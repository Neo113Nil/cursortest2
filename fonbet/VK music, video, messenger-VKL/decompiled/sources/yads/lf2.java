package yads;

/* loaded from: classes10.dex */
public final class lf2 {
    public final dw0 a = new dw0();

    public final lf2 a(int i) {
        this.a.a(i);
        return this;
    }

    public final lf2 a(mf2 mf2Var) {
        dw0 dw0Var = this.a;
        ew0 ew0Var = mf2Var.b;
        dw0Var.getClass();
        for (int i = 0; i < ew0Var.a.size(); i++) {
            dw0Var.a(ew0Var.a(i));
        }
        return this;
    }

    public final lf2 a(int... iArr) {
        dw0 dw0Var = this.a;
        dw0Var.getClass();
        for (int i : iArr) {
            dw0Var.a(i);
        }
        return this;
    }

    public final lf2 a(boolean z, int i) {
        dw0 dw0Var = this.a;
        if (z) {
            dw0Var.a(i);
            return this;
        }
        dw0Var.getClass();
        return this;
    }

    public final mf2 a() {
        return new mf2(this.a.a());
    }
}
