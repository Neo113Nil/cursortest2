package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.jl40;
import defpackage.oz40;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BouncerComposeView b;

    public /* synthetic */ n(BouncerComposeView bouncerComposeView, int i) {
        this.a = i;
        this.b = bouncerComposeView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        oz40 oz40Var;
        com.yandex.passport.internal.report.reporters.n nVar;
        v vVar;
        AppTheme appTheme;
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        BouncerComposeView bouncerComposeView = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                oz40Var = bouncerComposeView.stateState;
                s1 s1Var = (s1) oz40Var.getValue();
                if (s1Var != null) {
                    r1 r1Var = s1Var.b;
                    nVar = bouncerComposeView.reporter;
                    nVar.l(s1Var);
                    bouncerComposeView.trackBouncerEvent(s1Var);
                    bts btsVar2 = (bts) fidVar;
                    btsVar2.e0(1059602453);
                    if (!jl40.l(r1Var, p1.a)) {
                        btsVar2.e0(-1887025233);
                        boolean e = btsVar2.e(bouncerComposeView) | btsVar2.e(s1Var);
                        Object Q = btsVar2.Q();
                        if (e || Q == did.a) {
                            Q = new BouncerComposeView$1$1$1$1$1(bouncerComposeView, s1Var, null);
                            btsVar2.o0(Q);
                        }
                        btsVar2.t(false);
                        zpn.e(btsVar2, (wls) Q, r1Var);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.t(false);
                        vVar = bouncerComposeView.rendererComponent;
                        r.c(vVar, s1Var.a, btsVar2, 0);
                        break;
                    }
                }
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                appTheme = bouncerComposeView.appTheme;
                boolean c = com.yandex.passport.common.ui.compose.d.c(appTheme, fidVar2);
                z = bouncerComposeView.isWhiteLabel;
                com.yandex.passport.common.ui.compose.theme.e.a(c, z, wwg.S(-2074710705, true, new n(bouncerComposeView, i2), fidVar2), fidVar2, 384, 0);
                break;
        }
        return zy11Var;
    }
}
