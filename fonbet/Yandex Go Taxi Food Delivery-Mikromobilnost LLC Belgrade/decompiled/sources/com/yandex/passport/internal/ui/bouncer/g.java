package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.challenge.delete.z0;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.y0;
import defpackage.n3w;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class g implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final Object e;

    public g(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var) {
        this.a = 1;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        yvf0 yvf0Var3 = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                com.yandex.passport.internal.flags.j jVar = (com.yandex.passport.internal.flags.j) yvf0Var3.get();
                ((d) obj).getClass();
                return ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.S)).booleanValue() ? (p) yvf0Var.get() : (p) yvf0Var2.get();
            case 1:
                return new z0((com.yandex.passport.internal.ui.sloth.l) yvf0Var3.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) yvf0Var2.get(), (f0) yvf0Var.get(), (com.yandex.passport.sloth.ui.dependencies.p) ((xvf0) obj).get());
            case 2:
                SlothParams slothParams = (SlothParams) yvf0Var3.get();
                com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) ((xvf0) yvf0Var).get();
                com.yandex.passport.internal.ui.sloth.i iVar = (com.yandex.passport.internal.ui.sloth.i) yvf0Var2.get();
                ((com.yandex.passport.internal.ui.sloth.u) obj).getClass();
                com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                oVar.a = slothParams;
                oVar.b = iVar.a();
                oVar.c = bVar;
                c1 a = oVar.a().a();
                q5z.i(a);
                return a;
            case 3:
                SlothParams slothParams2 = (SlothParams) yvf0Var3.get();
                com.yandex.passport.sloth.dependencies.b bVar2 = (com.yandex.passport.sloth.dependencies.b) ((xvf0) yvf0Var).get();
                com.yandex.passport.sloth.dependencies.f fVar = (com.yandex.passport.sloth.dependencies.f) yvf0Var2.get();
                ((com.yandex.passport.internal.ui.sloth.screen.b) obj).getClass();
                com.yandex.passport.internal.ui.challenge.vpn.o oVar2 = new com.yandex.passport.internal.ui.challenge.vpn.o();
                oVar2.a = slothParams2;
                oVar2.b = fVar;
                oVar2.c = bVar2;
                c1 a2 = oVar2.a().a();
                q5z.i(a2);
                return a2;
            default:
                return new com.yandex.passport.sloth.command.performers.l((SlothParams) ((n3w) obj).a, (com.yandex.passport.sloth.v) yvf0Var3.get(), (com.yandex.passport.sloth.z0) yvf0Var2.get(), (y0) ((com.yandex.passport.internal.ui.j) yvf0Var).get());
        }
    }

    public /* synthetic */ g(Object obj, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, int i) {
        this.a = i;
        this.e = obj;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
    }

    public /* synthetic */ g(Object obj, yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.e = obj;
        this.b = yvf0Var;
        this.d = xvf0Var;
        this.c = yvf0Var2;
    }
}
