package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class izi0 {
    public final c9u a;
    public final xye b;
    public final nt6 c;
    public final s47 d;

    public izi0(c9u c9uVar, xye xyeVar, nt6 nt6Var, s47 s47Var) {
        this.a = c9uVar;
        this.b = xyeVar;
        this.c = nt6Var;
        this.d = s47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izi0)) {
            return false;
        }
        izi0 izi0Var = (izi0) obj;
        return jl40.l(this.a, izi0Var.a) && this.b.equals(izi0Var.b) && jl40.l(this.c, izi0Var.c) && this.d.equals(izi0Var.d);
    }

    public final int hashCode() {
        c9u c9uVar = this.a;
        int b = unr0.b((c9uVar == null ? 0 : c9uVar.hashCode()) * 31, 31, this.b.a);
        nt6 nt6Var = this.c;
        return this.d.hashCode() + ((b + (nt6Var != null ? nt6Var.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RentalDurationSelector(header=" + this.a + ", counter=" + this.b + ", bulletList=" + this.c + ", buttons=" + this.d + Extension.C_BRAKE;
    }
}
