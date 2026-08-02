package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ibv implements rbv {
    public final Drawable a;

    public ibv(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibv) && this.a.equals(((ibv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawableInstance(drawable=" + this.a + Extension.C_BRAKE;
    }
}
