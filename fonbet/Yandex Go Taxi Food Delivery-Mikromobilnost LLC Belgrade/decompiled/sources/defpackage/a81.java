package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a81 {
    public final String a;
    public final boolean b;
    public final CharSequence c;

    public /* synthetic */ a81(String str, String str2, int i) {
        this(true, (i & 4) != 0 ? "" : str2, (i & 1) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a81)) {
            return false;
        }
        a81 a81Var = (a81) obj;
        return jl40.l(this.a, a81Var.a) && this.b == a81Var.b && jl40.l(this.c, a81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xvz.n(oo31.l("AddressTextsModel(text=", this.a, ", isTitleVisible=", ", hint=", this.b), this.c, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a81() {
        this(r0, r0, 7);
        String str = null;
    }

    public a81(boolean z, CharSequence charSequence, String str) {
        this.a = str;
        this.b = z;
        this.c = charSequence;
    }
}
