package defpackage;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import com.yandex.go.due.data.api.dto.f;
import com.yandex.go.due.experiment.EarlyOptionConfigExperiment;
import com.yandex.go.due.experiment.EarlyOptionConfigExperiment$TariffRule$$serializer;
import com.yandex.go.due.experiment.a;
import com.yandex.go.order.external.unifiedpolling.dto.EatsOrderDto;
import com.yandex.go.order.external.unifiedpolling.dto.b;
import com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.EatsOrderCardTimelineDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.EatsOrderCardTimelineItemDto$$serializer;
import com.yandex.go.order.external.unifiedpolling.dto.contact.EatsOrderContactDto;
import com.yandex.go.order.external.unifiedpolling.dto.contact.EatsOrderContactKindDto;
import com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDeliveryTypeDto;
import com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDto;
import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;
import com.yandex.go.payments.data.model.EasypaisaWalletDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.o;
import com.yandex.go.superapp.impl.signals.EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment;
import com.yandex.go.superapp.impl.signals.EatsSdkLaunchEnvironmentSignalFactory$Result;
import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersParamDto;
import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import com.yx360.design.BrandTheme;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

/* loaded from: classes14.dex */
public final /* synthetic */ class ktm implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ktm(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                throw new IllegalArgumentException("User color is not set. Use in Ds.UserTheme context");
            case 1:
                yom yomVar = wom.a;
                return co91.b(BrandTheme.Mail);
            case 2:
                throw new IllegalArgumentException("Colors are not set. Use Ds.Theme context to provide");
            case 3:
                throw new IllegalArgumentException("Colors are not set. Use Ds.Theme context to provide");
            case 4:
                throw new IllegalArgumentException("Colors are not set. Use Ds.Theme context to provide");
            case 5:
                throw new IllegalArgumentException("Colors are not set. Use Ds.Theme context to provide");
            case 6:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            case 7:
                zvm zvmVar = awm.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 8:
                zvm zvmVar2 = awm.Companion;
                return new k8u(auu0.a, d4w.a, 1);
            case 9:
                f fVar = DuePricingDataParam.Companion;
                return new p53(b0t.a, 0);
            case 10:
                f fVar2 = DuePricingDataParam.Companion;
                return new p53(imx0.a, 0);
            case 11:
                return new k8u(auu0.a, bm2.a, 1);
            case 12:
                return new p53(l4n.a, 0);
            case 13:
                return new k8u(auu0.a, nj8.a, 1);
            case 14:
                wan wanVar = xan.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 15:
                bbn bbnVar = cbn.Companion;
                return new p53(auu0.a, 0);
            case 16:
                a aVar = EarlyOptionConfigExperiment.Companion;
                return new p53(EarlyOptionConfigExperiment$TariffRule$$serializer.INSTANCE, 0);
            case 17:
                o oVar = EasypaisaWalletDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 18:
                return new p53(auu0.a, 0);
            case 19:
                return ServicePromo.Companion.serializer();
            case 20:
                com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.a aVar2 = EatsOrderCardTimelineDto.Companion;
                return new p53(EatsOrderCardTimelineItemDto$$serializer.INSTANCE, 0);
            case 21:
                com.yandex.go.order.external.unifiedpolling.dto.contact.a aVar3 = EatsOrderContactDto.Companion;
                return EatsOrderContactKindDto.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.order.external.unifiedpolling.dto.contact.EatsOrderContactKindDto", EatsOrderContactKindDto.values(), new String[]{"courier", "call_center"}, new Annotation[][]{null, null});
            case 23:
                return vez0.g("com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDeliveryTypeDto", EatsOrderDetailsDeliveryTypeDto.values(), new String[]{"native", "marketplace"}, new Annotation[][]{null, null});
            case 24:
                com.yandex.go.order.external.unifiedpolling.dto.details.a aVar4 = EatsOrderDetailsDto.Companion;
                return EatsOrderDetailsDeliveryTypeDto.Companion.serializer();
            case 25:
                b bVar = EatsOrderDto.Button.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 26:
                return vez0.g("com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto", EatsOrderStatusDto.values(), new String[]{"order.created", "order.cooking", "order.delivering", "order.delivered", "order.cancel"}, new Annotation[][]{null, null, null, null, null});
            case 27:
                com.yandex.go.superapp.unified_polling.data.dto.b bVar2 = EatsOrdersParamDto.Companion;
                return TrackingsGroupMethodDto.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.superapp.impl.signals.EatsSdkLaunchEnvironmentSignalFactory.LaunchEnvironment", EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment.values(), new String[]{"eats_sdk", "default"}, new Annotation[][]{null, null});
            default:
                com.yandex.go.superapp.impl.signals.b bVar3 = EatsSdkLaunchEnvironmentSignalFactory$Result.Companion;
                return EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment.Companion.serializer();
        }
    }
}
