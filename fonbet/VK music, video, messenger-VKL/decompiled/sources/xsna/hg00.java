package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* compiled from: Utils.kt */
/* loaded from: classes12.dex */
public final class hg00 {
    public static final hg00 a = new hg00();
    public static final Handler b = new Handler(Looper.getMainLooper());

    public static void a(gzs gzsVar) {
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            gzsVar.invoke();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        b.post(new qe9(3, gzsVar, countDownLatch));
        countDownLatch.await();
    }
}
