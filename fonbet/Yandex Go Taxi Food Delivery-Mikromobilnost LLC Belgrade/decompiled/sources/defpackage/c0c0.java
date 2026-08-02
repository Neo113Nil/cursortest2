package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c0c0 implements f0c0 {
    public final Drawable a;

    public c0c0(Drawable drawable) {
        this.a = drawable;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0c0) && jl40.l(this.a, ((c0c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(drawable=" + this.a + Extension.C_BRAKE;
    }
}
