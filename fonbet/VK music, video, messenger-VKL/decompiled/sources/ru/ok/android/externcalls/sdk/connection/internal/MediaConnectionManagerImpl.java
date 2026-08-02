package ru.ok.android.externcalls.sdk.connection.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.listeners.CallStatsListener;
import xsna.asp;
import xsna.gzs;
import xsna.js6;
import xsna.qd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaConnectionManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MediaConnectionManagerImpl implements MediaConnectionManager, CallStatsListener, TopologyChangedListener {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MediaConnectionManager";
    private final gzs<Boolean> isConversationEnded;
    private boolean isDataConnected;
    private boolean isIceConnected;
    private MediaConnectionListener.ConnectedInfo lastConnectedInfo;
    private MediaConnectionListener.DisconnectedInfo lastDisconnectedInfo;
    private final RTCLog log;
    private final MediaConnectionSettings settings;
    private final CopyOnWriteArrayList<MediaConnectionListener> listeners = new CopyOnWriteArrayList<>();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isFirstConnection = true;
    private State reportedState = State.DISCONNECTED;
    private final Runnable disconnectRunnable = new js6(this, 4);
    private final Runnable noDataRunnable = new qd0(this, 12);

    /* compiled from: MediaConnectionManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaConnectionManagerImpl.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NONE = new State("NONE", 0);
        public static final State CONNECTED = new State("CONNECTED", 1);
        public static final State DISCONNECTED = new State("DISCONNECTED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NONE, CONNECTED, DISCONNECTED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private State(String str, int i) {
        }

        public static zrp<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: MediaConnectionManagerImpl.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MediaConnectionManagerImpl(RTCLog rTCLog, gzs<Boolean> gzsVar, MediaConnectionSettings mediaConnectionSettings) {
        this.log = rTCLog;
        this.isConversationEnded = gzsVar;
        this.settings = mediaConnectionSettings;
    }

    private final MediaConnectionListener.ConnectedInfo createConnectedInfo() {
        return new MediaConnectionListener.ConnectedInfo(this.isFirstConnection);
    }

    private final MediaConnectionListener.DisconnectedInfo createDisconnectedInfo() {
        return MediaConnectionListener.DisconnectedInfo.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnectConfirmedCheck() {
        this.log.log(LOG_TAG, "onIceDisconnected after timeout");
        this.isIceConnected = false;
        reportNewStateIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void noDataCallbackTimeout() {
        this.log.log(LOG_TAG, "noDataCallbackTimeout after timeout");
        this.isDataConnected = false;
        reportNewStateIfNeeded();
    }

    private final void reportNewState(State state) {
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                MediaConnectionListener.ConnectedInfo createConnectedInfo = createConnectedInfo();
                this.lastConnectedInfo = createConnectedInfo;
                Iterator<T> it = this.listeners.iterator();
                while (it.hasNext()) {
                    ((MediaConnectionListener) it.next()).onMediaConnected(createConnectedInfo);
                }
                return;
            }
            if (i != 2) {
                return;
            }
            MediaConnectionListener.DisconnectedInfo createDisconnectedInfo = createDisconnectedInfo();
            this.lastDisconnectedInfo = createDisconnectedInfo;
            Iterator<T> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                ((MediaConnectionListener) it2.next()).onMediaDisconnected(createDisconnectedInfo);
            }
        }
    }

    private final void reportNewStateIfNeeded() {
        State state;
        State state2 = this.reportedState;
        boolean z = this.isIceConnected;
        if (z || this.isDataConnected) {
            state = State.CONNECTED;
        } else {
            state = State.NONE;
            if (state2 != state) {
                state = State.DISCONNECTED;
            }
        }
        if (state2 != state) {
            this.log.log(LOG_TAG, "new state: " + state + " isIceConnected=" + z + " isDataConnected=" + this.isDataConnected);
            reportNewState(state);
            this.isFirstConnection = false;
            this.reportedState = state;
        }
    }

    private final void reportStateToNewListener(MediaConnectionListener mediaConnectionListener) {
        MediaConnectionListener.DisconnectedInfo disconnectedInfo;
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.reportedState.ordinal()];
            if (i != 1) {
                if (i == 2 && (disconnectedInfo = this.lastDisconnectedInfo) != null) {
                    mediaConnectionListener.onMediaDisconnected(disconnectedInfo);
                    return;
                }
                return;
            }
            MediaConnectionListener.ConnectedInfo connectedInfo = this.lastConnectedInfo;
            if (connectedInfo == null) {
                return;
            }
            mediaConnectionListener.onMediaConnected(connectedInfo);
        }
    }

    private final boolean shouldReport() {
        return !this.isConversationEnded.invoke().booleanValue();
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionManager
    public void addListener(MediaConnectionListener mediaConnectionListener) {
        this.listeners.add(mediaConnectionListener);
        reportStateToNewListener(mediaConnectionListener);
    }

    public final void onIceConnected() {
        this.log.log(LOG_TAG, "onIceConnected");
        this.isIceConnected = true;
        this.handler.removeCallbacks(this.disconnectRunnable);
        reportNewStateIfNeeded();
    }

    public final void onIceDisconnected() {
        this.log.log(LOG_TAG, "onIceDisconnected");
        this.handler.postDelayed(this.disconnectRunnable, this.settings.getNoIceConnectionReportTimeoutMs());
    }

    @Override // ru.ok.android.webrtc.listeners.CallStatsListener
    public void onMediaDataReceived(long j) {
        boolean z = this.isDataConnected;
        boolean z2 = j < this.settings.getNoMediaReportTimeoutMs();
        this.isDataConnected = z2;
        if (z != z2) {
            this.log.log(LOG_TAG, "isDataConnected=" + z2 + " timeSinceBytesReceivedMs=" + j);
        }
        reportNewStateIfNeeded();
        this.handler.removeCallbacks(this.noDataRunnable);
        this.handler.postDelayed(this.noDataRunnable, this.settings.getNoMediaReportTimeoutMs());
    }

    @Override // ru.ok.android.external.sdk.TopologyChangedListener
    public void onTopologyUpdated(Topology topology, Topology topology2) {
        this.log.log(LOG_TAG, "topology changed: oldTopology=" + topology + " newTopology=" + topology2);
    }

    public final void release() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionManager
    public void removeListener(MediaConnectionListener mediaConnectionListener) {
        this.listeners.remove(mediaConnectionListener);
    }
}
