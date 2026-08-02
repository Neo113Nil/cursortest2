package xsna;

import android.graphics.Rect;
import com.vk.libvideo.design.view.video.VideoView;
import xsna.xnt0;

/* compiled from: VideoUnderModalBottomSheetBehavior.kt */
/* loaded from: classes14.dex */
public final class unt0 implements xnt0.b {
    public final /* synthetic */ VideoView a;

    public unt0(VideoView videoView) {
        this.a = videoView;
    }

    @Override // xsna.xnt0.b
    public final Rect getRect() {
        return f4m.b(this.a.getViewBinding().j.getTextView());
    }

    @Override // xsna.xnt0.b
    public final int getRight() {
        return this.a.getViewBinding().j.getTextView().getRight();
    }

    @Override // xsna.xnt0.b
    public final void n(float f) {
        this.a.getViewBinding().j.setTranslationY(f);
    }

    @Override // xsna.xnt0.b
    public final void o(float f) {
        this.a.getViewBinding().j.setTranslationX(f);
    }

    @Override // xsna.xnt0.b
    public final float p() {
        return this.a.getViewBinding().j.getTranslationY();
    }
}
