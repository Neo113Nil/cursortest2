package xsna;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.giw0;
import xsna.yiw0;

/* compiled from: VoipCallServiceReducer.kt */
/* loaded from: classes7.dex */
public final class viw0 extends dm50<bjw0, giw0, yiw0> {
    public viw0() {
        super(yiw0.c.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [xsna.yiw0$e$b] */
    @Override // xsna.dm50
    public final yiw0 c(yiw0 yiw0Var, giw0 giw0Var) {
        yiw0.e.a aVar;
        yiw0.e.b.C4104b c4104b;
        List<low0> list;
        yiw0 yiw0Var2 = yiw0Var;
        giw0 giw0Var2 = giw0Var;
        if (giw0Var2.equals(giw0.d.b)) {
            return yiw0.c.b;
        }
        if (giw0Var2 instanceof giw0.b) {
            return new yiw0.b(null, ((giw0.b) giw0Var2).b);
        }
        if (giw0Var2 instanceof giw0.c.a) {
            giw0.c.a aVar2 = (giw0.c.a) giw0Var2;
            return new yiw0.d(aVar2.b, aVar2.c, aVar2.d, aVar2.e);
        }
        if (giw0Var2 instanceof giw0.f) {
            yiw0.a aVar3 = yiw0Var2 instanceof yiw0.a ? (yiw0.a) yiw0Var2 : null;
            if (aVar3 != null) {
                return new yiw0.a(aVar3.b, false);
            }
        } else if (giw0Var2 instanceof giw0.e) {
            yiw0.d dVar = yiw0Var2 instanceof yiw0.d ? (yiw0.d) yiw0Var2 : null;
            if (dVar != null) {
                return new yiw0.d(((giw0.e) giw0Var2).b, dVar.c, dVar.d, dVar.e);
            }
        } else {
            if (giw0Var2.equals(piw0.b)) {
                return yiw0.f.a.b;
            }
            if (giw0Var2 instanceof qiw0) {
                return new yiw0.f.b();
            }
            if (giw0Var2 instanceof oiw0) {
                return new yiw0.b(null, null);
            }
            if (!(giw0Var2 instanceof niw0)) {
                if (giw0Var2 instanceof hiw0) {
                    hiw0 hiw0Var = (hiw0) giw0Var2;
                    return new yiw0.b(hiw0Var.b, hiw0Var.c);
                }
                if (giw0Var2 instanceof giw0.a) {
                    return new yiw0.a(false, ((giw0.a) giw0Var2).b);
                }
                throw new NoWhenBranchMatchedException();
            }
            niw0 niw0Var = (niw0) giw0Var2;
            boolean z = niw0Var instanceof jiw0;
            if (z || (niw0Var instanceof liw0)) {
                if (yiw0Var2 instanceof yiw0.e) {
                    return new yiw0.e(z ? yiw0.e.a.C4103a.a : ((yiw0.e) yiw0Var2).b, niw0Var instanceof liw0 ? yiw0.e.b.a.a : ((yiw0.e) yiw0Var2).c);
                }
                return new yiw0.e(yiw0.e.a.C4103a.a, yiw0.e.b.a.a);
            }
            if (!(niw0Var instanceof miw0)) {
                boolean z2 = niw0Var instanceof iiw0;
                if (!z2 && !(niw0Var instanceof kiw0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (yiw0Var2 instanceof yiw0.e) {
                    if (z2) {
                        iiw0 iiw0Var = (iiw0) niw0Var;
                        aVar = new yiw0.e.a.b(iiw0Var.b, iiw0Var.c);
                    } else {
                        aVar = ((yiw0.e) yiw0Var2).b;
                    }
                    if (niw0Var instanceof kiw0) {
                        kiw0 kiw0Var = (kiw0) niw0Var;
                        c4104b = new yiw0.e.b.C4104b(kiw0Var.b, kiw0Var.c, false, kiw0Var.d);
                    } else {
                        c4104b = ((yiw0.e) yiw0Var2).c;
                    }
                    yiw0.e.a.b bVar = aVar instanceof yiw0.e.a.b ? (yiw0.e.a.b) aVar : null;
                    boolean isEmpty = bVar != null ? bVar.a.isEmpty() : false;
                    yiw0.e.b.C4104b c4104b2 = c4104b instanceof yiw0.e.b.C4104b ? c4104b : null;
                    return (isEmpty && ((c4104b2 == null || (list = c4104b2.c) == null) ? false : list.isEmpty())) ? new yiw0.a(true, false) : new yiw0.e(aVar, c4104b);
                }
            } else if (yiw0Var2 instanceof yiw0.e) {
                yiw0.e eVar = (yiw0.e) yiw0Var2;
                yiw0.e.b bVar2 = eVar.c;
                if (bVar2 instanceof yiw0.e.b.C4104b) {
                    yiw0.e.b.C4104b c4104b3 = (yiw0.e.b.C4104b) bVar2;
                    return new yiw0.e(eVar.b, new yiw0.e.b.C4104b(c4104b3.a, c4104b3.b, true, c4104b3.c));
                }
            }
        }
        return yiw0Var2;
    }

    @Override // xsna.dm50
    public final bjw0 d() {
        return new bjw0(e(new kfw0(this, 1)), e(new q9i0(this, 16)), e(new aer0(this, 10)), e(new rgl0(15)), e(new wx30(23)), e(new qcw0(1)));
    }

    @Override // xsna.dm50
    public final void h(yiw0 yiw0Var, bjw0 bjw0Var) {
        yiw0 yiw0Var2 = yiw0Var;
        bjw0 bjw0Var2 = bjw0Var;
        if (yiw0Var2.equals(yiw0.c.b)) {
            f(bjw0Var2.d, yiw0Var2);
            return;
        }
        if (yiw0Var2 instanceof yiw0.d) {
            f(bjw0Var2.a, yiw0Var2);
            return;
        }
        if (yiw0Var2 instanceof yiw0.f) {
            f(bjw0Var2.b, yiw0Var2);
            return;
        }
        if (yiw0Var2 instanceof yiw0.e) {
            f(bjw0Var2.c, yiw0Var2);
        } else if (yiw0Var2 instanceof yiw0.a) {
            f(bjw0Var2.e, yiw0Var2);
        } else {
            if (!(yiw0Var2 instanceof yiw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(bjw0Var2.f, yiw0Var2);
        }
    }
}
