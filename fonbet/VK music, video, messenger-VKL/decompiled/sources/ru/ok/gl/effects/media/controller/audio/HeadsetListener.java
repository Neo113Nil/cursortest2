package ru.ok.gl.effects.media.controller.audio;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import xsna.o7j;

/* loaded from: classes9.dex */
public final class HeadsetListener {
    private final AudioManager audioManager;
    private final Handler callbackHandler;

    @Nullable
    private o7j headsetCallback;
    private volatile boolean headsetsOn;
    private final AudioDeviceCallback registerCallback;

    public HeadsetListener(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.audioManager = audioManager;
        Handler handler = new Handler(Looper.getMainLooper());
        this.callbackHandler = handler;
        AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: ru.ok.gl.effects.media.controller.audio.HeadsetListener.1
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                HeadsetListener headsetListener = HeadsetListener.this;
                headsetListener.setHeadsetsOn(HeadsetListener.this.getHeadsetsState(audioDeviceInfoArr) | headsetListener.getHeadsetsOn());
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(@Nullable AudioDeviceInfo[] audioDeviceInfoArr) {
                HeadsetListener headsetListener = HeadsetListener.this;
                headsetListener.setHeadsetsOn(headsetListener.getHeadsetsState());
            }
        };
        this.registerCallback = audioDeviceCallback;
        setHeadsetsOn(getHeadsetsState());
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHeadsetsState() {
        return getHeadsetsState(this.audioManager.getDevices(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHeadsetsOn(boolean z) {
        this.headsetsOn = z;
        o7j o7jVar = this.headsetCallback;
        if (o7jVar != null) {
            o7jVar.accept(Boolean.valueOf(z));
        }
    }

    @Nullable
    public final o7j getHeadsetCallback() {
        return this.headsetCallback;
    }

    public final boolean getHeadsetsOn() {
        return this.headsetsOn;
    }

    public final void release() {
        this.callbackHandler.removeCallbacksAndMessages(null);
        this.audioManager.unregisterAudioDeviceCallback(this.registerCallback);
    }

    public final void setHeadsetCallback(@Nullable o7j o7jVar) {
        this.headsetCallback = o7jVar;
        if (o7jVar != null) {
            o7jVar.accept(Boolean.valueOf(this.headsetsOn));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHeadsetsState(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                return true;
            }
        }
        return false;
    }
}
