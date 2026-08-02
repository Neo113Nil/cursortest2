package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class akf0 extends eg00<ol60> {
    public final ain0<String> c;
    public final bi5 d;

    public akf0(ain0 ain0Var, bi5 bi5Var) {
        this.c = ain0Var;
        this.d = bi5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.eg00, xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, Object obj) {
        if (e0Var instanceof uj) {
            ((uj) e0Var).E(this.c.get());
            return;
        }
        boolean z = e0Var instanceof g0o0;
        bi5 bi5Var = this.d;
        if (z) {
            ((g0o0) e0Var).G = bi5Var;
        } else if (e0Var instanceof u5n0) {
            ((u5n0) e0Var).F = bi5Var;
        } else if (e0Var instanceof wts) {
            ((wts) e0Var).C = bi5Var;
        }
    }
}
