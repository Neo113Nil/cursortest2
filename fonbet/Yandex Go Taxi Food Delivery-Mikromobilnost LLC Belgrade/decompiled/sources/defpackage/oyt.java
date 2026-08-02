package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class oyt {
    public final String a;
    public final ArrayList b;
    public final kyt c;
    public final lyt d;

    public oyt(String str, ArrayList arrayList, kyt kytVar, lyt lytVar) {
        this.a = str;
        this.b = arrayList;
        this.c = kytVar;
        this.d = lytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyt)) {
            return false;
        }
        oyt oytVar = (oyt) obj;
        return jl40.l(this.a, oytVar.a) && this.b.equals(oytVar.b) && jl40.l(this.c, oytVar.c) && jl40.l(this.d, oytVar.d);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        kyt kytVar = this.c;
        int hashCode = (b + (kytVar == null ? 0 : Double.hashCode(kytVar.a))) * 31;
        lyt lytVar = this.d;
        return hashCode + (lytVar != null ? lytVar.hashCode() : 0);
    }

    public final String toString() {
        return "GradientFragment(__typename=" + this.a + ", colors=" + this.b + ", onLinearGradient=" + this.c + ", onRadialGradient=" + this.d + ')';
    }
}
