package androidx.work;

import android.content.Context;
import defpackage.euy;
import defpackage.juy;
import defpackage.jx81;
import defpackage.kuy;
import defpackage.ma51;
import defpackage.r3k0;
import defpackage.s2s;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/Worker;", "Lkuy;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Leuy;", "Ljuy;", "startWork", "()Leuy;", "Ls2s;", "getForegroundInfoAsync", "getForegroundInfo", "()Ls2s;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Worker extends kuy {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract juy doWork();

    public s2s getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // defpackage.kuy
    public euy getForegroundInfoAsync() {
        return jx81.r(new r3k0(29, getBackgroundExecutor(), new ma51(this, 1)));
    }

    @Override // defpackage.kuy
    public final euy startWork() {
        return jx81.r(new r3k0(29, getBackgroundExecutor(), new ma51(this, 0)));
    }
}
