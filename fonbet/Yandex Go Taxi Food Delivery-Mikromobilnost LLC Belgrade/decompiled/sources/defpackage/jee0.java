package defpackage;

import com.yandex.go.due.experiment.PreorderTitleByTariffExperiment;
import com.yandex.go.payments.shared.family.web.nativeapi.request.BackgroundState$$serializer;
import com.yandex.go.payments.shared.family.web.nativeapi.request.Postcard;
import com.yandex.go.payments.shared.family.web.nativeapi.request.PostcardParams;
import com.yandex.go.payments.shared.family.web.nativeapi.request.d;
import com.yandex.go.payments.shared.family.web.nativeapi.request.e;
import com.yandex.go.payments.shared.family.web.nativeapi.response.Contact$$serializer;
import com.yandex.go.payments.shared.family.web.nativeapi.response.PostcardInfoResponse;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PresentationTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ModalHeight$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$OpenFormat;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ToolbarNavigationType;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class jee0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jee0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(see0.a, 0);
            case 1:
                return new p53(auu0.a, 0);
            case 2:
                d dVar = Postcard.Companion;
                return new p53(BackgroundState$$serializer.INSTANCE, 0);
            case 3:
                com.yandex.go.payments.shared.family.web.nativeapi.response.d dVar2 = PostcardInfoResponse.Companion;
                return new p53(Contact$$serializer.INSTANCE, 0);
            case 4:
                e eVar = PostcardParams.Companion;
                return new p53(auu0.a, 0);
            case 5:
                return new p53(h6w.a, 1);
            case 6:
                return new p53(auu0.a, 1);
            case 7:
                return cje0.Companion.serializer();
            case 8:
                return uie0.Companion.serializer();
            case 9:
                return uie0.Companion.serializer();
            case 10:
                return uie0.Companion.serializer();
            case 11:
                return kje0.Companion.serializer();
            case 12:
                return uie0.Companion.serializer();
            case 13:
                return uie0.Companion.serializer();
            case 14:
                return hle0.Companion.serializer();
            case 15:
                return new p53(hle0.Companion.serializer(), 0);
            case 16:
                return new o4o("ru.yandex.taxi.delivery.experiments.flowoverrides.data.PredicateDto.Unsupported", fle0.INSTANCE, new Annotation[0]);
            case 17:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 18:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 19:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 20:
                com.yandex.go.due.experiment.d dVar3 = PreorderTitleByTariffExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 21:
                com.yandex.go.due.experiment.d dVar4 = PreorderTitleByTariffExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 22:
                return new p53(auu0.a, 0);
            case 23:
                return PresentationOptionsDto$OpenFormat.Companion.serializer();
            case 24:
                wwe0 wwe0Var = xwe0.Companion;
                return PresentationOptionsDto$ToolbarNavigationType.Companion.serializer();
            case 25:
                return PresentationOptionsDto$ModalHeight$Type.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.ModalHeight.Type", PresentationOptionsDto$ModalHeight$Type.values(), new String[]{"PERCENT", "FIXED"}, new Annotation[][]{null, null});
            case 27:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.OpenFormat", PresentationOptionsDto$OpenFormat.values(), new String[]{"card", "full"}, new Annotation[][]{null, null});
            case 28:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.ToolbarNavigationType", PresentationOptionsDto$ToolbarNavigationType.values(), new String[]{"CROSS_AND_ARROW", "ONLY_ARROW"}, new Annotation[][]{null, null});
            default:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PresentationTypeDto", PresentationTypeDto.values(), new String[]{"list", "table"}, new Annotation[][]{null, null});
        }
    }
}
