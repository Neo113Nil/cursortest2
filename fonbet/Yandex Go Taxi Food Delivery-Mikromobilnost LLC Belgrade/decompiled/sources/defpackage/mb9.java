package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mb9 implements ob9 {
    public final BitmapDrawable a;

    public mb9(BitmapDrawable bitmapDrawable) {
        this.a = bitmapDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb9) && this.a.equals(((mb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drawable(drawable=" + this.a + Extension.C_BRAKE;
    }
}
