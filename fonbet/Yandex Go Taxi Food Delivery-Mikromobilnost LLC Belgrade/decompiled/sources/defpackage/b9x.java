package defpackage;

import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class b9x extends t8x {
    public final c A;
    public final c9x B;
    public final ipb C;
    public final Object D;

    public b9x(c cVar, c9x c9xVar, ipb ipbVar, Object obj) {
        this.A = cVar;
        this.B = c9xVar;
        this.C = ipbVar;
        this.D = obj;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return false;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        c cVar = this.A;
        cVar.getClass();
        ipb ipbVar = this.C;
        ipb W = c.W(ipbVar);
        c9x c9xVar = this.B;
        Object obj = this.D;
        if (W == null || !cVar.i0(c9xVar, W, obj)) {
            c9xVar.a.c(new uqy(2), 2);
            ipb W2 = c.W(ipbVar);
            if (W2 == null || !cVar.i0(c9xVar, W2, obj)) {
                cVar.p(cVar.C(c9xVar, obj));
            }
        }
    }
}
