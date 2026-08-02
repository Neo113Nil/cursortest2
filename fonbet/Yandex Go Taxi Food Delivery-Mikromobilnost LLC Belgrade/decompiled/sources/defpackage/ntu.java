package defpackage;

import androidx.compose.foundation.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lntu;", "Lj530;", "Landroidx/compose/foundation/h;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ntu extends j530 {
    public final zx40 a;

    public ntu(zx40 zx40Var) {
        this.a = zx40Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        h hVar = new h();
        hVar.a = this.a;
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntu) && jl40.l(((ntu) obj).a, this.a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        h hVar = (h) e530Var;
        zx40 zx40Var = hVar.a;
        zx40 zx40Var2 = this.a;
        if (jl40.l(zx40Var, zx40Var2)) {
            return;
        }
        hVar.G0();
        hVar.a = zx40Var2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
