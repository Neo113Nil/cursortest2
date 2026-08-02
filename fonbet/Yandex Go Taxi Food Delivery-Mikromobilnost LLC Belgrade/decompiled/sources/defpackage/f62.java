package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f62 {
    public final int a;
    public final int b;
    public final int c;

    public f62(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static f62 a(f62 f62Var, int i) {
        int i2 = f62Var.b;
        int i3 = f62Var.c;
        f62Var.getClass();
        return new f62(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f62)) {
            return false;
        }
        f62 f62Var = (f62) obj;
        return this.a == f62Var.a && this.b == f62Var.b && this.c == f62Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String a = dtr0.a(this.a);
        return oyr.t(b64.u(this.b, "AnchorData(anchor=", a, ", additionalOffset=", ", offsetTarget="), dtr0.a(this.c), Extension.C_BRAKE);
    }
}
