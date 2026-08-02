package xsna;

import one.video.calls.sdk.internal.join.FastJoinException;

/* compiled from: FastJoinPrepare.kt */
/* loaded from: classes8.dex */
public final class flq<T, R> implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ clq b;

    public flq(clq clqVar) {
        this.b = clqVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        FastJoinException fastJoinException = th instanceof FastJoinException ? (FastJoinException) th : null;
        if (fastJoinException == null) {
            fastJoinException = new FastJoinException(th);
        }
        this.b.f.reportException("FastJoinPrepare", "fast join failed. reason: " + fastJoinException, fastJoinException);
        return io.reactivex.rxjava3.core.x.i(fastJoinException);
    }
}
