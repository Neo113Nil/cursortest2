package defpackage;

/* loaded from: classes2.dex */
public final class ba6 extends m5r0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ba6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public static ba6 a(ba6 ba6Var, boolean z, int i) {
        String str = ba6Var.a;
        ba6Var.getClass();
        boolean z2 = (i & 4) != 0 ? ba6Var.b : true;
        ba6Var.getClass();
        if ((i & 16) != 0) {
            z = ba6Var.c;
        }
        ba6Var.getClass();
        return new ba6(str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba6)) {
            return false;
        }
        ba6 ba6Var = (ba6) obj;
        return jl40.l(this.a, ba6Var.a) && this.b == ba6Var.b && this.c == ba6Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 961, 31, this.b), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanSettingData(id=");
        sb.append(this.a);
        sb.append(", metricaName=null, isEnabled=");
        sb.append(this.b);
        sb.append(", isLocal=true, value=");
        return unr0.u(sb, this.c, ')');
    }
}
