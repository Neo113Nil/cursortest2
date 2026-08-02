package com.yandex.passport.internal.flags.presentation;

import defpackage.cms;
import defpackage.f530;
import defpackage.fid;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class r0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sls b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ cms z;

    public /* synthetic */ r0(sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, f530 f530Var, androidx.compose.runtime.internal.a aVar, int i) {
        this.b = slsVar;
        this.w = slsVar2;
        this.x = slsVar3;
        this.y = slsVar4;
        this.c = f530Var;
        this.z = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(196609);
                c1.a(this.b, (sls) obj5, (sls) obj4, (sls) obj3, this.c, (androidx.compose.runtime.internal.a) cmsVar, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                com.yandex.passport.sloth.ui.w.a((com.yandex.passport.sloth.ui.error.d) obj5, (com.yandex.passport.sloth.ui.string.a) obj4, (com.yandex.passport.common.ui.progress.g) obj3, this.b, (tls) cmsVar, this.c, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ r0(com.yandex.passport.sloth.ui.error.d dVar, com.yandex.passport.sloth.ui.string.a aVar, com.yandex.passport.common.ui.progress.g gVar, sls slsVar, tls tlsVar, f530 f530Var, int i) {
        this.w = dVar;
        this.x = aVar;
        this.y = gVar;
        this.b = slsVar;
        this.z = tlsVar;
        this.c = f530Var;
    }
}
