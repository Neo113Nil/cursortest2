package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dk60 implements hk60 {
    public final Drawable a;
    public final int b;

    public dk60(Drawable drawable, int i) {
        this.a = drawable;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk60)) {
            return false;
        }
        dk60 dk60Var = (dk60) obj;
        return this.a.equals(dk60Var.a) && this.b == dk60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Icon(drawable=" + this.a + ", iconRes=" + this.b + Extension.C_BRAKE;
    }
}
