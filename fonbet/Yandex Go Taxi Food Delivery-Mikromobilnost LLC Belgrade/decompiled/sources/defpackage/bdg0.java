package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshArguments;

/* loaded from: classes3.dex */
public final class bdg0 extends uc5 {
    public final AppAnalyticsReporter B;
    public final j3h C;
    public final tfl0 D;

    public bdg0(QrRefreshArguments qrRefreshArguments, AppAnalyticsReporter appAnalyticsReporter, j3h j3hVar, tfl0 tfl0Var) {
        super(new vyf0(5, qrRefreshArguments), new d7g0(1));
        this.B = appAnalyticsReporter;
        this.C = j3hVar;
        this.D = tfl0Var;
        appAnalyticsReporter.Y.a.a("qr.refresh_info.shown", null);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.B.Y.a.a("qr.refresh_info.closed", null);
    }

    public final void b0() {
        this.B.Y.a.a("qr.refresh_info.button.clicked", null);
        h791.e(this.C, ((zcg0) X()).e.getAction(), false, null, 14);
    }
}
