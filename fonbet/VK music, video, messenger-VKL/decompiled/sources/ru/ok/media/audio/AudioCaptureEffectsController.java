package ru.ok.media.audio;

import ru.ok.media.api.AudioEffectController;

/* loaded from: classes9.dex */
public class AudioCaptureEffectsController implements AudioEffectController {
    private static final String TAG = "ru.ok.media.audio.AudioCaptureEffectsController";
    private AudioCaptureNative capture;
    private AudioEffectsState state;

    private void applyState() {
        AudioCaptureNative audioCaptureNative = this.capture;
        if (audioCaptureNative != null) {
            audioCaptureNative.setAudioEffectsState(this.state);
        }
    }

    @Override // ru.ok.media.api.AudioEffectController
    public long getFilePlaybackPositionMS() {
        AudioCaptureNative audioCaptureNative = this.capture;
        if (audioCaptureNative != null) {
            return audioCaptureNative.getFilePlaybackPositionMS();
        }
        return -1L;
    }

    @Override // ru.ok.media.api.AudioEffectController
    public float getMicLevel() {
        AudioCaptureNative audioCaptureNative = this.capture;
        if (audioCaptureNative != null) {
            return audioCaptureNative.getMicLevel();
        }
        return -1.0f;
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void pause() {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setPause(true);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void play() {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setPause(false);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setAudioFilter(String str) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setFilter(str);
        applyState();
    }

    public void setCapture(AudioCaptureNative audioCaptureNative) {
        this.capture = audioCaptureNative;
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setFileShiftMS(int i) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setShiftMS(i);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setFileSpeakerVolume(float f) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setFileSpeakerVolume(f);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setFileStreamVolume(float f) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setFileStreamVolume(f);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setMicVolume(float f) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setMicVolume(f);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setMixToSpeakerEnabled(boolean z) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setMixToSpeaker(z);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setMusicHalfTone(int i) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setMusicHalftone(i);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setNoiseSuppression(boolean z) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setNoiseSuppressionEnabled(z);
        applyState();
    }

    @Override // ru.ok.media.api.AudioEffectController
    public void setPlaybackFile(String str) {
        AudioEffectsState audioEffectsState = new AudioEffectsState(this.state);
        this.state = audioEffectsState;
        audioEffectsState.setPlaybackFile(str);
        this.state.setPause(true);
        applyState();
    }
}
