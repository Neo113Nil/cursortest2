package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public abstract class ol7 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(Context context) {
        if (a.compareAndSet(false, true)) {
            try {
                q66 q66Var = new q66();
                q66Var.a = true;
                q66Var.h(context, "app");
            } catch (Throwable th) {
                jst.e.k(th, "Failed to TraceRouteWrapper.checkNative");
            }
        }
    }
}
