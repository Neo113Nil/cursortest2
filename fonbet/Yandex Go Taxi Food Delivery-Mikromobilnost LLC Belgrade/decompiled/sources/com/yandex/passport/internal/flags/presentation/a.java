package com.yandex.passport.internal.flags.presentation;

import defpackage.agc;
import defpackage.bq11;
import defpackage.bts;
import defpackage.dgc;
import defpackage.eq11;
import defpackage.fid;
import defpackage.vqy0;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements zls {
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a w = new a(2);
    public static final a x = new a(3);
    public static final a y = new a(4);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
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
                bts btsVar2 = (bts) fidVar;
                vqy0.c("Cancel", null, ((agc) btsVar2.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(eq11.a)).o, fidVar, 6, 0, 131066);
                break;
            case 1:
                fid fidVar2 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                bts btsVar4 = (bts) fidVar2;
                vqy0.c("Clear", null, ((agc) btsVar4.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar4.m(eq11.a)).o, fidVar2, 6, 0, 131066);
                break;
            case 2:
                fid fidVar3 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar5 = (bts) fidVar3;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        break;
                    }
                }
                bts btsVar6 = (bts) fidVar3;
                vqy0.c("Confirm", null, ((agc) btsVar6.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar6.m(eq11.a)).o, fidVar3, 6, 0, 131066);
                break;
            case 3:
                fid fidVar4 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar7 = (bts) fidVar4;
                    if (btsVar7.E()) {
                        btsVar7.Y();
                        break;
                    }
                }
                bts btsVar8 = (bts) fidVar4;
                vqy0.c("Cancel", null, ((agc) btsVar8.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar8.m(eq11.a)).o, fidVar4, 6, 0, 131066);
                break;
            default:
                fid fidVar5 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar9 = (bts) fidVar5;
                    if (btsVar9.E()) {
                        btsVar9.Y();
                        break;
                    }
                }
                bts btsVar10 = (bts) fidVar5;
                vqy0.c("Select", null, ((agc) btsVar10.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar10.m(eq11.a)).o, fidVar5, 6, 0, 131066);
                break;
        }
        return zy11Var;
    }
}
