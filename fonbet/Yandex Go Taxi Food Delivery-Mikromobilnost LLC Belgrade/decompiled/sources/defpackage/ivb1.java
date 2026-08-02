package defpackage;

/* loaded from: classes11.dex */
public final class ivb1 extends lvb1 {
    public final String a;
    public final boolean b;
    public final int c;

    public /* synthetic */ ivb1(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.lvb1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.lvb1
    public final String b() {
        return this.a;
    }

    @Override // defpackage.lvb1
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lvb1)) {
            return false;
        }
        lvb1 lvb1Var = (lvb1) obj;
        return this.a.equals(lvb1Var.b()) && this.b == lvb1Var.c() && this.c == lvb1Var.a();
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
