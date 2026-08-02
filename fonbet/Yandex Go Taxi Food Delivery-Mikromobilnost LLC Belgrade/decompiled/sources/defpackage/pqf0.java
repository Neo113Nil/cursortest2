package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pqf0 implements qqf0 {
    public final CharSequence a;
    public final String b;

    public pqf0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqf0)) {
            return false;
        }
        pqf0 pqf0Var = (pqf0) obj;
        return jl40.l(this.a, pqf0Var.a) && this.b.equals(pqf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextWithCashbackUiState(text=" + ((Object) this.a) + ", cashbackText=" + this.b + Extension.C_BRAKE;
    }
}
