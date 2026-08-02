package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.AbstractC5300xi;
import io.appmetrica.analytics.impl.C5117qd;
import io.appmetrica.analytics.impl.C5168sd;
import io.appmetrica.analytics.impl.C5194td;
import io.appmetrica.analytics.impl.C5220ud;
import io.appmetrica.analytics.impl.C5245vd;
import io.appmetrica.analytics.impl.C5270wd;
import io.appmetrica.analytics.impl.C5295xd;
import io.appmetrica.analytics.impl.C5320yd;
import io.appmetrica.analytics.impl.C5332z0;

/* loaded from: classes8.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;
    private static C5320yd a = new C5320yd();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C5320yd c5320yd = a;
        C5117qd c5117qd = c5320yd.b;
        c5117qd.b.a(context);
        c5117qd.d.a(str);
        c5320yd.c.a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC5300xi.a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C5320yd c5320yd = a;
        c5320yd.b.getClass();
        c5320yd.c.getClass();
        c5320yd.a.getClass();
        return C5332z0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C5320yd c5320yd = a;
        c5320yd.b.a.a(null);
        c5320yd.c.getClass();
        c5320yd.d.execute(new C5194td(c5320yd, moduleEvent));
    }

    public static void reportExternalAttribution(int i, @NonNull String str) {
        C5320yd c5320yd = a;
        c5320yd.b.getClass();
        c5320yd.c.getClass();
        c5320yd.d.execute(new C5220ud(c5320yd, i, str));
    }

    public static void sendEventsBuffer() {
        C5320yd c5320yd = a;
        c5320yd.b.getClass();
        c5320yd.c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C5320yd c5320yd = a;
        c5320yd.b.getClass();
        c5320yd.c.getClass();
        c5320yd.d.execute(new C5245vd(c5320yd, z));
    }

    public static void setProxy(@NonNull C5320yd c5320yd) {
        a = c5320yd;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C5320yd c5320yd = a;
        c5320yd.b.c.a(str);
        c5320yd.c.getClass();
        c5320yd.d.execute(new C5270wd(c5320yd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C5320yd c5320yd = a;
        C5117qd c5117qd = c5320yd.b;
        c5117qd.b.a(context);
        c5117qd.d.a(str);
        c5320yd.c.a.a(context.getApplicationContext());
        c5320yd.d.execute(new C5295xd(str));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C5320yd c5320yd = a;
        boolean booleanValue = bool.booleanValue();
        c5320yd.b.getClass();
        c5320yd.c.getClass();
        c5320yd.d.execute(new C5168sd(c5320yd, adRevenue, booleanValue));
    }
}
