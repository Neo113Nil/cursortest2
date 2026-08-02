package ru.ok.media;

import android.os.Handler;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.media.api.ReachabilityService;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import xsna.a72;
import xsna.an10;
import xsna.asp;
import xsna.fw3;
import xsna.gp;
import xsna.hv2;
import xsna.i5s;
import xsna.m2l0;
import xsna.na8;
import xsna.ne7;
import xsna.odj;
import xsna.pzl;
import xsna.rl3;
import xsna.s3q0;
import xsna.tto0;
import xsna.vk9;
import xsna.xe9;
import xsna.z27;
import xsna.zcl;
import xsna.zr;
import xsna.zrp;
import xsna.zvo0;

/* compiled from: StreamingLaunchScheduler.kt */
/* loaded from: classes9.dex */
public final class StreamingLaunchScheduler implements ReachabilityService.Listener {
    public static final long ATTEMPTS_PER_ADDRESS_LIMIT = 10;
    public static final float ATTEMPT_DELAY_IN_SECONDS = 1.0f;
    public static final Companion Companion = new Companion(null);
    public static final int OFFLINE_LIMIT = 60;
    private static final String TAG = "Publisher";
    private int currentAddrIndex;
    private volatile Listener delegate;
    private final Handler handler;
    private int launchAttemptIndex;
    private boolean launching;
    private final Runnable offlineTimeoutRunnable;
    private zvo0 offlineTimer;
    private final StreamingLaunchScheduler$publisherStateListener$1 publisherStateListener;
    private final ReachabilityService reachabilityService;
    private boolean released;
    private AsyncDNSResolver resolver;
    private boolean startAfterPrepare;
    private boolean startedAtLeastOnce;
    private boolean startedStateReached;
    private final Streamer streamer;
    private URI uri;
    private URI urlAttempt;
    private State state = State.IDLE;
    private boolean foreground = true;
    private InetAddress[] addresses = new InetAddress[0];

