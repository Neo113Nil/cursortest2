package defpackage;

import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.places.flex.container.domain.actions.c;
import com.yandex.go.places.organization.card.impl.data.repositories.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.partnerpayments.internal.network.PartnerPaymentsApi;
import com.ybsdk.feature.passes.widget.internal.data.PassesWidgetApi;
import com.ybsdk.feature.pdf.internal.network.PdfService;
import com.ybsdk.feature.pfm.internal.data.network.PfmApi;
import com.ybsdk.feature.transfer.internal.domain.b;

/* loaded from: classes3.dex */
public final class f380 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ f380(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new e380((b1) ((peb) xvf0Var).get());
            case 1:
                return new yj70((b1) ((h1t) xvf0Var).get());
            case 2:
                return new q480((co40) ((l180) xvf0Var).get());
            case 3:
                return new mb80((e840) xvf0Var);
            case 4:
                return new wc80((v7j) ((l180) xvf0Var).get());
            case 5:
                return new a((al80) ((l180) xvf0Var).get());
            case 6:
                return new bl80((on2) ((o4g) xvf0Var).get());
            case 7:
                return new aq80((sz80) ((z4g) xvf0Var).get());
            case 8:
                return new q290((i650) ((wz30) xvf0Var).get());
            case 9:
                return new x770((pho) ((b5g) xvf0Var).get());
            case 10:
                return new lh90((mf1) ((j3g) xvf0Var).get());
            case 11:
                return (PartnerPaymentsApi) ((t0k0) ((j3g) xvf0Var).get()).b(PartnerPaymentsApi.class);
            case 12:
                return new f42((AppAnalyticsReporter) ((j3g) xvf0Var).get(), 8);
            case 13:
                return new us3((AppAnalyticsReporter) ((j3g) xvf0Var).get());
            case 14:
                return new b((com.ybsdk.feature.transfer.internal.data.a) ((gpx0) xvf0Var).get());
            case 15:
                return new mm90((y4a0) ((c5g) xvf0Var).b.b);
            case 16:
                return (PassesWidgetApi) ((t0k0) ((c5g) xvf0Var).get()).b(PassesWidgetApi.class);
            case 17:
                return new s9n((l7x0) ((ywf) xvf0Var).get());
            case 18:
                return (PdfService) ((t0k0) ((l5g) xvf0Var).get()).b(PdfService.class);
            case 19:
                return new bpw((c) ((g680) xvf0Var).get());
            case 20:
                return new com.yandex.messaging.ui.settings.c((oy80) ((vm80) xvf0Var).get());
            case 21:
                return new ebb0((cab0) ((l5g) xvf0Var).get());
            case 22:
                return new sb6((AppAnalyticsReporter) ((l5g) xvf0Var).get());
            case 23:
                return (PfmApi) ((t0k0) ((l5g) xvf0Var).get()).b(PfmApi.class);
            case 24:
                return new com.ybsdk.feature.pfm.internal.data.a((PfmApi) ((f380) xvf0Var).get());
            case 25:
                return new gdb0((w530) ((l5g) xvf0Var).get());
            case 26:
                return new tnb0((a3v) ((n5g) xvf0Var).get());
            case 27:
                return new dob0((v7j0) ((n5g) xvf0Var).get());
            case 28:
                return new epb0((p) ((qta0) xvf0Var).get());
            default:
                return new com.ybsdk.feature.pin.internal.domain.a((com.ybsdk.feature.pinstorage.internal.data.c) ((l5g) xvf0Var).get());
        }
    }
}
