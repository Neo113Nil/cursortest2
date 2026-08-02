package defpackage;

import com.yandex.go.tariffcard.ui.HeaderType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class k8u0 {
    public static final k8u0 f = new k8u0(false, HeaderType.STANDARD, false, false, false);
    public final boolean a;
    public final HeaderType b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public k8u0(boolean z, HeaderType headerType, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = headerType;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static k8u0 a(k8u0 k8u0Var, boolean z, HeaderType headerType, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = k8u0Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            headerType = k8u0Var.b;
        }
        HeaderType headerType2 = headerType;
        if ((i & 4) != 0) {
            z2 = k8u0Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = k8u0Var.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = k8u0Var.e;
        }
        k8u0Var.getClass();
        return new k8u0(z5, headerType2, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8u0)) {
            return false;
        }
        k8u0 k8u0Var = (k8u0) obj;
        return this.a == k8u0Var.a && this.b == k8u0Var.b && this.c == k8u0Var.c && this.d == k8u0Var.d && this.e == k8u0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusBarThemeState(isCardExpanded=");
        sb.append(this.a);
        sb.append(", headerType=");
        sb.append(this.b);
        sb.append(", isUltimaHeaderVisible=");
        nnm.v(", isFreeFromStateBar=", ", isThemeOverriden=", sb, this.c, this.d);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
