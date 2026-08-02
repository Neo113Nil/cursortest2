package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class p3l0 implements o3l0 {
    public final o3l0 a;
    public final klc b;

    public p3l0(o3l0 o3l0Var, klc klcVar) {
        this.a = o3l0Var;
        this.b = klcVar;
    }

    public final void a(u1m u1mVar, ywl ywlVar, boolean z) {
        boolean z2 = u1mVar != null && u1mVar.a.length() > 0;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        klc klcVar = this.b;
        if (booleanValue && z2 && z) {
            i3y i3yVar = ryl.c;
            uyl uylVar = (uyl) ck91.b().b.get(u1mVar);
            if ((uylVar != null ? uylVar.c : null) == null && klcVar != null) {
                ((txl) klcVar).a(new gxl(new nne0(u1mVar)));
            }
        }
        if (klcVar != null) {
            ((txl) klcVar).a(new h1o(new elf0(ywlVar, u1mVar)));
        }
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        return this.a.backward(z, map);
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        return this.a.dismiss(z, krVar, map);
    }

    @Override // defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        a(u1mVar, ywlVar, true);
        return this.a.forward(u1mVar, ywlVar, z, map);
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        return this.a.hideOverlay(str, false, map);
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        a(u1mVar, ywlVar, true);
        return this.a.overlay(u1mVar, ywlVar, z, z2, map);
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        a(null, ywlVar, true);
        return this.a.showOverlay(str, ywlVar, map);
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar) {
        a(u1mVar, ywlVar, z5);
        return this.a.showPopup(u1mVar, ywlVar, z, z2, z3, z4, f, z5, map, krVar);
    }
}
