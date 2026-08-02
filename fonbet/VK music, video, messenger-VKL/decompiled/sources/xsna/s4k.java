package xsna;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes13.dex */
public final class s4k implements Callable<Task<Void>> {
    public final /* synthetic */ long b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ Thread d;
    public final /* synthetic */ k1j0 e;
    public final /* synthetic */ u4k f;

    public s4k(u4k u4kVar, long j, Throwable th, Thread thread, k1j0 k1j0Var) {
        this.f = u4kVar;
        this.b = j;
        this.c = th;
        this.d = thread;
        this.e = k1j0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        long j = this.b;
        long j2 = j / 1000;
        u4k u4kVar = this.f;
        String e = u4kVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        u4kVar.c.a();
        tui0 tui0Var = u4kVar.m;
        tui0Var.getClass();
        tui0Var.f(this.c, this.d, CrashHianalyticsData.EVENT_ID_CRASH, new i0q(e, j2, jgp.b), true);
        u4kVar.d(j);
        k1j0 k1j0Var = this.e;
        u4kVar.b(false, k1j0Var, false);
        u4kVar.c(Boolean.FALSE, new cv8().a);
        return !u4kVar.b.b() ? Tasks.forResult(null) : k1j0Var.i.get().getTask().onSuccessTask(u4kVar.e.a, new r4k(this, e));
    }
}
