package androidx.compose.ui;

import defpackage.b64;
import defpackage.f530;
import defpackage.jl40;
import defpackage.tls;
import defpackage.wls;

/* loaded from: classes.dex */
public final class a implements f530 {
    public final f530 a;
    public final f530 b;

    public a(f530 f530Var, f530 f530Var2) {
        this.a = f530Var;
        this.b = f530Var2;
    }

    @Override // defpackage.f530
    public final Object b(Object obj, wls wlsVar) {
        return this.b.b(this.a.b(obj, wlsVar), wlsVar);
    }

    @Override // defpackage.f530
    public final boolean c(tls tlsVar) {
        return this.a.c(tlsVar) || this.b.c(tlsVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && jl40.l(this.b, aVar.b);
    }

    @Override // defpackage.f530
    public final boolean h(tls tlsVar) {
        return this.a.h(tlsVar) && this.b.h(tlsVar);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("["), (String) b("", CombinedModifier$toString$1.w), ']');
    }
}
