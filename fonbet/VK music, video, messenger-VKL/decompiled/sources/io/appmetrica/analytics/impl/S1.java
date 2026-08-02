package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes8.dex */
public final class S1 {
    public static Intent a(Context context) {
        C4993lj c4993lj;
        C5030n4.l().u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(S7.b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Lf.c).build());
        C5030n4 l = C5030n4.l();
        synchronized (l) {
            try {
                if (l.o == null) {
                    C4993lj c4993lj2 = new C4993lj();
                    l.o = c4993lj2;
                    l.h.a(c4993lj2);
                }
                c4993lj = l.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo b = c4993lj.b(context);
        return data.putExtra("screen_size", b != null ? AbstractC5166sb.a(b) : null);
    }
}
