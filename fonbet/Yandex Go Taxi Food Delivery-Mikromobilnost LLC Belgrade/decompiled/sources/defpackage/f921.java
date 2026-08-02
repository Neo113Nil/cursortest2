package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class f921 {
    public static final f921 d = new f921(false, "", "");
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;

    public f921(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f921)) {
            return false;
        }
        f921 f921Var = (f921) obj;
        return this.a == f921Var.a && jl40.l(this.b, f921Var.b) && jl40.l(this.c, f921Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeAccountMenuItemUiState(isVisible=");
        sb.append(this.a);
        sb.append(", itemTitle=");
        sb.append((Object) this.b);
        sb.append(", itemDescription=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
