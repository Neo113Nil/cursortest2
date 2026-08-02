package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Tk {
    public final Xk a;
    public final Map b;

    public Tk(Context context, C4747c5 c4747c5) {
        c4747c5.a();
        Xk xk = new Xk(context, c4747c5);
        this.a = xk;
        this.b = new LinkedHashMap(xk.a());
    }
}
