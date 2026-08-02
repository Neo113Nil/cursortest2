package com.vungle.ads.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import java.util.HashMap;
import xsna.vr;

/* loaded from: classes7.dex */
public final class ServiceLocator {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ServiceLocator INSTANCE;
    public static final v1 d = new v1();
    public final Context a;
    public final HashMap b;
    public final HashMap c;

    public /* synthetic */ ServiceLocator(Context context, int i) {
        this(context);
    }

    public final void b() {
        this.b.put(com.vungle.ads.internal.task.e.class, new d2(this));
        this.b.put(com.vungle.ads.internal.task.h.class, new e2(this));
        this.b.put(VungleApiClient.class, new f2(this));
        this.b.put(com.vungle.ads.internal.platform.f.class, new g2(this));
        this.b.put(com.vungle.ads.internal.executor.a.class, new h2());
        this.b.put(com.vungle.ads.internal.omsdk.c.class, new i2(this));
        this.b.put(com.vungle.ads.internal.omsdk.d.class, new j2());
        this.b.put(FilePreferences.class, new k2(this));
        this.b.put(com.vungle.ads.internal.locale.a.class, new l2());
        this.b.put(com.vungle.ads.internal.bidding.e.class, new x1(this));
        this.b.put(PathProvider.class, new y1(this));
        this.b.put(com.vungle.ads.internal.downloader.m.class, new z1(this));
        this.b.put(com.vungle.ads.internal.util.k.class, new a2());
        this.b.put(com.vungle.ads.internal.signals.j.class, new b2(this));
        this.b.put(com.vungle.ads.internal.network.r.class, new c2(this));
    }

    public final synchronized <T> T getService(Class<T> cls) {
        return (T) a(cls);
    }

    public ServiceLocator(Context context) {
        this.a = context.getApplicationContext();
        this.b = new HashMap();
        this.c = new HashMap();
        b();
    }

    public final Object a(Class cls) {
        for (Class cls2 : this.b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                Object obj = this.c.get(cls2);
                if (obj != null) {
                    return obj;
                }
                w1 w1Var = (w1) this.b.get(cls2);
                if (w1Var != null) {
                    Object a = w1Var.a();
                    if (w1Var.a) {
                        this.c.put(cls2, a);
                    }
                    return a;
                }
                throw new IllegalArgumentException("Unknown class");
            }
        }
        throw new IllegalArgumentException(vr.b(cls, "Unknown dependency for "));
    }
}
