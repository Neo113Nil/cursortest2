package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class c281 {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean();

    public c281(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a() {
        if (!xga1.c(this.a) || jl40.l(Thread.currentThread(), Looper.getMainLooper().getThread()) || this.b.getAndSet(true)) {
            return;
        }
        qc71.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
    }
}
