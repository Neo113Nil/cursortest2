package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class dj10 extends xij {
    public List a;
    public List b;
    public final /* synthetic */ ej10 c;

    public dj10(ej10 ej10Var) {
        this.c = ej10Var;
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        return jl40.l(this.a.get(i), this.b.get(i2));
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        return jl40.l(this.a.get(i), this.b.get(i2));
    }

    @Override // defpackage.xij
    public final int d() {
        return this.b.size();
    }

    @Override // defpackage.xij
    public final int e() {
        return this.a.size();
    }
}
