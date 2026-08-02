package com.cloudwebrtc.webrtc.record;

import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoFileRenderer b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(VideoFileRenderer videoFileRenderer, Object obj, int i) {
        this.a = i;
        this.b = videoFileRenderer;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        VideoFileRenderer videoFileRenderer = this.b;
        switch (i) {
            case 0:
                videoFileRenderer.lambda$onWebRtcAudioRecordSamplesReady$4((JavaAudioDeviceModule.AudioSamples) obj);
                break;
            default:
                videoFileRenderer.lambda$onFrame$1((VideoFrame) obj);
                break;
        }
    }
}
