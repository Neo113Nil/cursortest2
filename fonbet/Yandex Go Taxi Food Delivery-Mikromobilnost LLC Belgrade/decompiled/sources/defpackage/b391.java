package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class b391 {
    public final boolean a;
    public final bk61 b;

    public b391(boolean z) {
        this.a = z;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b391)) {
            return false;
        }
        b391 b391Var = (b391) obj;
        return this.a == b391Var.a && jl40.l(this.b, b391Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        bk61 bk61Var = this.b;
        return hashCode + (bk61Var == null ? 0 : bk61Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.a + ", handledDeeplinkRender=" + this.b + Extension.C_BRAKE;
    }

    public b391(boolean z, bk61 bk61Var) {
        this.a = z;
        this.b = bk61Var;
    }
}
