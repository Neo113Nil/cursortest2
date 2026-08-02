package com.yandex.passport.internal.ui.common.component;

import defpackage.agc;
import defpackage.bq11;
import defpackage.bts;
import defpackage.dgc;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.fid;
import defpackage.vqy0;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                vqy0.c(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) ((bts) fidVar).m(eq11.a)).o, fidVar, 0, 0, 131070);
                break;
            case 1:
                fid fidVar2 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                vqy0.c(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) ((bts) fidVar2).m(eq11.a)).o, fidVar2, 0, 0, 131070);
                break;
            default:
                fid fidVar3 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                bts btsVar4 = (bts) fidVar3;
                ety0 ety0Var = ((bq11) btsVar4.m(eq11.a)).k;
                vqy0.c(this.b, null, ((agc) btsVar4.m(dgc.a)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ety0Var, fidVar3, 0, 0, 131066);
                break;
        }
        return zy11Var;
    }
}
