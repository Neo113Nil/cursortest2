package defpackage;

/* loaded from: classes5.dex */
public final class a470 implements b151 {
    public final int a;
    public final int b;
    public final int c;
    public final r5s d;

    public a470(int i, int i2, int i3, r5s r5sVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = r5sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a470)) {
            return false;
        }
        a470 a470Var = (a470) obj;
        return this.a == a470Var.a && this.b == a470Var.b && this.c == a470Var.c && this.d.equals(a470Var.d);
    }

    public final int hashCode() {
        return (this.d.a.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "OpenCameraAction(maxWidth=", ", maxHeight=", ", maxCount=");
        s.append(this.c);
        s.append(", position=");
        s.append(this.d);
        s.append(", analyticsData=null)");
        return s.toString();
    }
}
