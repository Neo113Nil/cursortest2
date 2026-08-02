package xsna;

import android.graphics.Bitmap;

/* compiled from: UserData.kt */
/* loaded from: classes15.dex */
public final class ghq0 {
    public final String a;
    public final Bitmap b;

    public ghq0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghq0)) {
            return false;
        }
        ghq0 ghq0Var = (ghq0) obj;
        return epx.f(this.a, ghq0Var.a) && epx.f(this.b, ghq0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserData(title=");
        sb.append(this.a);
        sb.append(", avatar=");
        return qr.c(sb, this.b, ')');
    }

    public ghq0(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }
}
