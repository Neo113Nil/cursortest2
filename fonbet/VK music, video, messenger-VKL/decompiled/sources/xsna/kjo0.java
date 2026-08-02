package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import xsna.us2;
import xsna.v4s;

/* compiled from: TextLayoutResult.kt */
/* loaded from: classes11.dex */
public final class kjo0 {
    public final us2 a;
    public final nmo0 b;
    public final List<us2.d<esa0>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final azl g;
    public final LayoutDirection h;
    public final v4s.a i;
    public final long j;

    public kjo0() {
        throw null;
    }

    public kjo0(us2 us2Var, nmo0 nmo0Var, List list, int i, boolean z, int i2, azl azlVar, LayoutDirection layoutDirection, v4s.a aVar, long j) {
        this.a = us2Var;
        this.b = nmo0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = azlVar;
        this.h = layoutDirection;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjo0)) {
            return false;
        }
        kjo0 kjo0Var = (kjo0) obj;
        return epx.f(this.a, kjo0Var.a) && epx.f(this.b, kjo0Var.b) && epx.f(this.c, kjo0Var.c) && this.d == kjo0Var.d && this.e == kjo0Var.e && this.f == kjo0Var.f && epx.f(this.g, kjo0Var.g) && this.h == kjo0Var.h && epx.f(this.i, kjo0Var.i) && o6j.c(this.j, kjo0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + shy.a(this.f, qoy.b((fw3.a(yga0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) bko0.a(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) o6j.l(this.j)) + ')';
    }
}
