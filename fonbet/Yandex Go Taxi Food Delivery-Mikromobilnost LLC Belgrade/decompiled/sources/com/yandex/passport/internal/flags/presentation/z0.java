package com.yandex.passport.internal.flags.presentation;

import defpackage.f530;
import defpackage.fid;
import defpackage.sls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class z0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ z0(String str, sls slsVar, f530 f530Var, boolean z, int i) {
        this.b = str;
        this.c = slsVar;
        this.w = f530Var;
        this.x = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c1.i(vng.O(1), (fid) obj, this.c, this.w, this.b, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.properties.u.h(vng.O(385), (fid) obj, this.c, this.w, this.b, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ z0(boolean z, String str, sls slsVar, f530 f530Var, int i) {
        this.x = z;
        this.b = str;
        this.c = slsVar;
        this.w = f530Var;
    }
}
