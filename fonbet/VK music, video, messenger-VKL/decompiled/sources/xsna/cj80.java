package xsna;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: OneLogVideo.kt */
/* loaded from: classes11.dex */
public final class cj80 {
    public static final cj80 a = new cj80();
    public static String b = "unknown";
    public static ExecutorService c;

    public final Executor a() {
        if (c == null) {
            synchronized (this) {
                try {
                    if (c == null) {
                        c = Executors.newSingleThreadExecutor();
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
