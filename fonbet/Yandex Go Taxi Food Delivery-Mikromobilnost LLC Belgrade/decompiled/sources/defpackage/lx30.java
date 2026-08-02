package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lx30 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public lx30(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx30)) {
            return false;
        }
        lx30 lx30Var = (lx30) obj;
        return this.a == lx30Var.a && this.b == lx30Var.b && this.c == lx30Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, qv10.u("MtRoutesModalUiState(isDraggable=", ", isFocusRouteVisible=", ", badgeCount=", this.a, this.b));
    }
}
