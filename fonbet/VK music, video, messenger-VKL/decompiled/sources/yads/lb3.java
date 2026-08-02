package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.d4k;
import xsna.s3q0;
import xsna.y370;

/* loaded from: classes10.dex */
public final class lb3 {
    public static volatile boolean a;
    public static final Object b = new Object();

    public static void a(Context context, bu1 bu1Var) {
        qu2 a2;
        if (a) {
            return;
        }
        synchronized (b) {
            try {
                if (!a && (a2 = gx2.a().a(context)) != null && a2.g0) {
                    AtomicBoolean atomicBoolean = d4k.a;
                    d4k.a(new kb3(bu1Var, y370.a, a2));
                    a = true;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
