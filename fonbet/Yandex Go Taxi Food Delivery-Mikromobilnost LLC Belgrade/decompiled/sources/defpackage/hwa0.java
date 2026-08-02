package defpackage;

import com.yandex.plus.core.benchmark.a;
import com.yandex.plus.core.benchmark.b;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public final class hwa0 implements fwa0 {
    public final PlusPayCompositeOffers.Offer a;
    public final a b;
    public final rl5 c;
    public final com.yandex.plus.pay.internal.benchmark.tarifficator.a d;
    public final pgz e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;

    public hwa0(PlusPayCompositeOffers.Offer offer, a aVar, rl5 rl5Var, com.yandex.plus.pay.internal.benchmark.tarifficator.a aVar2, pgz pgzVar) {
        this.a = offer;
        this.b = aVar;
        this.c = rl5Var;
        this.d = aVar2;
        this.e = pgzVar;
        final int i = 0;
        this.f = kotlin.a.a(new sls(this) { // from class: gwa0
            public final /* synthetic */ hwa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                hwa0 hwa0Var = this.b;
                switch (i2) {
                    case 0:
                        return hwa0Var.b.c("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return hwa0Var.b.c("Checkout.IAP.StoreProcessing");
                    case 2:
                        return hwa0Var.b.c("Checkout.IAP.CoreProcessing");
                    default:
                        return hwa0Var.b.c("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i2 = 1;
        this.g = kotlin.a.a(new sls(this) { // from class: gwa0
            public final /* synthetic */ hwa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                hwa0 hwa0Var = this.b;
                switch (i22) {
                    case 0:
                        return hwa0Var.b.c("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return hwa0Var.b.c("Checkout.IAP.StoreProcessing");
                    case 2:
                        return hwa0Var.b.c("Checkout.IAP.CoreProcessing");
                    default:
                        return hwa0Var.b.c("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i3 = 2;
        this.h = kotlin.a.a(new sls(this) { // from class: gwa0
            public final /* synthetic */ hwa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                hwa0 hwa0Var = this.b;
                switch (i22) {
                    case 0:
                        return hwa0Var.b.c("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return hwa0Var.b.c("Checkout.IAP.StoreProcessing");
                    case 2:
                        return hwa0Var.b.c("Checkout.IAP.CoreProcessing");
                    default:
                        return hwa0Var.b.c("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i4 = 3;
        this.i = kotlin.a.a(new sls(this) { // from class: gwa0
            public final /* synthetic */ hwa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                hwa0 hwa0Var = this.b;
                switch (i22) {
                    case 0:
                        return hwa0Var.b.c("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return hwa0Var.b.c("Checkout.IAP.StoreProcessing");
                    case 2:
                        return hwa0Var.b.c("Checkout.IAP.CoreProcessing");
                    default:
                        return hwa0Var.b.c("Checkout.IAP.FlowDuration");
                }
            }
        });
    }

    public final void a(ll5 ll5Var) {
        PlusPayCompositeOffers.Offer offer = this.a;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if ((tariffOffer != null ? tariffOffer.getVendor() : null) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            b bVar = (b) ll5Var;
            boolean c = bVar.c();
            String str = bVar.a;
            pgz pgzVar = this.e;
            if (!c) {
                LogPriority logPriority = LogPriority.WARNING;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "PerformanceSessionImpl", oyr.p("Benchmark ", str, " already tracked!"));
                    return;
                }
                return;
            }
            this.c.b(bVar, null);
            this.d.a(bVar, offer);
            LogPriority logPriority2 = LogPriority.INFO;
            if (pgzVar.e(logPriority2)) {
                pgzVar.a(logPriority2, "PerformanceSessionImpl", oyr.p("Benchmark ", str, " tracked"));
            }
        }
    }
}
