package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import xsna.u4k;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class t4k implements SuccessContinuation<d0j0, Void> {
    public final /* synthetic */ u4k.a b;

    public t4k(u4k.a aVar) {
        this.b = aVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable d0j0 d0j0Var) throws Exception {
        if (d0j0Var == null) {
            return Tasks.forResult(null);
        }
        u4k.a aVar = this.b;
        u4k u4kVar = u4k.this;
        u4k u4kVar2 = u4k.this;
        u4k.a(u4kVar);
        u4kVar2.m.g(u4kVar2.e.a, null);
        u4kVar2.q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
