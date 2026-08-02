package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.cms;
import defpackage.f530;
import defpackage.fid;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ cms x;

    public /* synthetic */ b1(sls slsVar, f530 f530Var, androidx.compose.material3.w wVar, androidx.compose.runtime.internal.a aVar, int i) {
        this.c = slsVar;
        this.b = f530Var;
        this.w = wVar;
        this.x = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                c1.a((o0) obj4, (com.yandex.passport.internal.report.reporters.f0) obj3, (tls) cmsVar, this.b, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(3073);
                com.yandex.passport.internal.properties.u.e((sls) obj4, this.b, (androidx.compose.material3.w) obj3, (androidx.compose.runtime.internal.a) cmsVar, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ b1(o0 o0Var, com.yandex.passport.internal.report.reporters.f0 f0Var, tls tlsVar, f530 f530Var, int i) {
        this.c = o0Var;
        this.w = f0Var;
        this.x = tlsVar;
        this.b = f530Var;
    }
}
