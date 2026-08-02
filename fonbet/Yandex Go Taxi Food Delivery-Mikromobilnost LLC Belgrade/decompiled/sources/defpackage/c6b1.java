package defpackage;

/* loaded from: classes11.dex */
public final class c6b1 extends q6b1 {
    public final String a;
    public final boolean b;
    public final int c;

    public /* synthetic */ c6b1(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.q6b1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.q6b1
    public final String b() {
        return this.a;
    }

    @Override // defpackage.q6b1
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q6b1)) {
            return false;
        }
        q6b1 q6b1Var = (q6b1) obj;
        return this.a.equals(q6b1Var.b()) && this.b == q6b1Var.c() && this.c == q6b1Var.a();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return oyr.m(this.c, "}", oo31.l("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=", ", firelogEventType=", this.b));
    }
}
