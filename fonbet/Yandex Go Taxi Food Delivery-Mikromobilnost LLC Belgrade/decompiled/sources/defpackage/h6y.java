package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh6y;", "Lj530;", "Lj6y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h6y extends j530 {
    public final sls a;
    public final e6y b;
    public final Orientation c;
    public final boolean w;

    public h6y(sls slsVar, e6y e6yVar, Orientation orientation, boolean z) {
        this.a = slsVar;
        this.b = e6yVar;
        this.c = orientation;
        this.w = z;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new j6y(this.a, this.b, this.c, this.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6y)) {
            return false;
        }
        h6y h6yVar = (h6y) obj;
        return this.a == h6yVar.a && jl40.l(this.b, h6yVar.b) && this.c == h6yVar.c && this.w == h6yVar.w;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        j6y j6yVar = (j6y) e530Var;
        j6yVar.a = this.a;
        j6yVar.b = this.b;
        Orientation orientation = j6yVar.c;
        Orientation orientation2 = this.c;
        if (orientation != orientation2) {
            j6yVar.c = orientation2;
            qje.P(j6yVar).D();
        }
        boolean z = j6yVar.w;
        boolean z2 = this.w;
        if (z == z2) {
            return;
        }
        j6yVar.w = z2;
        j6yVar.E0();
        qje.P(j6yVar).D();
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.w);
    }
}
