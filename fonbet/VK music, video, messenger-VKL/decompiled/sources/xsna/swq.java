package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;
import xsna.a7f0;
import xsna.c2r;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedAuthChangedActionDelegate.kt */
/* loaded from: classes17.dex */
public final class swq implements oj50<q4r, qvq, c2r> {
    public final i4r a;
    public final myc b;

    public swq(i4r i4rVar, myc mycVar) {
        this.a = i4rVar;
        this.b = mycVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        aVar.a(qvq.t.b);
        if (!(q4rVar instanceof q4r.a)) {
            aVar.a(qvq.f.a.b);
            return;
        }
        q4r.a aVar2 = (q4r.a) q4rVar;
        c1r c1rVar = aVar2.b().get(aVar2.g);
        hfz hfzVar = c1rVar != null ? c1rVar.a : null;
        FeedItem.d dVar = hfzVar instanceof FeedItem.d ? (FeedItem.d) hfzVar : null;
        if (dVar == null) {
            aVar.a(qvq.n.b);
        } else {
            aVar.b(c2r.h.c.b);
            a7f0.a.f(aVar, this.a.v(dVar.k()), new ab6(dVar, this, aVar, 7), new t9e(aVar, 20), 1);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
