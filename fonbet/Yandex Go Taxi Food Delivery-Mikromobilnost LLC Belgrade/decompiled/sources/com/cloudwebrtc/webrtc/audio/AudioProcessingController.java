package com.cloudwebrtc.webrtc.audio;

import org.webrtc.ExternalAudioProcessingFactory;

/* loaded from: classes10.dex */
public class AudioProcessingController {
    public final AudioProcessingAdapter capturePostProcessing;
    public ExternalAudioProcessingFactory externalAudioProcessingFactory;
    public final AudioProcessingAdapter renderPreProcessing;

    public AudioProcessingController() {
        AudioProcessingAdapter audioProcessingAdapter = new AudioProcessingAdapter();
        this.capturePostProcessing = audioProcessingAdapter;
        AudioProcessingAdapter audioProcessingAdapter2 = new AudioProcessingAdapter();
        this.renderPreProcessing = audioProcessingAdapter2;
        ExternalAudioProcessingFactory externalAudioProcessingFactory = new ExternalAudioProcessingFactory();
        this.externalAudioProcessingFactory = externalAudioProcessingFactory;
        externalAudioProcessingFactory.setCapturePostProcessing(audioProcessingAdapter);
        this.externalAudioProcessingFactory.setRenderPreProcessing(audioProcessingAdapter2);
    }
}
