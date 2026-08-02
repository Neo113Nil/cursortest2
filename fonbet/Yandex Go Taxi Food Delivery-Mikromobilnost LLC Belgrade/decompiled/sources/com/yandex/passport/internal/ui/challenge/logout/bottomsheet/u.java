package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.fid;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ sls y;
    public final /* synthetic */ sls z;

    public /* synthetic */ u(boolean z, String str, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, int i) {
        this.a = 2;
        this.c = z;
        this.b = str;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = slsVar;
        this.z = slsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                b0.a((s) obj3, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                b0.a((s) obj3, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(1);
                com.yandex.passport.internal.social.esia.m.b(this.c, (String) obj3, this.w, this.x, this.y, this.z, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ u(s sVar, boolean z, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, int i, int i2) {
        this.a = i2;
        this.b = sVar;
        this.c = z;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = slsVar;
        this.z = slsVar2;
    }
}
