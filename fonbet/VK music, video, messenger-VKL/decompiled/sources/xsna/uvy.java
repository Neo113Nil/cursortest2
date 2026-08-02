package xsna;

import xsna.cuy;
import xsna.dak0;

/* compiled from: LazyListState.kt */
/* loaded from: classes11.dex */
public final class uvy {
    public final /* synthetic */ xvy a;

    public uvy(xvy xvyVar) {
        this.a = xvyVar;
    }

    public final cuy.b a(int i) {
        xvy xvyVar = this.a;
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            hvy hvyVar = (hvy) ((zak0) xvyVar.f).getValue();
            dak0.a.d(a, b, e);
            return xvyVar.q.a(i, hvyVar.j, xvyVar.d, new xsq(i, hvyVar));
        } catch (Throwable th) {
            dak0.a.d(a, b, e);
            throw th;
        }
    }
}
