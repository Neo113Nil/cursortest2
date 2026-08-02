package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class og90 {
    public final ywl a;
    public final kq90 b;

    public og90(ywl ywlVar, kq90 kq90Var) {
        this.a = ywlVar;
        this.b = kq90Var;
    }

    public final ywl a() {
        return this.a;
    }

    public final kq90 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!og90.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        og90 og90Var = (og90) obj;
        return jl40.l(this.a, og90Var.a) && jl40.l(this.b, og90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartDocument(document=" + this.a + ", patchParams=" + this.b + Extension.C_BRAKE;
    }
}
