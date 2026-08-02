package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f8l0 {
    public final g8l0 a;
    public final float b;
    public final ion c;
    public final boolean d;
    public final boolean e;

    public f8l0(g8l0 g8l0Var, float f, ion ionVar, boolean z, boolean z2) {
        this.a = g8l0Var;
        this.b = f;
        this.c = ionVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8l0)) {
            return false;
        }
        f8l0 f8l0Var = (f8l0) obj;
        return jl40.l(this.a, f8l0Var.a) && y7m.b(this.b, f8l0Var.b) && this.c.equals(f8l0Var.c) && this.d == f8l0Var.d && this.e == f8l0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e((this.c.hashCode() + g8e.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        String c = y7m.c(this.b);
        StringBuilder sb = new StringBuilder("RoutePointWidgetConfigurationModel(intervalToRemove=");
        sb.append(this.a);
        sb.append(", contentHeight=");
        sb.append(c);
        sb.append(", widgetModel=");
        sb.append(this.c);
        sb.append(", positionChangingAvailable=");
        sb.append(this.d);
        sb.append(", removalAvailable=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
