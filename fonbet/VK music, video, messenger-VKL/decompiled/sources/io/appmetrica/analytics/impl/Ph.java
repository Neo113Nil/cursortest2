package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class Ph extends T3 {

    @NonNull
    protected P8 c;
    protected Ef d;
    public boolean e;
    public String f;

    public Ph(@NonNull Lf lf, @NonNull CounterConfiguration counterConfiguration, @NonNull P8 p8) {
        this(lf, counterConfiguration, p8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        Lf lf = this.a;
        synchronized (lf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", lf);
        }
        return bundle;
    }

    @Nullable
    public final synchronized String d() {
        P8 p8;
        p8 = this.c;
        return p8.a.isEmpty() ? null : new JSONObject(p8.a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public Ph(@NonNull Lf lf, @NonNull CounterConfiguration counterConfiguration, @NonNull P8 p8, @Nullable String str) {
        super(lf, counterConfiguration);
        this.e = true;
        this.f = str;
        this.c = p8;
    }
}
