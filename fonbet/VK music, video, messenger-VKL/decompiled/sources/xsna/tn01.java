package xsna;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class tn01 extends sl01 {
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ sl01 d;
    public final /* synthetic */ as01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn01(as01 as01Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, sl01 sl01Var) {
        super(taskCompletionSource);
        this.e = as01Var;
        this.c = taskCompletionSource2;
        this.d = sl01Var;
    }

    @Override // xsna.sl01
    public final void a() {
        synchronized (this.e.f) {
            try {
                final as01 as01Var = this.e;
                final TaskCompletionSource taskCompletionSource = this.c;
                as01Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: xsna.jm01
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        as01 as01Var2 = as01.this;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (as01Var2.f) {
                            as01Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.e.k.getAndIncrement() > 0) {
                    this.e.b.c("Already connected to the service.", new Object[0]);
                }
                as01.b(this.e, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
