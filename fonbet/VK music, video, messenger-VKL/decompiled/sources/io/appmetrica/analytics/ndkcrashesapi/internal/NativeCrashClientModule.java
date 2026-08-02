package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;

/* loaded from: classes8.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(Context context, NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(String str);
}
