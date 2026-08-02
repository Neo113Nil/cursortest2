package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b0c0 implements f0c0 {
    public final Drawable a;
    public final int b;

    public b0c0(Drawable drawable, int i) {
        this.a = drawable;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final Drawable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0c0)) {
            return false;
        }
        b0c0 b0c0Var = (b0c0) obj;
        return jl40.l(this.a, b0c0Var.a) && this.b == b0c0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FixedIcon(drawable=" + this.a + ", bgColor=" + this.b + Extension.C_BRAKE;
    }
}
