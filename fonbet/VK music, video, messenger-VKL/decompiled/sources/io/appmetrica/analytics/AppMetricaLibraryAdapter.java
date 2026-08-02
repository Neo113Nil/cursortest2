package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C4690a0;
import io.appmetrica.analytics.impl.C4716b0;
import io.appmetrica.analytics.impl.C5030n4;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.Ob;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes8.dex */
public class AppMetricaLibraryAdapter {
    private static F0 a = new F0();

    public static void activate(@NonNull Context context) {
        F0 f0 = a;
        if (!f0.a.a.a(context).a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Ob ob = f0.b;
        Context applicationContext = context.getApplicationContext();
        ob.getClass();
        C5030n4.l().g.a(applicationContext);
        C5030n4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        F0 f0 = a;
        if (f0.a.c.a((Void) null).a) {
            f0.b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    public static void setProxy(@NonNull F0 f0) {
        a = f0;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        F0 f0 = a;
        f0.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Nb nb = f0.a;
        if (nb.g.a(str).a && nb.a.a(context).a) {
            f0.b.getClass();
            C5030n4.l().g.a(context);
            C4716b0 b = C5030n4.l().b();
            b.c.a().executeDelayed(new C4690a0(b, context), b.d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f0 = a;
        Nb nb = f0.a;
        if (nb.a.a(context).a && nb.b.a(appMetricaLibraryAdapterConfig).a) {
            Ob ob = f0.b;
            Context applicationContext = context.getApplicationContext();
            ob.getClass();
            C5030n4.l().g.a(applicationContext);
            C5030n4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
