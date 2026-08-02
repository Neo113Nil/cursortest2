package xsna;

import androidx.work.impl.WorkerStoppedException;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class yyx0 extends Lambda implements izs<Throwable, s3q0> {
    final /* synthetic */ boolean $isTracingEnabled;
    final /* synthetic */ String $traceTag;
    final /* synthetic */ androidx.work.b $worker;
    final /* synthetic */ uyx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyx0(androidx.work.b bVar, boolean z, String str, uyx0 uyx0Var) {
        super(1);
        this.$worker = bVar;
        this.$isTracingEnabled = z;
        this.$traceTag = str;
        this.this$0 = uyx0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        String str;
        Throwable th2 = th;
        if (th2 instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th2).d());
        }
        if (this.$isTracingEnabled && (str = this.$traceTag) != null) {
            uyx0 uyx0Var = this.this$0;
            p7i p7iVar = uyx0Var.f.m;
            int hashCode = uyx0Var.a.hashCode();
            p7iVar.getClass();
            ndp0.c(hashCode, str);
        }
        return s3q0.a;
    }
}
