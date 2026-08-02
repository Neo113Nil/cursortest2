package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes8.dex */
public abstract class Y5 extends BaseRequestConfig.ComponentLoader {
    public final SafePackageManager a;

    public Y5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a */
    public Z5 load(@NonNull X5 x5) {
        Z5 z5 = (Z5) super.load((Y5) x5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            z5.a = (i & 2) != 0 ? "1" : "0";
            z5.b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            z5.a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            z5.b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            z5.a = "0";
            z5.b = "0";
        }
        C5100pm c5100pm = x5.a;
        z5.c = c5100pm;
        z5.setRetryPolicyConfig(c5100pm.t);
        return z5;
    }

    public Y5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.a = safePackageManager;
    }
}
