package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pe20 {
    public final int a;
    public final float b;

    public pe20(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe20)) {
            return false;
        }
        pe20 pe20Var = (pe20) obj;
        return this.a == pe20Var.a && Float.compare(this.b, pe20Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PositionColor(color=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
