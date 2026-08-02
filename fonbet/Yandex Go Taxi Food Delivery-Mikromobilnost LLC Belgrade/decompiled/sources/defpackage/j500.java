package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j500 extends n351 {
    public final ome c;
    public final v4v d;
    public final vq0 e;
    public final ArrayList f;
    public final s2v0 g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public j500(ome omeVar, v4v v4vVar, vq0 vq0Var, ArrayList arrayList, s2v0 s2v0Var, boolean z, boolean z2, String str) {
        super("main-header-v2", false, 14);
        this.c = omeVar;
        this.d = v4vVar;
        this.e = vq0Var;
        this.f = arrayList;
        this.g = s2v0Var;
        this.h = z;
        this.i = z2;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j500)) {
            return false;
        }
        j500 j500Var = (j500) obj;
        return jl40.l(this.c, j500Var.c) && jl40.l(this.d, j500Var.d) && jl40.l(this.e, j500Var.e) && this.f.equals(j500Var.f) && jl40.l(this.g, j500Var.g) && this.h == j500Var.h && this.i == j500Var.i && jl40.l(this.j, j500Var.j);
    }

    public final int hashCode() {
        ome omeVar = this.c;
        int hashCode = (omeVar == null ? 0 : omeVar.hashCode()) * 31;
        v4v v4vVar = this.d;
        int hashCode2 = (hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        vq0 vq0Var = this.e;
        int b = ly3.b((hashCode2 + (vq0Var == null ? 0 : vq0Var.hashCode())) * 31, 31, this.f);
        s2v0 s2v0Var = this.g;
        int e = unr0.e(unr0.e((b + (s2v0Var == null ? 0 : s2v0Var.hashCode())) * 31, 31, this.h), 31, this.i);
        String str = this.j;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainHeaderState(control=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", addressButton=");
        sb.append(this.e);
        sb.append(", middleElements=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(this.h);
        sb.append(", isCollapsed=");
        return n.m(", address=", this.j, Extension.C_BRAKE, sb, this.i);
    }
}
