package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;
import xsna.bpn0;
import xsna.gzs;
import xsna.zcl;

/* compiled from: CallsBluethoothDeviceScanner.kt */
/* loaded from: classes9.dex */
public final class CallsBluethoothDeviceScanner {
    public static final Companion Companion = new Companion(null);
    private AudioManager audioManager;
    private final Handler audioManagerHandler;
    private final Lazy callback$delegate = new bpn0(new gzs<AudioDeviceCallback>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner$callback$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final AudioDeviceCallback invoke() {
            AudioDeviceCallback createCallback;
            createCallback = CallsBluethoothDeviceScanner.this.createCallback();
            return createCallback;
        }
    });
    private final Listener listener;

    /* compiled from: CallsBluethoothDeviceScanner.kt */
    public static final class BluetoothDeviceIntent {
        private final int id;
        private final String name;

        public BluetoothDeviceIntent(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public String toString() {
            return this.id + StringUtils.PROCESS_POSTFIX_DELIMITER + this.name;
        }
    }

    /* compiled from: CallsBluethoothDeviceScanner.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final boolean isSupported() {
            return true;
        }

        private Companion() {
        }
    }

    /* compiled from: CallsBluethoothDeviceScanner.kt */
    public interface Listener {
        boolean onDeviceAvailable(BluetoothDeviceIntent bluetoothDeviceIntent);

        boolean onDeviceUnavailable(BluetoothDeviceIntent bluetoothDeviceIntent);
    }

    public CallsBluethoothDeviceScanner(Handler handler, Listener listener) {
        this.audioManagerHandler = handler;
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioDeviceCallback createCallback() {
        if (Companion.isSupported()) {
            return createCallbackM();
        }
        return null;
    }

    @TargetApi(23)
    private final AudioDeviceCallback createCallbackM() {
        return new AudioDeviceCallback() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner$createCallbackM$1
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                CallsBluethoothDeviceScanner.Listener listener;
                if (audioDeviceInfoArr != null) {
                    CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = CallsBluethoothDeviceScanner.this;
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        if (audioDeviceInfo.getType() == 7) {
                            listener = callsBluethoothDeviceScanner.listener;
                            listener.onDeviceAvailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                        }
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                CallsBluethoothDeviceScanner.Listener listener;
                if (audioDeviceInfoArr != null) {
                    CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = CallsBluethoothDeviceScanner.this;
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        if (audioDeviceInfo.getType() == 7) {
                            listener = callsBluethoothDeviceScanner.listener;
                            listener.onDeviceUnavailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                        }
                    }
                }
            }
        };
    }

    private final AudioDeviceCallback getCallback() {
        return (AudioDeviceCallback) this.callback$delegate.getValue();
    }

    public static final boolean isSupported() {
        return Companion.isSupported();
    }

    @TargetApi(23)
    private final void startApiM(AudioManager audioManager) {
        AudioDeviceCallback callback = getCallback();
        if (callback != null) {
            audioManager.registerAudioDeviceCallback(callback, this.audioManagerHandler);
        }
        this.audioManager = audioManager;
    }

    @TargetApi(23)
    private final void stopApiM() {
        AudioManager audioManager;
        AudioDeviceCallback callback = getCallback();
        if (callback != null && (audioManager = this.audioManager) != null) {
            audioManager.unregisterAudioDeviceCallback(callback);
        }
        this.audioManager = null;
    }

    public final void start(AudioManager audioManager) {
        if (!Companion.isSupported() || audioManager == null) {
            return;
        }
        startApiM(audioManager);
    }

    public final void stop() {
        if (Companion.isSupported()) {
            stopApiM();
        }
    }
}
