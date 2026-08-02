package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ip8 {
    public static final ip8 d = new ip8("", "", EmptyList.a);
    public final CharSequence a;
    public final CharSequence b;
    public final List c;

    public ip8(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip8)) {
            return false;
        }
        ip8 ip8Var = (ip8) obj;
        return jl40.l(this.a, ip8Var.a) && jl40.l(this.b, ip8Var.b) && jl40.l(this.c, ip8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(vfc.r(this.a, this.b, "CardTariffsSuggestUiState(title=", ", subtitle=", ", tariffs="), this.c, Extension.C_BRAKE);
    }
}
