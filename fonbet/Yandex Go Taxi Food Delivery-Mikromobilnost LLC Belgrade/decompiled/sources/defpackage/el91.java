package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class el91 {
    public static final el91 d = new el91();
    public final Runnable a;
    public final Executor b;
    public el91 c;

    public el91() {
        this.a = null;
        this.b = null;
    }

    public el91(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
