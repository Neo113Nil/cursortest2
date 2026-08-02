package xsna;

import android.graphics.Bitmap;

/* compiled from: NotifyImageInfo.kt */
/* loaded from: classes7.dex */
public final class al70 {
    public final String a;
    public final Bitmap b;

    public al70(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al70)) {
            return false;
        }
        al70 al70Var = (al70) obj;
        return epx.f(this.a, al70Var.a) && epx.f(this.b, al70Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyImageInfo(url=");
        sb.append(this.a);
        sb.append(", image=");
        return qr.c(sb, this.b, ')');
    }
}
