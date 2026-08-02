package xsna;

import one.video.controls.view.seekbar.OneVideoSeekBarView;

/* compiled from: Seekbar.kt */
/* loaded from: classes7.dex */
public final class a4i0 implements OneVideoSeekBarView.a {
    public final /* synthetic */ b4i0 a;

    public a4i0(b4i0 b4i0Var) {
        this.a = b4i0Var;
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void c(long j, boolean z) {
        izs<? super Long, s3q0> izsVar = this.a.b;
        if (izsVar != null) {
            izsVar.invoke(Long.valueOf(j));
        }
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void a() {
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void d() {
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void b(sox soxVar, int i) {
    }
}
