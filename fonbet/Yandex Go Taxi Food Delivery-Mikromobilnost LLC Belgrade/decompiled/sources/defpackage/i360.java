package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i360 {
    public final f360 a;
    public final CharSequence b;

    public i360(f360 f360Var, CharSequence charSequence) {
        this.a = f360Var;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i360)) {
            return false;
        }
        i360 i360Var = (i360) obj;
        return jl40.l(this.a, i360Var.a) && jl40.l(this.b, i360Var.b);
    }

    public final int hashCode() {
        f360 f360Var = this.a;
        int hashCode = (f360Var == null ? 0 : f360Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "NeuroPostcardLabelsModel(watermark=" + this.a + ", sign=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
