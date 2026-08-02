package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class mds0 {
    public final xvl a;
    public final zrl b;

    public mds0(xvl xvlVar, zrl zrlVar) {
        this.a = xvlVar;
        this.b = zrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mds0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mds0 mds0Var = (mds0) obj;
        return this.a.equals(mds0Var.a) && jl40.l(this.b, mds0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zrl zrlVar = this.b;
        return hashCode + (zrlVar != null ? zrlVar.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleDivkitVo(vo=" + this.a + ", actionHandler=" + this.b + Extension.C_BRAKE;
    }
}
