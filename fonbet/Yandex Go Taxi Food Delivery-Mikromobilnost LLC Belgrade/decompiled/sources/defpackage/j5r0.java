package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class j5r0 {
    public final int a;
    public final String b;
    public final Integer c;

    public j5r0(int i, Integer num, String str) {
        this.a = i;
        this.b = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5r0)) {
            return false;
        }
        j5r0 j5r0Var = (j5r0) obj;
        return this.a == j5r0Var.a && jl40.l(this.b, j5r0Var.b) && jl40.l(this.c, j5r0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return oo31.j(unr0.v(this.a, "SettingButton(buttonTextRes=", ", id=", this.b, ", iconRes="), this.c, Extension.C_BRAKE);
    }
}
