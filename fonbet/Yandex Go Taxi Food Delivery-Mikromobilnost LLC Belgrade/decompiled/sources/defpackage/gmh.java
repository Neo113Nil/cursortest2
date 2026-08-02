package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.due_timetable.data.api.ScheduledOrderCalculationsApi;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.a;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.b;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.status.screen.internal.data.DivkitCommonScreenApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.data.DeliveryDashboardApi;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.DeliveryCancelInfoApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes5.dex */
public final class gmh implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public gmh(wzk wzkVar, czf czfVar) {
        this.a = 18;
        this.b = czfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new o61((pho) ((dbg) xvf0Var).get());
            case 1:
                return new a((b) ((wrh) xvf0Var).get());
            case 2:
                return new zgf(26, (pj) ((srb) xvf0Var).get());
            case 3:
                return new zgf(28, (m) ((wi7) xvf0Var).get());
            case 4:
                return (DeliveryCancelInfoApi) ((t0k0) ((eyf) xvf0Var).get()).b(DeliveryCancelInfoApi.class);
            case 5:
                return (DeliveryDashboardApi) ((t0k0) ((jyf) xvf0Var).get()).b(DeliveryDashboardApi.class);
            case 6:
                Set keySet = ((tgg) ((p6f) xvf0Var).get()).a.keySet();
                ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return kotlin.collections.a.J0(arrayList);
            case 7:
                return new i47((zuj0) ((gyf) xvf0Var).get(), 2);
            case 8:
                return new zch((itc) ((xki) xvf0Var).get());
            case 9:
                return new m8h((jwh) ((qyf) xvf0Var).get());
            case 10:
                return new yzh((pj) ((rwh) xvf0Var).get());
            case 11:
                return new qnh((v920) ((gc) xvf0Var).get());
            case 12:
                return new a40((Activity) ((t0g) xvf0Var).get());
            case 13:
                return new a2j((b1) ((lk) xvf0Var).get());
            case 14:
                return new pj((pho) ((zyf) xvf0Var).get());
            case 15:
                return new com.yandex.go.taxi.order.details.v1.elements.cancel.a((z4j) ((zo0) xvf0Var).get());
            case 16:
                return new e5j((vbb) ((peb) xvf0Var).get());
            case 17:
                return new hsj((pho) ((x4g) xvf0Var).get());
            case 18:
                return new com.ybsdk.feature.divkit.internal.domain.hmac.b((npk) ((czf) xvf0Var).get());
            case 19:
                return new sb6((AppAnalyticsReporter) ((byf) xvf0Var).get());
            case 20:
                return (DivkitCommonScreenApi) ((t0k0) ((byf) xvf0Var).get()).b(DivkitCommonScreenApi.class);
            case 21:
                return (com.ybsdk.feature.banners.impl.domain.interactors.a) ((tu4) ((byf) xvf0Var).get()).b.get();
            case 22:
                return new wsl((Context) ((byf) xvf0Var).get());
            case 23:
                return new tgm((a3v) ((ezf) xvf0Var).get());
            case 24:
                return new zch((w3i) ((wj0) xvf0Var).get());
            case 25:
                return new rvm((bwm) ((oti) xvf0Var).get());
            case 26:
                return new n3a((rqo) ((izf) xvf0Var).get(), 6);
            case 27:
                return new mum((com.yandex.go.analytics.b) ((fzf) xvf0Var).get());
            case 28:
                ScheduledOrderCalculationsApi scheduledOrderCalculationsApi = (ScheduledOrderCalculationsApi) ((on2) ((fzf) xvf0Var).get()).a(GoApiName.TaxiV4, ScheduledOrderCalculationsApi.class);
                q5z.i(scheduledOrderCalculationsApi);
                return scheduledOrderCalculationsApi;
            default:
                return new vyc((dci) ((gbg) xvf0Var).get());
        }
    }

    public /* synthetic */ gmh(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
