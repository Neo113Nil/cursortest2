package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ow0 {
    public final hyq a;
    public final c0k0 b;

    public ow0(hyq hyqVar, c0k0 c0k0Var) {
        this.a = hyqVar;
        this.b = c0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow0)) {
            return false;
        }
        ow0 ow0Var = (ow0) obj;
        return this.a.equals(ow0Var.a) && this.b.equals(ow0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressInputTextChanged(type=" + this.a + ", resultPosition=" + this.b + Extension.C_BRAKE;
    }
}
