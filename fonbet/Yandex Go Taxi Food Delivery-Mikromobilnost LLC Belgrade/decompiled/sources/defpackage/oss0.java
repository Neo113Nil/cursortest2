package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oss0 implements tss0 {
    public final BitmapDrawable a;
    public final int b;
    public final int c;
    public final kdc d;
    public final boolean e;

    public oss0(BitmapDrawable bitmapDrawable, int i, int i2, kdc kdcVar, boolean z) {
        this.a = bitmapDrawable;
        this.b = i;
        this.c = i2;
        this.d = kdcVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oss0)) {
            return false;
        }
        oss0 oss0Var = (oss0) obj;
        return this.a.equals(oss0Var.a) && this.b == oss0Var.b && this.c == oss0Var.c && this.d.equals(oss0Var.d) && this.e == oss0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + smw0.d(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconSpot(drawable=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", animateAppearance=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
