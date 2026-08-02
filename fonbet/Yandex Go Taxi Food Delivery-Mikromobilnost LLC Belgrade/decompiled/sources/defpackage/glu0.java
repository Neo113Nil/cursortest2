package defpackage;

/* loaded from: classes11.dex */
public final class glu0 extends vgb1 {
    public final String a;
    public final String b;

    public glu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glu0)) {
            return false;
        }
        glu0 glu0Var = (glu0) obj;
        return jl40.l(this.a, glu0Var.a) && this.b.equals(glu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlStoredValue(name=" + this.a + ", value=" + ((Object) this.b) + ')';
    }
}
