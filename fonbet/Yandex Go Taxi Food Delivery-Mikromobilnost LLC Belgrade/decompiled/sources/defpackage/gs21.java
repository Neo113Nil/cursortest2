package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.shortcuts.dto.request.StackItemTypeFeature$$serializer;
import com.yandex.go.shortcuts.dto.request.VerticalStackItemFeature;
import com.yandex.go.shortcuts.dto.request.u;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import com.yandex.go.taxi.experiments.m;
import com.yandex.go.taxi.experiments.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import com.yandex.go.taxi.summary.verticalsummary.expriment.a;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;
import java.lang.annotation.Annotation;
import java.time.format.DateTimeFormatterBuilder;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.model.b;
import ru.yandex.taxi.masstransit.model.c;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;
import ru.yandex.taxi.web.deeplink.d;
import ru.yandex.taxi.web.deeplink.e;

/* loaded from: classes8.dex */
public final /* synthetic */ class gs21 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ gs21(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment.Type", UserProfileExperiment.Type.values(), new String[]{"web", "native", "am", null}, new Annotation[][]{null, null, null, null});
            case 1:
                return FamilyRoleDto.Companion.serializer();
            case 2:
                return new p53(pkp.a, 0);
            case 3:
                mr21 mr21Var = new mr21(9);
                bw21 bw21Var = new bw21(new oz2());
                mr21Var.invoke(bw21Var);
                return new cw21(bw21Var.build());
            case 4:
                mr21 mr21Var2 = new mr21(10);
                bw21 bw21Var2 = new bw21(new oz2());
                mr21Var2.invoke(bw21Var2);
                return new cw21(bw21Var2.build());
            case 5:
                bw21 bw21Var3 = new bw21(new oz2());
                nrg.i(bw21Var3);
                nrg.f(bw21Var3);
                return new cw21(bw21Var3.build());
            case 6:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 7:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 8:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 9:
                return new Handler(Looper.getMainLooper());
            case 10:
                u231 u231Var = VariantStyle.Companion;
                return new p53(b.a, 0);
            case 11:
                c cVar = VariantStyle.a.Companion;
                return VariantStyle.VariantType.Companion.serializer();
            case 12:
                return vez0.g("ru.yandex.taxi.masstransit.model.VariantStyle.VariantType", VariantStyle.VariantType.values(), new String[]{"vehicle", "mark", "dot", null}, new Annotation[][]{null, null, null, null});
            case 13:
                return new a3y0(TaxiOrderLogGroup.CORE.getTag(), "VerifyOrderDataInteractor");
            case 14:
                a aVar = VerticalSelectorOnSummaryExperiment.Companion;
                return new p53(auu0.a, 0);
            case 15:
                m mVar = VerticalSelectorSettingsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 16:
                n nVar = VerticalSelectorSettingsExperiment.VerticalsScrollVisibility.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, new p53(auu0Var2, 0), 1);
            case 17:
                u uVar = VerticalStackItemFeature.Companion;
                return new p53(StackItemTypeFeature$$serializer.INSTANCE, 0);
            case 18:
                u uVar2 = VerticalStackItemFeature.Companion;
                return new p53(cm2.a, 0);
            case 19:
                return vez0.g("com.yandex.go.zone.dto.objects.VerticalType", VerticalType.values(), new String[]{"group", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "transport", "navigator", null, "mixed", null}, new Annotation[][]{null, null, null, null, null, null, null});
            case 20:
                return Lifecycle.State.DESTROYED;
            case 21:
                return Long.valueOf(SystemClock.uptimeMillis());
            case 22:
                return null;
            case 23:
                return new OkHttpClient(new OkHttpClient.a());
            case 24:
                HandlerThread handlerThread = new HandlerThread("Logic");
                handlerThread.start();
                return handlerThread.getLooper();
            case 25:
                return new drw();
            case 26:
                return new qsx();
            case 27:
                d dVar = WebViewFromDeeplinkExperiment.Companion;
                return new p53(e.a, 0);
            case 28:
                return vez0.g("ru.yandex.taxi.themes.dto.WebViewThemeChangeMode", WebViewThemeChangeMode.values(), new String[]{"prefers_color_scheme", "support_native_js_callback", "not_supported"}, new Annotation[][]{null, null, null});
            default:
                return wv.Companion.serializer();
        }
    }

    public /* synthetic */ gs21(qh41 qh41Var, int i) {
        this.a = i;
    }
}
