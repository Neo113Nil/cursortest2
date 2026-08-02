package xsna;

/* compiled from: VkVisibleRegion.kt */
/* loaded from: classes3.dex */
public final class v0w0 {
    public final edr0 a;
    public final edr0 b;
    public final edr0 c;
    public final edr0 d;

    public v0w0(edr0 edr0Var, edr0 edr0Var2, edr0 edr0Var3, edr0 edr0Var4) {
        this.a = edr0Var;
        this.b = edr0Var2;
        this.c = edr0Var3;
        this.d = edr0Var4;
    }

    public final edr0 a() {
        return this.c;
    }

    public final edr0 b() {
        return this.d;
    }

    public final edr0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0w0)) {
            return false;
        }
        v0w0 v0w0Var = (v0w0) obj;
        return epx.f(this.a, v0w0Var.a) && epx.f(this.b, v0w0Var.b) && epx.f(this.c, v0w0Var.c) && epx.f(this.d, v0w0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VkVisibleRegion(nearLeft=" + this.a + ", nearRight=" + this.b + ", farLeft=" + this.c + ", farRight=" + this.d + ')';
    }
}
