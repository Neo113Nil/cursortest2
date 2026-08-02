package com.cloudwebrtc.webrtc.record;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoFileRenderer b;

    public /* synthetic */ a(VideoFileRenderer videoFileRenderer, int i) {
        this.a = i;
        this.b = videoFileRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoFileRenderer videoFileRenderer = this.b;
        switch (i) {
            case 0:
                videoFileRenderer.lambda$release$2();
                break;
            case 1:
                videoFileRenderer.lambda$release$3();
                break;
            default:
                videoFileRenderer.lambda$initVideoEncoder$0();
                break;
        }
    }
}
