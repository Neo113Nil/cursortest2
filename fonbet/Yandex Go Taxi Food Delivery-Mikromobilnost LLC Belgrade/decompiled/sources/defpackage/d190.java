package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class d190 {
    public final long b;
    public final long a = ldc.b(ldc.f, 0.7f, 0.0f, 0.0f, 0.0f, 14);
    public final float c = 56.0f;
    public final float d = 16.0f;
    public final float e = 8.0f;
    public final float f = -2.0f;

    public d190(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d190)) {
            return false;
        }
        d190 d190Var = (d190) obj;
        return ldc.c(this.a, d190Var.a) && ldc.c(this.b, d190Var.b) && y7m.b(this.c, d190Var.c) && y7m.b(this.d, d190Var.d) && y7m.b(this.e, d190Var.e) && y7m.b(this.f, d190Var.f);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Float.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        String i = ldc.i(this.a);
        String i2 = ldc.i(this.b);
        String c = y7m.c(this.c);
        String c2 = y7m.c(this.d);
        String c3 = y7m.c(this.e);
        String c4 = y7m.c(this.f);
        StringBuilder v = b64.v("OverlayConfiguration(scrimColor=", i, ", focusColor=", i2, ", height=");
        g8e.D(v, c, ", cornerRadius=", c2, ", horizontalPadding=");
        return g8e.r(v, c3, ", verticalPadding=", c4, Extension.C_BRAKE);
    }
}
