package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.baw0;
import xsna.v9w0;

/* compiled from: VmojiProductsReducer.kt */
/* loaded from: classes7.dex */
public final class y9w0 extends dm50<gaw0, v9w0, baw0> {
    public final String d;

    public y9w0(String str, baw0.a aVar) {
        super(aVar);
        this.d = str;
    }

    @Override // xsna.dm50
    public final baw0 c(baw0 baw0Var, v9w0 v9w0Var) {
        baw0 baw0Var2 = baw0Var;
        v9w0 v9w0Var2 = v9w0Var;
        if (v9w0Var2 instanceof v9w0.a) {
            return new baw0.a(this.d, ((v9w0.a) v9w0Var2).b);
        }
        if (v9w0Var2 instanceof v9w0.c) {
            v9w0.c cVar = (v9w0.c) v9w0Var2;
            if (baw0Var2 instanceof baw0.a) {
                if (cVar instanceof v9w0.c.C3875c) {
                    return baw0.a.a((baw0.a) baw0Var2, null, null, null, baw0.a.AbstractC2601a.b.a, 7);
                }
                if (cVar instanceof v9w0.c.b) {
                    baw0.a aVar = (baw0.a) baw0Var2;
                    return baw0.a.a(aVar, aVar.b, aVar.c, null, baw0.a.AbstractC2601a.C2602a.a, 4);
                }
                if (cVar instanceof v9w0.c.a) {
                    return baw0.a.a((baw0.a) baw0Var2, null, null, null, baw0.a.AbstractC2601a.C2602a.a, 7);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (v9w0Var2 instanceof v9w0.d) {
            if (baw0Var2 instanceof baw0.a) {
                return baw0.a.a((baw0.a) baw0Var2, null, null, ((v9w0.d) v9w0Var2).b, null, 11);
            }
        } else {
            if (!(v9w0Var2 instanceof v9w0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (baw0Var2 instanceof baw0.a) {
                return baw0.a.a((baw0.a) baw0Var2, null, null, null, null, 11);
            }
        }
        return baw0Var2;
    }

    @Override // xsna.dm50
    public final gaw0 d() {
        return new gaw0(e(new kul0(5)));
    }

    @Override // xsna.dm50
    public final void h(baw0 baw0Var, gaw0 gaw0Var) {
        baw0 baw0Var2 = baw0Var;
        gaw0 gaw0Var2 = gaw0Var;
        if (!(baw0Var2 instanceof baw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(gaw0Var2.a, baw0Var2);
    }
}
