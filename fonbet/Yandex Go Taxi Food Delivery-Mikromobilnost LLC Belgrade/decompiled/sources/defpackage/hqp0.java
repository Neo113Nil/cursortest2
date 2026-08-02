package defpackage;

/* loaded from: classes3.dex */
public final class hqp0 extends crp0 {
    public final String c;
    public final IllegalArgumentException d;
    public final String e;
    public final String f;

    public hqp0(String str, IllegalArgumentException illegalArgumentException, String str2, String str3) {
        super("DeeplinkParsing");
        this.c = str;
        this.d = illegalArgumentException;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.d;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqp0)) {
            return false;
        }
        hqp0 hqp0Var = (hqp0) obj;
        return this.c.equals(hqp0Var.c) && this.d.equals(hqp0Var.d) && this.e.equals(hqp0Var.e) && jl40.l(this.f, hqp0Var.f);
    }

    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        return unr0.b(unr0.b((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeeplinkParsing(url=");
        sb.append(this.c);
        sb.append(", exception=");
        sb.append(this.d);
        sb.append(", message=");
        return g8e.r(sb, this.e, ", deeplinkSource=", this.f, ", payload=null)");
    }
}
