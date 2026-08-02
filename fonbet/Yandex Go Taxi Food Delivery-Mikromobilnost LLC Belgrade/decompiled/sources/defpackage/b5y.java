package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb5y;", "Lj530;", "Lf5y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b5y extends j530 {
    public final g5y a;
    public final a5y b;
    public final Orientation c;

    public b5y(g5y g5yVar, a5y a5yVar, Orientation orientation) {
        this.a = g5yVar;
        this.b = a5yVar;
        this.c = orientation;
    }

    @Override // defpackage.j530
    public final e530 a() {
        f5y f5yVar = new f5y();
        f5yVar.a = this.a;
        f5yVar.b = this.b;
        f5yVar.c = this.c;
        return f5yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5y)) {
            return false;
        }
        b5y b5yVar = (b5y) obj;
        return jl40.l(this.a, b5yVar.a) && jl40.l(this.b, b5yVar.b) && this.c == b5yVar.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        f5y f5yVar = (f5y) e530Var;
        f5yVar.a = this.a;
        f5yVar.b = this.b;
        f5yVar.c = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