    /* compiled from: StreamingLaunchScheduler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String formatTimeDuration(long j) {
            if (j <= 0) {
                return "0:00";
            }
            long j2 = j / 1000;
            long j3 = 60;
            long j4 = j2 / j3;
            if ((j2 ^ j3) < 0 && j4 * j3 != j2) {
                j4--;
            }
            return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j2 % j3)}, 2));
        }

        private Companion() {
        }
    }

    /* compiled from: StreamingLaunchScheduler.kt */
    public interface Listener {
        void streamLaunchFailed();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StreamingLaunchScheduler.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State RESOLVING = new State("RESOLVING", 1);
        public static final State PREPARING = new State("PREPARING", 2);
        public static final State STARTING = new State("STARTING", 3);
        public static final State STARTED = new State(SignalingProtocol.STATE_STARTED, 4);
        public static final State INTERRUPTED = new State("INTERRUPTED", 5);
        public static final State FINISHED = new State("FINISHED", 6);
        public static final State FAILED = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 7);
        public static final State RETRY = new State("RETRY", 8);
        public static final State CLOSED = new State("CLOSED", 9);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, RESOLVING, PREPARING, STARTING, STARTED, INTERRUPTED, FINISHED, FAILED, RETRY, CLOSED};
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

        public final String nameIdString() {
            return na8.a(ordinal(), nameString(), " ");
        }

        public final String nameString() {
            return toString().toLowerCase(Locale.ROOT);
        }
    }

    /* compiled from: StreamingLaunchScheduler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.RESOLVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PREPARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.STARTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[State.INTERRUPTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[State.FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[State.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[State.RETRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[State.CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StreamerState.values().length];
            try {
                iArr2[StreamerState.unrecoverableFailure.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StreamerState.waiting.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StreamerState.finished.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StreamerState.failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StreamerState.preparing.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StreamerState.starting.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StreamerState.started.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[StreamerState.paused.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public StreamingLaunchScheduler(Streamer streamer, ReachabilityService reachabilityService, Handler handler) {
        this.streamer = streamer;
        this.reachabilityService = reachabilityService;
        this.handler = handler;
        StreamingLaunchScheduler$publisherStateListener$1 streamingLaunchScheduler$publisherStateListener$1 = new StreamingLaunchScheduler$publisherStateListener$1(this);
        this.publisherStateListener = streamingLaunchScheduler$publisherStateListener$1;
        ne7.m(TAG, "init");
        streamer.getState();
        StreamerState streamerState = StreamerState.waiting;
        streamer.addListener(streamingLaunchScheduler$publisherStateListener$1);
        reachabilityService.addListener(this);
        this.offlineTimeoutRunnable = new vk9(this, 12);
    }

    public static final /* synthetic */ void access$handleStreamerState(StreamingLaunchScheduler streamingLaunchScheduler, StreamerState streamerState) {
        streamingLaunchScheduler.handleStreamerState(streamerState);
    }

    private final boolean canLaunch(AtomicReference<String> atomicReference) {
        URI uri = this.uri;
        if (uri == null || uri.getHost() == null) {
            atomicReference.set("URL with host name not set " + uri + ")");
            return false;
        }
        if (!this.foreground) {
            atomicReference.set("app state is not active");
            return false;
        }
        if (this.reachabilityService.isReachable()) {
            return true;
        }
        atomicReference.set("not reachable");
        return false;
    }

    private final void handlePauseResume() {
        State state;
        boolean z = this.foreground;
        boolean isReachable = this.reachabilityService.isReachable();
        boolean z2 = z && isReachable;
        State state2 = this.state;
        String nameIdString = state2.nameIdString();
        StringBuilder c = gp.c("handlePauseResume() - appState= ", " intr= false reachable= ", " in state ", z, isReachable);
        c.append(nameIdString);
        ne7.t(TAG, c.toString());
        if (state2 == State.CLOSED) {
            ne7.t(TAG, "handlePauseResume() - ignored in final state");
            return;
        }
        if (z2 && state2 == State.INTERRUPTED) {
            this.handler.post(new a72(this, 19));
        } else {
            if (z2 || state2 == (state = State.INTERRUPTED)) {
                return;
            }
            internalSetState(state);
            this.streamer.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePauseResume$lambda$4(StreamingLaunchScheduler streamingLaunchScheduler) {
        if (streamingLaunchScheduler.launching) {
            ne7.t(TAG, "handlePauseResume() closure - trying to launch");
            streamingLaunchScheduler.launch();
        }
    }

    private final void handleReachability(boolean z) {
        ne7.t(TAG, "handleReachability() - reachable= " + z + " in state " + this.state.nameIdString());
        this.streamer.reachabilityChanged(z);
        handlePauseResume();
    }

    private final boolean handleResolverResult() {
        AsyncDNSResolver asyncDNSResolver = this.resolver;
        if (asyncDNSResolver == null) {
            ne7.m(TAG, "resolver completed, but its results are not required anymore");
            return false;
        }
        State state = this.state;
        if (state != State.RESOLVING && state != State.INTERRUPTED) {
            ne7.m(TAG, "resolver completed, but scheduler state is " + state.nameIdString());
            return false;
        }
        if (!asyncDNSResolver.getComplete()) {
            ne7.n(TAG, "resolver isn't completed yet");
            return false;
        }
        if (!asyncDNSResolver.getSucceeded()) {
            ne7.n(TAG, "resolver failed for \"" + asyncDNSResolver.getHostname() + "\", error=" + asyncDNSResolver.getErrorString());
            internalSetState(State.FAILED);
            return false;
        }
        InetAddress[] addresses = asyncDNSResolver.getAddresses();
        InetAddress[] inetAddressArr = (InetAddress[]) Arrays.copyOf(addresses, addresses.length);
        Random.Default r0 = Random.b;
        for (int length = inetAddressArr.length - 1; length > 0; length--) {
            r0.getClass();
            int k = Random.c.k(length + 1);
            InetAddress inetAddress = inetAddressArr[length];
            inetAddressArr[length] = inetAddressArr[k];
            inetAddressArr[k] = inetAddress;
        }
        this.addresses = inetAddressArr;
        this.currentAddrIndex = 0;
        this.launchAttemptIndex = 0;
        ne7.t(TAG, "resolved " + inetAddressArr.length + " addresses: " + rl3.Z(inetAddressArr, " ", null, null, null, 62));
        if (state == State.RESOLVING) {
            prepareStreamer();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStreamerState(StreamerState streamerState) {
        boolean z;
        StreamerState state = this.streamer.getState();
        String idNameString = streamerState.idNameString();
        String a = streamerState == state ? "" : zr.a(" (real= ", state.idNameString(), ")");
        String nameIdString = this.state.nameIdString();
        StringBuilder a2 = xe9.a("handleStreamerState() - streamer state= ", idNameString, " ", a, " in state ");
        a2.append(nameIdString);
        ne7.m(TAG, a2.toString());
        if (this.state == State.CLOSED) {
            return;
        }
        if (state == StreamerState.unrecoverableFailure) {
            internalSetState(State.FAILED);
            return;
        }
        boolean z2 = state == StreamerState.started;
        boolean z3 = state == StreamerState.starting;
        boolean z4 = state == StreamerState.preparing;
        boolean z5 = state == StreamerState.finished;
        boolean z6 = state == StreamerState.failed;
        if (z2) {
            this.startedAtLeastOnce = true;
            this.startedStateReached = true;
            stopOfflineTimer();
        } else if (z5 || z6) {
            startOfflineTimer();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 3:
                if (z3) {
                    internalSetState(State.STARTING);
                    return;
                }
                if (z2) {
                    internalSetState(State.STARTED);
                    return;
                }
                if (!z4 || !(z = this.startAfterPrepare)) {
                    handleUnexpectedStreamerState(state);
                    return;
                }
                State state2 = this.state;
                if (state2 == State.PREPARING && z) {
                    ne7.m(TAG, "handleStreamerState() closure - starting...");
                    internalSetState(State.STARTING);
                    this.streamer.start();
                    return;
                }
                ne7.J(TAG, "handleStreamerState() closure - not starting in state=" + state2.nameIdString() + ", startAfterPrepare= " + this.startAfterPrepare);
                return;
            case 4:
                if (z2) {
                    internalSetState(State.STARTED);
                    return;
                } else {
                    handleUnexpectedStreamerState(state);
                    return;
                }
            case 5:
                handleUnexpectedStreamerState(state);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void handleUnexpectedStreamerState(StreamerState streamerState) {
        float internalNextServer;
        if (streamerState.isFinal()) {
            internalSetState(State.RETRY);
            if (this.streamer.getWasConnected() || !this.streamer.getWasBound()) {
                int i = this.launchAttemptIndex + 1;
                this.launchAttemptIndex = i;
                internalNextServer = ((long) i) >= 10 ? internalNextServer() : 1.0f;
            } else {
                ne7.m(TAG, "connect failed, will try next server");
                internalNextServer = internalNextServer();
            }
            ne7.m(TAG, "handleUnexpectedStreamerState() - will retry in " + internalNextServer + " second(s)");
            this.handler.postDelayed(new z27(this, 14), an10.c((double) (internalNextServer * ((float) 1000))));
        }
    }

    private final float internalNextServer() {
        int i = this.currentAddrIndex;
        int length = this.addresses.length;
        int i2 = this.launchAttemptIndex;
        StringBuilder a = odj.a(i, length, "internalNextServer() - currentAddrIndex= ", " / ", " launchAttemptIndex= ");
        a.append(i2);
        ne7.m(TAG, a.toString());
        int i3 = this.currentAddrIndex + 1;
        this.currentAddrIndex = i3;
        this.launchAttemptIndex = 0;
        InetAddress[] inetAddressArr = this.addresses;
        if (i3 >= inetAddressArr.length) {
            ne7.m(TAG, "internalNextServer() - failed for all " + inetAddressArr.length + " servers, will keep trying after 1.0 second(s)...");
            this.currentAddrIndex = 0;
        }
        return 1.0f;
    }

    private final void internalResetNameResolution() {
        ne7.m(TAG, "internalResetNameResolution() - in state " + this.state.nameIdString());
        this.addresses = new InetAddress[0];
        this.currentAddrIndex = 0;
        AsyncDNSResolver asyncDNSResolver = this.resolver;
        if (asyncDNSResolver != null) {
            asyncDNSResolver.cancel();
        }
        this.resolver = null;
        this.launchAttemptIndex = 0;
        this.urlAttempt = null;
    }

    private final void internalSetState(State state) {
        State state2 = this.state;
        if (state != state2) {
            ne7.m(TAG, "internalSetState() - " + state2.nameIdString() + " -> " + state.nameIdString());
            this.state = state;
            if (state == State.FAILED) {
                notifyDelegateLaunchFailed();
            }
        }
    }

    private final void notifyDelegateLaunchFailed() {
        ne7.m(TAG, "notifyDelegateLaunchFailed()");
        this.launching = false;
        this.handler.post(new hv2(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyDelegateLaunchFailed$lambda$0(StreamingLaunchScheduler streamingLaunchScheduler) {
        Listener listener = streamingLaunchScheduler.delegate;
        if (listener != null) {
            listener.streamLaunchFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOfflineTimeout() {
        ne7.m(TAG, "onOfflineTimeout() - offline time limit reached (60 seconds)");
        stopOfflineTimer();
        internalSetState(State.FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRetryDelayTimeout() {
        State state = this.state;
        if (state == State.RETRY) {
            ne7.m(TAG, "onRetryDelayTimeout() - retrying...");
            launch();
        } else {
            ne7.J(TAG, "onRetryDelayTimeout() - won't retry in state= " + state.nameIdString());
        }
    }

    private final boolean prepareStreamer() {
        ne7.m(TAG, "prepareStreamer() - in state " + this.state.nameIdString());
        URI uri = this.uri;
        if (uri == null) {
            ne7.n(TAG, "unexpected: NO URL!");
            internalSetState(State.FAILED);
            return false;
        }
        URI uri2 = new URI(uri.getScheme(), uri.getUserInfo(), this.addresses[this.currentAddrIndex].getHostAddress(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        this.urlAttempt = uri2;
        StreamerState state = this.streamer.getState();
        ne7.m(TAG, "preparing streamer with URL " + this.urlAttempt + " in streamer state " + state.nameIdString());
        switch (WhenMappings.$EnumSwitchMapping$1[state.ordinal()]) {
            case 1:
                ne7.n(TAG, "Won't do in streamer state " + state.nameIdString());
                internalSetState(State.FAILED);
                return false;
            case 2:
            case 3:
            case 4:
                internalSetState(State.PREPARING);
                this.streamer.prepare(uri2);
                return true;
            case 5:
                internalSetState(State.PREPARING);
                if (this.startAfterPrepare) {
                    this.streamer.start();
                }
                return true;
            case 6:
                internalSetState(State.STARTING);
                return true;
            case 7:
                internalSetState(State.STARTED);
                return true;
            case 8:
                internalSetState(State.PREPARING);
                this.streamer.resume();
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean startAddressResolution() {
        internalResetNameResolution();
        URI uri = this.uri;
        if (uri == null || uri.getHost() == null) {
            ne7.n(TAG, "URL with host name not set " + uri + ")");
            internalSetState(State.FAILED);
            return false;
        }
        String host = uri.getHost();
        ne7.m(TAG, "startAddressResolution() - starting DNS name resolver for '" + host + "'");
        internalSetState(State.RESOLVING);
        AsyncDNSResolver asyncDNSResolver = new AsyncDNSResolver(host, this.handler, new m2l0(this, 5));
        this.resolver = asyncDNSResolver;
        asyncDNSResolver.start();
        if (asyncDNSResolver.getComplete()) {
            return handleResolverResult();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 startAddressResolution$lambda$1(StreamingLaunchScheduler streamingLaunchScheduler, boolean z) {
        ne7.m(TAG, "AsyncDNSResolver callback - success= " + z);
        streamingLaunchScheduler.handleResolverResult();
        return s3q0.a;
    }

    private final void startOfflineTimer() {
        ne7.m(TAG, "startOfflineTimer()");
        if (this.offlineTimer != null) {
            stopOfflineTimer();
        }
        if (this.startedAtLeastOnce) {
            zvo0 zvo0Var = new zvo0(new tto0());
            zvo0Var.b();
            this.offlineTimer = zvo0Var;
            this.handler.postDelayed(this.offlineTimeoutRunnable, 60000L);
        }
    }

    private final void stopOfflineTimer() {
        ne7.m(TAG, "stopOfflineTimer()");
        if (this.offlineTimer != null) {
            this.handler.removeCallbacks(this.offlineTimeoutRunnable);
            this.offlineTimer = null;
        }
    }

    public final void close() {
        ne7.m(TAG, "close() - in state " + this.state.nameIdString());
        internalSetState(State.CLOSED);
        release();
    }

    public final String getDebugInfo() {
        String asyncDNSResolver;
        String str;
        StringBuilder b = i5s.b(this.state.nameString(), ", ", this.launching ? "" : "NOT ", "launching ", this.startAfterPrepare ? " [s]" : "");
        b.append("\n");
        String c = fw3.c(fw3.c(b.toString(), "App: ", this.foreground ? SignalingProtocol.KEY_ACTIVE : "inactive", "\n"), "Reachability: ", this.reachabilityService.isReachable() ? "YES" : " NO", "\n");
        zvo0 zvo0Var = this.offlineTimer;
        if (zvo0Var != null) {
            c = fw3.c(c, "Offline, failure in ", Companion.formatTimeDuration(60000 - zvo0Var.a(0L)), "\n");
        }
        String str2 = c + "currentAddrIndex=" + this.currentAddrIndex + " of " + this.addresses.length + "\n";
        String str3 = "null";
        if (this.launching) {
            URI uri = this.urlAttempt;
            if (uri == null || (str = uri.getHost()) == null) {
                str = "null";
            }
            str2 = pzl.b(str2, "Target: ", str) + " attempt " + this.launchAttemptIndex + " of 10\n";
        }
        AsyncDNSResolver asyncDNSResolver2 = this.resolver;
        if (asyncDNSResolver2 != null && (asyncDNSResolver = asyncDNSResolver2.toString()) != null) {
            str3 = asyncDNSResolver;
        }
        return pzl.b(str2, "Resolver: ", str3);
    }

    public final Listener getDelegate() {
        return this.delegate;
    }

    public final boolean launch() {
        ne7.m(TAG, "launch() - in state " + this.state.nameIdString());
        this.launching = true;
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
                if (!canLaunch(new AtomicReference<>(""))) {
                    ne7.n(TAG, "Can't launch: ");
                    return false;
                }
                if (startAddressResolution()) {
                    return true;
                }
                ne7.n(TAG, "Can't start address resolution");
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                ne7.n(TAG, "Already launched");
                return true;
            case 6:
            case 7:
            case 8:
            case 9:
                if (!canLaunch(new AtomicReference<>(""))) {
                    ne7.n(TAG, "Can't launch: ");
                    return false;
                }
                if (this.addresses.length != 0) {
                    return prepareStreamer();
                }
                if (startAddressResolution()) {
                    return true;
                }
                ne7.n(TAG, "Can't start address resolution");
                return false;
            case 10:
                ne7.n(TAG, "Won't launch in final state");
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ru.ok.media.api.ReachabilityService.Listener
    public void onReachabilityChanged() {
        handleReachability(this.reachabilityService.isReachable());
    }

    public final void release() {
        ne7.m(TAG, "release()");
        reset();
        stopOfflineTimer();
        if (this.released) {
            return;
        }
        this.released = true;
        this.reachabilityService.removeListener(this);
        this.streamer.removeListener(this.publisherStateListener);
    }

    public final void reset() {
        ne7.m(TAG, "reset()");
        this.launching = false;
        this.startAfterPrepare = false;
        stopOfflineTimer();
        internalResetNameResolution();
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
                internalSetState(State.IDLE);
                return;
            case 6:
            case 10:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void setDelegate(Listener listener) {
        this.delegate = listener;
    }

    public final void setForeground(boolean z) {
        ne7.t(TAG, "setForeground() - " + z);
        this.foreground = z;
        handlePauseResume();
    }

    public final void setUrl(URI uri) {
        ne7.m(TAG, "setUrl() - in state " + this.state.nameIdString() + " url= " + uri);
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
                this.uri = uri;
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ne7.n(TAG, "setUrl() - ignored");
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void start() {
        ne7.m(TAG, "start() - in state " + this.state.nameIdString());
        this.startAfterPrepare = true;
        StreamerState state = this.streamer.getState();
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 3:
                switch (WhenMappings.$EnumSwitchMapping$1[state.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                        ne7.m(TAG, "won't start in streamer state " + state.nameIdString());
                        return;
                    case 5:
                        ne7.m(TAG, "starting...");
                        this.streamer.start();
                        return;
                    case 6:
                        ne7.m(TAG, "already starting");
                        return;
                    case 8:
                        ne7.J(TAG, "unexpected paused streamer state, resuming anyway...");
                        this.streamer.resume();
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
