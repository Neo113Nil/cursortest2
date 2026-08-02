package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class k550 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;

    public k550(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k550)) {
            return false;
        }
        k550 k550Var = (k550) obj;
        return this.a == k550Var.a && this.b == k550Var.b && this.c == k550Var.c && jl40.l(this.j, k550Var.j) && this.d == k550Var.d && this.e == k550Var.e && this.f == k550Var.f && this.g == k550Var.g && this.h == k550Var.h && this.i == k550Var.i;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 29791) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        String str = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append(k550.class.getSimpleName());
        sb.append(Extension.O_BRAKE);
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(Extension.C_BRAKE);
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(Extension.C_BRAKE);
        }
        return sb.toString();
    }
}
