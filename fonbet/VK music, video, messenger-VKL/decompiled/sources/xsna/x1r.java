package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedMenuItemClipDelegate.kt */
/* loaded from: classes17.dex */
public final class x1r implements oj50<q4r, qvq, c2r> {
    public static final /* synthetic */ qcy<Object>[] b;
    public final d80 a = new d80();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(x1r.class, "clipActionDisposableProperty", "getClipActionDisposableProperty()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.l) && (q4rVar instanceof q4r.a)) {
            if (!(((qvq.l) qvqVar) instanceof qvq.l.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a(qvq.j.c.b);
            qcy<Object> qcyVar = b[0];
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.a.b;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
