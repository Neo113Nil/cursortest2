package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class opf0 {
    public final String a;
    public final int b;
    public final int c;

    public opf0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opf0)) {
            return false;
        }
        opf0 opf0Var = (opf0) obj;
        return jl40.l(this.a, opf0Var.a) && this.b == opf0Var.b && this.c == opf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "CounterWidgetOverride(deeplink=", this.a, ", total=", ", current="));
    }
}
