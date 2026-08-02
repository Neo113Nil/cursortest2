package com.ybsdk.feature.transfer.internal.screens.result.presentation;

import android.content.Context;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.di.modules.features.s;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import com.ybsdk.feature.transfer.api.TransfersResultReceiver$Result;
import defpackage.a201;
import defpackage.cjw0;
import defpackage.ds31;
import defpackage.eg01;
import defpackage.et01;
import defpackage.fyp0;
import defpackage.gpx0;
import defpackage.gt01;
import defpackage.hag;
import defpackage.it01;
import defpackage.ji01;
import defpackage.jrp0;
import defpackage.ks01;
import defpackage.ns01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qs01;
import defpackage.r3k0;
import defpackage.sr01;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.uc5;
import defpackage.us01;
import defpackage.us3;
import defpackage.w511;
import defpackage.wpy0;
import defpackage.wva1;
import defpackage.zgz0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final TransferResultScreenParams B;
    public final a201 C;
    public final fyp0 D;
    public final wpy0 E;
    public final ji01 F;
    public final com.ybsdk.feature.autotopup.internal.domain.a G;
    public final tfl0 H;
    public final eg01 I;
    public final com.ybsdk.feature.transfer.internal.screens.result.domain.b J;
    public pzt0 K;

    public b(Context context, us01 us01Var, TransferResultScreenParams transferResultScreenParams, it01 it01Var, a201 a201Var, fyp0 fyp0Var, wpy0 wpy0Var, ji01 ji01Var, com.ybsdk.feature.autotopup.internal.domain.a aVar, tfl0 tfl0Var, eg01 eg01Var) {
        super(new zgz0(28, transferResultScreenParams), new r3k0(23, us01Var, context));
        this.B = transferResultScreenParams;
        this.C = a201Var;
        this.D = fyp0Var;
        this.E = wpy0Var;
        this.F = ji01Var;
        this.G = aVar;
        this.H = tfl0Var;
        this.I = eg01Var;
        cjw0 cjw0Var = it01Var.a;
        this.J = new com.ybsdk.feature.transfer.internal.screens.result.domain.b((com.ybsdk.feature.transfer.internal.data.a) ((gpx0) cjw0Var.a).get(), (com.ybsdk.utils.poller.b) ((hag) cjw0Var.b).get(), transferResultScreenParams, (s) ((hag) cjw0Var.c).get(), this);
        tje.N(ds31.a(this), null, null, new TransferResultViewModel$3(this, null), 3);
    }

    public static final void b0(b bVar, et01 et01Var) {
        r0 r0Var;
        Object value;
        AnalyticsPaymentStatus analyticsPaymentStatus;
        AnalyticsSourceScreen analyticsSourceScreen;
        ji01 ji01Var = bVar.F;
        wpy0 wpy0Var = bVar.E;
        TransferStatus transferStatus = ((ns01) bVar.X()).g;
        TransferStatus transferStatus2 = et01Var.a;
        if (transferStatus != transferStatus2) {
            bVar.Z(new ks01(gt01.a(transferStatus2)));
        }
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ns01.a((ns01) value, et01Var.a, et01Var.c, et01Var.d, et01Var.e, false, 48703)));
        a201 a201Var = bVar.C;
        TransferType transferType = ((ns01) bVar.X()).n;
        String transferId = bVar.B.getTransferId();
        us3 us3Var = (us3) a201Var.c;
        int i = sr01.a[transferStatus2.ordinal()];
        if (i == 1) {
            analyticsPaymentStatus = AnalyticsPaymentStatus.SUCCESS;
        } else if (i == 2) {
            analyticsPaymentStatus = AnalyticsPaymentStatus.PROCESSING;
        } else if (i == 3) {
            analyticsPaymentStatus = AnalyticsPaymentStatus.FAILED;
        } else if (i == 4) {
            analyticsPaymentStatus = AnalyticsPaymentStatus.TIMEOUT;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            analyticsPaymentStatus = AnalyticsPaymentStatus.ERROR;
        }
        int i2 = sr01.b[transferType.ordinal()];
        if (i2 == 1) {
            analyticsSourceScreen = AnalyticsSourceScreen.TRANSFER;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            analyticsSourceScreen = AnalyticsSourceScreen.TOPUP;
        }
        AnalyticsPaymentStatus analyticsPaymentStatus2 = analyticsPaymentStatus;
        us3Var.b(null, analyticsPaymentStatus2, analyticsSourceScreen, (r41 & 8) != 0 ? null : null, (r41 & 16) != 0 ? null : null, (r41 & 32) != 0 ? null : null, (r41 & 64) != 0 ? null : null, (r41 & 128) != 0 ? null : null, (r41 & 256) != 0 ? null : null, TransferEvents$TransferPaymentResultChosenMethod.PHONE, "", "", null, transferId, (r41 & 16384) != 0 ? null : null, (32768 & r41) != 0 ? null : null, (65536 & r41) != 0 ? null : null, (r41 & 131072) != 0 ? null : null);
        int i3 = qs01.a[transferStatus2.ordinal()];
        if (i3 == 1) {
            ji01Var.a.a();
            trp0 trp0Var = trp0.a;
            trp0.f(new jrp0(((ns01) bVar.X()).e.toString(), ((ns01) bVar.X()).a));
            wpy0Var.l(TransfersResultReceiver$Result.SUCCESS);
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                wpy0Var.l(TransfersResultReceiver$Result.PENDING);
            } else if (i3 != 4 && i3 != 5) {
                w511.b();
            } else {
                ji01Var.a.a();
                wpy0Var.l(TransfersResultReceiver$Result.FAIL);
            }
        }
    }

    public final void c0() {
        int i = qs01.a[((ns01) X()).g.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            this.H.e();
        } else {
            w511.b();
        }
    }

    public final void d0() {
        AnalyticsSourceScreen analyticsSourceScreen;
        TransferType transferType = ((ns01) X()).n;
        String transferId = this.B.getTransferId();
        us3 us3Var = (us3) this.C.c;
        int i = sr01.b[transferType.ordinal()];
        if (i == 1) {
            analyticsSourceScreen = AnalyticsSourceScreen.TRANSFER;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            analyticsSourceScreen = AnalyticsSourceScreen.TOPUP;
        }
        wva1.e(us3Var, null, analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod.PHONE, null, "", "", null, transferId, 264);
        Z(new ks01(gt01.a(((ns01) X()).g)));
        e0(null);
    }

    public final void e0(String str) {
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(ds31.a(this), null, null, new TransferResultViewModel$startStatusesReceiving$1(this, str, null), 3);
    }
}
