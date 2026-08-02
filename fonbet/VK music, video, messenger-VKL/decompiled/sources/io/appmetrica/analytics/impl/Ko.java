package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class Ko {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Go c;
    public final Go d;

    public Ko(Context context) {
        this.a = context;
        C5036na c5036na = new C5036na(context, "appmetrica_vital.dat");
        this.c = new Go(C5342za.k().y(), c5036na);
        this.d = new Go(new C4937jf(C5342za.k().B().e(context)), c5036na);
    }

    public final Go a() {
        return this.c;
    }

    public final Go b() {
        return this.d;
    }
}
