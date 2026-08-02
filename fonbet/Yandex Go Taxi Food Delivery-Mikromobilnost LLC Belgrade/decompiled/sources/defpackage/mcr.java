package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.api.VendorRequiredApi;
import io.appmetrica.analytics.push.provider.firebase.AppMetricaMessagingService;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mcr extends VendorRequiredApi {
    public final List c;

    public mcr(boolean z, AppAnalyticsReporter appAnalyticsReporter) {
        super(z, appAnalyticsReporter);
        this.c = Collections.singletonList("com.google.android.gms.common.ConnectionResult");
    }

    @Override // com.ybsdk.core.vendor.api.VendorRequiredApi
    public final List d() {
        return this.c;
    }

    public final boolean f(ContextThemeWrapper contextThemeWrapper, Bundle bundle) {
        if (!e() || a.d.d(contextThemeWrapper, b.a) != 0) {
            return false;
        }
        new AppMetricaMessagingService().processPush(contextThemeWrapper, bundle);
        return true;
    }
}
