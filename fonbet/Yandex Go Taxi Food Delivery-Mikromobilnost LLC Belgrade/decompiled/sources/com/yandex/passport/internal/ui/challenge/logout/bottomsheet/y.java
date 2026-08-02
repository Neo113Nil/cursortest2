package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.oz40;
import defpackage.pw91;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u50;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class y implements wls {
    public final /* synthetic */ oz40 A;
    public final /* synthetic */ o0 a;
    public final /* synthetic */ s b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ androidx.compose.material3.w w;
    public final /* synthetic */ sls x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ sls z;

    public y(o0 o0Var, s sVar, tse tseVar, androidx.compose.material3.w wVar, sls slsVar, tls tlsVar, sls slsVar2, oz40 oz40Var) {
        this.a = o0Var;
        this.b = sVar;
        this.c = tseVar;
        this.w = wVar;
        this.x = slsVar;
        this.y = tlsVar;
        this.z = slsVar2;
        this.A = oz40Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = this.b.getLogoutReporter();
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-686779664);
        boolean e = btsVar2.e(this.c) | btsVar2.k(this.w) | btsVar2.k(this.x) | btsVar2.k(this.y) | btsVar2.k(this.z);
        Object Q = btsVar2.Q();
        if (e || Q == did.a) {
            final tse tseVar = this.c;
            final androidx.compose.material3.w wVar = this.w;
            final sls slsVar = this.x;
            final tls tlsVar = this.y;
            final sls slsVar2 = this.z;
            final oz40 oz40Var = this.A;
            tls tlsVar2 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.w
                @Override // defpackage.tls
                public final Object invoke(Object obj3) {
                    LogoutBottomsheetWish logoutBottomsheetWish = (LogoutBottomsheetWish) obj3;
                    tje.N(tse.this, null, null, new LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1(wVar, null), 3).w(new u50(logoutBottomsheetWish, slsVar, tlsVar, slsVar2, oz40Var, 28));
                    return zy11.a;
                }
            };
            btsVar2.o0(tlsVar2);
            Q = tlsVar2;
        }
        btsVar2.t(false);
        f530 u = pw91.u(c530.a, pw91.o(btsVar2), 14);
        c1.a(this.a, logoutReporter, (tls) Q, u, btsVar2, 0);
        return zy11.a;
    }
}
