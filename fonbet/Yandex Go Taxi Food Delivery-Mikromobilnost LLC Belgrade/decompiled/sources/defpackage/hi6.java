package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class hi6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new hi6(0, 0, 0, 0);
    }

    public hi6(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            w511.f(oyr.h(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        w511.f(oyr.h(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hi6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hi6 hi6Var = (hi6) obj;
        return this.a == hi6Var.a && this.b == hi6Var.b && this.c == hi6Var.c && this.d == hi6Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hi6.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(HexString.CHAR_COMMA);
        sb.append(this.b);
        sb.append(HexString.CHAR_COMMA);
        sb.append(this.c);
        sb.append(HexString.CHAR_COMMA);
        return oyr.m(this.d, "] }", sb);
    }

    public hi6(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
