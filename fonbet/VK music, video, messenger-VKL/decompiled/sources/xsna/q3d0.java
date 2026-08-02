package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: PreviewAnimationCallback.kt */
/* loaded from: classes16.dex */
public final class q3d0 extends c56 {
    public final ImageView b;

    public q3d0(VKImageView vKImageView) {
        this.b = vKImageView;
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    @Override // xsna.c56
    public final View f() {
        return this.b;
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.CROP;
    }

    @Override // xsna.io2
    public final void C() {
    }

    @Override // xsna.io2
    public final void D0() {
    }

    @Override // xsna.io2
    public final void J() {
    }

    @Override // xsna.io2
    public final void e0() {
    }
}
