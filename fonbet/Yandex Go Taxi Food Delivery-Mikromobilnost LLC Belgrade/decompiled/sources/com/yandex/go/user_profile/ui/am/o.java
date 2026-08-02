package com.yandex.go.user_profile.ui.am;

import defpackage.adf0;
import defpackage.agd;
import defpackage.alb0;
import defpackage.jqr;
import defpackage.mff0;
import defpackage.tgf0;
import defpackage.tls;
import defpackage.v5;
import defpackage.xcf0;
import defpackage.yfd;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final /* synthetic */ class o implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s b;
    public final /* synthetic */ com.yandex.go.user_profile.ui.a c;
    public final /* synthetic */ Object w;

    public /* synthetic */ o(s sVar, tgf0 tgf0Var, com.yandex.go.user_profile.ui.a aVar) {
        this.b = sVar;
        this.w = tgf0Var;
        this.c = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        com.yandex.go.user_profile.ui.a aVar = this.c;
        s sVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                o oVar = new o(sVar, aVar, new p(sVar));
                oVar.invoke(xcf0.a);
                ((agd) yfdVar).e = new v5(13, sVar, oVar);
                agd agdVar = (agd) yfdVar;
                agdVar.c = new r(new jqr(((tgf0) obj2).a(((mff0) agdVar.a).a), new AmProfileRouter$content$1$2(sVar, oVar, null), 3), sVar);
                agdVar.g = new androidx.compose.runtime.internal.a(-1866065622, new alb0(1, (u) sVar.O.get()), true);
                break;
            default:
                com.yandex.go.coroutines.b.g(sVar.o(), null, null, new AmProfileRouter$content$1$handleAction$1$1(aVar, (adf0) obj, (p) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ o(s sVar, com.yandex.go.user_profile.ui.a aVar, p pVar) {
        this.b = sVar;
        this.c = aVar;
        this.w = pVar;
    }
}
