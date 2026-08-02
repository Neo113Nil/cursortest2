package xsna;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class bc00 {
    public static final Object b = new Object();

    @Nullable
    public static bc00 c;
    public final com.google.android.gms.internal.mlkit_common.zza a;

    public bc00(Looper looper) {
        this.a = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    @NonNull
    public static bc00 a() {
        bc00 bc00Var;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new bc00(handlerThread.getLooper());
                }
                bc00Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bc00Var;
    }

    @NonNull
    public static Task b(@NonNull final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zd01.zza.execute(new Runnable() { // from class: xsna.pa01
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e) {
                    taskCompletionSource2.setException(e);
                } catch (Exception e2) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", e2));
                }
            }
        });
        return taskCompletionSource.getTask();
    }
}
