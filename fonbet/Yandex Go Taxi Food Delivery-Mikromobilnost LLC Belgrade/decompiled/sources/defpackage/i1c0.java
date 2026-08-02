package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class i1c0 {
    public final int a;
    public final int b;
    public final Integer c;
    public final float d;

    public i1c0(int i, int i2, Integer num, float f) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = f;
    }

    public static i1c0 a(i1c0 i1c0Var, int i, int i2, Integer num, float f, int i3) {
        if ((i3 & 1) != 0) {
            i = i1c0Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = i1c0Var.b;
        }
        if ((i3 & 4) != 0) {
            num = i1c0Var.c;
        }
        if ((i3 & 8) != 0) {
            f = i1c0Var.d;
        }
        i1c0Var.getClass();
        return new i1c0(i, i2, num, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1c0)) {
            return false;
        }
        i1c0 i1c0Var = (i1c0) obj;
        return this.a == i1c0Var.a && this.b == i1c0Var.b && jl40.l(this.c, i1c0Var.c) && Float.compare(this.d, i1c0Var.d) == 0;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return Float.hashCode(this.d) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "PinV2Style(contentColor=", ", bgColor=", ", outerBgColor=");
        s.append(this.c);
        s.append(", iconScale=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public /* synthetic */ i1c0(int i, int i2) {
        this(i, i2, null, 1.0f);
    }
}
