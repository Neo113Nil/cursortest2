package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.t6;
import com.yandex.passport.internal.report.u6;
import com.yandex.passport.internal.report.v6;
import com.yandex.passport.internal.report.w6;
import com.yandex.passport.internal.report.y6;
import com.yandex.passport.internal.report.yd;
import defpackage.oyr;
import defpackage.rcc;
import defpackage.w511;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class y extends l3 {
    public y(com.yandex.passport.internal.report.j jVar) {
        super(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Uid uid, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay) {
        v6 v6Var = v6.w;
        ListBuilder a = rcc.a();
        if (uid != null) {
            a.add(new yd(uid));
        }
        if (esiaBindingReporter$EsiaWay != null) {
            a.add(new com.yandex.passport.internal.report.i(esiaBindingReporter$EsiaWay.getValue(), 0, 0 == true ? 1 : 0));
        }
        e(v6Var, a.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Uid uid, String str, String str2, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay) {
        w6 w6Var = w6.w;
        ListBuilder a = rcc.a();
        if (uid != null) {
            a.add(new yd(uid));
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        a.add(new com.yandex.passport.internal.report.a(oyr.f(HexString.CHAR_SPACE, str, str2), 28, false));
        if (esiaBindingReporter$EsiaWay != null) {
            a.add(new com.yandex.passport.internal.report.i(esiaBindingReporter$EsiaWay.getValue(), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0));
        }
        e(w6Var, a.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Uid uid, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay) {
        y6 y6Var = y6.w;
        ListBuilder a = rcc.a();
        if (uid != null) {
            a.add(new yd(uid));
        }
        if (esiaBindingReporter$EsiaWay != null) {
            a.add(new com.yandex.passport.internal.report.i(esiaBindingReporter$EsiaWay.getValue(), 0, 0 == true ? 1 : 0));
        }
        e(y6Var, a.j());
    }

    public final void m(Uid uid, EsiaBindingReporter$FinishStatus esiaBindingReporter$FinishStatus, Throwable th) {
        ListBuilder a = rcc.a();
        if (uid != null) {
            a.add(new yd(uid));
        }
        if (th != null) {
            a.add(new yd(th));
        }
        int i = x.a[esiaBindingReporter$FinishStatus.ordinal()];
        boolean z = false;
        int i2 = 27;
        if (i == 1) {
            a.add(new com.yandex.passport.internal.report.a("success", i2, z));
        } else if (i == 2) {
            a.add(new com.yandex.passport.internal.report.a("cancelled", i2, z));
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            a.add(new com.yandex.passport.internal.report.a("error", i2, z));
        }
        e(t6.w, a.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Uid uid, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay) {
        u6 u6Var = u6.w;
        ListBuilder a = rcc.a();
        if (uid != null) {
            a.add(new yd(uid));
        }
        if (esiaBindingReporter$EsiaWay != null) {
            a.add(new com.yandex.passport.internal.report.i(esiaBindingReporter$EsiaWay.getValue(), 0, 0 == true ? 1 : 0));
        }
        e(u6Var, a.j());
    }
}
