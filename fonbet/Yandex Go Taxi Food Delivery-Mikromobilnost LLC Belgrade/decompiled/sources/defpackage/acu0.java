package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class acu0 {
    public final String a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public float f = 1.2f;
    public float g;

    public acu0(String str, RectF rectF, Paint paint, Paint paint2, Path path, float f) {
        this.a = str;
        this.b = rectF;
        this.c = paint;
        this.d = paint2;
        this.e = path;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acu0)) {
            return false;
        }
        acu0 acu0Var = (acu0) obj;
        return jl40.l(this.a, acu0Var.a) && this.b.equals(acu0Var.b) && this.c.equals(acu0Var.c) && this.d.equals(acu0Var.d) && this.e.equals(acu0Var.e) && Float.compare(this.f, acu0Var.f) == 0 && Float.compare(this.g, acu0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + g8e.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        float f = this.f;
        float f2 = this.g;
        StringBuilder sb = new StringBuilder("StickerModel(text=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", textPaint=");
        sb.append(this.c);
        sb.append(", backGroundPaint=");
        sb.append(this.d);
        sb.append(", stickerShape=");
        sb.append(this.e);
        sb.append(", scale=");
        sb.append(f);
        sb.append(", angle=");
        return uw51.i(sb, f2, Extension.C_BRAKE);
    }
}
