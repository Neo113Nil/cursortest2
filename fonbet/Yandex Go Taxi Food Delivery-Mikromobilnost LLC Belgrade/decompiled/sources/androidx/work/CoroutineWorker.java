package androidx.work;

import android.content.Context;
import defpackage.euy;
import defpackage.fse;
import defpackage.jl40;
import defpackage.kuy;
import defpackage.uh6;
import defpackage.yse;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lkuy;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "yse", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends kuy {
    public final WorkerParameters a;
    public final yse b;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = yse.b;
    }

    public abstract Object a(ContinuationImpl continuationImpl);

    @Override // defpackage.kuy
    public final euy getForegroundInfoAsync() {
        return uh6.G(this.b.plus(kotlinx.coroutines.a.a()), new CoroutineWorker$getForegroundInfoAsync$1(this, null));
    }

    @Override // defpackage.kuy
    public final void onStopped() {
    }

    @Override // defpackage.kuy
    public final euy startWork() {
        yse yseVar = yse.b;
        fse fseVar = this.b;
        if (jl40.l(fseVar, yseVar)) {
            fseVar = this.a.g;
        }
        return uh6.G(fseVar.plus(kotlinx.coroutines.a.a()), new CoroutineWorker$startWork$1(this, null));
    }
}
