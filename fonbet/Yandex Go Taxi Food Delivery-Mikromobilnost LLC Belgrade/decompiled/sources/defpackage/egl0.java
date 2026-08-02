package defpackage;

import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class egl0 implements o3l0 {
    public final zuj0 a;
    public final tls b;
    public final String c;
    public final hgl0 w;
    public final ljr x;
    public final sls y;
    public final String z;

    public egl0(zuj0 zuj0Var, tls tlsVar, String str, hgl0 hgl0Var, ljr ljrVar, sls slsVar) {
        this.a = zuj0Var;
        this.b = tlsVar;
        this.c = str;
        this.w = hgl0Var;
        this.x = ljrVar;
        this.y = slsVar;
        this.z = oyr.p("FLEX:", str.toUpperCase(Locale.ROOT), ":ROUTE_HANDLER");
    }

    public static g92 a(ywl ywlVar, u1m u1mVar) {
        if (u1mVar != null) {
            return new g92(2, new pwy(u1mVar, ywlVar, false, 4));
        }
        if (ywlVar != null) {
            return new g92(2, new o6s0(new xzl(ywlVar, null, null, 30)));
        }
        return null;
    }

    public final rhr b(vlr vlrVar, boolean z, boolean z2, g92 g92Var, boolean z3, boolean z4, Integer num) {
        Integer valueOf = z2 ? null : Integer.valueOf(mqg0.transparent);
        if (z) {
            ljr ljrVar = this.x;
            return new nhr(vlrVar, null, g92Var, null, null, valueOf, null, ljrVar != null ? new ljr(ljrVar.a, null) : null, null, null, 7898);
        }
        return new qhr(vlrVar, g92Var, null, num != null, valueOf, null, false, Integer.valueOf(((avj0) this.a).c(mrg0.modal_view_corner_radius_big)), z3, z4, num, null, null, null, 3970874);
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        dismiss(z, null, map);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        this.w.b(new cgl0(krVar, this, 0));
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        g92 a = a(ywlVar, u1mVar);
        if (a == null) {
            xby.l(jst.e, this.z, null, null, "RouteHandler.forward without data", 6);
            return false;
        }
        this.w.a(new bgc(12), new vxj0(17, this, a));
        return true;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        return false;
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Float f, boolean z5, Map map, kr krVar) {
        if (u1mVar == null || !z5) {
            u1mVar = null;
        }
        final g92 a = a(ywlVar, u1mVar);
        if (a == null) {
            xby.l(jst.e, this.z, null, null, "RouteHandler.showPopup without data", 6);
            return false;
        }
        this.w.a(new cgl0(krVar, this, 1), new tls() { // from class: dgl0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Integer num;
                egl0 egl0Var = egl0.this;
                String j = b64.j(egl0Var.c, ".ChildPopup");
                vlr vlrVar = (vlr) egl0Var.y.invoke();
                vlr a2 = vlr.a(vlrVar, j, new f83(egl0Var, j, (hgl0) obj, vlrVar, 12), 1048542);
                Float f2 = f;
                if (f2 != null) {
                    num = Integer.valueOf(tje.v(((avj0) egl0Var.a).a, f2.floatValue()));
                } else {
                    num = null;
                }
                return egl0Var.b(a2, z, z4, a, z2, z3, num);
            }
        });
        return true;
    }
}
