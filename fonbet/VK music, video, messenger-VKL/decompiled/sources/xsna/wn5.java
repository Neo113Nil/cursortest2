package xsna;

import xsna.kyk0;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes.dex */
public final class wn5 extends kyk0 {
    public final xn5 a;
    public final zn5 b;
    public final yn5 c;

    public wn5(xn5 xn5Var, zn5 zn5Var, yn5 yn5Var) {
        this.a = xn5Var;
        this.b = zn5Var;
        this.c = yn5Var;
    }

    @Override // xsna.kyk0
    public final kyk0.a a() {
        return this.a;
    }

    @Override // xsna.kyk0
    public final kyk0.b b() {
        return this.c;
    }

    @Override // xsna.kyk0
    public final kyk0.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyk0)) {
            return false;
        }
        kyk0 kyk0Var = (kyk0) obj;
        return this.a.equals(kyk0Var.a()) && this.b.equals(kyk0Var.c()) && this.c.equals(kyk0Var.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
