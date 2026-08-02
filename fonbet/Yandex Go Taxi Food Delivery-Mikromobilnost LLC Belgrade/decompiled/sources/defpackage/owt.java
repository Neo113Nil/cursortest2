package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.api.VendorRequiredApi;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class owt extends VendorRequiredApi implements la5 {
    public final Context c;
    public final List d;

    public owt(Context context, AppAnalyticsReporter appAnalyticsReporter, boolean z) {
        super(z, appAnalyticsReporter);
        this.c = context;
        this.d = Collections.singletonList("com.google.android.gms.auth.api.phone.SmsRetriever");
    }

    @Override // com.ybsdk.core.vendor.api.VendorRequiredApi
    public final List d() {
        return this.d;
    }
}
