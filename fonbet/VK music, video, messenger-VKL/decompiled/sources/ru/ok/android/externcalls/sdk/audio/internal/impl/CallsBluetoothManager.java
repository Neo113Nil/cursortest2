package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.Logger;
import xsna.anj;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.qb3;
import xsna.r44;
import xsna.s3q0;
import xsna.tgw;
import xsna.zcl;

/* compiled from: CallsBluetoothManager.kt */
/* loaded from: classes9.dex */
public final class CallsBluetoothManager {
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 2500;
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallsBluetoothManager";
    private static final int MAX_SCO_CONNECTION_ATTEMPTS = 3;
    private final AudioManager audioManager;
    private BluetoothAdapter bluetoothAdapter;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final Logger logger;
    private volatile HeadsetState bluetoothHeadsetState = HeadsetState.None.INSTANCE;
    private final BluetoothProfile.ServiceListener bluetoothServiceListener = new BluetoothServiceListener();
    private final BroadcastReceiver bluetoothHeadsetReceiver = new BluetoothHeadsetBroadcastReceiver();
    private final Runnable bluetoothTimeoutRunnable = new qb3(this, 1);
    private final Runnable updateAudioManagerRunnable = new r44(this, 4);

    /* compiled from: CallsBluetoothManager.kt */
    public final class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {
        public BluetoothHeadsetBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            CallsAudioManagerV2Impl callsAudioManagerV2Impl = CallsBluetoothManager.this.callsAudioManager;
            final CallsBluetoothManager callsBluetoothManager = CallsBluetoothManager.this;
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(callsAudioManagerV2Impl, "bluetoothBroadcastRecieved", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CallsBluetoothManager.this.onBroadcastReceiveImpl(intent, this.isInitialStickyBroadcast());
                }
            }, 6, null);
        }
    }

    /* compiled from: CallsBluetoothManager.kt */
    public final class BluetoothServiceListener implements BluetoothProfile.ServiceListener {
        public BluetoothServiceListener() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(final int i, final BluetoothProfile bluetoothProfile) {
            CallsAudioManagerV2Impl callsAudioManagerV2Impl = CallsBluetoothManager.this.callsAudioManager;
            final CallsBluetoothManager callsBluetoothManager = CallsBluetoothManager.this;
            izs<Throwable, s3q0> izsVar = new izs<Throwable, s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                    invoke2(th);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Logger logger;
                    logger = CallsBluetoothManager.this.logger;
                    logger.reportError("CallsBluetoothManager", tgw.b(i, "Error at onServiceConnected(", ")"), th);
                }
            };
            final CallsBluetoothManager callsBluetoothManager2 = CallsBluetoothManager.this;
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(callsAudioManagerV2Impl, "bluetoothServiceConnected", null, izsVar, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CallsBluetoothManager.this.onServiceConnectedImpl(i, bluetoothProfile);
                }
            }, 2, null);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(final int i) {
            CallsAudioManagerV2Impl callsAudioManagerV2Impl = CallsBluetoothManager.this.callsAudioManager;
            final CallsBluetoothManager callsBluetoothManager = CallsBluetoothManager.this;
            izs<Throwable, s3q0> izsVar = new izs<Throwable, s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                    invoke2(th);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Logger logger;
                    logger = CallsBluetoothManager.this.logger;
                    logger.reportError("CallsBluetoothManager", tgw.b(i, "Error at onServiceDisconnected(", ")"), th);
                }
            };
            final CallsBluetoothManager callsBluetoothManager2 = CallsBluetoothManager.this;
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(callsAudioManagerV2Impl, "bluetoothServiceDisconnected", null, izsVar, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CallsBluetoothManager.this.onServiceDisconnectedImpl(i);
                }
            }, 2, null);
        }
    }

    /* compiled from: CallsBluetoothManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CallsBluetoothManager.kt */
    public interface ConnectionState {

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Connected implements ConnectionState {
            private final SCOAudioState audioState;
            private final String deviceName;

            public Connected(String str, SCOAudioState sCOAudioState) {
                this.deviceName = str;
                this.audioState = sCOAudioState;
            }

            public static /* synthetic */ Connected copy$default(Connected connected, String str, SCOAudioState sCOAudioState, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = connected.deviceName;
                }
                if ((i & 2) != 0) {
                    sCOAudioState = connected.audioState;
                }
                return connected.copy(str, sCOAudioState);
            }

            public final String component1() {
                return this.deviceName;
            }

            public final SCOAudioState component2() {
                return this.audioState;
            }

            public final Connected copy(String str, SCOAudioState sCOAudioState) {
                return new Connected(str, sCOAudioState);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Connected)) {
                    return false;
                }
                Connected connected = (Connected) obj;
                return epx.f(this.deviceName, connected.deviceName) && epx.f(this.audioState, connected.audioState);
            }

            public final SCOAudioState getAudioState() {
                return this.audioState;
            }

            public final String getDeviceName() {
                return this.deviceName;
            }

            public int hashCode() {
                return this.audioState.hashCode() + (this.deviceName.hashCode() * 31);
            }

            public String toString() {
                return "Connected(device=" + this.deviceName + ", audio=" + this.audioState + ")";
            }

            public /* synthetic */ Connected(String str, SCOAudioState sCOAudioState, int i, zcl zclVar) {
                this(str, (i & 2) != 0 ? SCOAudioState.Disconnected.INSTANCE : sCOAudioState);
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Disconnected implements ConnectionState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }
    }

    /* compiled from: CallsBluetoothManager.kt */
    public interface HeadsetState {

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Available implements HeadsetState {
            private final ConnectionState connectionState;
            private final BluetoothHeadset headset;

            public Available(BluetoothHeadset bluetoothHeadset, ConnectionState connectionState) {
                this.headset = bluetoothHeadset;
                this.connectionState = connectionState;
            }

            public static /* synthetic */ Available copy$default(Available available, BluetoothHeadset bluetoothHeadset, ConnectionState connectionState, int i, Object obj) {
                if ((i & 1) != 0) {
                    bluetoothHeadset = available.headset;
                }
                if ((i & 2) != 0) {
                    connectionState = available.connectionState;
                }
                return available.copy(bluetoothHeadset, connectionState);
            }

            public final BluetoothHeadset component1() {
                return this.headset;
            }

            public final ConnectionState component2() {
                return this.connectionState;
            }

            public final Available copy(BluetoothHeadset bluetoothHeadset, ConnectionState connectionState) {
                return new Available(bluetoothHeadset, connectionState);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Available)) {
                    return false;
                }
                Available available = (Available) obj;
                return epx.f(this.headset, available.headset) && epx.f(this.connectionState, available.connectionState);
            }

            public final ConnectionState getConnectionState() {
                return this.connectionState;
            }

            public final BluetoothHeadset getHeadset() {
                return this.headset;
            }

            public int hashCode() {
                return this.connectionState.hashCode() + (this.headset.hashCode() * 31);
            }

            public String toString() {
                return "Available(connection=" + this.connectionState + ")";
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class None implements HeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Unavailable implements HeadsetState {
            public static final Unavailable INSTANCE = new Unavailable();

            private Unavailable() {
            }

            public String toString() {
                return "Unavailable";
            }
        }
    }

    /* compiled from: CallsBluetoothManager.kt */
    public interface SCOAudioState {

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Connected implements SCOAudioState {
            public static final Connected INSTANCE = new Connected();

            private Connected() {
            }

            public String toString() {
                return "Connected";
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Connecting implements SCOAudioState {
            private final int connectionAttempt;

            public Connecting(int i) {
                this.connectionAttempt = i;
            }

            public static /* synthetic */ Connecting copy$default(Connecting connecting, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = connecting.connectionAttempt;
                }
                return connecting.copy(i);
            }

            public final int component1() {
                return this.connectionAttempt;
            }

            public final Connecting copy(int i) {
                return new Connecting(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Connecting) && this.connectionAttempt == ((Connecting) obj).connectionAttempt;
            }

            public final int getConnectionAttempt() {
                return this.connectionAttempt;
            }

            public int hashCode() {
                return Integer.hashCode(this.connectionAttempt);
            }

            public String toString() {
                return tgw.b(this.connectionAttempt, "Connecting(attempt=", ")");
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Disconnected implements SCOAudioState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }

        /* compiled from: CallsBluetoothManager.kt */
        public static final class Disconnecting implements SCOAudioState {
            public static final Disconnecting INSTANCE = new Disconnecting();

            private Disconnecting() {
            }

            public String toString() {
                return "Disconnecting";
            }
        }
    }

    public CallsBluetoothManager(Context context, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger) {
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        this.context = context;
        logger.v(LOG_TAG, "CAM BT is created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bluetoothTimeout() {
        this.logger.v(LOG_TAG, "BT SCO timed out, state " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(LOG_TAG, "Ignore timeout event because headset not available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(LOG_TAG, "Ignore timeout event because headset is not connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (!(audioState instanceof SCOAudioState.Connecting)) {
            this.logger.v(LOG_TAG, "Ignore timeout event because we are not connecting now");
            return;
        }
        if (updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null)) {
            return;
        }
        SCOAudioState.Connecting connecting = (SCOAudioState.Connecting) audioState;
        this.logger.w(LOG_TAG, "BT failed to connect after timeout, attempt was " + connecting.getConnectionAttempt());
        int connectionAttempt = connecting.getConnectionAttempt();
        if (connectionAttempt < 3) {
            startScoAudio(connectionAttempt + 1);
        } else {
            this.callsAudioManager.selectPreferredAudioDevice$calls_audiomanager_release(false);
        }
    }

    private final void cancelTimer() {
        this.logger.v(LOG_TAG, "cancel timers");
        this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    private final void closeProfileProxy(BluetoothHeadset bluetoothHeadset) {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            this.logger.d(LOG_TAG, "Close bluetooth profile proxy: " + bluetoothHeadset);
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
    }

    @SuppressLint({"MissingPermission"})
    private final String getBluetoothDeviceName(BluetoothDevice bluetoothDevice) {
        String alias;
        if (Build.VERSION.SDK_INT < 30) {
            return bluetoothDevice.getName();
        }
        alias = bluetoothDevice.getAlias();
        return alias == null ? bluetoothDevice.getName() : alias;
    }

    private final boolean getBluetoothProfileProxy(Context context, BluetoothProfile.ServiceListener serviceListener, int i) {
        try {
            BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
            if (bluetoothAdapter == null) {
                return false;
            }
            return bluetoothAdapter.getProfileProxy(context, serviceListener, i);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't get bluetooth profile proxy", th);
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    private final BluetoothDevice getConnectedBluetoothDevice(BluetoothHeadset bluetoothHeadset) {
        this.logger.v(LOG_TAG, "Looking for connected bluetooth device...");
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            this.logger.v(LOG_TAG, "No connected divice found...");
            return null;
        }
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            int connectionState = bluetoothHeadset.getConnectionState(bluetoothDevice);
            String bluetoothDeviceName = getBluetoothDeviceName(bluetoothDevice);
            if (connectionState == 0) {
                this.logger.v(LOG_TAG, "Disconnected device found: " + bluetoothDeviceName);
            } else if (connectionState == 1) {
                this.logger.v(LOG_TAG, "Connected device found: " + bluetoothDeviceName);
            } else {
                if (connectionState == 2) {
                    this.logger.v(LOG_TAG, "Connected device found: " + bluetoothDeviceName);
                    return bluetoothDevice;
                }
                if (connectionState == 3) {
                    this.logger.v(LOG_TAG, "Disconnecting device found: " + bluetoothDeviceName);
                }
            }
        }
        return null;
    }

    private final boolean hasPermission() {
        return Build.VERSION.SDK_INT < 31 ? anj.a(this.context, "android.permission.BLUETOOTH") == 0 : anj.a(this.context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    private final void onAudioConnected() {
        this.logger.v(LOG_TAG, "audio connected, state " + this.bluetoothHeadsetState);
        cancelTimer();
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(LOG_TAG, "Weird! audio connected notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(LOG_TAG, "Weird! audio connected notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (!(connected.getAudioState() instanceof SCOAudioState.Connecting)) {
            this.logger.w(LOG_TAG, "Unexpected state for BluetoothHeadset.STATE_AUDIO_CONNECTED");
        }
        updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, SCOAudioState.Connected.INSTANCE, 1, null), 1, null), false, 2, null);
    }

    private final void onAudioConnecting() {
        this.logger.v(LOG_TAG, "audio has started connecting, state " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.w(LOG_TAG, "Weird! audio connecting notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(LOG_TAG, "Weird! audio connecting notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (connected.getAudioState() instanceof SCOAudioState.Connecting) {
            this.logger.v(LOG_TAG, "Since we are in connecting state, ignore event");
        } else {
            this.logger.v(LOG_TAG, "Weird! our state is wrong? Reset to connecting");
            updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, new SCOAudioState.Connecting(0), 1, null), 1, null), false, 2, null);
        }
    }

    private final void onAudioDisconnected(boolean z) {
        this.logger.v(LOG_TAG, "audio disconnected, state " + this.bluetoothHeadsetState);
        if (z) {
            return;
        }
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState).getHeadset(), false, 2, null);
        } else {
            this.logger.w(LOG_TAG, "Weird! Headset is not available when sco goes down");
        }
        this.logger.v(LOG_TAG, "audio disconnected, state after update: " + this.bluetoothHeadsetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBroadcastReceiveImpl(Intent intent, boolean z) {
        this.logger.v(LOG_TAG, "received " + intent + ", state is " + this.bluetoothHeadsetState);
        if (this.bluetoothHeadsetState instanceof HeadsetState.None) {
            this.logger.v(LOG_TAG, "Our headset was not initialized yet, ignore broadcast event");
        }
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1435586571) {
                if (hashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    this.logger.v(LOG_TAG, "intent action is ACTION_CONNECTION_STATE_CHANGED, connection state is " + intExtra);
                    if (intExtra == 0) {
                        onHeadsetDisconnected();
                        return;
                    } else {
                        if (intExtra != 2) {
                            return;
                        }
                        onHeadsetConnected();
                        return;
                    }
                }
                return;
            }
            if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                this.logger.v(LOG_TAG, "intent action is ACTION_AUDIO_STATE_CHANGED, audio state is " + intExtra2);
                switch (intExtra2) {
                    case 10:
                        onAudioDisconnected(z);
                        break;
                    case 11:
                        onAudioConnecting();
                        break;
                    case 12:
                        onAudioConnected();
                        break;
                }
            }
        }
    }

    private final void onHeadsetConnected() {
        this.logger.v(LOG_TAG, "BT headset connected: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState).getHeadset(), false, 2, null);
        } else {
            this.logger.e(LOG_TAG, "Unexpected state when headset connected");
        }
    }

    private final void onHeadsetDisconnected() {
        this.logger.v(LOG_TAG, "BT headset disconnected");
        stopScoAudio();
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState, null, ConnectionState.Disconnected.INSTANCE, 1, null), false, 2, null);
            return;
        }
        this.logger.e(LOG_TAG, "BT headset disconnected came for unexpected state " + headsetState + ", ignore");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceConnectedImpl(int i, BluetoothProfile bluetoothProfile) {
        this.logger.v(LOG_TAG, "connected " + i + ", our state is " + this.bluetoothHeadsetState);
        if (i != 1 || epx.f(this.bluetoothHeadsetState, HeadsetState.None.INSTANCE)) {
            this.logger.v(LOG_TAG, "Own state or connected profile don't match to expected one, ignore event");
        } else {
            updateCurrentConnectionState$default(this, (BluetoothHeadset) bluetoothProfile, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnectedImpl(int i) {
        this.logger.v(LOG_TAG, "disconnected " + i + ", our state is " + this.bluetoothHeadsetState);
        if (i != 1 || epx.f(this.bluetoothHeadsetState, HeadsetState.None.INSTANCE)) {
            this.logger.v(LOG_TAG, "Own state or connected profile don't match to expected one, ignore event");
        } else {
            stopScoAudio();
            updateHeadsetState$default(this, HeadsetState.Unavailable.INSTANCE, false, 2, null);
        }
    }

    private final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.logger.v(LOG_TAG, "registering receiver");
        this.context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ boolean startScoAudio$default(CallsBluetoothManager callsBluetoothManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return callsBluetoothManager.startScoAudio(i);
    }

    private final void startTimer() {
        this.logger.v(LOG_TAG, "start connection timers");
        this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().postDelayed(this.bluetoothTimeoutRunnable, 2500L);
    }

    private final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.logger.v(LOG_TAG, "unregistering receiver");
        this.context.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAudioDeviceState() {
        this.logger.v(LOG_TAG, "Calling update CAM state because of BT state change");
        this.callsAudioManager.updateAudioDeviceState$calls_audiomanager_release();
    }

    @SuppressLint({"MissingPermission"})
    private final boolean updateCurrentConnectionState(BluetoothHeadset bluetoothHeadset, boolean z) {
        this.logger.v(LOG_TAG, "BT headset check begin: " + this.bluetoothHeadsetState);
        try {
            BluetoothDevice connectedBluetoothDevice = getConnectedBluetoothDevice(bluetoothHeadset);
            ConnectionState connected = (connectedBluetoothDevice == null || !bluetoothHeadset.isAudioConnected(connectedBluetoothDevice)) ? connectedBluetoothDevice != null ? new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Disconnected.INSTANCE) : ConnectionState.Disconnected.INSTANCE : new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Connected.INSTANCE);
            updateHeadsetState(new HeadsetState.Available(bluetoothHeadset, connected), z);
            this.logger.v(LOG_TAG, "BT headset check completed: " + this.bluetoothHeadsetState);
            if (connected instanceof ConnectionState.Connected) {
                if (((ConnectionState.Connected) connected).getAudioState() instanceof SCOAudioState.Connected) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            this.logger.d(LOG_TAG, "SecurityException: did you permit android.permission.BLUETOOTH_CONNECT?", e);
            closeProfileProxy(bluetoothHeadset);
            stop();
            return false;
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Error detecting remote audio device", th);
            return false;
        }
    }

    public static /* synthetic */ boolean updateCurrentConnectionState$default(CallsBluetoothManager callsBluetoothManager, BluetoothHeadset bluetoothHeadset, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return callsBluetoothManager.updateCurrentConnectionState(bluetoothHeadset, z);
    }

    private final void updateHeadsetState(HeadsetState headsetState, boolean z) {
        HeadsetState headsetState2 = this.bluetoothHeadsetState;
        if ((headsetState2 instanceof HeadsetState.Available) && !(headsetState instanceof HeadsetState.Available)) {
            closeProfileProxy(((HeadsetState.Available) headsetState2).getHeadset());
        }
        this.bluetoothHeadsetState = headsetState;
        this.logger.v(LOG_TAG, "BT state did change to: " + headsetState);
        if (z) {
            this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().removeCallbacks(this.updateAudioManagerRunnable);
            this.logger.v(LOG_TAG, "Scheduling update CAM state because of BT state change");
            this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release().post(this.updateAudioManagerRunnable);
        }
    }

    public static /* synthetic */ void updateHeadsetState$default(CallsBluetoothManager callsBluetoothManager, HeadsetState headsetState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        callsBluetoothManager.updateHeadsetState(headsetState, z);
    }

    public final String getConnectedDeviceName() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            HeadsetState.Available available = (HeadsetState.Available) headsetState;
            if (available.getConnectionState() instanceof ConnectionState.Connected) {
                return ((ConnectionState.Connected) available.getConnectionState()).getDeviceName();
            }
        }
        return "";
    }

    public final boolean getHasBluetoothHeadset() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            return ((HeadsetState.Available) headsetState).getConnectionState() instanceof ConnectionState.Connected;
        }
        return false;
    }

    public final boolean isBluetoothOn() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            HeadsetState.Available available = (HeadsetState.Available) headsetState;
            if ((available.getConnectionState() instanceof ConnectionState.Connected) && (((ConnectionState.Connected) available.getConnectionState()).getAudioState() instanceof SCOAudioState.Connected)) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        this.logger.v(LOG_TAG, "start requested");
        if (!(this.bluetoothHeadsetState instanceof HeadsetState.None)) {
            this.logger.w(LOG_TAG, "Unexpected start request when state is " + this.bluetoothHeadsetState);
            return;
        }
        if (!hasPermission()) {
            this.logger.e(LOG_TAG, "Process (pid=" + Process.myPid() + ") lacks BLUETOOTH permission");
            return;
        }
        if (!this.audioManager.isBluetoothScoAvailableOffCall()) {
            this.logger.e(LOG_TAG, "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            this.logger.w(LOG_TAG, "Device does not support Bluetooth");
            return;
        }
        this.bluetoothAdapter = defaultAdapter;
        updateHeadsetState(HeadsetState.Unavailable.INSTANCE, false);
        if (!getBluetoothProfileProxy(this.context, this.bluetoothServiceListener, 1)) {
            this.logger.e(LOG_TAG, "BluetoothAdapter.getProfileProxy(HEADSET) failed");
            return;
        }
        BroadcastReceiver broadcastReceiver = this.bluetoothHeadsetReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        s3q0 s3q0Var = s3q0.a;
        registerReceiver(broadcastReceiver, intentFilter);
    }

    public final boolean startScoAudio() {
        return startScoAudio(1);
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop requested");
        stopScoAudio();
        if (this.bluetoothHeadsetState instanceof HeadsetState.None) {
            return;
        }
        unregisterReceiver(this.bluetoothHeadsetReceiver);
        cancelTimer();
        updateHeadsetState(HeadsetState.None.INSTANCE, false);
        this.bluetoothAdapter = null;
    }

    public final void stopScoAudio() {
        this.logger.v(LOG_TAG, "stop sco requested; state: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(LOG_TAG, "BT SCO disconnection ignored - no headset available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(LOG_TAG, "BT SCO disconnection ignored - no headset connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (audioState instanceof SCOAudioState.Disconnected) {
            this.logger.v(LOG_TAG, "BT SCO is already disconnected. Ignore stop SCO request");
            return;
        }
        if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(LOG_TAG, "Disconnecting is in progress. Ignore stop SCO request");
            return;
        }
        cancelTimer();
        try {
            updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState, null, ConnectionState.Connected.copy$default((ConnectionState.Connected) connectionState, null, SCOAudioState.Disconnecting.INSTANCE, 1, null), 1, null), false, 2, null);
            this.audioManager.stopBluetoothSco();
            this.audioManager.setBluetoothScoOn(false);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't stop bluetooth sco", th);
            updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null);
        }
    }

    private final boolean startScoAudio(int i) {
        this.logger.v(LOG_TAG, "start sco requested, state: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.e(LOG_TAG, "BT SCO connection fails - no headset available");
            return false;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.e(LOG_TAG, "BT SCO connection fails - headset is not connected yet");
            return false;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        SCOAudioState audioState = connected.getAudioState();
        if (audioState instanceof SCOAudioState.Connected) {
            this.logger.v(LOG_TAG, "BT SCO is already connected");
            return true;
        }
        if (audioState instanceof SCOAudioState.Connecting) {
            this.logger.v(LOG_TAG, "BT SCO is about to connect, ignore this attempt");
            return true;
        }
        if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(LOG_TAG, "BT SCO is about to disconnect, ignore this attempt");
            return false;
        }
        this.logger.v(LOG_TAG, "BT SCO connection condition satisfied, update state and request for connection");
        updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, new SCOAudioState.Connecting(i), 1, null), 1, null), false, 2, null);
        try {
            this.audioManager.startBluetoothSco();
            this.audioManager.setBluetoothScoOn(true);
            startTimer();
            return true;
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Error on startBluetoothSco()", th);
            updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null);
            return false;
        }
    }
}
