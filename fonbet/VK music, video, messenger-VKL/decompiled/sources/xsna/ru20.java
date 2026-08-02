package xsna;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public class ru20<DetectionResultT> implements Closeable, e5z {
    public static final f3u f = new f3u("MobileVisionBase", "");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ac00 c;
    public final CancellationTokenSource d;
    public final Executor e;

    public ru20(@NonNull rf01 rf01Var, @NonNull Executor executor) {
        this.c = rf01Var;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.d = cancellationTokenSource;
        this.e = executor;
        rf01Var.b.incrementAndGet();
        rf01Var.a(executor, e201.b, cancellationTokenSource.getToken()).addOnFailureListener(z501.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.b.getAndSet(true)) {
            return;
        }
        this.d.cancel();
        ac00 ac00Var = this.c;
        Executor executor = this.e;
        if (ac00Var.b.get() <= 0) {
            z = false;
        }
        exc0.l(z);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ac00Var.a.a(new ue01(ac00Var, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
