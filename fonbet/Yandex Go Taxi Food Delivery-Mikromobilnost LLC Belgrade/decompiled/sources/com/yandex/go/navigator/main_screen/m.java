package com.yandex.go.navigator.main_screen;

import defpackage.cg50;
import defpackage.iez;
import defpackage.qu;
import defpackage.rz60;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class m implements cg50 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.cg50
    public final void J0() {
        this.a.r(new iez(22));
    }

    @Override // defpackage.sy60
    public final void a() {
        o oVar = this.a;
        tje.N(oVar.o(), null, null, new MainScreenRootRouter$NavigatorSummaryRootExitListenerImpl$onExitCalledInside$1(oVar, null), 3);
    }

    @Override // defpackage.cg50
    public final void g0(String str) {
        o oVar = this.a;
        oVar.Q.l(new rz60(str));
        oVar.r(new qu(9));
    }
}
