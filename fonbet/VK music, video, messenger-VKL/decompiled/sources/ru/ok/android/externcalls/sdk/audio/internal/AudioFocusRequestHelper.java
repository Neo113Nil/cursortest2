package ru.ok.android.externcalls.sdk.audio.internal;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import xsna.ep0;
import xsna.gzs;
import xsna.po4;
import xsna.qo4;
import xsna.s3q0;
import xsna.vq3;
import xsna.zcl;

/* compiled from: AudioFocusRequestHelper.kt */
/* loaded from: classes9.dex */
public final class AudioFocusRequestHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long RE_REQUEST_FOCUS_DELAY_MILLIS = 2000;

    @Deprecated
    public static final String TAG = "AudioFocusRequestHelper";
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final gzs<Boolean> isDestroyed;
    private boolean isFocusGained;
    private final Logger logger;
    private final Handler mainThreadHandler;
    private final gzs<s3q0> onFocusGained;
    private final gzs<s3q0> onFocusLost;
    private final CallsAudioManager.OnMuteListener onMuteListener;
    private final Handler workerThreadHandler;

    /* compiled from: AudioFocusRequestHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, gzs<Boolean> gzsVar, Logger logger, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        this.audioManager = audioManager;
        this.onMuteListener = onMuteListener;
        this.mainThreadHandler = handler;
        this.workerThreadHandler = handler2;
        this.isDestroyed = gzsVar;
        this.logger = logger;
        this.onFocusLost = gzsVar2;
        this.onFocusGained = gzsVar3;
    }

    private final <T> T handleAudioFocusRequestResult(T t, int i) {
        try {
            if (i == 1) {
                handleFocusUpdate$default(this, true, false, 2, null);
                this.logger.d(TAG, "Audio focus request granted");
                return t;
            }
            this.workerThreadHandler.postDelayed(new qo4(this, 0), 2000L);
            this.logger.d(TAG, "Audio focus request failed");
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        } catch (Throwable th) {
            this.logger.e(TAG, "Audio focus request failed with error", th);
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        }
    }

    private final void handleFocusUpdate(boolean z, boolean z2) {
        if (this.isFocusGained == z) {
            this.logger.d(TAG, "Focus state didn't change, ignore update to " + z);
            return;
        }
        this.isFocusGained = z;
        if (z) {
            this.onFocusGained.invoke();
            unmute();
            return;
        }
        this.onFocusLost.invoke();
        if (z2) {
            muteForever();
        } else {
            mute();
        }
    }

    public static /* synthetic */ void handleFocusUpdate$default(AudioFocusRequestHelper audioFocusRequestHelper, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        audioFocusRequestHelper.handleFocusUpdate(z, z2);
    }

    private final void mute() {
        if (this.isDestroyed.invoke().booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new vq3(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mute$lambda$4(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(true);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute event", th);
            }
        }
    }

    private final void muteForever() {
        if (this.isDestroyed.invoke().booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new ep0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void muteForever$lambda$6(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMutedForever();
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute forever event", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestFocus$lambda$0(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        audioFocusRequestHelper.logger.d(TAG, i != -3 ? i != -2 ? i != -1 ? i != 1 ? String.valueOf(i) : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        if (i == -3 || i == -2) {
            handleFocusUpdate$default(audioFocusRequestHelper, false, false, 2, null);
            return;
        }
        if (i == -1) {
            audioFocusRequestHelper.handleFocusUpdate(false, true);
            return;
        }
        if (i == 1) {
            handleFocusUpdate$default(audioFocusRequestHelper, true, false, 2, null);
            return;
        }
        audioFocusRequestHelper.logger.e(TAG, "Unexpected audio focus change " + i);
    }

    private final void unmute() {
        if (this.isDestroyed.invoke().booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new po4(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unmute$lambda$8(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(false);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise unmute event", th);
            }
        }
    }

    public final void releaseFocus() {
        this.logger.d(TAG, "Release audio focus");
        try {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while releasing audio focus request", th);
        }
        this.audioFocusRequest = null;
        this.audioFocusListener = null;
        this.isFocusGained = false;
    }

    public final void requestFocus() {
        if (this.isFocusGained) {
            this.logger.d(TAG, "Focus is already gained, ignore request");
            return;
        }
        this.logger.d(TAG, "Request audio focus. O+=true");
        releaseFocus();
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(false).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: xsna.oo4
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                AudioFocusRequestHelper.requestFocus$lambda$0(AudioFocusRequestHelper.this, i);
            }
        }, this.workerThreadHandler).build();
        this.audioFocusRequest = (AudioFocusRequest) handleAudioFocusRequestResult(build, this.audioManager.requestAudioFocus(build));
    }

    public /* synthetic */ AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, gzs gzsVar, Logger logger, gzs gzsVar2, gzs gzsVar3, int i, zcl zclVar) {
        this(audioManager, onMuteListener, handler, handler2, gzsVar, logger, (i & 64) != 0 ? new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }
        } : gzsVar2, (i & 128) != 0 ? new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }
        } : gzsVar3);
    }
}
