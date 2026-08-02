package defpackage;

/* loaded from: classes.dex */
public final class asv {
    public final int a;
    public final boolean b;
    public final float c;
    public final bb1 d;
    public final float e;

    public asv(int i, boolean z, float f, bb1 bb1Var, float f2) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = bb1Var;
        this.e = f2;
    }

    public static asv a(asv asvVar, float f, bb1 bb1Var, float f2, int i) {
        int i2 = asvVar.a;
        boolean z = asvVar.b;
        if ((i & 4) != 0) {
            f = asvVar.c;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            bb1Var = asvVar.d;
        }
        bb1 bb1Var2 = bb1Var;
        if ((i & 16) != 0) {
            f2 = asvVar.e;
        }
        return new asv(i2, z, f3, bb1Var2, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asv)) {
            return false;
        }
        asv asvVar = (asv) obj;
        return this.a == asvVar.a && this.b == asvVar.b && Float.compare(this.c, asvVar.c) == 0 && jl40.l(this.d, asvVar.d) && Float.compare(this.e, asvVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + g8e.c(this.c, unr0.e(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Indicator(position=");
        sb.append(this.a);
        sb.append(", active=");
        sb.append(this.b);
        sb.append(", centerOffset=");
        sb.append(this.c);
        sb.append(", itemSize=");
        sb.append(this.d);
        sb.append(", scaleFactor=");
        return n.n(sb, this.e, ')');
    }
}
