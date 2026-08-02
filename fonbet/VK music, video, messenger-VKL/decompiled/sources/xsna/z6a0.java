package xsna;

import xsna.ify;

/* compiled from: PhotoEditorSelectionStickerView.java */
/* loaded from: classes15.dex */
public final class z6a0 implements ify.a {
    public final /* synthetic */ x6a0 b;

    public z6a0(x6a0 x6a0Var) {
        this.b = x6a0Var;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        x6a0 x6a0Var = this.b;
        if (x6a0Var.c0 != null) {
            x6a0Var.f0.onNext(Boolean.FALSE);
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        x6a0 x6a0Var = this.b;
        if (x6a0Var.c0 != null) {
            x6a0Var.f0.onNext(Boolean.TRUE);
        }
    }
}
