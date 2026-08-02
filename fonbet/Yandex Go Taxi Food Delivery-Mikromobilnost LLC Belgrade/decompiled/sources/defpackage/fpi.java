package defpackage;

/* loaded from: classes5.dex */
public final class fpi extends hpi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public fpi(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpi)) {
            return false;
        }
        fpi fpiVar = (fpi) obj;
        return jl40.l(this.a, fpiVar.a) && jl40.l(this.b, fpiVar.b) && jl40.l(this.c, fpiVar.c) && this.d.equals(fpiVar.d) && this.e == fpiVar.e;
    }

    public final int hashCode() {
        return unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("BooleanSetupRequirement(name=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", price=", this.d, ", isSelected=");
        return x4e.i(v, this.e, ", image=null)");
    }
}
