package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.common.ui.progress.p;
import defpackage.bts;
import defpackage.fid;
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
        p.d(null, null, false, fidVar, 0, 7);
        return zy11.a;
    }
}
