package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class axj0 {
    public final ywl a;
    public final String b;

    public axj0(ywl ywlVar, String str) {
        this.a = ywlVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axj0)) {
            return false;
        }
        axj0 axj0Var = (axj0) obj;
        return this.a.equals(axj0Var.a) && jl40.l(this.b, axj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RestorableFlexState(document=" + this.a + ", paramsKey=" + this.b + Extension.C_BRAKE;
    }
}
