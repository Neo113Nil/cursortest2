package defpackage;

import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class b0m implements tww0, dez {
    public final bzl a;
    public final zjr b = new zjr(new hwn(), EmptyList.a);

    public b0m(bzl bzlVar) {
        this.a = bzlVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.b;
    }

    @Override // defpackage.tww0
    public final Object b(oju0 oju0Var, peo peoVar, Continuation continuation) {
        if (peoVar instanceof v0m) {
            v0m v0mVar = (v0m) peoVar;
            this.a.a.o(v0mVar.a, v0mVar.b);
        }
        return zy11.a;
    }
}
