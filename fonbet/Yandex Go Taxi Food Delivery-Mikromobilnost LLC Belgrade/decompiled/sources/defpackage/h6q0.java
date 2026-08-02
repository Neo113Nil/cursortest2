package defpackage;

import flex.engine.section.c;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class h6q0 implements zxw0 {
    public final /* synthetic */ c a;

    public /* synthetic */ h6q0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.zxw0
    public void onRefresh() {
        xyp0 xyp0Var;
        c cVar = this.a;
        nie nieVar = cVar.d0;
        see seeVar = nieVar != null ? nieVar.c : null;
        dzp0 dzp0Var = seeVar instanceof dzp0 ? (dzp0) seeVar : null;
        kr krVar = (dzp0Var == null || (xyp0Var = dzp0Var.d) == null) ? null : xyp0Var.e;
        cnr0 cnr0Var = nieVar != null ? nieVar.d : null;
        if (krVar != null && cnr0Var != null) {
            cVar.b.b(krVar, new pxl(cnr0Var), b.f());
        }
        cVar.c.a(new jxl(0));
        c990 c990Var = cVar.A;
        c990Var.b = null;
        c990Var.a = true;
        c990Var.c.clear();
    }
}
