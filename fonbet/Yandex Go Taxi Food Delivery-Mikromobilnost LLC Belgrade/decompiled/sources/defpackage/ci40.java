package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ci40 {
    public final CharSequence a;
    public final List b;
    public final String c;
    public final CharSequence d;

    public ci40(CharSequence charSequence, List list, String str, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = list;
        this.c = str;
        this.d = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci40)) {
            return false;
        }
        ci40 ci40Var = (ci40) obj;
        return jl40.l(this.a, ci40Var.a) && jl40.l(this.b, ci40Var.b) && jl40.l(this.c, ci40Var.c) && jl40.l(this.d, ci40Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int c = unr0.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainTariffUiState(title=" + ((Object) this.a) + ", tariffItems=" + this.b + ", selectedTariffId=" + this.c + ", applyButtonTitle=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
