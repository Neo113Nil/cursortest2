package yads;

import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class y42 implements lsr {
    public final /* synthetic */ nj2 a;

    public y42(nj2 nj2Var) {
        this.a = nj2Var;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        s31 s31Var = (s31) obj;
        nj2 nj2Var = this.a;
        nj2Var.b.put(s31Var.a, s31Var.b);
        return s3q0.a;
    }
}
