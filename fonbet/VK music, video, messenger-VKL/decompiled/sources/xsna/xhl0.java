package xsna;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import xsna.xhl0.a;
import xsna.ycq0;

/* compiled from: StorageTask.java */
/* loaded from: classes13.dex */
public abstract class xhl0<ResultT extends a> extends gqj<ResultT> {
    public static final HashMap<Integer, HashSet<Integer>> j;
    public final Object a = new Object();
    public final k6o0<OnSuccessListener<? super ResultT>, ResultT> b = new k6o0<>(this, 128, new o860(this, 8));
    public final k6o0<OnFailureListener, ResultT> c = new k6o0<>(this, 64, new ac20(this, 17));
    public final k6o0<OnCompleteListener<ResultT>, ResultT> d = new k6o0<>(this, 448, new uq80(this, 1));
    public final k6o0<OnCanceledListener, ResultT> e = new k6o0<>(this, 256, new uf20(this, 11));
    public final k6o0<la80<? super ResultT>, ResultT> f = new k6o0<>(this, -465, new koi0(2));
    public final k6o0<y980<? super ResultT>, ResultT> g = new k6o0<>(this, 16, new thl0(0));
    public volatile int h = 1;
    public ResultT i;

    /* compiled from: StorageTask.java */
    public interface a {
        Exception getError();
    }

    /* compiled from: StorageTask.java */
    public class b implements a {
        public final Exception a;

        public b(@Nullable ycq0 ycq0Var, StorageException storageException) {
            if (storageException != null) {
                this.a = storageException;
                return;
            }
            if (ycq0Var.isCanceled()) {
                this.a = StorageException.a(Status.j);
            } else if (ycq0Var.h == 64) {
                this.a = StorageException.a(Status.h);
            } else {
                this.a = null;
            }
        }

        @Override // xsna.xhl0.a
        @Nullable
        public final Exception getError() {
            return this.a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        j = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    public final void a() {
        if (isComplete() || (this.h & 16) != 0 || this.h == 2 || f(256)) {
            return;
        }
        f(64);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        exc0.i(onCanceledListener);
        this.e.a(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCompleteListener(@NonNull OnCompleteListener<Object> onCompleteListener) {
        exc0.i(onCompleteListener);
        this.d.a(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        exc0.i(onFailureListener);
        this.c.a(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnSuccessListener(@NonNull OnSuccessListener<? super Object> onSuccessListener) {
        exc0.i(onSuccessListener);
        this.b.a(null, null, onSuccessListener);
        return this;
    }

    public final ResultT b() {
        ycq0.b e;
        ResultT resultt = this.i;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.i == null) {
            synchronized (this.a) {
                e = e();
            }
            this.i = e;
        }
        return this.i;
    }

    public abstract mhl0 c();

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> continueWith(@NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.a(null, null, new uhl0(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> continueWithTask(@NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.d.a(null, null, new vhl0(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public abstract ycq0.b e();

    public final boolean f(int i) {
        int[] iArr = {i};
        HashMap<Integer, HashSet<Integer>> hashMap = j;
        synchronized (this.a) {
            try {
                int i2 = iArr[0];
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(this.h));
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i2))) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = iArr[0];
                    sb.append(i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? i3 != 32 ? i3 != 64 ? i3 != 128 ? i3 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED");
                    sb.append(", ");
                    sb.substring(0, sb.length() - 2);
                    return false;
                }
                this.h = i2;
                int i4 = this.h;
                if (i4 == 2) {
                    yhl0 yhl0Var = yhl0.c;
                    synchronized (yhl0Var.b) {
                        yhl0Var.a.put(c().toString(), new WeakReference(this));
                    }
                } else if (i4 != 4 && i4 != 16 && i4 != 64 && i4 != 128 && i4 == 256) {
                    d();
                }
                this.b.b();
                this.c.b();
                this.e.b();
                this.d.b();
                this.g.b();
                this.f.b();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    public final Exception getException() {
        if (b() == null) {
            return null;
        }
        return b().getError();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Object getResult() {
        if (b() == null) {
            throw new IllegalStateException();
        }
        Exception error = b().getError();
        if (error == null) {
            return b();
        }
        throw new RuntimeExecutionException(error);
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.h == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return (this.h & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return (this.h & 128) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(@NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.b.a(null, null, new whl0(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        exc0.i(onCanceledListener);
        exc0.i(executor);
        this.e.a(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<Object> onCompleteListener) {
        exc0.i(onCompleteListener);
        exc0.i(executor);
        this.d.a(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        exc0.i(onFailureListener);
        exc0.i(executor);
        this.c.a(null, executor, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super Object> onSuccessListener) {
        exc0.i(executor);
        exc0.i(onSuccessListener);
        this.b.a(null, executor, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> continueWith(@NonNull Executor executor, @NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.a(null, executor, new uhl0(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        exc0.i(onCanceledListener);
        exc0.i(activity);
        this.e.a(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<Object> onCompleteListener) {
        exc0.i(onCompleteListener);
        exc0.i(activity);
        this.d.a(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        exc0.i(onFailureListener);
        exc0.i(activity);
        this.c.a(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<Object> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super Object> onSuccessListener) {
        exc0.i(activity);
        exc0.i(onSuccessListener);
        this.b.a(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> continueWithTask(@NonNull Executor executor, @NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.d.a(null, executor, new vhl0(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Object getResult(@NonNull Class cls) throws Throwable {
        if (b() != null) {
            if (!cls.isInstance(b().getError())) {
                Exception error = b().getError();
                if (error == null) {
                    return b();
                }
                throw new RuntimeExecutionException(error);
            }
            throw ((Throwable) cls.cast(b().getError()));
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(@NonNull Executor executor, @NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.b.a(null, executor, new whl0(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public void d() {
    }
}
