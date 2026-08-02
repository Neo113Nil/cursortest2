package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class di40 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public di40(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di40)) {
            return false;
        }
        di40 di40Var = (di40) obj;
        return jl40.l(this.a, di40Var.a) && jl40.l(this.b, di40Var.b) && jl40.l(this.c, di40Var.c) && jl40.l(this.d, di40Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.d;
        return hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "MtTrainTicketsActivePeriodState(ticketStartDateTitle=", ", ticketStartDate=", ", ticketEndDateTitle=");
        r.append((Object) this.c);
        r.append(", ticketEndDate=");
        r.append((Object) this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public di40() {
        this(null, null, null, null);
    }
}
