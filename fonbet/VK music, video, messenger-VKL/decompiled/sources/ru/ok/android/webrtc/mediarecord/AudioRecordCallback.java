package ru.ok.android.webrtc.mediarecord;

import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import xsna.bjn0;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AudioRecordCallback implements JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "AudioRecordCallback";
    public final RTCLog a;
    public final izs b;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public AudioRecordCallback(RTCLog rTCLog, izs<? super AudioErrorEvent, s3q0> izsVar) {
        this.a = rTCLog;
        this.b = izsVar;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        bjn0.b("Audio record error: ", str, this.a, TAG);
        this.b.invoke(new AudioErrorEvent("record", "run", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        bjn0.b("Audio record init error: ", str, this.a, TAG);
        this.b.invoke(new AudioErrorEvent("record", "init", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStart() {
        this.a.log(TAG, "Audio record did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        this.a.log(TAG, "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
        this.b.invoke(new AudioErrorEvent("record", "start", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStop() {
        this.a.log(TAG, "Audio record did stop");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackError(String str) {
        bjn0.b("Audio track error: ", str, this.a, TAG);
        this.b.invoke(new AudioErrorEvent("playback", "run", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackInitError(String str) {
        bjn0.b("Audio track init error: ", str, this.a, TAG);
        this.b.invoke(new AudioErrorEvent("playback", "init", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStart() {
        this.a.log(TAG, "Audio track did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        this.a.log(TAG, "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
        this.b.invoke(new AudioErrorEvent("playback", "start", str, null, 8, null));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStop() {
        this.a.log(TAG, "Audio track did stop");
    }
}
