package xsna;

/* compiled from: TextStyleColorItem.kt */
/* loaded from: classes16.dex */
public final class omo0 {
    public nco0 a;
    public boolean b;
    public final boolean c;

    public omo0(nco0 nco0Var, boolean z, boolean z2) {
        this.a = nco0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omo0)) {
            return false;
        }
        omo0 omo0Var = (omo0) obj;
        return epx.f(this.a, omo0Var.a) && this.b == omo0Var.b && this.c == omo0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyleColorItem(colorInfo=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", colorPicker=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
