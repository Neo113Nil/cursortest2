package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes8.dex */
public class T3 {
    public final Lf a;
    public final CounterConfiguration b;

    public T3(Lf lf, CounterConfiguration counterConfiguration) {
        this.a = lf;
        this.b = counterConfiguration;
    }

    @Nullable
    public static T3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Lf lf;
        CounterConfiguration fromBundle;
        String str = Lf.c;
        if (bundle != null) {
            try {
                lf = (Lf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && lf != null && context.getPackageName().equals(lf.a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && lf.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new T3(lf, fromBundle);
            }
            return null;
        }
        lf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.a + ", mCounterConfiguration=" + this.b + '}';
    }

    @NonNull
    public final Lf a() {
        return this.a;
    }
}
