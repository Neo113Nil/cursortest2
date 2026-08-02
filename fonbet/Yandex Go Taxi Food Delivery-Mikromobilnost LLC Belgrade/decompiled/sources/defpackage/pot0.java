package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pot0 {
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;

    public pot0(CharSequence charSequence, CharSequence charSequence2, String str, boolean z) {
        this.a = z;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pot0)) {
            return false;
        }
        pot0 pot0Var = (pot0) obj;
        return this.a == pot0Var.a && jl40.l(this.b, pot0Var.b) && jl40.l(this.c, pot0Var.c) && jl40.l(this.d, pot0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b(smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SpecialNeedsMenuItemUiState(isVisible=" + this.a + ", itemTitle=" + ((Object) this.b) + ", itemDescription=" + ((Object) this.c) + ", deeplink=" + this.d + Extension.C_BRAKE;
    }
}
