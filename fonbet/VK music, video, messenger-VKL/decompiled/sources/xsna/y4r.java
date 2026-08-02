package xsna;

import com.vk.log.L;
import xsna.a7f0;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedUpdateLivesStatusActionDelegate.kt */
/* loaded from: classes17.dex */
public final class y4r implements oj50<q4r, qvq, c2r> {
    public final i4r a;

    public y4r(i4r i4rVar) {
        this.a = i4rVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        if ((((qvq) kj50Var) instanceof qvq.w) && (q4rVar instanceof q4r.a)) {
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.k(((q4r.a) q4rVar).b.a).l(new dg1(new com.vk.movika.sdk.base.observable.u(29), 19)), new pj4(new xa9(1, this.a, t8e.class, "requestFinishedLives", "requestFinishedLives(Ljava/util/Set;)Lio/reactivex/rxjava3/core/Single;", 0, 5), 21)), new sop(aVar, 2), new whe(L.a, 5), 1);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
