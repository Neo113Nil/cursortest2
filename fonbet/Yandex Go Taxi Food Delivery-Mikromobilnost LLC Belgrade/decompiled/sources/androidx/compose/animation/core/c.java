package androidx.compose.animation.core;

import defpackage.aii0;
import defpackage.bns;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.osv;
import defpackage.oz40;
import defpackage.wls;
import defpackage.wz40;
import defpackage.zpn;

/* loaded from: classes10.dex */
public final class c {
    public final String a;
    public final wz40 b = new wz40(new osv[16]);
    public final oz40 c = androidx.compose.runtime.f.j(Boolean.FALSE);
    public long d = Long.MIN_VALUE;
    public final oz40 e = androidx.compose.runtime.f.j(Boolean.TRUE);

    public c(String str) {
        this.a = str;
    }

    public final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-318043801);
        int i2 = (btsVar.e(this) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            if (((Boolean) this.e.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue()) {
                btsVar.e0(-144841960);
                boolean e = btsVar.e(this);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new InfiniteTransition$run$1$1(oz40Var, this, null);
                    btsVar.o0(Q2);
                }
                zpn.e(btsVar, (wls) Q2, this);
                btsVar.t(false);
            } else {
                btsVar.e0(-143455237);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(this, i, 12);
        }
    }
}
