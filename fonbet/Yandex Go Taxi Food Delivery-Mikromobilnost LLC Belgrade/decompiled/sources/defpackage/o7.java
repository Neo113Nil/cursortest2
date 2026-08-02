package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class o7 {
    public static final o7 d = new o7();
    public final Runnable a;
    public final Executor b;
    public o7 c;

    public o7() {
        this.a = null;
        this.b = null;
    }

    public o7(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
