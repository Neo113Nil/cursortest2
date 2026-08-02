package defpackage;

import android.graphics.Typeface;

/* loaded from: classes11.dex */
public final class nps0 {
    public final float a;
    public final float b;
    public final Typeface c;
    public final float d;
    public final float e;
    public final int f;

    public nps0(float f, float f2, Typeface typeface, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = typeface;
        this.d = f3;
        this.e = f4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nps0)) {
            return false;
        }
        nps0 nps0Var = (nps0) obj;
        return Float.compare(this.a, nps0Var.a) == 0 && Float.compare(this.b, nps0Var.b) == 0 && jl40.l(this.c, nps0Var.c) && Float.compare(this.d, nps0Var.d) == 0 && Float.compare(this.e, nps0Var.e) == 0 && this.f == nps0Var.f;
    }

    public final int hashCode() {
        return oyr.b(this.f, g8e.c(this.e, g8e.c(this.d, (this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderTextStyle(fontSize=");
        sb.append(this.a);
        sb.append(", spacing=");
        sb.append(this.b);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", offsetX=");
        sb.append(this.d);
        sb.append(", offsetY=");
        sb.append(this.e);
        sb.append(", textColor=");
        return oyr.m(this.f, ", fontVariations=null)", sb);
    }
}
