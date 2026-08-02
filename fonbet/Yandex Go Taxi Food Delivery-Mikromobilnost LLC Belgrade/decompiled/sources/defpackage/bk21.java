package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bk21 extends t691 {
    public final ro21 a;
    public final Bitmap b;

    public bk21(ro21 ro21Var, Bitmap bitmap) {
        this.a = ro21Var;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk21)) {
            return false;
        }
        bk21 bk21Var = (bk21) obj;
        return jl40.l(this.a, bk21Var.a) && jl40.l(this.b, bk21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AvatarLoaded(model=" + this.a + ", avatar=" + this.b + Extension.C_BRAKE;
    }
}
