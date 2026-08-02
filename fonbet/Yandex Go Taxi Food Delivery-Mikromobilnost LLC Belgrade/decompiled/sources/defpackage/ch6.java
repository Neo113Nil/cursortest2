package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ch6 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ch6(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch6)) {
            return false;
        }
        ch6 ch6Var = (ch6) obj;
        return this.a == ch6Var.a && this.b == ch6Var.b && this.c == ch6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("BottomSheetUiState(target=", dtr0.a(this.a), ", isDragging=", ", isSettling=", this.b), this.c, Extension.C_BRAKE);
    }
}
