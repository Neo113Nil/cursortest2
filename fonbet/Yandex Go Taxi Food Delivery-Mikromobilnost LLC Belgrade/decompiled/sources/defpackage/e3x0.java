package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le3x0;", "Lj530;", "Lf3x0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e3x0 extends j530 {
    public final tls a;
    public final tls b;

    public e3x0(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        f3x0 f3x0Var = new f3x0(w8a1.a);
        f3x0Var.w = this.b;
        return f3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e3x0) {
            return this.b == ((e3x0) obj).b;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        f3x0 f3x0Var = (f3x0) e530Var;
        tls tlsVar = f3x0Var.w;
        tls tlsVar2 = this.b;
        if (tlsVar != tlsVar2) {
            f3x0Var.w = tlsVar2;
            a aVar = f3x0Var.x;
            if (aVar != null) {
                p651 p651Var = (p651) tlsVar2.invoke(aVar);
                if (jl40.l(p651Var, f3x0Var.c)) {
                    return;
                }
                f3x0Var.c = p651Var;
                f3x0Var.F0();
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
