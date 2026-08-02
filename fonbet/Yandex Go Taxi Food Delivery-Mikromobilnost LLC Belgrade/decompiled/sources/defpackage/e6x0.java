package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e6x0 extends n351 {
    public final String c;
    public final g6x0 d;

    public e6x0(String str, g6x0 g6x0Var) {
        super("tabs", false, 14);
        this.c = str;
        this.d = g6x0Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6x0)) {
            return false;
        }
        e6x0 e6x0Var = (e6x0) obj;
        return jl40.l(this.c, e6x0Var.c) && this.d.equals(e6x0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "TabsModel(id=" + this.c + ", state=" + this.d + Extension.C_BRAKE;
    }
}
