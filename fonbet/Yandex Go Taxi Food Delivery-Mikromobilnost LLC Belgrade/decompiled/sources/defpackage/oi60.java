package defpackage;

import coil3.network.okhttp.internal.a;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.dto.response.Offer$Animation;
import com.yandex.go.shortcuts.dto.response.Offer$MainScreenOnboarding;
import com.yandex.go.shortcuts.dto.response.Overlay;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import com.yandex.go.shortcuts.dto.response.d0;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import com.yandex.go.shortcuts.dto.response.x;
import com.yandex.go.shortcuts.dto.response.z;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceAnalytics;
import com.yandex.go.taxi.order.models.api.promotions.b;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import defpackage.ri60;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.common_models.net.NotificationParams;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;
import ru.yandex.taxi.scooters.data.model.OfferType;

/* loaded from: classes6.dex */
public final /* synthetic */ class oi60 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ oi60(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qi60 qi60Var = ri60.a.Companion;
                return OptionType.Companion.serializer();
            case 1:
                ui60 ui60Var = NotificationParams.Companion;
                return jsq0.Companion.serializer(NotificationParams.BehaviorOption.Companion.serializer());
            case 2:
                return vez0.g("ru.yandex.taxi.common_models.net.NotificationParams.BehaviorOption", NotificationParams.BehaviorOption.values(), new String[]{"no_hide_summary", null}, new Annotation[][]{null, null});
            case 3:
                kj60 kj60Var = lj60.Companion;
                return new k8u(auu0.a, pnz.a, 1);
            case 4:
                b bVar = ObjectAppearanceAnalytics.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 5:
                b bVar2 = ObjectAppearanceAnalytics.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 6:
                x xVar = ObjectOverMap.Companion;
                return PositionOverMap.Companion.serializer();
            case 7:
                x xVar2 = ObjectOverMap.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 8:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 9:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 10:
                qr60 qr60Var = tr60.Companion;
                return OfferType.Companion.serializer();
            case 11:
                z zVar = Offer$Animation.Companion;
                return Offer$Animation.Type.Companion.serializer();
            case 12:
                z zVar2 = Offer$Animation.Companion;
                return new p53(auu0.a, 0);
            case 13:
                return vez0.g("com.yandex.go.shortcuts.dto.response.Offer.Animation.Type", Offer$Animation.Type.values(), new String[]{"sliding_image", null}, new Annotation[][]{null, null});
            case 14:
                d0 d0Var = Offer$MainScreenOnboarding.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 15:
                return new p53(Overlay.Companion.serializer(), 0);
            case 16:
                return new p53(NestedButton.Companion.serializer(), 0);
            case 17:
                return new p53(auu0.a, 0);
            case 18:
                cs60 cs60Var = ds60.Companion;
                return new p53(fs60.a, 0);
            case 19:
                mt60 mt60Var = nt60.Companion;
                return new p53(l8j.a, 0);
            case 20:
                mt60 mt60Var2 = nt60.Companion;
                return new p53(bs60.a, 0);
            case 21:
                return vez0.g("ru.yandex.taxi.scooters.data.model.OfferType", OfferType.values(), new String[]{"minutes_offer", "fix_offer"}, new Annotation[][]{null, null});
            case 22:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto", OfferTypeDto.values(), new String[]{"COMPOSITE", "OPTION", "TARIFF"}, new Annotation[][]{null, null, null});
            case 23:
                xm51 f = rm2.f(new r79());
                OkHttpClient.a aVar = new OkHttpClient.a();
                ryj ryjVar = new ryj();
                ryjVar.e();
                aVar.a = ryjVar;
                aVar.g(40L, TimeUnit.SECONDS);
                aVar.h(vez0.h(f), f);
                return new OkHttpClient(aVar);
            case 24:
                return new a(new OkHttpClient());
            case 25:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 27:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 28:
                return new c570();
            default:
                return new n570(null, false);
        }
    }
}
