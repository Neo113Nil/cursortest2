package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.deeplinks.generated.summary.SummarySection;
import com.yandex.go.payments.transport.navigation.b;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.preorder.navigation.h;
import com.yandex.go.tips.navigation.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class db0 implements vje {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        int i = this.a;
        n5u n5uVar = n5u.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fb0 fb0Var = (fb0) obj;
                Uri data = intent.getData();
                if (data == null || !"addcreditcard".equalsIgnoreCase(data.getAuthority())) {
                    return n5uVar;
                }
                if (fb0Var.x()) {
                    return new m5u(false, false);
                }
                fb0Var.i();
                return n5uVar;
            case 1:
                a aVar = (a) obj;
                Uri data2 = intent.getData();
                if (data2 == null) {
                    return n5uVar;
                }
                String authority = data2.getAuthority();
                if (!jl40.l(authority != null ? authority.toLowerCase(Locale.ROOT) : null, "tips")) {
                    return n5uVar;
                }
                if (aVar.x()) {
                    return new m5u(false, false);
                }
                aVar.i();
                return n5uVar;
            case 2:
                return com.yandex.go.external_service.deeplink.a.a((com.yandex.go.external_service.deeplink.a) obj, intent, (ContinuationImpl) continuation);
            case 3:
                Uri data3 = intent.getData();
                if (data3 == null || !"paymentmethods".equalsIgnoreCase(data3.getAuthority())) {
                    return n5uVar;
                }
                ((b) obj).getClass();
                return (jl40.l(og21.a(data3, Constants.KEY_SERVICE), "transport") && jl40.l(og21.a(data3, "type"), "transport_cards")) ? new m5u(false, false) : n5uVar;
            case 4:
                com.yandex.go.places.impl.navigation.discovery.map.a aVar2 = (com.yandex.go.places.impl.navigation.discovery.map.a) obj;
                Uri data4 = intent.getData();
                if (data4 != null) {
                    DeeplinkSource deeplinkSource = (DeeplinkSource) ffx.R(intent, "deeplink_source", DeeplinkSource.class);
                    if (deeplinkSource == null) {
                        deeplinkSource = DeeplinkSource.UNSPECIFIED;
                    }
                    if ("discovery".equalsIgnoreCase(data4.getAuthority()) && deeplinkSource == DeeplinkSource.PLACES) {
                        aVar2.k0.getClass();
                        dm80 a = dl80.a(data4, false, true);
                        PlacesNavigationEntry$Source placesNavigationEntry$Source = aVar2.t() ? PlacesNavigationEntry$Source.INTERNAL : PlacesNavigationEntry$Source.STARTER;
                        if (a instanceof xl80) {
                            com.yandex.go.places.impl.navigation.discovery.map.a.k0(aVar2, (xl80) a, true, placesNavigationEntry$Source);
                        } else if (a instanceof yl80) {
                            com.yandex.go.places.impl.navigation.discovery.map.a.l0(aVar2, (yl80) a, placesNavigationEntry$Source);
                        } else if (a instanceof ul80) {
                            aVar2.a0().a((ul80) a, true, new bgc(12));
                        } else if (a instanceof cm80) {
                            aVar2.a0().h((cm80) a, true);
                        } else if (!(a instanceof vl80) && !(a instanceof zl80) && !(a instanceof am80) && !(a instanceof bm80) && !(a instanceof wl80)) {
                            w511.b();
                            return null;
                        }
                        return new m5u(true, false);
                    }
                    if ("superapp_search".equalsIgnoreCase(data4.getAuthority())) {
                        return aVar2.l0.a(intent, (ContinuationImpl) continuation);
                    }
                }
                return n5uVar;
            case 5:
                com.yandex.go.places.impl.navigation.organization.card.a aVar3 = (com.yandex.go.places.impl.navigation.organization.card.a) obj;
                Uri data5 = intent.getData();
                if (data5 == null || !"discovery".equalsIgnoreCase(data5.getAuthority())) {
                    return n5uVar;
                }
                aVar3.j0.getClass();
                dm80 a2 = dl80.a(data5, true, false);
                if (!(a2 instanceof ul80)) {
                    return n5uVar;
                }
                aVar3.a0().a((ul80) a2, true, null);
                return new m5u(false, false);
            case 6:
                h hVar = (h) obj;
                return (hVar.O.a() && egb1.d(intent) && hVar.b0.e(intent, new k7d0(20, hVar))) ? new m5u(true, false) : n5uVar;
            case 7:
                Uri data6 = intent.getData();
                if (data6 == null || !"address_input".equalsIgnoreCase(data6.getAuthority())) {
                    return n5uVar;
                }
                spt0 spt0Var = (spt0) obj;
                spt0Var.c.a(Events$Zalogin$LoginContext.DEEPLINK, new ppr0(27, spt0Var, data6));
                return new m5u(false, false);
            default:
                com.yandex.go.taxi.summary.router.b bVar = (com.yandex.go.taxi.summary.router.b) obj;
                bVar.getClass();
                Uri data7 = intent.getData();
                if (data7 == null) {
                    return n5uVar;
                }
                afv0 r = frl0.C.r(data7);
                if ((r != null ? r.a : null) != SummarySection.PRICE_INFO) {
                    return n5uVar;
                }
                String queryParameter = data7.getQueryParameter("origin");
                if (queryParameter == null) {
                    queryParameter = "widget";
                }
                bVar.A((m950) bVar.J.get(), queryParameter, sy60.Q2);
                return new m5u(true, false);
        }
    }
}
