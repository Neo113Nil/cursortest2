package defpackage;

import android.graphics.Typeface;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ntc {
    public final Typeface a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;
    public final Float h;

    public ntc(Typeface typeface, float f, float f2, float f3, int i, int i2, int i3, Float f4) {
        this.a = typeface;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntc)) {
            return false;
        }
        ntc ntcVar = (ntc) obj;
        return jl40.l(this.a, ntcVar.a) && Float.compare(this.b, ntcVar.b) == 0 && Float.compare(this.c, ntcVar.c) == 0 && Float.compare(this.d, ntcVar.d) == 0 && this.e == ntcVar.e && this.f == ntcVar.f && this.g == ntcVar.g && jl40.l(this.h, ntcVar.h);
    }

    public final int hashCode() {
        Typeface typeface = this.a;
        int b = oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, (typeface == null ? 0 : typeface.hashCode()) * 31, 31), 31), 31), 31), 31), 31);
        Float f = this.h;
        return b + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleProperties(font=");
        sb.append(this.a);
        sb.append(", maxSize=");
        sb.append(this.b);
        sb.append(", minSize=");
        vfc.x(sb, this.c, ", lineHeight=", this.d, ", targetMaxLines=");
        vfc.u(this.e, this.f, ", maxLinesIfSubtitleEmpty=", ", alignment=", sb);
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ ntc(Typeface typeface, float f, float f2, int i, int i2) {
        this(typeface, f, f2, 0.83f, 3, i, i2, null);
    }
}
