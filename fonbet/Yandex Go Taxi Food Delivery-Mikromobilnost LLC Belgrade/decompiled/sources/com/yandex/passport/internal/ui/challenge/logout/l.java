package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.internal.flags.presentation.c1;
import defpackage.f530;
import defpackage.fid;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class l implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ l(com.yandex.passport.internal.flags.b bVar, String str, tls tlsVar, f530 f530Var, int i) {
        this.a = 2;
        this.b = bVar;
        this.w = str;
        this.c = tlsVar;
        this.x = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                m.a((k) obj5, this.c, (tls) obj4, (tls) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                m.a((k) obj5, this.c, (tls) obj4, (tls) obj3, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(385);
                c1.c((com.yandex.passport.internal.flags.b) obj5, (String) obj4, this.c, (f530) obj3, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ l(k kVar, tls tlsVar, tls tlsVar2, tls tlsVar3, int i, int i2) {
        this.a = i2;
        this.b = kVar;
        this.c = tlsVar;
        this.w = tlsVar2;
        this.x = tlsVar3;
    }
}
