package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.cb7;
import xsna.db7;
import xsna.ia7;
import xsna.ka7;
import xsna.ntf0;
import xsna.of90;
import xsna.ta7;

/* compiled from: BirthdaysListFeature.kt */
/* loaded from: classes15.dex */
public final class ma7 extends wk50<kb7, db7, ia7, ta7> {
    public final dv3 f;
    public final pa7 g;
    public final f4z h;

    public ma7(za7 za7Var, dv3 dv3Var, pa7 pa7Var) {
        super(ia7.a.b, za7Var);
        this.f = dv3Var;
        this.g = pa7Var;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(db7 db7Var, ia7 ia7Var) {
        db7 db7Var2 = db7Var;
        ia7 ia7Var2 = ia7Var;
        boolean z = ia7Var2 instanceof ia7.a;
        int i = 0;
        dv3 dv3Var = this.f;
        if (z) {
            T(ta7.a.c.b);
            a7f0.a.f(this, dv3Var.d(0), new r6(this, 9), new s6(this, 10), 1);
            return;
        }
        if (ia7Var2 instanceof ia7.d) {
            ia7.d dVar = (ia7.d) ia7Var2;
            if (dVar instanceof ia7.d.b) {
                T(ta7.a.c.b);
                a7f0.a.f(this, dv3Var.d(0), new r6(this, 9), new s6(this, 10), 1);
                return;
            } else {
                if (!(dVar instanceof ia7.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((db7Var2 instanceof db7.a) && (((db7.a) db7Var2).c instanceof ntf0.a)) {
                    T(ta7.c.C3734c.b);
                    a7f0.a.f(this, dv3Var.d(0), new pd(this, 12), new tl0(this, 13), 1);
                    return;
                }
                return;
            }
        }
        if (ia7Var2 instanceof ia7.c) {
            ia7.c cVar = (ia7.c) ia7Var2;
            if (db7Var2 instanceof db7.a) {
                db7.a aVar = (db7.a) db7Var2;
                la7 la7Var = aVar.b;
                if (la7Var.b && (aVar.c instanceof ntf0.a)) {
                    if (!(cVar instanceof ia7.c.b) || (aVar.d instanceof of90.b)) {
                        T(ta7.b.c.b);
                        Iterator<T> it = la7Var.a.iterator();
                        while (it.hasNext()) {
                            i += ((ab7) it.next()).b.size();
                        }
                        a7f0.a.f(this, dv3Var.d(i), new ns1(this, 9), new com.vk.movika.sdk.base.hooks.p(this, 13), 1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (ia7Var2 instanceof ia7.b) {
            ia7.b bVar = (ia7.b) ia7Var2;
            ka7 ka7Var = bVar.c;
            UserId userId = bVar.b;
            boolean f = epx.f(ka7Var, ka7.a.a);
            f4z f4zVar = this.h;
            if (f) {
                f4zVar.b(new cb7.a.C2654a(userId));
                return;
            }
            if (epx.f(ka7Var, ka7.c.a)) {
                f4zVar.b(new cb7.a.c(userId));
                return;
            }
            if (ka7Var instanceof ka7.e) {
                f4zVar.b(new cb7.a.e(userId, ((ka7.e) ka7Var).a));
            } else if (epx.f(ka7Var, ka7.d.a)) {
                f4zVar.b(new cb7.a.d(userId));
            } else {
                if (!epx.f(ka7Var, ka7.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new cb7.a.b(userId));
            }
        }
    }
}
