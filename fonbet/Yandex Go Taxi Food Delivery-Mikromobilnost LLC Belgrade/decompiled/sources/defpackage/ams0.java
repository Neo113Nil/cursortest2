package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ams0 {
    public final int a;
    public final float b;
    public final int c;

    public ams0(float f, int i, int i2) {
        this.a = i;
        this.b = f;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ams0)) {
            return false;
        }
        ams0 ams0Var = (ams0) obj;
        return this.a == ams0Var.a && Float.compare(this.b, ams0Var.b) == 0 && this.c == ams0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + g8e.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(shape=");
        sb.append(this.a);
        sb.append(", cornerRadius=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
