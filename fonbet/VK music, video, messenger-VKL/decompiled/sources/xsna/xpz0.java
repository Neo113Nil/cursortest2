package xsna;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import xsna.cv90;
import xsna.dv90;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class xpz0 implements cv90.a {
    public final /* synthetic */ cv90 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ dv90.a c;

    public xpz0(cv90 cv90Var, TaskCompletionSource taskCompletionSource, dv90.a aVar) {
        this.a = cv90Var;
        this.b = taskCompletionSource;
        this.c = aVar;
    }

    @Override // xsna.cv90.a
    public final void a(Status status) {
        boolean i = status.i();
        TaskCompletionSource taskCompletionSource = this.b;
        if (!i) {
            taskCompletionSource.setException(ey2.g(status));
            return;
        }
        taskCompletionSource.setResult(this.c.a(this.a.await(0L, TimeUnit.MILLISECONDS)));
    }
}
