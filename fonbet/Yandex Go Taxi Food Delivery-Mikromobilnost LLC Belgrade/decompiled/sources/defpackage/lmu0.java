package defpackage;

/* loaded from: classes6.dex */
public final class lmu0 implements o7m {
    public final String a;
    public final String b;
    public final boolean c;

    public lmu0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lmu0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lmu0 lmu0Var = (lmu0) obj;
        return jl40.l(this.a, lmu0Var.a) && jl40.l(this.b, lmu0Var.b);
    }

    @Override // defpackage.o7m
    public final String getStoryId() {
        return this.a;
    }

    @Override // defpackage.o7m
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
