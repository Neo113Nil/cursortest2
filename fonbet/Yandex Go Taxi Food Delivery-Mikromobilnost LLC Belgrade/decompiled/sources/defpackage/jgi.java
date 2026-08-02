package defpackage;

import com.yandex.go.zone.dto.objects.DeliveryPinType;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import com.yandex.go.zone.dto.objects.y1;
import defpackage.nli;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.experiments.d;
import ru.yandex.taxi.logistics.experiments.e;
import ru.yandex.taxi.logistics.experiments.f;
import ru.yandex.taxi.logistics.experiments.h;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.b;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.c;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.g;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.j;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.k;

/* loaded from: classes9.dex */
public final /* synthetic */ class jgi implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jgi(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                lgi lgiVar = mgi.Companion;
                return new p53(rcx.a, 0);
            case 1:
                kii kiiVar = lii.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 2:
                kii kiiVar2 = lii.Companion;
                return new p53(auu0.a, 0);
            case 3:
                uii uiiVar = vii.Companion;
                return new p53(auu0.a, 0);
            case 4:
                return vez0.g("com.yandex.go.zone.dto.objects.DeliveryPinType", DeliveryPinType.values(), new String[]{"map_source", "map_destination", "route_source", "route_destination", null}, new Annotation[][]{null, null, null, null, null});
            case 5:
                ili iliVar = DeliveryPvzExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 6:
                ili iliVar2 = DeliveryPvzExperiment.Companion;
                return new p53(auu0.a, 0);
            case 7:
                ili iliVar3 = DeliveryPvzExperiment.Companion;
                return new p53(h.a, 0);
            case 8:
                ili iliVar4 = DeliveryPvzExperiment.Companion;
                return new p53(e.a, 0);
            case 9:
                return vez0.g("ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment.AddressFlow", DeliveryPvzExperiment.AddressFlow.values(), new String[]{"courier", "pickup_point"}, new Annotation[][]{null, null});
            case 10:
                d dVar = DeliveryPvzExperiment.a.Companion;
                return DeliveryPvzExperiment.AddressFlow.Companion.serializer();
            case 11:
                f fVar = DeliveryPvzExperiment.b.Companion;
                return DeliveryPvzExperiment.RouteType.Companion.serializer();
            case 12:
                return vez0.g("ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment.RouteType", DeliveryPvzExperiment.RouteType.values(), new String[]{"source", "destination"}, new Annotation[][]{null, null});
            case 13:
                kli kliVar = nli.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 14:
                mli mliVar = nli.a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 15:
                mli mliVar2 = nli.a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 16:
                rli rliVar = nli.c.Companion;
                return new p53(sli.a, 0);
            case 17:
                tli tliVar = nli.d.Companion;
                return new p53(lli.a, 0);
            case 18:
                mmi mmiVar = nmi.Companion;
                return new p53(ycj0.a, 0);
            case 19:
                umi umiVar = vmi.Companion;
                return new p53(sax0.a, 0);
            case 20:
                eti etiVar = DeliveryTariffsCommentRedirectionsExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 21:
                eti etiVar2 = DeliveryTariffsCommentRedirectionsExperiment.Companion;
                return new p53(j.a, 0);
            case 22:
                c cVar = DeliveryTariffsCommentRedirectionsExperiment.a.Companion;
                return new p53(auu0.a, 0);
            case 23:
                jti jtiVar = ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.e.Companion;
                return jsq0.Companion.serializer(DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.Companion.serializer());
            case 24:
                return new o4o("ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment.RuleType.Unknown", g.INSTANCE, new Annotation[0]);
            case 25:
                return vez0.g("ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment.ScreenDto", DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.values(), new String[]{"explicit_comment", "address_details"}, new Annotation[][]{null, null});
            case 26:
                k kVar = DeliveryTariffsCommentRedirectionsExperiment.b.Companion;
                return new p53(b.a, 0);
            case 27:
                y1 y1Var = DeliveryZoneTariffExtra.Companion;
                return DeliveryZoneTariffExtra.DeliveryFlowType.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra.DeliveryFlowType", DeliveryZoneTariffExtra.DeliveryFlowType.values(), new String[]{"default", "ndd_form", "ndd_form_v2", "rover"}, new Annotation[][]{null, null, null, null});
            default:
                hxi hxiVar = ixi.Companion;
                return new p53(pnz.a, 0);
        }
    }
}
