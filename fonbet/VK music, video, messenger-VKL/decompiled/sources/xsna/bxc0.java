package xsna;

/* compiled from: PreInflateRequest.kt */
/* loaded from: classes.dex */
public final class bxc0 {
    public final int a;
    public final Class<?> b;
    public final boolean c;

    /* compiled from: PreInflateRequest.kt */
    public static final class a {
        public static bxc0 a(int i) {
            return new bxc0(i, null, false);
        }
    }

    public bxc0(int i, Class<?> cls, boolean z) {
        this.a = i;
        this.b = cls;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc0)) {
            return false;
        }
        bxc0 bxc0Var = (bxc0) obj;
        return this.a == bxc0Var.a && epx.f(this.b, bxc0Var.b) && this.c == bxc0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Class<?> cls = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (cls == null ? 0 : cls.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreInflateRequest(layoutId=");
        sb.append(this.a);
        sb.append(", parentClass=");
        sb.append(this.b);
        sb.append(", mergeLayout=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
