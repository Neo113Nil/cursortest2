package defpackage;

/* loaded from: classes4.dex */
public final class j6r0 implements Comparable {
    public final long a;
    public final long b;
    public final boolean c;

    public j6r0(int i) {
        this.a = 208352939L;
        this.b = 208352940L;
        this.c = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j6r0 j6r0Var = (j6r0) obj;
        return (this.a == j6r0Var.a && this.b == j6r0Var.b && this.c == j6r0Var.c) ? 0 : -1;
    }

    public final boolean equals(Object obj) {
        j6r0 j6r0Var = obj instanceof j6r0 ? (j6r0) obj : null;
        return j6r0Var != null && this.a == j6r0Var.a && this.b == j6r0Var.b && this.c == j6r0Var.c;
    }

    public final int hashCode() {
        return j6r0.class.hashCode();
    }

    public j6r0() {
        this(0);
    }
}
