package xsna;

/* compiled from: TextFieldValue.kt */
/* loaded from: classes11.dex */
public final class tho0 {
    public static final fh9 d = new fh9(new n21(7), new nc90(19));
    public final us2 a;
    public final long b;
    public final qko0 c;

    public tho0(us2 us2Var, long j, int i) {
        this(us2Var, (i & 2) != 0 ? qko0.b : j, (qko0) null);
    }

    public static tho0 a(tho0 tho0Var, String str) {
        long j = tho0Var.b;
        qko0 qko0Var = tho0Var.c;
        tho0Var.getClass();
        return new tho0(new us2(str), j, qko0Var);
    }

    public static tho0 b(tho0 tho0Var, us2 us2Var, long j, int i) {
        if ((i & 1) != 0) {
            us2Var = tho0Var.a;
        }
        if ((i & 2) != 0) {
            j = tho0Var.b;
        }
        qko0 qko0Var = (i & 4) != 0 ? tho0Var.c : null;
        tho0Var.getClass();
        return new tho0(us2Var, j, qko0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tho0)) {
            return false;
        }
        tho0 tho0Var = (tho0) obj;
        return qko0.b(this.b, tho0Var.b) && epx.f(this.c, tho0Var.c) && epx.f(this.a, tho0Var.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = qko0.c;
        int a = bh10.a(hashCode, 31, this.b);
        qko0 qko0Var = this.c;
        return a + (qko0Var != null ? Long.hashCode(qko0Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) qko0.h(this.b)) + ", composition=" + this.c + ')';
    }

    public tho0(us2 us2Var, long j, qko0 qko0Var) {
        qko0 qko0Var2;
        this.a = us2Var;
        this.b = jgz.m(us2Var.c.length(), j);
        if (qko0Var != null) {
            qko0Var2 = new qko0(jgz.m(us2Var.c.length(), qko0Var.a));
        } else {
            qko0Var2 = null;
        }
        this.c = qko0Var2;
    }

    public tho0(String str, long j, int i) {
        this(new us2((i & 1) != 0 ? "" : str), (i & 2) != 0 ? qko0.b : j, (qko0) null);
    }
}
