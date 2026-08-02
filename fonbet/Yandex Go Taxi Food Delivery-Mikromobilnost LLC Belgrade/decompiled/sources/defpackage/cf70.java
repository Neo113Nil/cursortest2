package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cf70 {
    public static final cf70 c = new cf70("", new gdc(mqg0.component_gray_300));
    public final CharSequence a;
    public final kdc b;

    public cf70(CharSequence charSequence, kdc kdcVar) {
        this.a = charSequence;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf70)) {
            return false;
        }
        cf70 cf70Var = (cf70) obj;
        return jl40.l(this.a, cf70Var.a) && jl40.l(this.b, cf70Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "OptionSubtitle(subtitleText=" + ((Object) this.a) + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
