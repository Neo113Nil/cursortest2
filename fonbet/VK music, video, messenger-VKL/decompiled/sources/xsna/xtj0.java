package xsna;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: SingleEmitterListener.kt */
/* loaded from: classes6.dex */
public final class xtj0<T> implements OnCompleteListener<T> {
    public final io.reactivex.rxjava3.core.y<T> b;

    public xtj0(io.reactivex.rxjava3.core.y<T> yVar) {
        this.b = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        io.reactivex.rxjava3.core.y<T> yVar = this.b;
        try {
            yVar.onSuccess(m4s.n(task));
        } catch (Exception e) {
            yVar.onError(e);
        }
    }
}
