package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.brm0;

/* loaded from: classes8.dex */
public final class X1 {
    public static B1 d;
    public final Context a;
    public final A1 b;
    public BinderC5333z1 c;

    public X1(Context context, A1 a1) {
        this.a = context;
        this.b = a1;
    }

    public final void b() {
        C5342za.a(this.a);
        PublicLogger.Companion.init(this.a);
        Context context = this.a;
        A1 a1 = this.b;
        if (d == null) {
            N1 n1 = new N1(context, a1, new C5083p5(context));
            C5072ok c5072ok = C5342za.I.v;
            Q1 q1 = new Q1(n1);
            LinkedHashMap linkedHashMap = c5072ok.a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(q1);
            d = new M1(C5342za.I.d.b(), n1);
        }
        B1 b1 = d;
        if (b1 != null) {
            this.c = new BinderC5333z1(b1);
            C5342za c5342za = C5342za.I;
            c5342za.f = new C5276wj(c5342za.a, new C5301xj(b1));
            b1.onCreate();
        }
    }

    public final boolean c(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            b1.b(intent);
        }
        String action = intent.getAction();
        return (action == null || !brm0.B(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        d = null;
    }

    public final void a(Intent intent, int i) {
        B1 b1 = d;
        if (b1 != null) {
            b1.a(intent, i);
        }
    }

    public final int a(Intent intent, int i, int i2) {
        B1 b1 = d;
        if (b1 == null) {
            return 2;
        }
        b1.a(intent, i, i2);
        return 2;
    }

    public final IBinder a(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            b1.a(intent);
        }
        String action = intent.getAction();
        if (action != null && brm0.B(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new Mo();
        }
        BinderC5333z1 binderC5333z1 = this.c;
        if (binderC5333z1 == null) {
            return null;
        }
        return binderC5333z1;
    }

    public final void c() {
        B1 b1 = d;
        if (b1 != null) {
            b1.onDestroy();
        }
    }

    public final void a(Configuration configuration) {
        B1 b1 = d;
        if (b1 != null) {
            b1.onConfigurationChanged(configuration);
        }
    }

    public final void b(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            b1.c(intent);
        }
    }
}
