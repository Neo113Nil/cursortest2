package defpackage;

/* loaded from: classes7.dex */
public final class dd71 implements kq71 {
    public final int a;
    public final int b;
    public final int c;

    public dd71(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd71)) {
            return false;
        }
        dd71 dd71Var = (dd71) obj;
        return this.a == dd71Var.a && this.b == dd71Var.b && this.c == dd71Var.c;
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c;
    }
}
