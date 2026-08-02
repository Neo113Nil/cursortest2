package com.yandex.passport.internal.ui.common.screen;

import com.yandex.passport.R;
import defpackage.agc;
import defpackage.bts;
import defpackage.dgc;
import defpackage.fid;
import defpackage.mt71;
import defpackage.p4v;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class a implements wls {
    public static final a a = new a();

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
        p4v.b(mt71.m(R.drawable.passport_error_slab_copy, 0, fidVar), null, null, ((agc) ((bts) fidVar).m(dgc.a)).f, fidVar, 48, 4);
        return zy11.a;
    }
}
