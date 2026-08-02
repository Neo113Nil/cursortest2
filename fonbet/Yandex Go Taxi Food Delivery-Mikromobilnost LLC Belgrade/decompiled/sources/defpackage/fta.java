package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fta {
    public final CharSequence a;
    public final cta b;

    public fta(CharSequence charSequence, cta ctaVar) {
        this.a = charSequence;
        this.b = ctaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fta)) {
            return false;
        }
        fta ftaVar = (fta) obj;
        return jl40.l(this.a, ftaVar.a) && jl40.l(this.b, ftaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersSubscriptionButton(title=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
