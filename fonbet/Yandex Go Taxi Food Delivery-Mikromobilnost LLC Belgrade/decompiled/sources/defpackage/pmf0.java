package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParam$$serializer;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParams;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto$$serializer;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeSectionDto$$serializer;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListResponseDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.b;
import com.yandex.go.promocodes.base.impl.promo_codes.data.experiments.PromoCodeListRequestServicesExperiment;
import com.yandex.go.promocodes.base.impl.promo_codes.data.experiments.a;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$AndroidDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$AndroidDto$$serializer;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$FusedDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$FusedDto$$serializer;
import com.yandex.go.ridetech.locationsdk.experiment.dto.f;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.push.impl.network.PushNotificationsApi;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;
import ru.yandex.taxi.communications.api.dto.w;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

/* loaded from: classes8.dex */
public final /* synthetic */ class pmf0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ pmf0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = PromoCodeListRequestServicesExperiment.Companion;
                return new p53(auu0.a, 0);
            case 1:
                b bVar = PromoCodeListResponseDto.Companion;
                return new p53(PromoCodeDto$$serializer.INSTANCE, 0);
            case 2:
                b bVar2 = PromoCodeListResponseDto.Companion;
                return new p53(PromoCodeSectionDto$$serializer.INSTANCE, 0);
            case 3:
                return vez0.g("com.yandex.go.shortcuts.dto.response.PromoMode", PromoMode.values(), new String[]{null, Constants.NORMAL, "restricted"}, new Annotation[][]{null, null, null});
            case 4:
                return vez0.g("ru.yandex.taxi.promotions.model.Promotion.Type", Promotion.Type.values(), new String[]{"fullscreen", "card", "notification", "story", "ticket", "missed_seen"}, new Annotation[][]{null, null, null, null, null, null});
            case 5:
                d dVar = PromotionBackground.Companion;
                return PromotionBackground.Type.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.promotions.model.PromotionBackground.Type", PromotionBackground.Type.values(), new String[]{"color", "image", MediaStreamTrack.VIDEO_TRACK_KIND, "animation", null}, new Annotation[][]{null, null, null, null, null});
            case 7:
                rsf0 rsf0Var = ssf0.Companion;
                return new p53(auu0.a, 0);
            case 8:
                rsf0 rsf0Var2 = ssf0.Companion;
                return new p53(auu0.a, 0);
            case 9:
                rsf0 rsf0Var3 = ssf0.Companion;
                return jsq0.Companion.serializer(PromotionBackground.Type.Companion.serializer());
            case 10:
                rsf0 rsf0Var4 = ssf0.Companion;
                return new p53(auu0.a, 0);
            case 11:
                rsf0 rsf0Var5 = ssf0.Companion;
                return new p53(ysc.a, 0);
            case 12:
                zsf0 zsf0Var = atf0.Companion;
                return new p53(ohs.a, 0);
            case 13:
                zsf0 zsf0Var2 = atf0.Companion;
                return new p53(ab8.a, 0);
            case 14:
                zsf0 zsf0Var3 = atf0.Companion;
                return new p53(rg60.a, 0);
            case 15:
                zsf0 zsf0Var4 = atf0.Companion;
                return new p53(w.a, 0);
            case 16:
                zsf0 zsf0Var5 = atf0.Companion;
                return new p53(y0z0.a, 0);
            case 17:
                zsf0 zsf0Var6 = atf0.Companion;
                return new p53(xi20.a, 0);
            case 18:
                etf0 etf0Var = ftf0.Companion;
                return new p53(qke.n(Promotion.Companion.serializer()), 1);
            case 19:
                return new ssp0("com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto", qoi0.a(f.class), new lfx[]{qoi0.a(ProviderConfigDto$AndroidDto.class), qoi0.a(ProviderConfigDto$FusedDto.class)}, new KSerializer[]{ProviderConfigDto$AndroidDto$$serializer.INSTANCE, ProviderConfigDto$FusedDto$$serializer.INSTANCE}, new Annotation[0]);
            case 20:
                return new bzf0(1000000L, TimeUnit.MICROSECONDS);
            case 21:
                return new bzf0(10000L, TimeUnit.MILLISECONDS);
            case 22:
                com.yandex.go.notifications.acknowledge.data.model.b bVar3 = PushAckParams.Companion;
                return new p53(PushAckParam$$serializer.INSTANCE, 1);
            case 23:
                r1g0 r1g0Var = s1g0.Companion;
                return new k8u(auu0.a, h6w.a, 1);
            case 24:
                jb7 jb7Var = vez0.f;
                jb7 jb7Var2 = jb7Var != null ? jb7Var : null;
                Object obj = jb7Var2.b;
                com.ybsdk.feature.push.impl.data.a aVar2 = new com.ybsdk.feature.push.impl.data.a((PushNotificationsApi) ((xvf0) jb7Var2.w).get());
                m2g0 t = jb7Var2.t();
                x8g x8gVar = (x8g) ((dnp0) jb7Var2.c);
                qc20 qc20Var = new qc20((com.ybsdk.common.repositiories.auth.f) x8gVar.G.get());
                AppAnalyticsReporter d = x8gVar.d();
                q5z.h(d);
                return new com.ybsdk.feature.push.impl.domain.b(aVar2, t, qc20Var, d);
            case 25:
                m3g0 m3g0Var = p3g0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                return new p53(auu0.a, 1);
            case 27:
                return new p53(auu0.a, 1);
            case 28:
                u5g0 u5g0Var = v5g0.Companion;
                return new p53(auu0.a, 0);
            default:
                p8i0 p8i0Var = q8i0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
        }
    }
}
