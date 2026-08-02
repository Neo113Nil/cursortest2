package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nws0 extends n351 {
    public final String c;
    public final cqs0 d;

    public nws0(String str, cqs0 cqs0Var) {
        super("slot", false, 14);
        this.c = str;
        this.d = cqs0Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nws0)) {
            return false;
        }
        nws0 nws0Var = (nws0) obj;
        return jl40.l(this.c, nws0Var.c) && jl40.l(this.d, nws0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SlotWidgetModel(id=" + this.c + ", slot=" + this.d + Extension.C_BRAKE;
    }
}
