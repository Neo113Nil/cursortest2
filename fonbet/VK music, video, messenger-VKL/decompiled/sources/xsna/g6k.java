package xsna;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes.dex */
public final class g6k {
    public static final a d = new a();
    public final z5k a;
    public final z5k b;
    public final z5k c;

    /* compiled from: CrashlyticsWorkers.kt */
    public static final class a {
        public static void a(gzs gzsVar, gzs gzsVar2) {
            if (((Boolean) gzsVar.invoke()).booleanValue()) {
                return;
            }
            a aVar = g6k.d;
        }

        public static String b() {
            return Thread.currentThread().getName();
        }
    }

    public g6k(ExecutorService executorService, ExecutorService executorService2) {
        this.a = new z5k(executorService);
        this.b = new z5k(executorService);
        Tasks.forResult(null);
        this.c = new z5k(executorService2);
    }

    public static final void a() {
        a aVar = d;
        aVar.getClass();
        a.a(new a6k(0, aVar, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0), b6k.i);
    }
}
