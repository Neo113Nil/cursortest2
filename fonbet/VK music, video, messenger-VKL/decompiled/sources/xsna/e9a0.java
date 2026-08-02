package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.dga0;

/* compiled from: PhotoFlowView.kt */
/* loaded from: classes4.dex */
public final class e9a0 implements dga0.a {
    @Override // xsna.dga0.a
    public final boolean a(int i, RecyclerView.a0 a0Var) {
        return i != c(a0Var);
    }

    @Override // xsna.dga0.a
    public final int c(RecyclerView.a0 a0Var) {
        int b = a0Var.b();
        return b > 0 ? b - 1 : b;
    }

    @Override // xsna.dga0.a
    public final int b(int i) {
        return i;
    }
}
