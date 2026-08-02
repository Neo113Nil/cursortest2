package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class m921 {
    public static final m921 e = new m921(false, "", "", "");
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public m921(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m921)) {
            return false;
        }
        m921 m921Var = (m921) obj;
        return this.a == m921Var.a && jl40.l(this.b, m921Var.b) && jl40.l(this.c, m921Var.c) && jl40.l(this.d, m921Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b(smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "UpgradeAccountModalViewUiState(isVisible=" + this.a + ", title=" + ((Object) this.b) + ", message=" + ((Object) this.c) + ", buttonText=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
