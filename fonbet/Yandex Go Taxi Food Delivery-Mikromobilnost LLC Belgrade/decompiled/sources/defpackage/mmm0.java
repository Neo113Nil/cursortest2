package defpackage;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a;
import kotlin.Result;

/* loaded from: classes2.dex */
public final /* synthetic */ class mmm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pmm0 b;

    public /* synthetic */ mmm0(pmm0 pmm0Var, int i) {
        this.a = i;
        this.b = pmm0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        pmm0 pmm0Var = this.b;
        switch (i) {
            case 0:
                return new a(pmm0Var.w, pmm0Var.a(), (n4u0) ((qc20) pmm0Var.q).a);
            case 1:
                com.yandex.plus.domain.auth.impl.a aVar = pmm0Var.k;
                ((wyj) pmm0Var.i).getClass();
                return new com.yandex.plus.pay.ui.core.api.domain.a(aVar, wyj.f, pmm0Var.g);
            case 2:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a(pmm0Var.v, pmm0Var.g);
            case 3:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a(pmm0Var.a().a(), pmm0Var.c(), pmm0Var.w, (n4u0) ((qc20) pmm0Var.q).a);
            case 4:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a((yap) pmm0Var.b0.getValue(), (zap) pmm0Var.c0.getValue(), (zg41) pmm0Var.H.getValue());
            case 5:
                return new jy90(pmm0Var.g, (u7d0) ((i3y) pmm0Var.a.x).getValue());
            case 6:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a(pmm0Var.c(), (gce) pmm0Var.a0.getValue());
            case 7:
                return new wi41(pmm0Var.z);
            case 8:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a(pmm0Var.a().a(), (n4u0) ((qc20) pmm0Var.q).a, pmm0Var.j, pmm0Var.g);
            case 9:
                return new h7t(new zgh(pmm0Var.f()), pmm0Var.g);
            case 10:
                return new up51(pmm0Var.b(), (eu90) pmm0Var.a.a);
            case 11:
                eva0 eva0Var = (eva0) pmm0Var.K0.getValue();
                PlusPayCompositeOffers.Offer offer = pmm0Var.b.getOffer();
                gva0 gva0Var = (gva0) eva0Var;
                pgz pgzVar = gva0Var.d;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "PerformanceAnalyticsImpl", "Start performance session for offer = " + offer);
                }
                return new hwa0(offer, gva0Var.a, gva0Var.b, gva0Var.c, gva0Var.d);
            case 12:
                return new omm0(pmm0Var);
            case 13:
                return new com.yandex.plus.pay.ui.webview.common.diagnostic.a(pmm0Var.k, pmm0Var.g);
            case 14:
                return new zg41(pmm0Var.k.h);
            case 15:
                return new d7a0(pmm0Var.c(), (eu90) pmm0Var.a.a, ((b) pmm0Var.w).d().c);
            case 16:
                Object h = ((com.yandex.plus.experiments.impl.providers.a) ((b) pmm0Var.w).a.getValue()).h();
                if (h instanceof Result.Failure) {
                    h = null;
                }
                return (k2d0) h;
            case 17:
                return new g7c((eu90) pmm0Var.a.a, ((b) pmm0Var.w).d().a);
            case 18:
                return new hpd0((eu90) pmm0Var.a.a);
            case 19:
                eu90 eu90Var = (eu90) pmm0Var.a.a;
                b bVar = (b) pmm0Var.w;
                return new ppd0(eu90Var, bVar.d().e, bVar.d().a);
            default:
                return new lpd0(pmm0Var.c(), (eu90) pmm0Var.a.a);
        }
    }
}
