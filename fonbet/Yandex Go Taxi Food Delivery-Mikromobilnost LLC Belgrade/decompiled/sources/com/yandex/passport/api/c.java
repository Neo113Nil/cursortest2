package com.yandex.passport.api;

import android.content.Context;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.f530;
import defpackage.fid;
import defpackage.tls;
import defpackage.tpr;
import defpackage.ub31;
import io.appmetrica.analytics.IReporterYandex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class c {
    public final IReporterYandex a;
    public final com.yandex.passport.internal.methods.requester.f b;

    public c(Context context, IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
        this.b = new com.yandex.passport.internal.methods.requester.f(context, new com.yandex.passport.common.network.u(context.getContentResolver(), com.yandex.passport.internal.util.p.l(context.getPackageName())), iReporterYandex);
    }

    public final void a(f530 f530Var, c3 c3Var, tls tlsVar, tpr tprVar, fid fidVar, int i) {
        c3 c3Var2;
        tls tlsVar2;
        tpr tprVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2008819989);
        int i2 = i | 6 | (btsVar.e(c3Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tprVar) ? 2048 : 1024) | (btsVar.e(this) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            tprVar2 = tprVar;
            tlsVar2 = tlsVar;
            c3Var2 = c3Var;
            f530Var2 = f530Var;
        } else {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var = c530.a;
            } else {
                btsVar.Y();
            }
            f530 f530Var3 = f530Var;
            btsVar.u();
            com.yandex.passport.internal.methods.requester.e eVar = new com.yandex.passport.internal.methods.requester.e(this.b);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            int i4 = i2 << 6;
            com.yandex.passport.user_id.ui.a.a(f530Var3, c3Var, this.a, eVar, tlsVar, tprVar, btsVar, i3 | (57344 & i4) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES));
            c3Var2 = c3Var;
            tlsVar2 = tlsVar;
            tprVar2 = tprVar;
            f530Var2 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ub31(this, f530Var2, c3Var2, tlsVar2, tprVar2, i);
        }
    }
}
