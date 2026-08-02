package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jkz {
    public final RectF a;
    public final Rect b;
    public final float c;
    public final Paint d;
    public final Drawable e;

    public jkz(RectF rectF, Rect rect, float f, Paint paint, Drawable drawable) {
        this.a = rectF;
        this.b = rect;
        this.c = f;
        this.d = paint;
        this.e = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkz)) {
            return false;
        }
        jkz jkzVar = (jkz) obj;
        return this.a.equals(jkzVar.a) && this.b.equals(jkzVar.b) && Float.compare(this.c, jkzVar.c) == 0 && jl40.l(this.d, jkzVar.d) && jl40.l(this.e, jkzVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + g8e.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31;
        Drawable drawable = this.e;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "LogoModel(bounds=" + this.a + ", spiralBounds=" + this.b + ", cornerRadius=" + this.c + ", paint=" + this.d + ", spiralDrawable=" + this.e + Extension.C_BRAKE;
    }
}
