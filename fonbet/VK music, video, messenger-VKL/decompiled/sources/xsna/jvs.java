package xsna;

import one.video.controls.view.seekpreview.SeekPreviewImageView;

/* compiled from: FullPreviewController.kt */
/* loaded from: classes3.dex */
public final class jvs extends v3d0 {
    public final c4u0 a;

    public jvs(c4u0 c4u0Var) {
        this.a = c4u0Var;
        SeekPreviewImageView seekPreviewImageView = c4u0Var.j;
        seekPreviewImageView.setShowBorder(false);
        seekPreviewImageView.setOutlineProvider(null);
        seekPreviewImageView.setClipToOutline(false);
        seekPreviewImageView.setBackgroundColor(-16777216);
        seekPreviewImageView.setImageLoader(new jl80());
    }

    @Override // xsna.v3d0
    public final c4u0 a() {
        return this.a;
    }

    @Override // xsna.v3d0
    public final void c() {
        this.a.j.setVisibility(0);
    }

    @Override // xsna.v3d0
    public final void d(long j) {
        this.a.j.setDuration(j);
    }

    @Override // xsna.v3d0
    public final void e(com.vk.movika.tools.controls.seekbar.y yVar, long j) {
        this.a.j.setPosition(j);
    }

    @Override // xsna.v3d0
    public final void f(boolean z) {
        c4u0 c4u0Var = this.a;
        bwt0.d0(c4u0Var.l, z);
        bwt0.p0(c4u0Var.m, !z);
    }

    @Override // xsna.v3d0
    public final void g(owo0 owo0Var) {
        this.a.j.setTimelineImages(owo0Var);
    }
}
