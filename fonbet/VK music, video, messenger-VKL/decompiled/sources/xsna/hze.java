package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gna;
import xsna.tlo0;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public final class hze implements pgf {
    public final zoa a;
    public final gna b;
    public final tlo0 c;
    public final tlo0 d;
    public final skp e;
    public final boolean f;
    public final List g;
    public final cna h;
    public final String i;
    public final tlo0 j;

    public hze(zoa zoaVar, gna gnaVar, tlo0 tlo0Var, tlo0 tlo0Var2, skp skpVar, boolean z, List list, cna cnaVar, String str, tlo0 tlo0Var3) {
        this.a = zoaVar;
        this.b = gnaVar;
        this.c = tlo0Var;
        this.d = tlo0Var2;
        this.e = skpVar;
        this.f = z;
        this.g = list;
        this.h = cnaVar;
        this.i = str;
        this.j = tlo0Var3;
    }

    @Override // xsna.pgf
    public final zoa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hze)) {
            return false;
        }
        hze hzeVar = (hze) obj;
        return epx.f(this.a, hzeVar.a) && epx.f(this.b, hzeVar.b) && epx.f(this.c, hzeVar.c) && epx.f(this.d, hzeVar.d) && epx.f(this.e, hzeVar.e) && this.f == hzeVar.f && epx.f(this.g, hzeVar.g) && epx.f(this.h, hzeVar.h) && epx.f(this.i, hzeVar.i) && epx.f(this.j, hzeVar.j);
    }

    public final int hashCode() {
        int a = com.vk.movika.sdk.base.model.history.b.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        tlo0 tlo0Var = this.d;
        int a2 = fw3.a(qoy.b((this.e.hashCode() + ((a + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31, 31, this.f), 31, this.g);
        cna cnaVar = this.h;
        int a3 = urd0.a((a2 + (cnaVar == null ? 0 : cnaVar.hashCode())) * 31, 31, this.i);
        tlo0 tlo0Var2 = this.j;
        return a3 + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPublishCellConfig(itemType=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", endIconState=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        sb.append(this.f);
        sb.append(", suggestions=");
        mr.c(", details=", sb, this.g);
        sb.append(this.h);
        sb.append(", testTag=");
        sb.append(this.i);
        sb.append(", tooltipText=");
        return bt.a(sb, this.j, ')');
    }

    public hze(zoa zoaVar, tlo0.f fVar, tlo0 tlo0Var, skp skpVar, boolean z, cna cnaVar, String str, int i) {
        this(zoaVar, gna.d.a, fVar, tlo0Var, skpVar, z, EmptyList.b, (i & 128) != 0 ? null : cnaVar, (i & 256) != 0 ? zoaVar.toString() : str, null);
    }
}
