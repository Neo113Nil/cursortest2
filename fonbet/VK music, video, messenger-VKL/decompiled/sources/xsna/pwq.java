package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.c2r;
import xsna.mke;
import xsna.q4r;
import xsna.qvq;
import xsna.t8e;
import xsna.wk50;

/* compiled from: FeedApplyArgumentsActionDelegate.kt */
/* loaded from: classes17.dex */
public abstract class pwq implements oj50<q4r, qvq, c2r> {
    public final myc a;

    /* compiled from: FeedApplyArgumentsActionDelegate.kt */
    public static final class a extends pwq {
        public final mke.x b;
        public final i4r c;

        public a(mke.x xVar, i4r i4rVar, myc mycVar) {
            super(mycVar);
            this.b = xVar;
            this.c = i4rVar;
        }

        @Override // xsna.pwq
        public final io.reactivex.rxjava3.core.x b(qvq.v vVar) {
            if (!vVar.equals(qvq.v.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return t8e.a.a(this.c, this.b);
        }
    }

    /* compiled from: FeedApplyArgumentsActionDelegate.kt */
    public static final class b extends pwq {
        public final myc b;

        public b(myc mycVar) {
            super(mycVar);
            this.b = mycVar;
        }

        @Override // xsna.pwq
        public final io.reactivex.rxjava3.core.x b(qvq.v vVar) {
            return sn.b("Arguments is not supported");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WithoutArguments(itemsProducer=" + this.b + ')';
        }
    }

    public pwq(myc mycVar) {
        this.a = mycVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.v) && (q4rVar instanceof q4r.a)) {
            aVar.b(c2r.h.c.b);
            aVar.a(qvq.t.b);
            a7f0.a.f(aVar, b((qvq.v) qvqVar), new v74(13, aVar, this), new dxh(aVar, 15), 1);
        }
    }

    public abstract io.reactivex.rxjava3.core.x b(qvq.v vVar);

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
