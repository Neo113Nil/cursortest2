package com.cloudwebrtc.webrtc.audio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public class PlaybackSamplesReadyCallbackAdapter implements JavaAudioDeviceModule.PlaybackSamplesReadyCallback {
    List<JavaAudioDeviceModule.PlaybackSamplesReadyCallback> callbacks = new ArrayList();

    public void addCallback(JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.add(playbackSamplesReadyCallback);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.PlaybackSamplesReadyCallback
    public void onWebRtcAudioTrackSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        Iterator<JavaAudioDeviceModule.PlaybackSamplesReadyCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onWebRtcAudioTrackSamplesReady(audioSamples);
        }
    }

    public void removeCallback(JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.remove(playbackSamplesReadyCallback);
        }
    }
}
