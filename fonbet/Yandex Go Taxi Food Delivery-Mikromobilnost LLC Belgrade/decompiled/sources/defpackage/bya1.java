package defpackage;

/* loaded from: classes11.dex */
public final class bya1 extends vya1 {
    public final String a;
    public final boolean b;
    public final int c;

    public /* synthetic */ bya1(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.vya1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vya1
    public final String b() {
        return this.a;
    }

    @Override // defpackage.vya1
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vya1)) {
            return false;
        }
        vya1 vya1Var = (vya1) obj;
        return this.a.equals(vya1Var.b()) && this.b == vya1Var.c() && this.c == vya1Var.a();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.c ^ (((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return oyr.m(this.c, "}", oo31.l("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=", ", firelogEventType=", this.b));
    }
}
