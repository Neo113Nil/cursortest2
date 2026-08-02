package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.yandex.go.environment.SwitchNetworkEnvironmentExperiment;
import com.yandex.go.environment.c;
import com.yandex.go.overdraft.data.model.TapAction$PayDebtAction;
import com.yandex.go.overdraft.data.model.f0;
import com.yandex.go.overdraft.data.model.g0;
import com.yandex.go.overdraft.data.model.h0;
import com.yandex.go.overdraft.data.model.i0;
import com.yandex.go.overdraft.data.model.j0;
import com.yandex.go.overdraft.data.model.n0;
import com.yandex.go.overdraft.data.model.o0;
import com.yandex.go.overdraft.data.model.q0;
import com.yandex.go.overdraft.data.model.r0;
import com.yandex.go.overdraft.data.model.s0;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment$CardOption$$serializer;
import com.yandex.go.tappable_poi.experiments.TappablePoiExperiment;
import com.yandex.go.tappable_poi.experiments.TappablePoiExperiment$TappablePoiExpItem$$serializer;
import com.yandex.go.tappable_poi.experiments.a;
import com.yandex.go.tappable_poi.experiments.b;
import com.yandex.go.taxi.order.feedback.data.model.SurveyAnswerOption$$serializer;
import com.yandex.go.taxi.order.feedback.data.model.SurveyQuestion;
import com.yandex.go.taxi.order.feedback.data.model.d;
import com.yandex.go.taxi.order.models.api.objects.Tariff;
import com.yandex.go.taxi.order.models.api.objects.n1;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$ExtraItem$$serializer;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.TariffBranding;
import com.yandex.go.zone.dto.objects.TariffModifierInfo;
import com.yandex.go.zone.dto.objects.l6;
import com.yandex.go.zone.dto.objects.z5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import ru.yandex.alice.megamind.protos.common.experiments.quark.webchat.TExperimentsProto$Companion$ADAPTER$1;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card$Companion$ADAPTER$1;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card$TDivPalette$Companion$ADAPTER$1;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final /* synthetic */ class dvw0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ dvw0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ProtoAdapter globalTemplatesAdapter_delegate$lambda$0;
        ProtoAdapter darkAdapter_delegate$lambda$0;
        ProtoAdapter lightAdapter_delegate$lambda$1;
        ProtoAdapter storageAdapter_delegate$lambda$0;
        switch (this.a) {
            case 0:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeShortcutAction.Close", evw0.INSTANCE, new Annotation[0]);
            case 1:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeShortcutAction.Unsupported", jvw0.INSTANCE, new Annotation[0]);
            case 2:
                pww0 pww0Var = qww0.Companion;
                return new p53(ey6.a, 0);
            case 3:
                d dVar = SurveyQuestion.Companion;
                return new p53(SurveyAnswerOption$$serializer.INSTANCE, 0);
            case 4:
                c cVar = SwitchNetworkEnvironmentExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 5:
                try {
                    return Class.forName("android.os.SystemProperties");
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                Class cls = (Class) r3x0.a.getValue();
                if (cls == null) {
                    return null;
                }
                try {
                    Method method = cls.getMethod("get", (Class[]) Arrays.copyOf(new Class[]{String.class}, 1));
                    method.setAccessible(true);
                    return method;
                } catch (Throwable unused2) {
                    return null;
                }
            case 7:
                globalTemplatesAdapter_delegate$lambda$0 = TDiv2Card$Companion$ADAPTER$1.globalTemplatesAdapter_delegate$lambda$0();
                return globalTemplatesAdapter_delegate$lambda$0;
            case 8:
                darkAdapter_delegate$lambda$0 = TDiv2Card$TDivPalette$Companion$ADAPTER$1.darkAdapter_delegate$lambda$0();
                return darkAdapter_delegate$lambda$0;
            case 9:
                lightAdapter_delegate$lambda$1 = TDiv2Card$TDivPalette$Companion$ADAPTER$1.lightAdapter_delegate$lambda$1();
                return lightAdapter_delegate$lambda$1;
            case 10:
                storageAdapter_delegate$lambda$0 = TExperimentsProto$Companion$ADAPTER$1.storageAdapter_delegate$lambda$0();
                return storageAdapter_delegate$lambda$0;
            case 11:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.CloseAction", f0.INSTANCE, new Annotation[0]);
            case 12:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.ContinueCreateOrderAction", g0.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.OpenDebtInfoAction", h0.INSTANCE, new Annotation[0]);
            case 14:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.OpenDebtPaymentMethodsAction", i0.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.OpenPaymentMethodsAction", j0.INSTANCE, new Annotation[0]);
            case 16:
                n0 n0Var = TapAction$PayDebtAction.Companion;
                return new p53(auu0.a, 0);
            case 17:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.PlusToggleAction", o0.INSTANCE, new Annotation[0]);
            case 18:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.TopUpYandexCardAction", q0.INSTANCE, new Annotation[0]);
            case 19:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.TopUpYangoCardAction", r0.INSTANCE, new Annotation[0]);
            case 20:
                return new o4o("com.yandex.go.overdraft.data.model.TapAction.Unknown", s0.INSTANCE, new Annotation[0]);
            case 21:
                b bVar = TappablePoiCardExperiment.Companion;
                return new p53(TappablePoiCardExperiment$CardOption$$serializer.INSTANCE, 0);
            case 22:
                a aVar = TappablePoiCardExperiment.CardOption.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 23:
                com.yandex.go.tappable_poi.experiments.d dVar2 = TappablePoiExperiment.Companion;
                return new p53(TappablePoiExperiment$TappablePoiExpItem$$serializer.INSTANCE, 0);
            case 24:
                return PointType.SOURCE;
            case 25:
                return new k8u(auu0.a, cm2.a, 1);
            case 26:
                n1 n1Var = Tariff.Companion;
                return new p53(OrderStatusInfo$ExtraItem$$serializer.INSTANCE, 0);
            case 27:
                z5 z5Var = TariffBranding.Companion;
                return BrandingType.Companion.serializer();
            case 28:
                l6 l6Var = TariffModifierInfo.Companion;
                return jsq0.Companion.serializer(TariffModifierInfo.ModifierShowMode.Companion.serializer());
            default:
                return vez0.g("com.yandex.go.zone.dto.objects.TariffModifierInfo.ModifierShowMode", TariffModifierInfo.ModifierShowMode.values(), new String[]{"selected", "unselected", null}, new Annotation[][]{null, null, null});
        }
    }
}
