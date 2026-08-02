package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.R;
import defpackage.agc;
import defpackage.bts;
import defpackage.dgc;
import defpackage.fid;
import defpackage.mt71;
import defpackage.ohb1;
import defpackage.p4v;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class d0 implements wls {
    public static final d0 a = new d0();

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
        p4v.b(mt71.m(R.drawable.passport_ic_arrow_back, 0, fidVar), ohb1.e(fidVar, R.string.passport_common_back_button_content_description), null, ((agc) ((bts) fidVar).m(dgc.a)).a, fidVar, 0, 4);
        return zy11.a;
    }
}
