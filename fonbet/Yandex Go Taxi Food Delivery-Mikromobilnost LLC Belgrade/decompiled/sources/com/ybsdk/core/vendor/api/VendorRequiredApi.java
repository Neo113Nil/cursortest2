package com.ybsdk.core.vendor.api;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.x4c;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class VendorRequiredApi {
    public final boolean a;
    public final AppAnalyticsReporter b;

    public VendorRequiredApi(boolean z, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = z;
        this.b = appAnalyticsReporter;
    }

    public abstract List d();

    public final boolean e() {
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        if (this.a) {
            List<String> d = d();
            if (!(d instanceof Collection) || !d.isEmpty()) {
                for (String str : d) {
                    try {
                        Class.forName(str);
                        appAnalyticsReporter.m0.c(str, true);
                    } catch (ClassNotFoundException unused) {
                        appAnalyticsReporter.m0.c(str, false);
                        return false;
                    } catch (Throwable th) {
                        x4c.g("Error when checking vendor api availability", th, str, null, 8);
                    }
                }
                return true;
            }
        }
        return true;
    }
}
