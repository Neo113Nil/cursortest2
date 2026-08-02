package com.ybsdk.screens.divbottomsheet;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$GeneralNoticeOpenedStatus;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentSplitShutterLoadedResult;
import defpackage.ahk;
import defpackage.b3z;
import defpackage.ds31;
import defpackage.ehk;
import defpackage.em3;
import defpackage.f42;
import defpackage.fhk;
import defpackage.g8e;
import defpackage.ghk;
import defpackage.hhk;
import defpackage.jl40;
import defpackage.khk;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.w2y;
import defpackage.w511;
import defpackage.x3;
import defpackage.xgk;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class c extends w2y {
    public final a A;
    public final b3z B;
    public final f42 C;
    public final xgk D;
    public pzt0 E;
    public final khk F;
    public final x3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(x3 x3Var, hhk hhkVar, a aVar, b3z b3zVar, f42 f42Var, xgk xgkVar) {
        super(new ghk(r1 != null ? r1.z : null, 13), hhkVar);
        ehk ehkVar = x3Var instanceof ehk ? (ehk) x3Var : null;
        this.z = x3Var;
        this.A = aVar;
        this.B = b3zVar;
        this.C = f42Var;
        this.D = xgkVar;
        khk khkVar = new khk(0, this);
        this.F = khkVar;
        X();
        b3zVar.a(khkVar);
        b3zVar.a(new khk(1, this));
    }

    public final void W(Object obj, String str) {
        Object value;
        Object value2;
        boolean z = obj instanceof Result.Failure;
        f42 f42Var = this.C;
        r0 r0Var = this.w;
        if (!z) {
            ahk ahkVar = (ahk) obj;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, ghk.a((ghk) value2, ahkVar.a, false, false, null, 16)));
            if (str != null) {
                f42Var.getClass();
                TargetType targetType = TargetType.QR_CREDLIM_PAYMENT_TERM;
                if (!jl40.l(str, targetType.getTarget())) {
                    targetType = TargetType.CUSTOM;
                }
                int i = d.a[targetType.ordinal()];
                if (i == 1) {
                    f42Var.b.Y.B(QrPaymentEvents$QrPaymentSplitShutterLoadedResult.OK, null);
                } else if (i != 2) {
                    w511.b();
                    return;
                }
            }
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, ghk.a((ghk) value, null, false, true, a, 17)));
            if (str != null) {
                String message = a.getMessage();
                AppAnalyticsReporter appAnalyticsReporter = f42Var.b;
                em3 em3Var = appAnalyticsReporter.o;
                CommonEvents$GeneralNoticeOpenedStatus commonEvents$GeneralNoticeOpenedStatus = CommonEvents$GeneralNoticeOpenedStatus.ERROR;
                LinkedHashMap w = g8e.w(2, "target", str);
                w.put(ACSPConstants.STATUS, commonEvents$GeneralNoticeOpenedStatus.getOriginalValue());
                em3Var.a.a("general_notice.opened", w);
                TargetType targetType2 = TargetType.QR_CREDLIM_PAYMENT_TERM;
                if (!jl40.l(str, targetType2.getTarget())) {
                    targetType2 = TargetType.CUSTOM;
                }
                int i2 = d.a[targetType2.ordinal()];
                if (i2 == 1) {
                    appAnalyticsReporter.Y.B(QrPaymentEvents$QrPaymentSplitShutterLoadedResult.ERROR, message);
                } else {
                    if (i2 == 2) {
                        return;
                    }
                    w511.b();
                }
            }
        }
    }

    public final void X() {
        r0 r0Var;
        Object value;
        pzt0 N;
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        do {
            r0Var = this.w;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ghk.a((ghk) value, null, true, false, null, 17)));
        x3 x3Var = this.z;
        if (x3Var instanceof ehk) {
            N = tje.N(ds31.a(this), null, null, new DivBottomSheetViewModel$loadTargetedData$1(this, (ehk) x3Var, null), 3);
        } else {
            if (!(x3Var instanceof fhk)) {
                w511.b();
                return;
            }
            N = tje.N(ds31.a(this), null, null, new DivBottomSheetViewModel$loadProTopupBottomSheet$1(this, (fhk) x3Var, null), 3);
        }
        this.E = N;
    }
}
