package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SuperappKitCommon.kt */
/* loaded from: classes11.dex */
public final class wgn0 {
    public static volatile mgn0 a;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static io.reactivex.rxjava3.disposables.c c;

    public static final void a() {
        if (jgn0.a != null) {
            ce3 b2 = jgn0.b();
            ((jf3) b2.e.b).evictAll();
            b2.f.removeMessages(0);
        }
    }
}
