package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes10.dex */
public final class cry0 {
    public final kk2 a;
    public final ety0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final fwi g;
    public final LayoutDirection h;
    public final dyr i;
    public final long j;

    public cry0(kk2 kk2Var, ety0 ety0Var, List list, int i, boolean z, int i2, fwi fwiVar, LayoutDirection layoutDirection, dyr dyrVar, long j) {
        this.a = kk2Var;
        this.b = ety0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = fwiVar;
        this.h = layoutDirection;
        this.i = dyrVar;
        this.j = j;
    }

    public final fwi a() {
        return this.g;
    }

    public final ety0 b() {
        return this.b;
    }

    public final kk2 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cry0)) {
            return false;
        }
        cry0 cry0Var = (cry0) obj;
        return jl40.l(this.a, cry0Var.a) && jl40.l(this.b, cry0Var.b) && jl40.l(this.c, cry0Var.c) && this.d == cry0Var.d && this.e == cry0Var.e && this.f == cry0Var.f && jl40.l(this.g, cry0Var.g) && this.h == cry0Var.h && jl40.l(this.i, cry0Var.i) && n8e.c(this.j, cry0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + oyr.b(this.f, unr0.e((unr0.c(tse0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) rnb1.b(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) n8e.l(this.j)) + ')';
    }
}
