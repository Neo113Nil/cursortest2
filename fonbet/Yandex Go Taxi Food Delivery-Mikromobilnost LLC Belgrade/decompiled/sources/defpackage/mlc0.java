package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PointsVisiblePriorityDto;
import com.yandex.plus.core.network.error.a;
import com.yandex.plus.pay.internal.di.b;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes8.dex */
public final /* synthetic */ class mlc0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ mlc0(b bVar) {
        this.a = 6;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b3u0 b3u0Var;
        switch (this.a) {
            case 0:
                return new p53(shh.a, 0);
            case 1:
                return new p53(shh.a, 0);
            case 2:
                return new p53(shh.a, 0);
            case 3:
                return new p53(pnz.a, 0);
            case 4:
                return new p53(auu0.a, 1);
            case 5:
                return tje.a(sbx.d, new qda0(12));
            case 6:
                return new a();
            case 7:
                return new tne();
            case 8:
                return new fdd0(new oed0());
            case 9:
                return new ccd0();
            case 10:
                return new lzs(null);
            case 11:
                return j73.f0(new String[]{"redirect.appmetrica.yandex.com", "app.link", "adj.st", "onelink.me", Constants.AUTHORITY});
            case 12:
                return new lkd0();
            case 13:
                return UUID.randomUUID();
            case 14:
                sls slsVar = skd0.b;
                if (slsVar == null || (b3u0Var = (b3u0) slsVar.invoke()) == null) {
                    return null;
                }
                skd0.b = null;
                return b3u0Var;
            case 15:
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
            case 16:
                nld0 nld0Var = PlusSdkWidgetExperiment.Companion;
                return PlusSdkWidgetExperiment.PlaqueType.Companion.serializer();
            case 17:
                return vez0.g("ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment.PlaqueType", PlusSdkWidgetExperiment.PlaqueType.values(), new String[]{"universal_plaque", "plus_sdk_plaque"}, new Annotation[][]{null, null});
            case 18:
                ttd0 ttd0Var = utd0.Companion;
                return new p53(qke.n(mtd0.e), 0);
            case 19:
                return vez0.g("com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PointsVisiblePriorityDto", PointsVisiblePriorityDto.values(), new String[]{"source", "destination", null}, new Annotation[][]{null, null, null});
            case 20:
                f4e0 f4e0Var = g4e0.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 21:
                f4e0 f4e0Var2 = g4e0.Companion;
                return new p53(e3e0.a, 0);
            case 22:
                f4e0 f4e0Var3 = g4e0.Companion;
                return new p53(auu0.a, 1);
            case 23:
                n5e0 n5e0Var = o5e0.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 24:
                n5e0 n5e0Var2 = o5e0.Companion;
                return new p53(h4e0.a, 0);
            case 25:
                hae0 hae0Var = iae0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                return vez0.g("ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction", PositionInitAction.values(), new String[]{"auto_location", "geo", PolicyMappingsExtension.MAP, "suggest", "cache", "panorama", "summary_change_tariff"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 27:
                int i = fhe0.a;
                return Boolean.FALSE;
            case 28:
                return new p53(hle0.Companion.serializer(), 0);
            default:
                return new ConcurrentHashMap();
        }
    }

    public /* synthetic */ mlc0(int i) {
        this.a = i;
    }
}
