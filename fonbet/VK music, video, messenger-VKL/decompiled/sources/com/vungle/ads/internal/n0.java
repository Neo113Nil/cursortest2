package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import xsna.epx;

/* loaded from: classes7.dex */
public final class n0 {
    public final Context a;
    public final DisplayMetrics b;

    public n0(Context context) {
        this.a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b = displayMetrics;
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && epx.f(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
