package xsna;

import xsna.hr90;
import xsna.kw40;

/* compiled from: LeadingStopEventfulStateFilter.kt */
/* loaded from: classes3.dex */
public final class wyy implements x0q {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x0q
    public final boolean a(ry40 ry40Var, ry40 ry40Var2) {
        v0q v0qVar = (v0q) ry40Var2;
        if ((ry40Var != null && ry40Var2.c.hashCode() == ry40Var.c.hashCode()) || (v0qVar.a() instanceof kw40.b)) {
            return true;
        }
        kw40 a = v0qVar.a();
        kw40.a aVar = a instanceof kw40.a ? (kw40.a) a : null;
        return epx.f(aVar != null ? aVar.b : null, hr90.e.a);
    }

    @Override // xsna.x0q
    public final String getTag() {
        return "LeadingStopEventfulStateFilter";
    }
}
