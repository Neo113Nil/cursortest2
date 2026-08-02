package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class dhz implements xmi0, dez {
    public final zmi0 a;
    public final zjr b = new zjr(new hwn(), EmptyList.a);

    public dhz(zmi0 zmi0Var) {
        this.a = zmi0Var;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.b;
    }

    @Override // defpackage.xmi0
    public final Object b(Object obj, peo peoVar) {
        return this.a.invoke(obj, peoVar);
    }
}
