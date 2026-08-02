package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oc21 {
    public final int a;
    public final int b;
    public final int c;

    public oc21(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc21)) {
            return false;
        }
        oc21 oc21Var = (oc21) obj;
        return this.a == oc21Var.a && this.b == oc21Var.b && this.c == oc21Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "UploadImagesConstrains(maxWidth=", ", maxHeight=", ", maxCount="));
    }
}
