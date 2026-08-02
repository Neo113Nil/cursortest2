package xsna;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wjr implements SuccessContinuation, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wjr(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((xv8) this.c).invoke(obj);
            default:
                return (io.reactivex.rxjava3.core.e) ((xa40) this.c).invoke(obj);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        final zjr zjrVar = (zjr) this.c;
        final Task<com.google.firebase.remoteconfig.internal.a> b = zjrVar.c.b();
        final Task<com.google.firebase.remoteconfig.internal.a> b2 = zjrVar.d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b, b2}).continueWithTask(zjrVar.b, new Continuation() { // from class: xsna.xjr
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                com.google.firebase.remoteconfig.internal.a aVar;
                Task task2 = b;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                com.google.firebase.remoteconfig.internal.a aVar2 = (com.google.firebase.remoteconfig.internal.a) task2.getResult();
                Task task3 = b2;
                if (task3.isSuccessful() && (aVar = (com.google.firebase.remoteconfig.internal.a) task3.getResult()) != null && aVar2.c.equals(aVar.c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                zjr zjrVar2 = zjr.this;
                ixi ixiVar = zjrVar2.d;
                Executor executor = ixiVar.a;
                return Tasks.call(executor, new gxi(0, ixiVar, aVar2)).onSuccessTask(executor, new hxi(ixiVar, aVar2)).continueWith(zjrVar2.b, new kf3(zjrVar2, 18));
            }
        });
    }
}
