package xsna;

import xsna.d4g0;
import xsna.rxh;
import xsna.ywh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dyh implements eig0 {
    public final /* synthetic */ fyh b;

    public /* synthetic */ dyh(fyh fyhVar) {
        this.b = fyhVar;
    }

    @Override // xsna.eig0
    public final void a(Object obj) {
        m3a m3aVar = this.b.i;
        d4g0 d4g0Var = (d4g0) obj;
        if (d4g0Var instanceof d4g0.a) {
            d4g0.a aVar = (d4g0.a) d4g0Var;
            m3aVar.c(new ywh.a(aVar.b, Integer.valueOf(aVar.a), aVar.c));
            return;
        }
        if (d4g0Var instanceof d4g0.e) {
            m3aVar.c(new rxh.j(((d4g0.e) d4g0Var).a));
            return;
        }
        if (d4g0Var instanceof d4g0.d) {
            d4g0.d dVar = (d4g0.d) d4g0Var;
            m3aVar.c(new ywh.e(dVar.a, dVar.b));
        } else if (d4g0Var instanceof d4g0.b) {
            d4g0.b bVar = (d4g0.b) d4g0Var;
            m3aVar.c(new ywh.b(bVar.a, bVar.b));
        } else if (d4g0Var instanceof d4g0.c) {
            d4g0.c cVar = (d4g0.c) d4g0Var;
            m3aVar.c(new ywh.c(cVar.a, cVar.b));
        }
    }
}
