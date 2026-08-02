package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kdo0 implements e6v {
    public final CharSequence a;
    public final String b;

    public kdo0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdo0)) {
            return false;
        }
        kdo0 kdo0Var = (kdo0) obj;
        return jl40.l(this.a, kdo0Var.a) && jl40.l(this.b, kdo0Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + ((Object) this.a) + ", iconUrl=" + this.b + Extension.C_BRAKE;
    }
}
