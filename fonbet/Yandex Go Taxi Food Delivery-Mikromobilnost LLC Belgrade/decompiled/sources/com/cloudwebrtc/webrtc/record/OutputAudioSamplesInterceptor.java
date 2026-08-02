package com.cloudwebrtc.webrtc.record;

import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioTrackUtils;

/* loaded from: classes10.dex */
public class OutputAudioSamplesInterceptor extends AudioSamplesInterceptor {
    private final JavaAudioDeviceModule audioDeviceModule;

    public OutputAudioSamplesInterceptor(JavaAudioDeviceModule javaAudioDeviceModule) {
        this.audioDeviceModule = javaAudioDeviceModule;
    }

    @Override // com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor
    public void attachCallback(Integer num, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) throws Exception {
        if (this.callbacks.isEmpty()) {
            WebRtcAudioTrackUtils.attachOutputCallback(this, this.audioDeviceModule);
        }
        super.attachCallback(num, samplesReadyCallback);
    }

    @Override // com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor
    public void detachCallback(Integer num) {
        super.detachCallback(num);
        if (this.callbacks.isEmpty()) {
            WebRtcAudioTrackUtils.detachOutputCallback(this.audioDeviceModule);
        }
    }
}
