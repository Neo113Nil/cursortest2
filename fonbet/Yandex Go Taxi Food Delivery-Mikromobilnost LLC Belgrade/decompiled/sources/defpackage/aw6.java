package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class aw6 {
    public final Bitmap a;
    public final String b;

    public aw6(Bitmap bitmap, String str) {
        this.a = bitmap;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw6)) {
            return false;
        }
        aw6 aw6Var = (aw6) obj;
        return jl40.l(this.a, aw6Var.a) && jl40.l(this.b, aw6Var.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return this.b.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        return "BusTrail(icon=" + this.a + ", registrationNumber=" + this.b + Extension.C_BRAKE;
    }

    public aw6() {
        this(0);
    }

    public /* synthetic */ aw6(int i) {
        this(null, "");
    }
}
