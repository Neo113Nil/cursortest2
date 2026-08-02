package com.yandex.passport.internal.ui.common;

import defpackage.bts;
import defpackage.fid;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.compose.runtime.internal.a b;

    public /* synthetic */ a(androidx.compose.runtime.internal.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        androidx.compose.runtime.internal.a aVar = this.b;
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
                aVar.invoke(fidVar, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(false, false, wwg.S(-635752478, true, new a(aVar, i2), fidVar2), fidVar2, 384, 3);
                break;
        }
        return zy11Var;
    }
}
