package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bk01 {
    public final int a;
    public final int b;
    public final int c;

    public bk01(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk01)) {
            return false;
        }
        bk01 bk01Var = (bk01) obj;
        return this.a == bk01Var.a && this.b == bk01Var.b && this.c == bk01Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "TransferMainInfoTextAutosize(minTextSizeSp=", ", maxTextSizeSp=", ", stepSp="));
    }
}
