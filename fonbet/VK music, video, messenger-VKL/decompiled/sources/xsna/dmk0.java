package xsna;

/* compiled from: SpoilerParams.kt */
/* loaded from: classes18.dex */
public final class dmk0 implements g5p {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dmk0() {
        this(false, false, false, false);
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.a == this.c && this.b == this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmk0)) {
            return false;
        }
        dmk0 dmk0Var = (dmk0) obj;
        return this.a == dmk0Var.a && this.b == dmk0Var.b && this.c == dmk0Var.c && this.d == dmk0Var.d;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return jmk0.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerParams(isSpoilerEnabled=");
        sb.append(this.a);
        sb.append(", isDonateEnabled=");
        sb.append(this.b);
        sb.append(", initialSpoilerEnabled=");
        sb.append(this.c);
        sb.append(", initialDonateEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public dmk0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
