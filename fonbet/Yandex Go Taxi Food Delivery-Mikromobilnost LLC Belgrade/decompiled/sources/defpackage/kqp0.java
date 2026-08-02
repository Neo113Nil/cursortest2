package defpackage;

/* loaded from: classes11.dex */
public final class kqp0 extends crp0 {
    public final String c;
    public final Object d;
    public final String e;
    public final Throwable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqp0(String str, Object obj, String str2, Throwable th, int i) {
        super("ImageLoading");
        str = (i & 1) != 0 ? null : str;
        this.c = str;
        this.d = obj;
        this.e = str2;
        this.f = th;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.f;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqp0)) {
            return false;
        }
        kqp0 kqp0Var = (kqp0) obj;
        return jl40.l(this.c, kqp0Var.c) && jl40.l(this.d, kqp0Var.d) && jl40.l(this.e, kqp0Var.e) && jl40.l(this.f, kqp0Var.f);
    }

    public final String f() {
        return this.e;
    }

    public final Object g() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.f;
        return (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "ImageLoading(imageUrl=" + this.c + ", requestData=" + this.d + ", originalException=" + this.e + ", exception=" + this.f + ", payload=null)";
    }
}
