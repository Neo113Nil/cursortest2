package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.btl;

/* compiled from: DelayedReloadObservable.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class atl extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        ((btl.a) this.receiver).onError(th);
        return s3q0.a;
    }
}
