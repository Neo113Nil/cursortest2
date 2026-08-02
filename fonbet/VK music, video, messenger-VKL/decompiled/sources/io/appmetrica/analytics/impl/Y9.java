package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes8.dex */
public final class Y9 {
    public final Context a;
    public final C4842fn b;
    public final C4900i3 c;
    public final SafePackageManager d;

    public Y9(Context context, C4842fn c4842fn, C4900i3 c4900i3, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = c4842fn;
        this.c = c4900i3;
        this.d = safePackageManager;
    }

    public Y9(Context context) {
        this(context, new C4842fn(context, "io.appmetrica.analytics.build_id"), new C4900i3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
