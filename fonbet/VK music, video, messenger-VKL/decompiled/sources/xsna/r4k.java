package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes13.dex */
public final class r4k implements SuccessContinuation {
    public final Object b;

    public /* synthetic */ r4k(Object obj) {
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public Task then(@Nullable Object obj) throws Exception {
        d0j0 d0j0Var = (d0j0) obj;
        u4k u4kVar = ((s4k) this.b).f;
        return d0j0Var == null ? Tasks.forResult(null) : Tasks.whenAll((Task<?>[]) new Task[]{u4k.a(u4kVar), u4kVar.m.g(u4kVar.e.a, null)});
    }

    public r4k() {
        this.b = new io.reactivex.rxjava3.disposables.g();
    }

    public r4k(s4k s4kVar, String str) {
        this.b = s4kVar;
    }
}
