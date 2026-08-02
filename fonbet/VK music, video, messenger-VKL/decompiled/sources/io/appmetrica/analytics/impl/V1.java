package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.V1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.epx;

/* loaded from: classes8.dex */
public final class V1 {
    public final Ba a = new Ba();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                U1 u1 = (U1) entry.getKey();
                if (((T1) entry.getValue()).a(intent)) {
                    u1.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Ba ba = this.a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) ba.a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && ba.b) {
                        ba.a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.c.entrySet()) {
                U1 u1 = (U1) entry.getKey();
                if (((T1) entry.getValue()).a(intent)) {
                    u1.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                U1 u1 = (U1) entry.getKey();
                if (((T1) entry.getValue()).a(intent)) {
                    u1.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i, int i2) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(U1 u1) {
        this.c.put(u1, new T1() { // from class: xsna.e6r0
            @Override // io.appmetrica.analytics.impl.T1
            public final boolean a(Intent intent) {
                return V1.a(V1.this, intent);
            }
        });
    }

    public static final boolean a(V1 v1, Intent intent) {
        v1.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) v1.a.a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(U1 u1) {
        this.b.put(u1, new T1() { // from class: xsna.g6r0
            @Override // io.appmetrica.analytics.impl.T1
            public final boolean a(Intent intent) {
                return V1.c(V1.this, intent);
            }
        });
    }

    public static final boolean c(V1 v1, Intent intent) {
        v1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(U1 u1) {
        this.b.put(u1, new T1() { // from class: xsna.f6r0
            @Override // io.appmetrica.analytics.impl.T1
            public final boolean a(Intent intent) {
                return V1.b(V1.this, intent);
            }
        });
    }

    public static final boolean b(V1 v1, Intent intent) {
        Collection collection;
        v1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) v1.a.a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !epx.f(data.getPath(), "/client")) {
            return -1;
        }
        try {
            return Integer.parseInt(data.getQueryParameter("pid"));
        } catch (Throwable unused) {
            return -1;
        }
    }
}
