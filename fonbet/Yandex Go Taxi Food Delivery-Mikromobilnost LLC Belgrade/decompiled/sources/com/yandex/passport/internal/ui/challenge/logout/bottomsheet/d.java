package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.R;
import defpackage.bts;
import defpackage.c36;
import defpackage.fid;
import defpackage.ldc;
import defpackage.mt71;
import defpackage.o4b1;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class d implements wls {
    public static final d a = new d();

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        o4b1.b(mt71.m(R.drawable.passport_bottomsheet_pin, 0, fidVar), null, null, null, null, 0.0f, new c36(ldc.b(ldc.f, 0.45f, 0.0f, 0.0f, 0.0f, 14), 5), fidVar, 1572912, 60);
        return zy11.a;
    }
}
