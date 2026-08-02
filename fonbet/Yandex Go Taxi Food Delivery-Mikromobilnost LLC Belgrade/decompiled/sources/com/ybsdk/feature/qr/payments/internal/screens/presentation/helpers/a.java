package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.c6g0;
import defpackage.d9g0;
import defpackage.e9g0;
import defpackage.gci0;
import defpackage.h9g0;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.ka6;
import defpackage.l031;
import defpackage.lbg0;
import defpackage.lrp0;
import defpackage.n031;
import defpackage.n9g0;
import defpackage.o031;
import defpackage.odf0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q031;
import defpackage.qca1;
import defpackage.r031;
import defpackage.rr51;
import defpackage.rzj0;
import defpackage.s7g0;
import defpackage.sue0;
import defpackage.t8g0;
import defpackage.tje;
import defpackage.tzj0;
import defpackage.v031;
import defpackage.w511;
import defpackage.x4c;
import defpackage.yj1;
import defpackage.yxf0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a {
    public final k5c a;
    public final gci0 b;
    public final sue0 c;
    public final com.ybsdk.feature.qr.payments.internal.domain.v2.b d;
    public final yxf0 e;
    public pzt0 f;

    public a(lbg0 lbg0Var, k5c k5cVar, com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar, c6g0 c6g0Var, gci0 gci0Var, sue0 sue0Var, t8g0 t8g0Var) {
        this.a = k5cVar;
        this.b = gci0Var;
        this.c = sue0Var;
        this.d = lbg0Var.a(c6g0Var, bVar);
        this.e = new yxf0((AppAnalyticsReporter) t8g0Var.a.a.get(), c6g0Var.d);
    }

    public static List b(v031 v031Var) {
        if (jl40.l(v031Var, o031.a)) {
            return null;
        }
        if (v031Var instanceof q031) {
            return ((q031) v031Var).c;
        }
        if (v031Var instanceof l031) {
            return ((l031) v031Var).e;
        }
        if (v031Var instanceof n031) {
            return ((n031) v031Var).a;
        }
        if (v031Var instanceof r031) {
            return b(v031Var);
        }
        w511.b();
        return null;
    }

    public final void a(String str, boolean z) {
        v031 v031Var;
        String str2;
        d9g0 d9g0Var = (d9g0) this.b.a.getValue();
        if (d9g0Var == null) {
            return;
        }
        yj1 yj1Var = d9g0Var.f;
        v031 v031Var2 = d9g0Var.n;
        boolean z2 = v031Var2 instanceof r031;
        o031 o031Var = o031.a;
        if (z2) {
            v031Var = ((r031) v031Var2).a;
        } else {
            if (!(v031Var2 instanceof n031) && !jl40.l(v031Var2, o031Var) && !(v031Var2 instanceof q031) && !(v031Var2 instanceof l031)) {
                w511.b();
                return;
            }
            v031Var = v031Var2;
        }
        if (yj1Var == null || (str2 = yj1Var.a) == null) {
            return;
        }
        if (str == null) {
            str = d9g0Var.h;
        }
        String str3 = str;
        String str4 = yj1Var.c;
        QrPaymentBankInfo qrPaymentBankInfo = str4 != null ? new QrPaymentBankInfo(yj1Var.b, str4, yj1Var.d) : null;
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (BigDecimal.ZERO.compareTo(d9g0Var.g) != 0) {
            pzt0 N = tje.N(this.a, null, null, new QrPaymentsAmountInputHelper$checkPayment$2(this, str2, d9g0Var, str3, qrPaymentBankInfo, v031Var, z, null), 3);
            N.w(new odf0(5, this));
            this.f = N;
            return;
        }
        boolean l = jl40.l(v031Var2, o031Var);
        sue0 sue0Var = this.c;
        if (!l) {
            sue0Var.o(new s7g0(d9g0Var, 2));
        }
        if (z) {
            ((com.ybsdk.feature.qr.payments.internal.screens.presentation.b) sue0Var.b).Z(n9g0.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ?? r0;
        r0 r0Var;
        Object value;
        String str;
        rzj0 rzj0Var;
        com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar = (com.ybsdk.feature.qr.payments.internal.screens.presentation.b) this.c.b;
        d9g0 d9g0Var = (d9g0) this.b.a.getValue();
        if (d9g0Var == null) {
            return;
        }
        v031 v031Var = d9g0Var.n;
        if (!(v031Var instanceof l031)) {
            if ((v031Var instanceof q031) || (v031Var instanceof n031) || jl40.l(v031Var, o031.a) || (v031Var instanceof r031)) {
                bVar.Z(n9g0.a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        d9g0 b = qca1.b((h9g0) bVar.X());
        if (b == null) {
            return;
        }
        ThemedImageUrlEntity themedImageUrlEntity = b.a;
        String str2 = b.b;
        BigDecimal bigDecimal = b.g;
        String str3 = b.c;
        PageImageHeaderEntity pageImageHeaderEntity = b.d;
        String str4 = b.e;
        v031 v031Var2 = b.n;
        boolean z = v031Var2 instanceof l031;
        e9g0 e9g0Var = null;
        l031 l031Var = z ? (l031) v031Var2 : null;
        if (l031Var != null && (str = l031Var.a) != null) {
            yj1 yj1Var = b.f;
            if (yj1Var == null) {
                r0 = 0;
            } else {
                l031 l031Var2 = z ? (l031) v031Var2 : null;
                if (l031Var2 != null && (rzj0Var = l031Var2.c) != null) {
                    tzj0 tzj0Var = new tzj0(ResultStatus.PROCESSING, null, 14);
                    l031 l031Var3 = z ? (l031) v031Var2 : null;
                    rr51 rr51Var = l031Var3 != null ? l031Var3.d : null;
                    l031 l031Var4 = z ? (l031) v031Var2 : null;
                    String str5 = l031Var4 != null ? l031Var4.f : null;
                    ka6 ka6Var = b.p;
                    BoostStrategy boostStrategy = ka6Var != null ? ka6Var.a : null;
                    r0 = 0;
                    e9g0Var = new e9g0(themedImageUrlEntity, str2, str3, pageImageHeaderEntity, str4, yj1Var, bigDecimal, str5, rzj0Var, str, tzj0Var, null, null, rr51Var, boostStrategy);
                }
            }
            if (e9g0Var != null) {
                x4c.g("Can't convert amount state to result state", r0, r0, Collections.singletonList(lrp0.x), 6);
                return;
            }
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new h9g0(e9g0Var)));
            bVar.k0(r0);
            return;
        }
        r0 = 0;
        e9g0Var = null;
        if (e9g0Var != null) {
        }
    }
}
