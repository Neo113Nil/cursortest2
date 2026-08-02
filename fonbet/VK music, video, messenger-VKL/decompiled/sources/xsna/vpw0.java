package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.spw0;
import xsna.xpw0;

/* compiled from: VoipHistoryFriendsReducer.kt */
/* loaded from: classes7.dex */
public final class vpw0 extends dm50<com.vk.voip.ui.history.friends.ui.b, spw0, xpw0> {
    public final ppw0 d;

    public vpw0() {
        super(xpw0.c.b);
        this.d = new ppw0();
    }

    @Override // xsna.dm50
    public final xpw0 c(xpw0 xpw0Var, spw0 spw0Var) {
        xpw0 xpw0Var2 = xpw0Var;
        spw0 spw0Var2 = spw0Var;
        if (spw0Var2 instanceof spw0.a) {
            spw0.a aVar = (spw0.a) spw0Var2;
            if (aVar instanceof spw0.a.b) {
                spw0.a.b bVar = (spw0.a.b) aVar;
                return new xpw0.a(bVar.b, bVar.c, bVar.d, xpw0.a.b.C4035a.a, xpw0.a.AbstractC4033a.b.a);
            }
            if (aVar instanceof spw0.a.C3685a) {
                return new xpw0.b(((spw0.a.C3685a) aVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (spw0Var2 instanceof spw0.d) {
            spw0.d dVar = (spw0.d) spw0Var2;
            if (xpw0Var2 instanceof xpw0.a) {
                if (dVar instanceof spw0.d.c) {
                    return xpw0.a.a((xpw0.a) xpw0Var2, null, 0, null, xpw0.a.b.C4036b.a, null, 23);
                }
                if (dVar instanceof spw0.d.b) {
                    spw0.d.b bVar2 = (spw0.d.b) dVar;
                    return xpw0.a.a((xpw0.a) xpw0Var2, bVar2.b, bVar2.c, bVar2.d, xpw0.a.b.C4035a.a, null, 16);
                }
                if (dVar instanceof spw0.d.a) {
                    return xpw0.a.a((xpw0.a) xpw0Var2, null, 0, null, xpw0.a.b.C4035a.a, null, 23);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(spw0Var2 instanceof spw0.b)) {
                if (spw0Var2.equals(spw0.c.b)) {
                    return xpw0.c.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            spw0.b bVar3 = (spw0.b) spw0Var2;
            if (xpw0Var2 instanceof xpw0.a) {
                if (bVar3 instanceof spw0.b.c) {
                    return xpw0.a.a((xpw0.a) xpw0Var2, null, 0, null, null, xpw0.a.AbstractC4033a.c.a, 15);
                }
                if (!(bVar3 instanceof spw0.b.C3686b)) {
                    if (bVar3 instanceof spw0.b.a) {
                        return xpw0.a.a((xpw0.a) xpw0Var2, null, 0, null, null, new xpw0.a.AbstractC4033a.C4034a(((spw0.b.a) bVar3).b), 15);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xpw0.a aVar2 = (xpw0.a) xpw0Var2;
                spw0.b.C3686b c3686b = (spw0.b.C3686b) bVar3;
                return xpw0.a.a(aVar2, null, c3686b.b, j5g.u0(c3686b.c, aVar2.d), null, xpw0.a.AbstractC4033a.b.a, 9);
            }
        }
        return xpw0Var2;
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.history.friends.ui.b d() {
        return new com.vk.voip.ui.history.friends.ui.b(e(new pzt0(7)), e(new ygm0(10)), e(new zyl0(this, 27)));
    }

    @Override // xsna.dm50
    public final void h(xpw0 xpw0Var, com.vk.voip.ui.history.friends.ui.b bVar) {
        xpw0 xpw0Var2 = xpw0Var;
        com.vk.voip.ui.history.friends.ui.b bVar2 = bVar;
        if (xpw0Var2 instanceof xpw0.c) {
            f(bVar2.a, xpw0Var2);
        } else if (xpw0Var2 instanceof xpw0.b) {
            f(bVar2.b, xpw0Var2);
        } else {
            if (!(xpw0Var2 instanceof xpw0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(bVar2.c, xpw0Var2);
        }
    }
}
