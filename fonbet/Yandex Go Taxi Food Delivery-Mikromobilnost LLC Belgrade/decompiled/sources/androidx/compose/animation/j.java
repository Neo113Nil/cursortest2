package androidx.compose.animation;

import defpackage.e530;
import defpackage.j530;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.ox01;
import defpackage.q2o;
import defpackage.sls;
import defpackage.v2o;
import defpackage.ymo;
import defpackage.zx01;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/j;", "Lj530;", "Landroidx/compose/animation/l;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class j extends j530 {
    public final q2o A;
    public final zx01 a;
    public final ox01 b;
    public final ox01 c;
    public final ox01 w;
    public final v2o x;
    public final ymo y;
    public final sls z;

    public j(zx01 zx01Var, ox01 ox01Var, ox01 ox01Var2, ox01 ox01Var3, v2o v2oVar, ymo ymoVar, sls slsVar, q2o q2oVar) {
        this.a = zx01Var;
        this.b = ox01Var;
        this.c = ox01Var2;
        this.w = ox01Var3;
        this.x = v2oVar;
        this.y = ymoVar;
        this.z = slsVar;
        this.A = q2oVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new l(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jl40.l(jVar.a, this.a) && jl40.l(jVar.b, this.b) && jl40.l(jVar.c, this.c) && jl40.l(jVar.w, this.w) && jl40.l(jVar.x, this.x) && jl40.l(jVar.y, this.y) && jVar.z == this.z && jl40.l(jVar.A, this.A);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        l lVar = (l) e530Var;
        lVar.a = this.a;
        lVar.b = this.b;
        lVar.c = this.c;
        lVar.w = this.w;
        lVar.x = this.x;
        lVar.y = this.y;
        lVar.z = this.z;
        lVar.A = this.A;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ox01 ox01Var = this.b;
        int hashCode2 = (hashCode + (ox01Var != null ? ox01Var.hashCode() : 0)) * 31;
        ox01 ox01Var2 = this.c;
        int hashCode3 = (hashCode2 + (ox01Var2 != null ? ox01Var2.hashCode() : 0)) * 31;
        ox01 ox01Var3 = this.w;
        return this.A.hashCode() + nnm.a((this.y.hashCode() + ((this.x.hashCode() + ((hashCode3 + (ox01Var3 != null ? ox01Var3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.z);
    }
}
