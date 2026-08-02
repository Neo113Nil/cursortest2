package defpackage;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarButton$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oz7 {
    public final CharSequence a;
    public final kdc b;
    public final CharSequence c;
    public final nz7 d;
    public final CancelSimilarButton$State e;

    public oz7(CharSequence charSequence, kdc kdcVar, CharSequence charSequence2, nz7 nz7Var, CancelSimilarButton$State cancelSimilarButton$State) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = charSequence2;
        this.d = nz7Var;
        this.e = cancelSimilarButton$State;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz7)) {
            return false;
        }
        oz7 oz7Var = (oz7) obj;
        return jl40.l(this.a, oz7Var.a) && jl40.l(this.b, oz7Var.b) && jl40.l(this.c, oz7Var.c) && jl40.l(this.d, oz7Var.d) && this.e == oz7Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + smw0.b((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "CancelSimilarButton(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", subtitle=" + ((Object) this.c) + ", action=" + this.d + ", state=" + this.e + Extension.C_BRAKE;
    }
}
