package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i500 extends s151 {
    public final pau a;
    public final lrb1 b;
    public final ArrayList c;
    public final uq0 d;
    public final r0b1 e;
    public final boolean f;
    public final Object g;
    public final String h;

    public i500(pau pauVar, lrb1 lrb1Var, ArrayList arrayList, uq0 uq0Var, r0b1 r0b1Var, boolean z, Object obj, String str, int i) {
        uq0Var = (i & 8) != 0 ? null : uq0Var;
        r0b1Var = (i & 16) != 0 ? null : r0b1Var;
        this.a = pauVar;
        this.b = lrb1Var;
        this.c = arrayList;
        this.d = uq0Var;
        this.e = r0b1Var;
        this.f = z;
        this.g = obj;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i500)) {
            return false;
        }
        i500 i500Var = (i500) obj;
        return jl40.l(this.a, i500Var.a) && jl40.l(this.b, i500Var.b) && jl40.l(this.c, i500Var.c) && jl40.l(this.d, i500Var.d) && jl40.l(this.e, i500Var.e) && this.f == i500Var.f && jl40.l(this.g, i500Var.g) && jl40.l(this.h, i500Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lrb1 lrb1Var = this.b;
        int hashCode2 = (hashCode + (lrb1Var == null ? 0 : lrb1Var.hashCode())) * 31;
        ArrayList arrayList = this.c;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        uq0 uq0Var = this.d;
        int hashCode4 = (hashCode3 + (uq0Var == null ? 0 : uq0Var.hashCode())) * 31;
        r0b1 r0b1Var = this.e;
        int e = unr0.e((hashCode4 + (r0b1Var == null ? 0 : r0b1Var.hashCode())) * 31, 31, this.f);
        Object obj = this.g;
        int hashCode5 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.h;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MainHeaderModel(lead=" + this.a + ", trail=" + this.b + ", middleElements=" + this.c + ", addressButton=" + this.d + ", subtitleModel=" + this.e + ", showWhenSectionCollapsed=" + this.f + ", meta=" + this.g + ", metricaLabel=" + this.h + Extension.C_BRAKE;
    }
}
