package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fcf0 implements jcf0 {
    public final kao a;
    public final boolean b;
    public final boolean c;

    public fcf0(kao kaoVar, boolean z, boolean z2) {
        this.a = kaoVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.jcf0
    public final rb6 a() {
        return null;
    }

    @Override // defpackage.jcf0
    public final rbf0 b() {
        return null;
    }

    @Override // defpackage.jcf0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.jcf0
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.jcf0
    public final kao e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fcf0) {
            fcf0 fcf0Var = (fcf0) obj;
            if (this.a == fcf0Var.a && this.b == fcf0Var.b && this.c == fcf0Var.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jcf0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jcf0
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.jcf0
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 29791, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(errorState=");
        sb.append(this.a);
        sb.append(", bottomBarState=null, headerGradientState=null, isProductsV4Enabled=");
        sb.append(this.b);
        sb.append(", isProductsV4HeaderEnabled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
