package xsna;

import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.internal.join.FastJoinException;
import xsna.d0y;

/* compiled from: FastJoinPrepare.kt */
/* loaded from: classes8.dex */
public final class dlq<T, R> implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ clq b;

    public dlq(clq clqVar) {
        this.b = clqVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        d0y.a aVar = (d0y.a) obj;
        if (aVar instanceof d0y.a.C2694a) {
            ((d0y.a.C2694a) aVar).getClass();
            throw new FastJoinException(null);
        }
        if (!(aVar instanceof d0y.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.b.f.log("FastJoinPrepare", "fast join succeeded. result " + aVar);
        ((d0y.a.b) aVar).getClass();
        throw new IllegalStateException("conversationId must not be null");
    }
}
