package xsna;

import androidx.work.impl.WorkerStoppedException;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class azx0 extends Lambda implements izs<Throwable, s3q0> {
    final /* synthetic */ ugz<Object> $this_awaitWithin;
    final /* synthetic */ androidx.work.b $worker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azx0(androidx.work.b bVar, ugz<Object> ugzVar) {
        super(1);
        this.$worker = bVar;
        this.$this_awaitWithin = ugzVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th2).d());
        }
        this.$this_awaitWithin.cancel(false);
        return s3q0.a;
    }
}
