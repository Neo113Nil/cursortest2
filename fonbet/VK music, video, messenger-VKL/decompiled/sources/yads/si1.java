package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class si1 {
    public final Context b;
    public final h73 a = new h73();
    public final AtomicBoolean c = new AtomicBoolean();

    public si1(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a() {
        if (ub.a(this.b)) {
            this.a.getClass();
            if (h73.a() || this.c.getAndSet(true)) {
                return;
            }
            oc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
