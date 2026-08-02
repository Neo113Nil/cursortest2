package defpackage;

import com.yandex.quark.js.event.a;
import com.yandex.quark.js.event.b;
import com.yandex.quark.js.event.c;
import com.yandex.quark.js.event.d;
import com.yandex.quark.js.event.e;
import com.yandex.quark.js.event.f;
import com.yandex.quark.js.event.g;
import com.yandex.quark.js.event.h;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes2.dex */
public final /* synthetic */ class cao implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ cao(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        switch (this.a) {
            case 0:
                return new tmx(ErrorType.Companion.serializer());
            case 1:
                return vez0.g("ru.yandex.taxi.eatskit.dto.ErrorType", ErrorType.values(), new String[]{"API_ERROR", "RUNTIME_ERROR", "BAN_ERROR"}, new Annotation[][]{null, null, null});
            case 2:
                List g = scc.g(f.d, a.d, b.d, d.d, e.d, g.d, c.d, h.d);
                int d = gw00.d(tcc.n(g, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj : g) {
                    linkedHashMap.put(((ndo) obj).a, obj);
                }
                return linkedHashMap;
            case 3:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 4:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 5:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 6:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 7:
                return new p53(auu0.a, 0);
            case 8:
                return new p53(auu0.a, 0);
            case 9:
                return new oke(qoi0.a(png.class), new v5e0(qoi0.a(png.class), new Annotation[0]), new KSerializer[0]);
            case 10:
                return EvolveState.Companion.serializer();
            case 11:
                fjo fjoVar = gjo.Companion;
                return new p53(qke.n(s9r.e), 0);
            case 12:
                return vez0.g("ru.yandex.taxi.scooters.data.model.EvolveState", EvolveState.values(), new String[]{"old_state_reservation", "old_state_parking", "old_state_riding"}, new Annotation[][]{null, null, null});
            case 13:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 14:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 15:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 16:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 17:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 18:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 19:
                return new o4o("com.yandex.go.service_catalog.presentation.ExitFromPreviewAction", umo.INSTANCE, new Annotation[0]);
            case 20:
                return vez0.g("ru.yandex.taxi.masstransit.experiment.ExperimentAction", ExperimentAction.values(), new String[]{"share_route", "view_on_map", null}, new Annotation[][]{null, null, null});
            case 21:
                zy11Var = zy11.a;
                return zy11Var;
            case 22:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 23:
                return com.uber.h3core.a.f();
            case 24:
                n1p n1pVar = ExternalServiceData.Companion;
                return ExternalServiceData.NotificationType.Companion.serializer();
            case 25:
                n1p n1pVar2 = ExternalServiceData.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                return vez0.g("ru.yandex.taxi.eatskit.dto.ExternalServiceData.NotificationType", ExternalServiceData.NotificationType.values(), new String[]{ACSPConstants.STATUS, "rate"}, new Annotation[][]{null, null});
            case 27:
                return new oke(qoi0.a(Object.class), null, new KSerializer[0]);
            case 28:
                o5p o5pVar = p5p.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            default:
                o5p o5pVar2 = p5p.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
        }
    }
}
