package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.eboks.objects.data.EboksObjectsApi;
import com.yandex.go.navigator.gas_stations.experiment.c;
import com.yandex.go.summary.interactor.a;
import com.yandex.go.summary.interactor.expanded.action.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.futurepayments.internal.network.FuturePaymentsApi;
import com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsFragment;
import ru.yandex.taxi.logistics.sdk.management.storage.b;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public final class hbn implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public hbn(owf owfVar, nwf nwfVar) {
        this.a = 23;
        this.b = owfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new gbn((a) ((y2s0) obj).get());
            case 1:
                EboksObjectsApi eboksObjectsApi = (EboksObjectsApi) ((on2) ((kzf) obj).get()).a(GoApiName.TaxiV4, EboksObjectsApi.class);
                q5z.i(eboksObjectsApi);
                return eboksObjectsApi;
            case 2:
                return new zhn((Context) ((kzf) obj).get());
            case 3:
                return new yn3((rqo) ((kzf) obj).get(), 2);
            case 4:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain.a((b) ((gbg) obj).get());
            case 5:
                return new pj((pho) ((g6g) obj).get());
            case 6:
                return ((m3o) obj).a;
            case 7:
                return new dpo((dex0) ((npi) obj).get());
            case 8:
                return new fpo((d) ((kdv0) obj).get());
            case 9:
                return new m8h((jwh) ((qzf) obj).get());
            case 10:
                return new gym((bu0) ((so4) obj).get());
            case 11:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.b((q8s) ((qzf) obj).get());
            case 12:
                return new x1p(((h1p) ((kk) obj).get()).getValue());
            case 13:
                return new ozv0((bgn) ((l7s0) ((szf) obj).get()).a);
            case 14:
                return new r9p((o61) ((njp) obj).get());
            case 15:
                return new guq((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.b) ((k0n) obj).get());
            case 16:
                return (FlexAdapter) ((t70) ((c1) obj).get()).a(FlexAdapter.class, "com.yandex.fintechsdk.adapters.flex.sdk.impl.FlexAdapterFactory");
            case 17:
                return new t1s((u1s) ((o2g) obj).get());
            case 18:
                return new jln(22, (cu8) ((k0n) obj).get());
            case 19:
                return new v3s((o5s) ((dxf) obj).get());
            case 20:
                return new s4s((mum) ((njp) obj).get());
            case 21:
                return new ds0((jwh) ((exf) obj).get());
            case 22:
                return new mum((u1n) ((c4p) obj).get());
            case 23:
                return new zrm(24, (AppAnalyticsReporter) ((owf) obj).get(), new wbz0());
            case 24:
                return ((gf41) ((s1g) obj).get()).a();
            case 25:
                return new FuturePaymentsFragment((z9n) obj);
            case 26:
                return (FuturePaymentsApi) ((t0k0) ((u1g) obj).get()).b(FuturePaymentsApi.class);
            case 27:
                return new c((rqo) ((k4g) obj).get());
            case 28:
                return new com.yandex.go.navigator.gas_stations.repositories.c((com.yandex.go.navigator.gas_stations.analytics.a) ((w1g) obj).get());
            default:
                return new s0t((u8w) ((mvy) obj).get());
        }
    }

    public /* synthetic */ hbn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public hbn(ils ilsVar, s1g s1gVar) {
        this.a = 24;
        this.b = s1gVar;
    }
}
