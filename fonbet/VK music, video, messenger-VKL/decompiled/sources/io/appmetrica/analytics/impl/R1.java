package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class R1 {
    public final C5010ma a;
    public boolean b;

    public R1() {
        this(new C5010ma());
    }

    public final synchronized long a(Context context) {
        String a;
        try {
            this.a.getClass();
            a = Va.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a) ? 0L : new JSONObject(a).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.b) {
            return;
        }
        long a = a(context);
        if (a > 0) {
            try {
                Thread.sleep(a);
            } catch (Throwable unused) {
            }
        }
        this.b = true;
    }

    public R1(C5010ma c5010ma) {
        this.b = false;
        this.a = c5010ma;
    }
}
