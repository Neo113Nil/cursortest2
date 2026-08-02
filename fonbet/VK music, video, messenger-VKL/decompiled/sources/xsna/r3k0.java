package xsna;

import one.video.controls.view.seekpreview.SeekPreviewImageView;

/* compiled from: SmallPreviewController.kt */
/* loaded from: classes3.dex */
public final class r3k0 extends v3d0 {
    public final c4u0 a;

    public r3k0(c4u0 c4u0Var) {
        this.a = c4u0Var;
        SeekPreviewImageView seekPreviewImageView = c4u0Var.i;
        seekPreviewImageView.setBackgroundColor(-16777216);
        seekPreviewImageView.setImageLoader(new jl80());
    }

    @Override // xsna.v3d0
    public final c4u0 a() {
        return this.a;
    }

    @Override // xsna.v3d0
    public final void c() {
        this.a.h.setVisibility(0);
    }

    @Override // xsna.v3d0
    public final void d(long j) {
        this.a.i.setDuration(j);
    }

    @Override // xsna.v3d0
    public final void e(com.vk.movika.tools.controls.seekbar.y yVar, long j) {
        c4u0 c4u0Var = this.a;
        c4u0Var.i.setPosition(j);
        c4u0Var.h.setTranslationX(swe0.f((c4u0Var.f.getWidth() * (j / yVar.getMaxCurrent())) - (c4u0Var.h.getWidth() / 2), c4u0Var.f.getPaddingStart(), (c4u0Var.f.getWidth() - c4u0Var.h.getWidth()) - c4u0Var.f.getPaddingEnd()));
    }

    @Override // xsna.v3d0
    public final void f(boolean z) {
        c4u0 c4u0Var = this.a;
        bwt0.d0(c4u0Var.k, z);
        bwt0.p0(c4u0Var.m, !z);
    }

    @Override // xsna.v3d0
    public final void g(owo0 owo0Var) {
        this.a.i.setTimelineImages(owo0Var);
    }
}
