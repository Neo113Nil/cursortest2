package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class bip0 implements n390 {
    public final int a;
    public final List b;
    public Float c = null;
    public Float w = null;
    public bhp0 x = null;
    public bhp0 y = null;

    public bip0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void a(bhp0 bhp0Var) {
        this.x = bhp0Var;
    }

    public final void b(bhp0 bhp0Var) {
        this.y = bhp0Var;
    }

    @Override // defpackage.n390
    public final boolean isValidOwnerScope() {
        return this.b.contains(this);
    }
}
