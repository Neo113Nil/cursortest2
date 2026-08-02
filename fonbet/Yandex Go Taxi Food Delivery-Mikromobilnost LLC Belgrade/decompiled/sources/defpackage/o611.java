package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o611 {
    public final String a;
    public final String b;
    public final CharSequence c;

    public o611(CharSequence charSequence, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o611)) {
            return false;
        }
        o611 o611Var = (o611) obj;
        return jl40.l(this.a, o611Var.a) && jl40.l(this.b, o611Var.b) && jl40.l(this.c, o611Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return xvz.n(b64.v("HubDoneButtonUiState(id=", this.a, ", analyticsId=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }
}
