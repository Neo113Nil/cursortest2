package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d14 implements g14 {
    public final b14 a;
    public final c14 b;
    public final zu3 c;

    public d14(b14 b14Var, c14 c14Var, zu3 zu3Var) {
        this.a = b14Var;
        this.b = c14Var;
        this.c = zu3Var;
    }

    public final zu3 a() {
        return this.c;
    }

    public final b14 b() {
        return this.a;
    }

    public final c14 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d14)) {
            return false;
        }
        d14 d14Var = (d14) obj;
        return this.a.equals(d14Var.a) && this.b.equals(d14Var.b) && jl40.l(this.c, d14Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zu3 zu3Var = this.c;
        return hashCode + (zu3Var == null ? 0 : zu3Var.hashCode());
    }

    public final String toString() {
        return "Content(mainBlock=" + this.a + ", toolbar=" + this.b + ", bottomSheetState=" + this.c + Extension.C_BRAKE;
    }
}
