package defpackage;

import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.orders.card.experiments.u;
import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.order.details.v1.elements.support.experiment.a;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.go.zone.dto.objects.SurgeBalanceContent;
import com.yandex.go.zone.dto.objects.u5;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;
import ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto$ActionButtonStyle;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;
import ru.yandex.taxi.surge.models.dto.c0;
import ru.yandex.taxi.surge.models.dto.d0;
import ru.yandex.taxi.surge.models.dto.f0;
import ru.yandex.taxi.surge.models.dto.g0;
import ru.yandex.taxi.surge.models.dto.i1;
import ru.yandex.taxi.surge.models.dto.l0;
import ru.yandex.taxi.surge.models.dto.m0;
import ru.yandex.taxi.surge.models.dto.u0;
import ru.yandex.taxi.surge.models.dto.v0;

/* loaded from: classes6.dex */
public final /* synthetic */ class bhw0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bhw0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bdc defaultTextColor_delegate$lambda$0;
        switch (this.a) {
            case 0:
                u uVar = SuperappTrackingCardExperiment.TaxiTracking.Companion;
                return ahw0.Companion.serializer();
            case 1:
                defaultTextColor_delegate$lambda$0 = SupportDetailsModalView.defaultTextColor_delegate$lambda$0();
                return defaultTextColor_delegate$lambda$0;
            case 2:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SupportMenuPresenter");
            case 3:
                a aVar = SupportOnCompleteExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 4:
                return new y7m(0.0f);
            case 5:
                u5 u5Var = SurgeBalanceContent.Companion;
                return new p53(auu0.a, 0);
            case 6:
                return vez0.g("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.ActionButtonStyle", SurgeButtonActionDto$ActionButtonStyle.values(), new String[]{"default", "accent"}, new Annotation[][]{null, null});
            case 7:
                wow0 wow0Var = c0.Companion;
                return new p53(d0.a, 0);
            case 8:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.SendFeedback", f0.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.UnknownAction", g0.INSTANCE, new Annotation[0]);
            case 10:
                return new bj70(new oi70(new gdc(mqg0.component_red_toxic), new up2(gq2.b)), new gdc(mqg0.white), new up2(zp2.a));
            case 11:
                spw0 spw0Var = tpw0.Companion;
                return new p53(lsw0.e, 0);
            case 12:
                aqw0 aqw0Var = bqw0.Companion;
                return new p53(ksw0.e, 0);
            case 13:
                gqw0 gqw0Var = l0.Companion;
                return new p53(m0.a, 0);
            case 14:
                wqw0 wqw0Var = xqw0.Companion;
                return new p53(dsw0.a, 0);
            case 15:
                arw0 arw0Var = SurgeInfoItem$ActionButtonsContent.Companion;
                return SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.Companion.serializer();
            case 16:
                arw0 arw0Var2 = SurgeInfoItem$ActionButtonsContent.Companion;
                return new p53(u0.a, 0);
            case 17:
                v0 v0Var = SurgeInfoItem$ActionButtonsContent.a.Companion;
                return SurgeButtonActionDto$ActionButtonStyle.Companion.serializer();
            case 18:
                return vez0.g("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.ActionButtonsContent.ButtonsOrientation", SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.values(), new String[]{"vertical", "horizontal"}, new Annotation[][]{null, null});
            case 19:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.Unsupported", i1.INSTANCE, new Annotation[0]);
            case 20:
                nsw0 nsw0Var = osw0.Companion;
                return new p53(ksw0.e, 0);
            case 21:
                return new p53(auu0.a, 1);
            case 22:
                return new k8u(auu0.a, cm2.a, 1);
            case 23:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockAction.Unknown", rtw0.INSTANCE, new Annotation[0]);
            case 24:
                utw0 utw0Var = vtw0.Companion;
                return TextBlockSize.Companion.serializer();
            case 25:
                xtw0 xtw0Var = ytw0.Companion;
                return SurgeInfoTextBlockIconType.Companion.serializer();
            case 26:
                return vez0.g("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType", SurgeInfoTextBlockIconType.values(), new String[]{"rotate"}, new Annotation[][]{null});
            case 27:
                cuw0 cuw0Var = duw0.Companion;
                return SelectorStyle.Companion.serializer();
            case 28:
                cuw0 cuw0Var2 = duw0.Companion;
                return new p53(qmq0.a, 0);
            default:
                return new o4o("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockTrail.Unsupported", kuw0.INSTANCE, new Annotation[0]);
        }
    }
}
