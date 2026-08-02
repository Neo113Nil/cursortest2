package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HttpExecutorInitializer.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class cjv extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
        return s3q0.a;
    }
}
