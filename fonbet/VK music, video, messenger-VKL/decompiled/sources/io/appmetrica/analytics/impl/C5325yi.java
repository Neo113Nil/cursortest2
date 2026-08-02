package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5325yi {
    public final HashMap a = new HashMap();
    public final C5332z0 b;

    public C5325yi(C5332z0 c5332z0) {
        this.b = c5332z0;
    }

    public static C5325yi a() {
        return AbstractC5300xi.a;
    }

    public final C5122qi a(Context context, String str) {
        C5122qi c5122qi;
        C5122qi c5122qi2 = (C5122qi) this.a.get(str);
        if (c5122qi2 != null) {
            return c5122qi2;
        }
        synchronized (this.a) {
            try {
                c5122qi = (C5122qi) this.a.get(str);
                if (c5122qi == null) {
                    IHandlerExecutor a = C5030n4.l().c.a();
                    this.b.getClass();
                    if (C5307y0.e == null) {
                        ((L9) a).b.post(new RunnableC5275wi(this, context));
                    }
                    c5122qi = new C5122qi(context.getApplicationContext(), str, new C5332z0());
                    this.a.put(str, c5122qi);
                    c5122qi.d(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5122qi;
    }
}
