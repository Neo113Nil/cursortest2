package com.yandex.passport.internal.ui.common.screen;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.internal.flags.presentation.k;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Throwable th, final boolean z, boolean z2, final sls slsVar, fid fidVar, final int i, final int i2) {
        Throwable th2;
        int i3;
        boolean z3;
        String str;
        boolean z4;
        Object Q;
        boolean e;
        Object Q2;
        final boolean z5;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1714860254);
        if ((i & 6) == 0) {
            th2 = th;
            i3 = (btsVar.e(th2) ? 4 : 2) | i;
        } else {
            th2 = th;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.a(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z2;
            i3 |= btsVar.a(z3) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(slsVar) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !btsVar.E()) {
                boolean z6 = i4 == 0 ? false : z3;
                com.yandex.passport.common.common.a applicationDetailsProvider = com.yandex.passport.internal.di.a.a().getApplicationDetailsProvider();
                com.yandex.passport.common.analytics.d analyticalIdentifiersProvider = com.yandex.passport.internal.di.a.a().getAnalyticalIdentifiersProvider();
                String a = ((com.yandex.passport.internal.common.e) applicationDetailsProvider).a();
                str = analyticalIdentifiersProvider.b().a;
                if (str == null) {
                    str = "";
                }
                d dVar = new d(th2, a, str, new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString(), z, z6);
                Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
                btsVar.e0(1497171322);
                z4 = (i3 & 7168) != 2048;
                Q = btsVar.Q();
                o430 o430Var = did.a;
                if (!z4 || Q == o430Var) {
                    Q = new k(12, slsVar);
                    btsVar.o0(Q);
                }
                sls slsVar2 = (sls) Q;
                btsVar.t(false);
                btsVar.e0(1497172659);
                e = btsVar.e(context);
                Q2 = btsVar.Q();
                if (!e || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.ui.bouncer.challenge.d(context, 2);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                c.c(dVar, slsVar2, (tls) Q2, btsVar, 0);
                z5 = z6;
            } else {
                btsVar.Y();
                z5 = z3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: com.yandex.passport.internal.ui.common.screen.e
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f.a(th, z, z5, slsVar, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        com.yandex.passport.common.common.a applicationDetailsProvider2 = com.yandex.passport.internal.di.a.a().getApplicationDetailsProvider();
        com.yandex.passport.common.analytics.d analyticalIdentifiersProvider2 = com.yandex.passport.internal.di.a.a().getAnalyticalIdentifiersProvider();
        String a2 = ((com.yandex.passport.internal.common.e) applicationDetailsProvider2).a();
        str = analyticalIdentifiersProvider2.b().a;
        if (str == null) {
        }
        d dVar2 = new d(th2, a2, str, new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString(), z, z6);
        Context context2 = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        btsVar.e0(1497171322);
        if ((i3 & 7168) != 2048) {
        }
        Q = btsVar.Q();
        o430 o430Var2 = did.a;
        if (!z4) {
        }
        Q = new k(12, slsVar);
        btsVar.o0(Q);
        sls slsVar22 = (sls) Q;
        btsVar.t(false);
        btsVar.e0(1497172659);
        e = btsVar.e(context2);
        Q2 = btsVar.Q();
        if (!e) {
        }
        Q2 = new com.yandex.passport.internal.ui.bouncer.challenge.d(context2, 2);
        btsVar.o0(Q2);
        btsVar.t(false);
        c.c(dVar2, slsVar22, (tls) Q2, btsVar, 0);
        z5 = z6;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
