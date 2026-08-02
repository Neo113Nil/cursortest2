package defpackage;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class b301 implements tww0, dez {
    public final l1o a;
    public final jol0 b;
    public final i7x0 c;
    public final lb7 w;
    public final zjr x = new zjr(new hwn(), EmptyList.a);

    public b301(l1o l1oVar, jol0 jol0Var, i7x0 i7x0Var, lb7 lb7Var) {
        this.a = l1oVar;
        this.b = jol0Var;
        this.c = i7x0Var;
        this.w = lb7Var;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.x;
    }

    @Override // defpackage.tww0
    public final Object b(oju0 oju0Var, peo peoVar, Continuation continuation) {
        boolean z = peoVar instanceof d1m;
        lb7 lb7Var = this.w;
        i7x0 i7x0Var = this.c;
        l1o l1oVar = this.a;
        jol0 jol0Var = this.b;
        if (z) {
            d1m d1mVar = (d1m) peoVar;
            u1m u1mVar = d1mVar.a;
            ((i3m) s8o.W(this, jol0Var)).onDocumentLoadingStarted(l1oVar, u1mVar, i7x0Var.c(), d1mVar.b);
            lb7Var.z(new e1m(l1oVar, u1mVar));
        } else if (peoVar instanceof x0m) {
            x0m x0mVar = (x0m) peoVar;
            u1m u1mVar2 = x0mVar.a;
            ArrayList c = i7x0Var.c();
            i3m i3mVar = (i3m) s8o.W(this, jol0Var);
            xzl xzlVar = x0mVar.b;
            i3mVar.onDocumentLoadingFinished(l1oVar, u1mVar2, xzlVar, c);
            lb7Var.z(new y0m(l1oVar, u1mVar2, xzlVar.a, c));
        } else if (peoVar instanceof v0m) {
            v0m v0mVar = (v0m) peoVar;
            u1m u1mVar3 = v0mVar.a;
            ArrayList c2 = i7x0Var.c();
            i3m i3mVar2 = (i3m) s8o.W(this, jol0Var);
            Throwable th = v0mVar.b;
            i3mVar2.onDocumentLoadingFailed(l1oVar, u1mVar3, th, c2);
            lb7Var.z(new w0m(l1oVar, u1mVar3, th, c2));
        } else if (peoVar instanceof t0m) {
            t0m t0mVar = (t0m) peoVar;
            u1m u1mVar4 = t0mVar.a;
            ((i3m) s8o.W(this, jol0Var)).onDocumentLoadingCancelled(l1oVar, u1mVar4, i7x0Var.c(), t0mVar.b);
            lb7Var.z(new u0m(l1oVar, u1mVar4));
        } else if (peoVar instanceof vbe0) {
            vbe0 vbe0Var = (vbe0) peoVar;
            u1m u1mVar5 = vbe0Var.a;
            i3m i3mVar3 = (i3m) s8o.W(this, jol0Var);
            wbe0 wbe0Var = vbe0Var.b;
            i3mVar3.onPortionLoadingStarted(l1oVar, u1mVar5, wbe0Var, i7x0Var.c());
            lb7Var.z(new c1m(l1oVar, u1mVar5, wbe0Var));
        } else if (peoVar instanceof ube0) {
            ube0 ube0Var = (ube0) peoVar;
            i3m i3mVar4 = (i3m) s8o.W(this, jol0Var);
            u1m u1mVar6 = ube0Var.a;
            wbe0 wbe0Var2 = ube0Var.b;
            xzl xzlVar2 = ube0Var.c;
            i3mVar4.onPortionLoadingFinished(l1oVar, u1mVar6, wbe0Var2, xzlVar2.a, i7x0Var.c());
            lb7Var.z(new b1m(l1oVar, ube0Var.a, ube0Var.b, xzlVar2.a));
        } else if (peoVar instanceof tbe0) {
            tbe0 tbe0Var = (tbe0) peoVar;
            ((i3m) s8o.W(this, jol0Var)).onPortionLoadingFailed(l1oVar, tbe0Var.a, tbe0Var.b, tbe0Var.c, i7x0Var.c());
            lb7Var.z(new a1m(l1oVar, tbe0Var.a, tbe0Var.b, tbe0Var.c));
        } else if (peoVar instanceof sbe0) {
            sbe0 sbe0Var = (sbe0) peoVar;
            ((i3m) s8o.W(this, jol0Var)).onPortionLoadingCancelled(l1oVar, sbe0Var.a, sbe0Var.b, i7x0Var.c(), sbe0Var.c);
            lb7Var.z(new z0m(l1oVar, sbe0Var.a, sbe0Var.b));
        }
        return zy11.a;
    }
}
