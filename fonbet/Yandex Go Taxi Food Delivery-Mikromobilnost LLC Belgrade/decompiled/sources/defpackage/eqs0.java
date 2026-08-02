package defpackage;

import com.yandex.delivery.mapper.model.state.Align;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class eqs0 {
    public final Align a;
    public final CharSequence b;
    public final CharSequence c;

    public eqs0(Align align, CharSequence charSequence, CharSequence charSequence2) {
        this.a = align;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqs0)) {
            return false;
        }
        eqs0 eqs0Var = (eqs0) obj;
        return this.a == eqs0Var.a && jl40.l(this.b, eqs0Var.b) && jl40.l(this.c, eqs0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotBody(align=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
