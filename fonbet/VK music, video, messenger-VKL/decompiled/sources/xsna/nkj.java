package xsna;

import xsna.pkj;

/* compiled from: ContentProductsStateMapper.kt */
/* loaded from: classes18.dex */
public final class nkj implements izs<mkj, pkj> {
    public static final nkj b = new nkj();

    @Override // xsna.izs
    public final pkj invoke(mkj mkjVar) {
        mkj mkjVar2 = mkjVar;
        if (mkjVar2.e) {
            return pkj.d.b;
        }
        Exception exc = mkjVar2.f;
        return exc != null ? new pkj.c(exc) : (mkjVar2.d.isEmpty() && mkjVar2.c.isEmpty()) ? pkj.b.b : new pkj.a(mkjVar2.b, mkjVar2.c, mkjVar2.d, mkjVar2.h, mkjVar2.i, mkjVar2.g);
    }
}
