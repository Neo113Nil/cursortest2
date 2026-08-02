package xsna;

/* compiled from: CameraCellItem.kt */
/* loaded from: classes17.dex */
public final class pg9 implements yp10 {
    public final boolean a;
    public final boolean b;

    public pg9() {
        this(true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg9)) {
            return false;
        }
        pg9 pg9Var = (pg9) obj;
        return this.a == pg9Var.a && this.b == pg9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraCellItem(isEnabled=");
        sb.append(this.a);
        sb.append(", isShowSeparateButtons=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public pg9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
