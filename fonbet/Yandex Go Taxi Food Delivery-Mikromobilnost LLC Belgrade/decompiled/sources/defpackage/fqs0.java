package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.Align;

/* loaded from: classes5.dex */
public final class fqs0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Align c;
    public final qj4 d;
    public final w4a1 e;
    public final w4a1 f;

    public fqs0(CharSequence charSequence, CharSequence charSequence2, Align align, qj4 qj4Var, w4a1 w4a1Var, w4a1 w4a1Var2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = align;
        this.d = qj4Var;
        this.e = w4a1Var;
        this.f = w4a1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqs0)) {
            return false;
        }
        fqs0 fqs0Var = (fqs0) obj;
        return jl40.l(this.a, fqs0Var.a) && jl40.l(this.b, fqs0Var.b) && this.c == fqs0Var.c && jl40.l(this.d, fqs0Var.d) && this.e.equals(fqs0Var.e) && this.f.equals(fqs0Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        qj4 qj4Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (qj4Var != null ? qj4Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "SlotBody(title=", ", subtitle=", ", align=");
        r.append(this.c);
        r.append(", badge=");
        r.append(this.d);
        r.append(", titleEllipsize=");
        r.append(this.e);
        r.append(", subtitleEllipsize=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
