package xsna;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ka4 implements io.reactivex.rxjava3.functions.l, Continuation {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Iterable) ((ta3) this.c).invoke(obj);
            default:
                return (io.reactivex.rxjava3.core.b0) ((ta3) this.c).invoke(obj);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((Runnable) this.c).run();
        return Tasks.forResult(null);
    }
}
