package defpackage;

import android.content.Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.b;
import com.yandex.go.zone.repository.o;
import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment;
import com.ybsdk.feature.merchants.internal.network.MerchantsApi;
import com.ybsdk.feature.merchants.internal.screens.MerchantsFragment;
import ru.yandex.taxi.logistics.sdk.mission_details.data.MissionDetailsApi;
import ru.yandex.taxi.masstransit.router.d;
import ru.yandex.taxi.masstransit.trains.checkout.actionpopup.e;

/* loaded from: classes6.dex */
public final class jl00 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ jl00(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static jl00 a(q310 q310Var) {
        return new jl00(q310Var, 20);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new reu(26, (pj) ((mvy) xvf0Var).get());
            case 1:
                return new a((a) ((g3g) xvf0Var).get());
            case 2:
                return (MerchantOffersApi) ((t0k0) ((j3g) xvf0Var).get()).b(MerchantOffersApi.class);
            case 3:
                return (com.ybsdk.feature.banners.impl.domain.interactors.a) ((tu4) ((u2g) xvf0Var).get()).b.get();
            case 4:
                return new MerchantOffersSearchFragment((prq) xvf0Var);
            case 5:
                return new MerchantOffersTestSearchFragment((e3u) xvf0Var);
            case 6:
                return new xl10((qp10) ((u2g) xvf0Var).get());
            case 7:
                return new MerchantsFragment((com.ybsdk.feature.merchants.internal.screens.a) ((x0z) xvf0Var).get());
            case 8:
                return (MerchantsApi) ((t0k0) ((j3g) xvf0Var).get()).b(MerchantsApi.class);
            case 9:
                return new kz10((z7b) ((br10) xvf0Var).get());
            case 10:
                return new ij20((jwh) ((k3g) xvf0Var).get());
            case 11:
                return (MissionDetailsApi) ((t0k0) ((k3g) xvf0Var).get()).b(MissionDetailsApi.class);
            case 12:
                return new x3i(i2, (b) ((di20) xvf0Var).get());
            case 13:
                return new fl10((wrr) ((epf) xvf0Var).get());
            case 14:
                return new xl10((dt20) ((ahu) xvf0Var).get());
            case 15:
                return new a830((wgr) ((jl00) xvf0Var).get());
            case 16:
                ((m3g) xvf0Var).get();
                return new k15();
            case 17:
                return new uw7((com.yandex.go.mainscreen.superapp.impl.fragment.a) ((b3g) xvf0Var).get(), 1);
            case 18:
                return new zc30((Context) ((b3g) xvf0Var).get());
            case 19:
                return new bpw((d) ((o08) xvf0Var).get());
            case 20:
                return (w310) ((q310) xvf0Var).get();
            case 21:
                return new pw1((wvq) xvf0Var);
            case 22:
                return ((yn30) ((w3g) xvf0Var).get()).a();
            case 23:
                return new b140((co40) ((z0s0) xvf0Var).get());
            case 24:
                return new xl10((pj) ((r3g) xvf0Var).get());
            case 25:
                return (xl10) ((jl00) xvf0Var).get();
            case 26:
                return new hhd((o) ((r3g) xvf0Var).get());
            case 27:
                return new ru.yandex.taxi.masstransit.trains.checkout.actionpopup.d((e) ((wz30) xvf0Var).get());
            case 28:
                return new wyo0(i2, (cv5) xvf0Var);
            default:
                return new og40((xf40) ((vu) xvf0Var).get());
        }
    }
}
