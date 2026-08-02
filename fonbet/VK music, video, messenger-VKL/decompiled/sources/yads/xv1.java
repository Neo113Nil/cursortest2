package yads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public abstract class xv1 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        if (a.compareAndSet(false, true)) {
            oc1.b("Yandex Mobile Ads 7.18.6 initialized successfully", new Object[0]);
        }
    }
}
