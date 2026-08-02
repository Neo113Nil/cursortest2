package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.feedback_common.services.d;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.superapp.impl.interactor.c;
import com.yandex.messaging.internal.prefs.ThreadRestrictPreferences;
import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.AnalyticsEnvironment;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.persistence.api.StorageType;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.management.j;
import ru.yandex.taxi.logistics.sdk.management.storage.e;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class kpp0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ kpp0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        AnalyticsEnvironment analyticsEnvironment;
        switch (this.a) {
            case 0:
                hh51 hh51Var = (hh51) this.b.get();
                kg51 kg51Var = (kg51) this.c.get();
                sw51 sw51Var = (sw51) this.d.get();
                Context context = hh51Var.a;
                String str = kg51Var.a;
                w4o w4oVar = hh51Var.c;
                if (w4oVar.equals(u4o.d) || w4oVar.equals(t4o.d)) {
                    analyticsEnvironment = AnalyticsEnvironment.DEVELOPMENT;
                } else {
                    if (!w4oVar.equals(v4o.d)) {
                        w511.b();
                        return null;
                    }
                    analyticsEnvironment = AnalyticsEnvironment.PRODUCTION;
                }
                String a = sw51Var.a();
                String str2 = (String) kg51Var.B.invoke();
                ReporterYandexConfig.Builder newBuilder = ReporterYandexConfig.newBuilder(str);
                newBuilder.withPulseLibraryConfig(PulseLibraryConfig.newBuilder("FTA", "com.yandex.yb.sdk", "0.233.1").build());
                newBuilder.withSessionTimeout(1800);
                AppMetricaYandex.activateReporter(context, ReporterYandexConfig.from(newBuilder.build()));
                IReporterYandex reporter = AppMetricaYandex.getReporter(context, str);
                reporter.clearAppEnvironment();
                reporter.putAppEnvironmentValue("bank_sdk_version", "0.233.1");
                reporter.putAppEnvironmentValue("user_agent", a);
                reporter.putAppEnvironmentValue("flavor_environment", str2);
                String uuid = AppMetricaYandex.getUuid(context);
                String deviceId = AppMetricaYandex.getDeviceId(context);
                trp0 trp0Var = trp0.a;
                trp0.e = uuid;
                trp0.d = deviceId;
                reporter.updateRtmConfig(RtmConfig.newBuilder().withProjectName(eqp0.i.b).withEnvironment(analyticsEnvironment.getRtmConfigEnvironment()).withUserId(uuid != null ? String.valueOf(uuid.hashCode() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) : null).build());
                if (uuid == null || deviceId == null) {
                    AppMetricaYandex.requestStartupParams(context, new xo2(context, reporter), "appmetrica_uuid", "appmetrica_device_id");
                }
                return new AppAnalyticsReporter(reporter, new a(reporter));
            case 1:
                return new e4u0((AppAnalyticsReporter) this.b.get(), (g) this.c.get(), (y1r0) this.d.get());
            case 2:
                return new com.ybsdk.utils.smsretriever.a((Context) this.b.get(), (AppAnalyticsReporter) this.d.get(), ((CommonFeatureFlag) ((b) this.c.get()).d(wlp.M0).getData()).isEnabled());
            case 3:
                return new fvp0((Context) this.b.get(), (xk60) this.c.get(), (i280) this.d.get());
            case 4:
                return new jaq0((maj0) this.b.get(), (wiq0) this.c.get(), (c4r0) this.d.get());
            case 5:
                return new teq0((c4r0) this.b.get(), (c8r) this.c.get(), (ck31) this.d.get());
            case 6:
                return new com.yandex.go.taxi.tariffs.repository.g((wiq0) this.b.get(), (b8r) this.c.get(), (tt2) this.d.get());
            case 7:
                return new k((b03) this.d.get(), (wnt) this.b.get(), (dne0) this.c.get());
            case 8:
                return new dmq0((arv0) this.b.get(), (ck31) this.c.get(), (tt2) this.d.get());
            case 9:
                return new woq0((h) this.b.get(), (d) this.c.get(), (jtq0) this.d.get());
            case 10:
                return new c((po21) this.b.get(), (ru.yandex.taxi.superapp.orders.a) this.c.get(), (p6j0) this.d.get());
            case 11:
                return new ru.yandex.taxi.design.utils.b((Context) this.b.get(), (tt2) this.c.get(), i5m.a(this.d));
            case 12:
                return new wnr0((qmp) this.b.get(), (i0) this.c.get(), (com.yandex.go.payments.shared.business.c) this.d.get());
            case 13:
                Context context2 = (Context) this.b.get();
                Looper looper = (Looper) this.c.get();
                String str3 = (String) this.d.get();
                Locale locale = Locale.US;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("messenger_" + str3, 0);
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("messenger", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                boolean a2 = rpr0.a(edit2, edit, sharedPreferences2, "logout_token") | rpr0.a(edit2, edit, sharedPreferences2, "push_token") | rpr0.a(edit2, edit, sharedPreferences2, "push_token_type");
                for (Map.Entry<String, ?> entry : sharedPreferences2.getAll().entrySet()) {
                    String key = entry.getKey();
                    if (key.startsWith("hide_")) {
                        edit.putLong(key, ((Long) entry.getValue()).longValue());
                        edit2.remove(entry.getKey());
                        a2 = true;
                    }
                }
                if (a2) {
                    edit.apply();
                    edit2.apply();
                }
                return new ThreadRestrictPreferences(looper, sharedPreferences);
            case 14:
                return new hsr0((zuj0) this.c.get(), (xk60) this.d.get());
            case 15:
                return new com.yandex.go.shortcuts.impl.factory.g((Context) this.b.get(), (ru.yandex.taxi.widget.c) this.c.get(), (pav) this.d.get());
            case 16:
                return new m9s0((xcv0) this.b.get(), (ru.yandex.taxi.perf.b) this.c.get(), (fva0) this.d.get());
            case 17:
                return new j((st2) this.b.get(), (ru.yandex.taxi.logistics.sdk.management.deliveries.d) this.c.get(), (e) this.d.get());
            case 18:
                return new ru.yandex.taxi.layers.presentation.walkroute.simple.a((ru.yandex.taxi.walkroute.a) this.b.get(), (a3v) this.c.get(), (pwy0) this.d.get());
            case 19:
                return new wdt0((tk51) this.b.get(), (xam) this.c.get(), (hbm) this.d.get());
            case 20:
                return new zkt0((Looper) this.b.get(), (k020) this.c.get(), (lqo) this.d.get());
            case 21:
                return new com.yandex.go.special_needs_menu.a((oot0) this.b.get(), this.c, i5m.a(this.d));
            case 22:
                return new qqt0((as21) this.b.get(), (qmp) this.c.get(), (Context) this.d.get());
            case 23:
                return new com.yandex.go.splash.v2.e((tse) this.b.get(), (Lifecycle) this.c.get(), (com.yandex.go.splash.v2.g) this.d.get());
            case 24:
                return new y1r0((b) this.b.get(), (AppAnalyticsReporter) this.d.get(), ((c1b0) ((a1b0) this.c.get())).a(StorageType.SESSIONS_WITHOUT_FULLSCREEN));
            case 25:
                return new vvt0((com.ybsdk.persistence.b) this.b.get(), (b) this.c.get(), (AppAnalyticsReporter) this.d.get());
            case 26:
                return new slu0((Lifecycle) this.b.get(), (tse) this.c.get(), (ru.yandex.taxi.stories.domain.b) this.d.get());
            case 27:
                return new jpu0(this.b, (iu4) this.c.get(), (oep0) this.d.get());
            case 28:
                pwy0 pwy0Var = (pwy0) this.b.get();
                exu0 exu0Var = (exu0) this.c.get();
                return new tig0(pwy0Var, exu0Var);
            default:
                return new x4v0((dfw0) this.b.get(), (gfw0) this.c.get(), (c1m0) this.d.get());
        }
    }

    public /* synthetic */ kpp0(epp0 epp0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
