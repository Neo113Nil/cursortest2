package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class g4w0 implements h4w0 {
    public final wju a;
    public final o00 b;
    public final pwz0 c;

    public g4w0(wju wjuVar, o00 o00Var, pwz0 pwz0Var) {
        this.a = wjuVar;
        this.b = o00Var;
        this.c = pwz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4w0)) {
            return false;
        }
        g4w0 g4w0Var = (g4w0) obj;
        return this.a.equals(g4w0Var.a) && this.b.equals(g4w0Var.b) && jl40.l(this.c, g4w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Visible(hintState=" + this.a + ", actionsState=" + this.b + ", topPlaqueReason=" + this.c + Extension.C_BRAKE;
    }
}
