package xsna;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class ss01 extends xq01 {
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ xq01 d;
    public final /* synthetic */ uvz0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss01(uvz0 uvz0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, xq01 xq01Var) {
        super(taskCompletionSource);
        this.e = uvz0Var;
        this.c = taskCompletionSource2;
        this.d = xq01Var;
    }

    @Override // xsna.xq01
    public final void c() {
        synchronized (this.e.f) {
            try {
                final uvz0 uvz0Var = this.e;
                final TaskCompletionSource taskCompletionSource = this.c;
                uvz0Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: xsna.mr01
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        uvz0 uvz0Var2 = uvz0.this;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (uvz0Var2.f) {
                            uvz0Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.e.k.getAndIncrement() > 0) {
                    this.e.b.d("Already connected to the service.", new Object[0]);
                }
                uvz0.b(this.e, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
