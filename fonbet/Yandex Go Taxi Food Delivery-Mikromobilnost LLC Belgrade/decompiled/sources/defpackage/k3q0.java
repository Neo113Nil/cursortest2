package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k3q0 extends n351 {
    public final cqs0 c;

    public k3q0(cqs0 cqs0Var) {
        super("section-promo", false, 14);
        this.c = cqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3q0) && jl40.l(this.c, ((k3q0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "SectionPromoWidgetModel(slot=" + this.c + Extension.C_BRAKE;
    }
}
