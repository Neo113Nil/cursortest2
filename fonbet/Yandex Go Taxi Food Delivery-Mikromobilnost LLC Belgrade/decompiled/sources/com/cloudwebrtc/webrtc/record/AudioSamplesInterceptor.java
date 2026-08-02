package com.cloudwebrtc.webrtc.record;

import java.util.HashMap;
import java.util.Iterator;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public class AudioSamplesInterceptor implements JavaAudioDeviceModule.SamplesReadyCallback {
    protected final HashMap<Integer, JavaAudioDeviceModule.SamplesReadyCallback> callbacks = new HashMap<>();

    public void attachCallback(Integer num, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) throws Exception {
        this.callbacks.put(num, samplesReadyCallback);
    }

    public void detachCallback(Integer num) {
        this.callbacks.remove(num);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        Iterator<JavaAudioDeviceModule.SamplesReadyCallback> it = this.callbacks.values().iterator();
        while (it.hasNext()) {
            it.next().onWebRtcAudioRecordSamplesReady(audioSamples);
        }
    }
}
