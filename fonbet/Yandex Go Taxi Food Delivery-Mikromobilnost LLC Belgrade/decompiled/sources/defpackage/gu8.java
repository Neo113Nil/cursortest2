package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class gu8 {
    public static final fu8 Companion = new fu8();
    public final String a;
    public final double b;
    public final float c;
    public final float d;
    public final String e;

    public /* synthetic */ gu8(int i, String str, double d, float f, float f2, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, eu8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
        this.c = f;
        this.d = f2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu8)) {
            return false;
        }
        gu8 gu8Var = (gu8) obj;
        return jl40.l(this.a, gu8Var.a) && Double.compare(this.b, gu8Var.b) == 0 && Float.compare(this.c, gu8Var.c) == 0 && Float.compare(this.d, gu8Var.d) == 0 && jl40.l(this.e, gu8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g8e.c(this.d, g8e.c(this.c, unr0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaretViewCustomProps(colorExpression=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", endAlpha=");
        sb.append(this.c);
        sb.append(", startAlpha=");
        sb.append(this.d);
        return unr0.r(sb, ", uniqueId=", this.e, Extension.C_BRAKE);
    }
}
