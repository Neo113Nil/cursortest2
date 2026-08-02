package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.wac0;

/* compiled from: BottomPanelPosterDelegate.kt */
/* loaded from: classes4.dex */
public final class o68 implements fux<xac0>, wac0.b {
    public static final int f = iah0.a(2);
    public RecyclerView b;
    public final LinearLayoutManager c = new LinearLayoutManager(0, false);
    public final wac0 d = new wac0(this, this);
    public qdc0 e;

    @Override // xsna.wac0.b
    public final void b() {
        qdc0 qdc0Var = this.e;
        if (qdc0Var != null) {
            qdc0Var.Cf();
        }
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        xac0 xac0Var = (xac0) obj;
        qdc0 qdc0Var = this.e;
        if (qdc0Var != null) {
            qdc0Var.h8(xac0Var);
        }
    }

    @Override // xsna.wac0.b
    public final void o() {
        qdc0 qdc0Var = this.e;
        if (qdc0Var != null) {
            qdc0Var.E6();
        }
    }
}
