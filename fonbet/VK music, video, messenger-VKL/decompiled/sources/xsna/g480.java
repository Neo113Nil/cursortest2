package xsna;

/* compiled from: OnDialogMigrateEvent.kt */
/* loaded from: classes2.dex */
public final class g480 extends sxp {
    public final long b;
    public final long c;
    public final Object d;

    public g480(Object obj, long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = obj;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.d;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g480)) {
            return false;
        }
        g480 g480Var = (g480) obj;
        return this.b == g480Var.b && this.c == g480Var.c && epx.f(this.d, g480Var.d);
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
        Object obj = this.d;
        return a + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogMigrateEvent(oldDialogId=");
        sb.append(this.b);
        sb.append(", newDialogId=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
