package xsna;

import com.vk.dto.hints.Hint;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import kotlin.NoWhenBranchMatchedException;
import xsna.kqc0;
import xsna.nqc0;
import xsna.pqc0;
import xsna.rqc0;
import xsna.sqc0;

/* compiled from: PostingWithAuthorFeature.kt */
/* loaded from: classes4.dex */
public final class oqc0 extends wk50<yqc0, sqc0, kqc0, pqc0> {
    public final wcc0 f;
    public final f4z g;

    public oqc0(wcc0 wcc0Var, sqc0 sqc0Var) {
        super(kqc0.e.b, new qqc0(sqc0Var));
        this.f = wcc0Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(sqc0 sqc0Var, kqc0 kqc0Var) {
        Hint p;
        sqc0 sqc0Var2 = sqc0Var;
        kqc0 kqc0Var2 = kqc0Var;
        if (kqc0Var2 instanceof kqc0.e) {
            if (sqc0Var2 instanceof sqc0.b) {
                U();
                return;
            } else if (sqc0Var2 instanceof sqc0.c) {
                T(new pqc0.c(((sqc0.c) sqc0Var2).b));
                return;
            } else {
                if (!(sqc0Var2 instanceof sqc0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new pqc0.a(((sqc0.a) sqc0Var2).b));
                return;
            }
        }
        boolean z = kqc0Var2 instanceof kqc0.d;
        f4z f4zVar = this.g;
        if (z) {
            kqc0.d dVar = (kqc0.d) kqc0Var2;
            f4zVar.b(new rqc0.c(dVar.b, dVar.c));
            return;
        }
        if (kqc0Var2 instanceof kqc0.a) {
            if (sqc0Var2 instanceof sqc0.c) {
                vcc0 vcc0Var = ((sqc0.c) sqc0Var2).b;
                if (vcc0Var.b()) {
                    f4zVar.b(new rqc0.b(vcc0Var));
                    return;
                }
                return;
            }
            return;
        }
        if (kqc0Var2 instanceof kqc0.b) {
            if (sqc0Var2 instanceof sqc0.c) {
                sqc0.c cVar = (sqc0.c) sqc0Var2;
                wvw e = pla.e();
                String str = cVar.b.f;
                if (str != null && (p = e.b().p(str)) != null) {
                    e.b().s(p);
                }
                T(new pqc0.d(vcc0.a(cVar.b, null, null, false, null, null, 7)));
                return;
            }
            return;
        }
        boolean z2 = kqc0Var2 instanceof kqc0.g;
        wcc0 wcc0Var = this.f;
        if (z2) {
            if (sqc0Var2 instanceof sqc0.c) {
                vcc0 vcc0Var2 = ((sqc0.c) sqc0Var2).b;
                PostingAuthor a = com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.a.a(null);
                wcc0Var.b.getClass();
                T(new pqc0.d(vcc0.a(vcc0Var2, null, com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a.a(a), false, null, null, 58)));
                return;
            }
            return;
        }
        if (!(kqc0Var2 instanceof kqc0.f)) {
            if (!(kqc0Var2 instanceof kqc0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((sqc0Var2 instanceof sqc0.a) && epx.f(((sqc0.a) sqc0Var2).b, nqc0.b.a)) {
                wcc0Var.a.a();
            }
            f4zVar.b(rqc0.a.a);
            return;
        }
        if (sqc0Var2 instanceof sqc0.a) {
            nqc0 nqc0Var = ((sqc0.a) sqc0Var2).b;
            if (epx.f(nqc0Var, nqc0.a.a)) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    U();
                    return;
                }
                return;
            }
            if (epx.f(nqc0Var, nqc0.c.a)) {
                wcc0Var.a.a();
                U();
            }
        }
    }

    public final void U() {
        wcc0 wcc0Var = this.f;
        io.reactivex.rxjava3.internal.operators.single.y l = wcc0Var.a.b().l(new l960(new bgy(wcc0Var, 25), 3)).l(new xhb0(new qey(26), 4));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(l.q(asu0.i()).m(asu0Var.d()), new fv70(new es00(this, 28), 6)).subscribe(new fs00(new gda0(this, 6), 13), new ca10(new v4w(this, 19), 12)));
    }
}
