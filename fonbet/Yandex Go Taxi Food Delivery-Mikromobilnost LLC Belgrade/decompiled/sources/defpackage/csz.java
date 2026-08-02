package defpackage;

import android.net.ConnectivityManager;
import android.view.View;
import androidx.core.app.s0;
import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsPresentationExperiment;
import com.yandex.mob.domain.m;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.util.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import ru.yandex.taxi.address.d;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.maas.api.MaasApi;
import ru.yandex.taxi.maas.impl.a;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.settings.main.j;

/* loaded from: classes.dex */
public final /* synthetic */ class csz implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ csz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fse coroutineContext = ((hit) obj).a.getCoroutineContext();
                return bvf0.a(coroutineContext.plus(new qhw0((l8x) coroutineContext.get(seu.C))));
            case 1:
                on2 on2Var = ((a) obj).b;
                on2Var.getClass();
                return (MaasApi) on2Var.a(GoApiName.TaxiV4, MaasApi.class);
            case 2:
                return ((jbh) ((com.yandex.go.messenger_native.marketplace.repositories.a) obj).a).f(SimplePersistentBooleanExperiment.MARKETPLACE_OPEN_ALL_CHATS);
            case 3:
                bn10 bn10Var = (bn10) obj;
                return bn10Var.b.a() ? (f600) bn10Var.d.get() : (f600) bn10Var.e.get();
            case 4:
                return ((com.yandex.mob.reporting.a) obj).b.a();
            case 5:
                return ((m) obj).a.a();
            case 6:
                View view = (View) ((c230) obj).c.invoke();
                return Integer.valueOf(view != null ? view.getPaddingBottom() : 0);
            case 7:
                m230 m230Var = (m230) obj;
                if (m230Var.u()) {
                    m230Var.r(new qu(9));
                }
                return zy11Var;
            case 8:
                return (vlr) obj;
            case 9:
                ((m1k) obj).dispose();
                return zy11Var;
            case 10:
                wr40 wr40Var = (wr40) obj;
                String l = ((cne0) wr40Var.d.getValue()).l("dest_address", null);
                if (l == null) {
                    return new HashMap();
                }
                try {
                    return new LinkedHashMap(h2b1.c(wr40Var.b, l, Address.Companion.serializer()));
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return new HashMap();
                }
            case 11:
                yu40 yu40Var = (yu40) obj;
                String l2 = ((cne0) yu40Var.b.getValue()).l("orders", null);
                if (l2 == null) {
                    return new LinkedHashSet();
                }
                try {
                    return kotlin.collections.a.M0(h2b1.d(yu40Var.a, l2, MultimodalRoutesOrderDto.Companion.serializer()));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    return new LinkedHashSet();
                }
            case 12:
                return (i700) ((j) obj).b.get();
            case 13:
                return Boolean.valueOf(((w950) obj).f);
            case 14:
                return (ConnectivityManager) ((com.yandex.go.network.connectivity.a) obj).a.getSystemService(ConnectivityManager.class);
            case 15:
                ((tt2) obj).getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 16:
                ((q) ((d) obj).c.get()).getClass();
                return q.a();
            case 17:
                return (NewbiesRedesignPointsABExperiment) ((q) obj).d.getValue();
            case 18:
                vx21.b(new uh60(r2, (vh60) obj));
                return zy11Var;
            case 19:
                return new s0(((wi60) obj).a);
            case 20:
                return "Unexpected end of input: yet to parse ".concat(((gn60) obj).b());
            case 21:
                xm51 f = rm2.f(((pw60) obj).a);
                return new ow60(f, vez0.h(f));
            case 22:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) obj).b;
            case 23:
                return (r2h) ((com.yandex.go.flex.common.descriptors.action.factory.a) obj).c;
            case 24:
                return (i970) ((com.yandex.go.flex.common.descriptors.action.factory.a) obj).c;
            case 25:
                return (OrderDetailsPresentationExperiment) ((qs70) obj).a.c();
            case 26:
                return new s0(((q280) obj).a);
            case 27:
                AccountListProperties.a aVar = new AccountListProperties.a();
                ((vo90) obj).d.getClass();
                aVar.w = true;
                aVar.b = AccountListBranding.Yandex.INSTANCE;
                return p.v(aVar);
            case 28:
                hp90 hp90Var = (hp90) obj;
                return hp90Var.b.a().l(hp90Var.a, hp90Var.c);
            default:
                androidx.room.coroutines.d dVar = (androidx.room.coroutines.d) obj;
                return dVar.a.c(dVar.b);
        }
    }
}
