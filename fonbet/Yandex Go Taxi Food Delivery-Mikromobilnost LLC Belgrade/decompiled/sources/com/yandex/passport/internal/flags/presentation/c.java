package com.yandex.passport.internal.flags.presentation;

import defpackage.bts;
import defpackage.fid;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class c implements wls {
    public static final c b = new c(0);
    public static final c c = new c(1);
    public static final c w = new c(2);
    public static final c x = new c(3);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
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
                vqy0.c("Clear overrides", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fidVar, 6, 0, 262142);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                vqy0.c("Clear network cache", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fidVar2, 6, 0, 262142);
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                vqy0.c("Refresh network cache", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fidVar3, 6, 0, 262142);
                break;
            default:
                fid fidVar4 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar4;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                vqy0.c("Search", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fidVar4, 6, 0, 262142);
                break;
        }
        return zy11Var;
    }
}
