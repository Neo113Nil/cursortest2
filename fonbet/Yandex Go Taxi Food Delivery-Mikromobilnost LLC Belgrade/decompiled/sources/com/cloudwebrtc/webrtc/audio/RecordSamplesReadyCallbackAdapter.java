package com.cloudwebrtc.webrtc.audio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public class RecordSamplesReadyCallbackAdapter implements JavaAudioDeviceModule.SamplesReadyCallback {
    List<JavaAudioDeviceModule.SamplesReadyCallback> callbacks = new ArrayList();

    public void addCallback(JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.add(samplesReadyCallback);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        synchronized (this.callbacks) {
            try {
                Iterator<JavaAudioDeviceModule.SamplesReadyCallback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onWebRtcAudioRecordSamplesReady(audioSamples);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeCallback(JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.remove(samplesReadyCallback);
        }
    }
}
