package xsna;

import xsna.ft80;

/* compiled from: OpponentNetworkStatusHolder.kt */
/* loaded from: classes7.dex */
public final class gt80 implements ft80.a {
    public boolean a;
    public final /* synthetic */ ft80 b;

    public gt80(ft80 ft80Var) {
        this.b = ft80Var;
    }

    @Override // xsna.ft80.a
    public final void hide() {
        this.a = false;
        f4m.j(this.b.b);
    }

    @Override // xsna.ft80.a
    public final void show() {
        ft80 ft80Var = this.b;
        if (ft80Var.d) {
            this.a = true;
            ft80Var.b.setVisibility(0);
        }
    }
}
