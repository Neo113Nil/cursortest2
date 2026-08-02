package com.vungle.ads.internal;

import android.content.Context;
import android.os.Handler;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.anj;
import xsna.drm0;
import xsna.j8y;
import xsna.l5p;
import xsna.msy;
import xsna.nu4;
import xsna.t33;

/* loaded from: classes7.dex */
public final class w2 {
    public AtomicBoolean a = new AtomicBoolean(false);
    public AtomicBoolean b = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final n2 d = new n2(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public final void a(Context context, String str, InitializationListener initializationListener) {
        AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.s) null, 6);
        this.d.e();
        this.c.add(initializationListener);
        if (!drm0.N(str)) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '.') {
                }
            }
            if (com.vungle.ads.internal.util.z.a()) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.b("VungleInitializer", "Init: SDK is supported only for API versions 25 and above.");
                a(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
                return;
            }
            ConfigManager.INSTANCE.getClass();
            ConfigManager.b(str);
            if (this.a.get()) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already complete");
                b();
                return;
            } else if (this.b.getAndSet(true)) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already in progress");
                return;
            } else {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) msy.a(lazyThreadSafetyMode, new r2(context)).getValue())).b().a(new l5p(this, context, str, msy.a(lazyThreadSafetyMode, new s2(context)), 3), new nu4(this, 14));
                return;
            }
        }
        StringBuilder a = t33.a("App id invalid: ", str, ", package name: ");
        a.append(context.getPackageName());
        a(new InvalidAppId(a.toString()).logError$vungle_ads_release());
    }

    public final void b() {
        this.b.set(false);
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.d, (com.vungle.ads.internal.util.s) null, 6);
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onSuccess ");
        a.append(Thread.currentThread().getId());
        com.vungle.ads.internal.util.t.a("VungleInitializer", a.toString());
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new v2(this));
    }

    public static final void a(w2 w2Var, Context context, String str, Lazy lazy) {
        com.vungle.ads.internal.task.f a;
        boolean z = false;
        boolean z2 = anj.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean z3 = anj.a(context, "android.permission.INTERNET") == 0;
        if (z2 && z3) {
            PrivacyManager.INSTANCE.a(context);
            ((VungleApiClient) lazy.getValue()).c(str);
            try {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                Lazy a2 = msy.a(lazyThreadSafetyMode, new o2(context));
                ConfigManager configManager = ConfigManager.INSTANCE;
                FilePreferences filePreferences = (FilePreferences) a2.getValue();
                configManager.getClass();
                com.vungle.ads.internal.model.v2 a3 = ConfigManager.a(filePreferences, str);
                if (a3 != null) {
                    configManager.a(context, a3, true, null);
                    z = true;
                }
                w2Var.a.set(true);
                w2Var.b();
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "Running cleanup jobs. " + Thread.currentThread().getId());
                com.vungle.ads.internal.task.h hVar = (com.vungle.ads.internal.task.h) msy.a(lazyThreadSafetyMode, new p2(context)).getValue();
                a = com.vungle.ads.internal.task.a.a(null);
                ((com.vungle.ads.internal.task.s) hVar).a(a);
                if (z) {
                    return;
                }
                ConfigManager.a(context, q2.a);
                return;
            } catch (Throwable th) {
                boolean z5 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "Cannot get config", th);
                return;
            }
        }
        boolean z6 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "Network permissions not granted");
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new t2(w2Var));
    }

    public static final void a(w2 w2Var) {
        w2Var.a(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    public final void a(VungleError vungleError) {
        this.b.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Exception code is ");
            a.append(vungleError.getCode());
            localizedMessage = a.toString();
        }
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.INSTANCE.a(this.d, (com.vungle.ads.internal.util.s) null, localizedMessage);
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new u2(this, vungleError));
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", localizedMessage);
    }

    public final void a() {
        synchronized (ServiceLocator.d) {
            ServiceLocator.INSTANCE = null;
        }
        j8y j8yVar = VungleApiClient.n;
        com.vungle.ads.internal.network.d0.a = com.vungle.ads.internal.network.d0.a();
        this.a.set(false);
        this.b.set(false);
        this.c.clear();
    }

    public final void a(String str, String str2) {
        if (drm0.N(str)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "integrationName is empty");
            return;
        }
        String d = com.vungle.ads.internal.network.d0.d();
        String a = com.iab.omid.library.vungle.d.a(str, !drm0.N(str2) ? DomExceptionUtils.SEPARATOR.concat(str2) : "");
        if (drm0.D(d, a, false)) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.d0.c(d + ';' + a);
        if (this.a.get()) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
