package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.bmz;
import xsna.tlz;

/* compiled from: LiveSpectatorsReducer.kt */
/* loaded from: classes3.dex */
public final class wlz extends dm50<dmz, tlz, bmz> {
    public static final int d = cn70.b(40);

    @Override // xsna.dm50
    public final bmz c(bmz bmzVar, tlz tlzVar) {
        tlz tlzVar2 = tlzVar;
        if (tlzVar2 instanceof tlz.b) {
            return bmz.c.b;
        }
        if (tlzVar2 instanceof tlz.c) {
            return new bmz.a(((tlz.c) tlzVar2).b);
        }
        if (tlzVar2 instanceof tlz.a) {
            return bmz.b.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final dmz d() {
        return new dmz(e(new p7x(1)), e(new ugm(this, 13)), e(new ulz(0)), e(new d37(22)));
    }

    @Override // xsna.dm50
    public final void h(bmz bmzVar, dmz dmzVar) {
        bmz bmzVar2 = bmzVar;
        dmz dmzVar2 = dmzVar;
        if (bmzVar2 instanceof bmz.c) {
            f(dmzVar2.a, bmzVar2);
            return;
        }
        if (!(bmzVar2 instanceof bmz.a)) {
            if (!(bmzVar2 instanceof bmz.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(dmzVar2.d, bmzVar2);
        } else if (((bmz.a) bmzVar2).b.isEmpty()) {
            f(dmzVar2.c, bmzVar2);
        } else {
            f(dmzVar2.b, bmzVar2);
        }
    }
}
