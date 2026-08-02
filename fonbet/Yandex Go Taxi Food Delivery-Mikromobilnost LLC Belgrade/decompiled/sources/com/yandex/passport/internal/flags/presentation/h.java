package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.R;
import defpackage.bts;
import defpackage.fid;
import defpackage.mt71;
import defpackage.p4v;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class h implements wls {
    public static final h a = new h();

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
        p4v.b(mt71.m(R.drawable.passport_search_24, 0, fidVar), null, null, 0L, fidVar, 48, 12);
        return zy11.a;
    }
}
