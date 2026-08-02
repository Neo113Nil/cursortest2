package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: FixedIconView.kt */
/* loaded from: classes17.dex */
public final class wmr {
    public final Drawable a;
    public final String b;
    public final gzs<s3q0> c;

    public wmr(Drawable drawable, String str, gzs<s3q0> gzsVar) {
        this.a = drawable;
        this.b = str;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmr)) {
            return false;
        }
        wmr wmrVar = (wmr) obj;
        return epx.f(this.a, wmrVar.a) && epx.f(this.b, wmrVar.b) && epx.f(this.c, wmrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FixedIcon(image=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", onClick=");
        return uf3.d(sb, this.c, ')');
    }
}
