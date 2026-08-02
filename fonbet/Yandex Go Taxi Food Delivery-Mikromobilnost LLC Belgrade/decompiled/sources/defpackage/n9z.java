package defpackage;

/* loaded from: classes8.dex */
public final class n9z {
    public final yf70 a;
    public final yf70 b;
    public final yf70 c;

    public n9z(yf70 yf70Var, yf70 yf70Var2, int i) {
        int i2 = i & 1;
        vf70 vf70Var = vf70.a;
        yf70Var = i2 != 0 ? vf70Var : yf70Var;
        yf70Var2 = (i & 4) != 0 ? vf70Var : yf70Var2;
        this.a = yf70Var;
        this.b = vf70Var;
        this.c = yf70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9z)) {
            return false;
        }
        n9z n9zVar = (n9z) obj;
        return jl40.l(this.a, n9zVar.a) && jl40.l(this.b, n9zVar.b) && jl40.l(this.c, n9zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vfc.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LocationInput(coordinates=" + this.a + ", geoId=" + this.b + ", geoPinPosition=" + this.c + ')';
    }

    public n9z() {
        this(null, null, 7);
    }
}
