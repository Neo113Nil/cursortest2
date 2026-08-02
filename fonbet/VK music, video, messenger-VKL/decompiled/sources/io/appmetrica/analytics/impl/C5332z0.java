package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5332z0 {
    public static boolean a() {
        boolean z;
        synchronized (C5307y0.class) {
            z = C5307y0.f;
        }
        return z;
    }

    public static void b() {
        synchronized (C5307y0.class) {
            C5307y0.f = true;
        }
    }
}
