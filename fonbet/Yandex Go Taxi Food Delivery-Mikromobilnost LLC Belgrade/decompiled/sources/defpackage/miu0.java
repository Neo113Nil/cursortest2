package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class miu0 {
    public final Bitmap a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;

    public miu0(Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, int i) {
        bitmap = (i & 1) != 0 ? null : bitmap;
        charSequence = (i & 2) != 0 ? "" : charSequence;
        charSequence2 = (i & 4) != 0 ? "" : charSequence2;
        this.a = bitmap;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miu0)) {
            return false;
        }
        miu0 miu0Var = (miu0) obj;
        return jl40.l(this.a, miu0Var.a) && jl40.l(this.b, miu0Var.b) && jl40.l(this.c, miu0Var.c) && this.d == miu0Var.d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StopsItem(icon=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", enabled=" + this.d + Extension.C_BRAKE;
    }

    public miu0() {
        this(null, null, null, 15);
    }
}
