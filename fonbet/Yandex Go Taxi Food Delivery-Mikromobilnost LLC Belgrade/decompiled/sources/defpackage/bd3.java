package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bd3 implements cd3 {
    public final sbv a;
    public final int b;
    public final int c;

    public bd3(sbv sbvVar, int i, int i2) {
        this.a = sbvVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd3)) {
            return false;
        }
        bd3 bd3Var = (bd3) obj;
        return this.a.equals(bd3Var.a) && this.b == bd3Var.b && this.c == bd3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticImage(image=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
