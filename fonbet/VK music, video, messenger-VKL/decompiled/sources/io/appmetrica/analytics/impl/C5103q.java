package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5103q {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC5077p enumC5077p) {
        if (activity != null && this.a.get(activity) == enumC5077p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, enumC5077p);
        return true;
    }
}
