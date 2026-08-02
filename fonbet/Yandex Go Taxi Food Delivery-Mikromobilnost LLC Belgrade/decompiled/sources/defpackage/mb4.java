package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mb4 {
    public final boolean a;
    public final Drawable b;

    public mb4(Drawable drawable, boolean z) {
        this.a = z;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb4)) {
            return false;
        }
        mb4 mb4Var = (mb4) obj;
        return this.a == mb4Var.a && this.b.equals(mb4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarState(isLoading=" + this.a + ", drawable=" + this.b + Extension.C_BRAKE;
    }
}
