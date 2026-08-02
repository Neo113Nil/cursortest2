package xsna;

import one.video.controls.views.preview.FullSeekPreviewLayout;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import one.video.transform.TransformController;

/* compiled from: TransformControllerListener.kt */
/* loaded from: classes2.dex */
public final class zjp0 implements TransformController.a {
    public final FullSeekPreviewLayout a;

    public zjp0(FullSeekPreviewLayout fullSeekPreviewLayout) {
        this.a = fullSeekPreviewLayout;
    }

    @Override // one.video.transform.TransformController.a
    public final void a(float f, float f2, float f3, float f4) {
        FullSeekPreviewLayout fullSeekPreviewLayout = this.a;
        VideoSeekPreviewImage videoSeekPreviewImage = fullSeekPreviewLayout.b;
        videoSeekPreviewImage.setScaleX(Math.max(1.0f, f));
        videoSeekPreviewImage.setScaleY(Math.max(1.0f, f2));
        fullSeekPreviewLayout.d = f;
        fullSeekPreviewLayout.c = f2;
        videoSeekPreviewImage.setTranslationX(f3);
        videoSeekPreviewImage.setTranslationY(f4);
    }

    @Override // one.video.transform.TransformController.a
    public final void b(TransformController.ScaleType scaleType) {
    }
}
