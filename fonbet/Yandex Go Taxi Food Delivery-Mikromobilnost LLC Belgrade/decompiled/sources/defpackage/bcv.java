package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class bcv implements dcv {
    public final Drawable a;

    public bcv(Drawable drawable) {
        this.a = drawable;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcv) && this.a.equals(((bcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageDrawable(drawable=" + this.a + Extension.C_BRAKE;
    }
}
