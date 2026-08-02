package xsna;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vkontakte.android.R;

/* compiled from: ShopsClipsGridBlockAnimationDialogCallback.kt */
/* loaded from: classes17.dex */
public final class wej0 extends c56 implements po2 {
    public final kih0 b;
    public final int c;
    public final gbe d;

    public wej0(kih0 kih0Var, int i, gbe gbeVar) {
        this.b = kih0Var;
        this.c = i;
        this.d = gbeVar;
    }

    @Override // xsna.io2
    public final void C() {
        bmp0.a(null);
        this.d.i();
    }

    @Override // xsna.io2
    public final void D0() {
        bmp0.a(null);
    }

    @Override // xsna.io2
    public final void J() {
        yg5 yg5Var = bmp0.a;
        bmp0.a(d370.R(this.b));
    }

    @Override // xsna.io2
    public final boolean M() {
        return true;
    }

    @Override // xsna.po2
    public final void c() {
        this.d.d(this.c, this.b);
    }

    @Override // xsna.io2
    public final void e0() {
        yg5 yg5Var = bmp0.a;
        bmp0.a(d370.R(this.b));
    }

    @Override // xsna.c56
    public final View f() {
        return this.d.f(this.c);
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.CROP;
    }

    @Override // xsna.c56, xsna.io2
    public final float i0() {
        return e3m.a(R.dimen.vk_ui_spacing_size_xl, this.d.g());
    }
}
