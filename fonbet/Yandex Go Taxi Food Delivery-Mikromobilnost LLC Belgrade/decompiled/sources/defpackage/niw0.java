package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class niw0 {
    public final String a;
    public final kdc b;
    public final CharSequence c;
    public final miw0 d;

    public niw0(String str, kdc kdcVar, CharSequence charSequence, miw0 miw0Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = charSequence;
        this.d = miw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niw0)) {
            return false;
        }
        niw0 niw0Var = (niw0) obj;
        return jl40.l(this.a, niw0Var.a) && jl40.l(this.b, niw0Var.b) && jl40.l(this.c, niw0Var.c) && jl40.l(this.d, niw0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b(smw0.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SupportActionButton(type=" + this.a + ", color=" + this.b + ", text=" + ((Object) this.c) + ", action=" + this.d + Extension.C_BRAKE;
    }
}
