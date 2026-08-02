package com.yandex.passport.internal.flags.presentation;

import defpackage.f530;
import defpackage.fid;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class m implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ f530 w;

    public /* synthetic */ m(String str, tls tlsVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = tlsVar;
        this.w = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.w;
        tls tlsVar = this.c;
        String str = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c1.b(vng.O(49), fidVar, tlsVar, f530Var, str);
                break;
            default:
                c1.m(vng.O(49), fidVar, tlsVar, f530Var, str);
                break;
        }
        return zy11Var;
    }
}
