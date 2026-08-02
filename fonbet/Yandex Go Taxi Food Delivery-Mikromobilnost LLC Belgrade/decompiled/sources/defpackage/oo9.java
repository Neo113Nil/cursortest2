package defpackage;

/* loaded from: classes12.dex */
public final class oo9 {
    public final boolean a;
    public final no9 b;
    public final boolean c;
    public final mwa d;

    public oo9(boolean z, no9 no9Var, boolean z2, mwa mwaVar) {
        this.a = z;
        this.b = no9Var;
        this.c = z2;
        this.d = mwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo9)) {
            return false;
        }
        oo9 oo9Var = (oo9) obj;
        return this.a == oo9Var.a && jl40.l(this.b, oo9Var.b) && this.c == oo9Var.c && jl40.l(this.d, oo9Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        no9 no9Var = this.b;
        return Boolean.hashCode(false) + ((this.d.hashCode() + unr0.e((hashCode + (no9Var == null ? 0 : no9Var.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "ChargersBackgroundUiState(isFaded=" + this.a + ", toolbar=" + this.b + ", isPlusPlaqueVisible=" + this.c + ", surge=" + this.d + ", hasMenuEntryPoint=false)";
    }

    public oo9() {
        this(false, null, false, bei.A);
    }
}
