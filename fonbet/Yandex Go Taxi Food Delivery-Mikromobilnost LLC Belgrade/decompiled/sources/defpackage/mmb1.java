package defpackage;

/* loaded from: classes11.dex */
public final class mmb1 extends mnb1 {
    public final String a;
    public final boolean b;
    public final int c;

    public /* synthetic */ mmb1(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.mnb1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.mnb1
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mnb1
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mnb1)) {
            return false;
        }
        mnb1 mnb1Var = (mnb1) obj;
        return this.a.equals(mnb1Var.b()) && this.b == mnb1Var.c() && this.c == mnb1Var.a();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.c ^ (((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.a);
        sb.append(", enableFirelog=");
        sb.append(this.b);
        sb.append(", firelogEventType=");
        return oyr.m(this.c, "}", sb);
    }
}
