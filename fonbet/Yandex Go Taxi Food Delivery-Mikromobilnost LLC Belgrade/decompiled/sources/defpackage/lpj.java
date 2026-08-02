package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lpj {
    public final CharSequence a;
    public final kpj b;
    public final jpj c;

    public lpj(String str, kpj kpjVar, jpj jpjVar) {
        this.a = str;
        this.b = kpjVar;
        this.c = jpjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpj)) {
            return false;
        }
        lpj lpjVar = (lpj) obj;
        return jl40.l(this.a, lpjVar.a) && jl40.l(this.b, lpjVar.b) && this.c.equals(lpjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kpj kpjVar = this.b;
        return this.c.hashCode() + ((hashCode + (kpjVar == null ? 0 : kpjVar.hashCode())) * 31);
    }

    public final String toString() {
        return "DiscountsAddPromoCodeUiState(title=" + ((Object) this.a) + ", inputState=" + this.b + ", buttonState=" + this.c + Extension.C_BRAKE;
    }
}
