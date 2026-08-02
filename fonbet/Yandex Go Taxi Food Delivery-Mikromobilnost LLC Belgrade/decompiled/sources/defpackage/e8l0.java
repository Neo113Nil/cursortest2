package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e8l0 {
    public final hon a;
    public final boolean b;
    public final boolean c;

    public e8l0(hon honVar, boolean z, boolean z2) {
        this.a = honVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8l0)) {
            return false;
        }
        e8l0 e8l0Var = (e8l0) obj;
        return this.a.equals(e8l0Var.a) && this.b == e8l0Var.b && this.c == e8l0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutePointWidgetConfiguration(widget=");
        sb.append(this.a);
        sb.append(", positionChangingAvailable=");
        sb.append(this.b);
        sb.append(", removalAvailable=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
