package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class piu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public piu(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piu)) {
            return false;
        }
        piu piuVar = (piu) obj;
        return this.a.equals(piuVar.a) && this.b.equals(piuVar.b) && this.c.equals(piuVar.c) && jl40.l(this.d, piuVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("HidePhoneInfoConfirmationUiState(title=", this.a, ", text=", this.b, ", doneButtonText="), this.c, ", iconTag=", this.d, Extension.C_BRAKE);
    }
}
