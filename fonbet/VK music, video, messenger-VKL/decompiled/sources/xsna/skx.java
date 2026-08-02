package xsna;

import java.util.HashMap;
import xsna.okx;

/* compiled from: InternalPostMethodChainCall.kt */
/* loaded from: classes15.dex */
public final class skx<T> extends bkv<T> {
    public skx(wy2 wy2Var, mkx mkxVar, xbr0 xbr0Var, m7r0 m7r0Var, k7r0 k7r0Var) {
        super(wy2Var, mkxVar, xbr0Var, m7r0Var, k7r0Var);
    }

    @Override // xsna.bkv, xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        okx.a aVar = new okx.a();
        xbr0 xbr0Var = this.c;
        if (xbr0Var instanceof akv) {
            aVar.e = ((akv) xbr0Var).g;
        }
        aVar.a = xbr0Var.a;
        aVar.b = xbr0Var.b;
        HashMap hashMap = xbr0Var.c;
        HashMap hashMap2 = aVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        aVar.d = xbr0Var.e;
        return c(this.b.e(new okx(aVar), this.d));
    }
}
