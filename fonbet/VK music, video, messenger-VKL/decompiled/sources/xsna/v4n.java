package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.dz40;
import xsna.m2n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4n implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v4n(d64 d64Var, d64 d64Var2, d64 d64Var3, d64 d64Var4, d64 d64Var5) {
        this.c = d64Var;
        this.d = d64Var2;
        this.e = d64Var3;
        this.f = d64Var4;
        this.g = d64Var5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                d64 d64Var5 = (d64) this.g;
                rj50 rj50Var = (rj50) obj;
                m2n m2nVar = (m2n) obj2;
                if (m2nVar instanceof m2n.d) {
                    return rj50Var.a(d64Var, m2nVar);
                }
                if (m2nVar instanceof m2n.a) {
                    return rj50Var.a(d64Var2, m2nVar);
                }
                if (m2nVar instanceof m2n.b) {
                    return rj50Var.a(d64Var3, m2nVar);
                }
                if (m2nVar instanceof m2n.c.a) {
                    return rj50Var.a(d64Var4, m2nVar);
                }
                if (m2nVar instanceof m2n.e.a) {
                    return rj50Var.a(d64Var5, m2nVar);
                }
                throw new NoWhenBranchMatchedException();
            default:
                ((Integer) obj2).getClass();
                ive0.b((h17) this.c, (rg50) this.d, (dz40.s) this.e, (q630) this.f, (jai) this.g, (androidx.compose.runtime.a) obj, ne7.I(25009));
                return s3q0.a;
        }
    }

    public /* synthetic */ v4n(h17 h17Var, rg50 rg50Var, dz40.s sVar, q630 q630Var, jai jaiVar, int i) {
        this.c = h17Var;
        this.d = rg50Var;
        this.e = sVar;
        this.f = q630Var;
        this.g = jaiVar;
    }
}
