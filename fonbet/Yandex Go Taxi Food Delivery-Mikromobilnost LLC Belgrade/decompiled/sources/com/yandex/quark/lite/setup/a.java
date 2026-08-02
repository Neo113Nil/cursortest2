package com.yandex.quark.lite.setup;

import android.content.Context;
import com.yandex.quark.lite.b;
import defpackage.a6h;
import defpackage.ad90;
import defpackage.ahg0;
import defpackage.ate0;
import defpackage.b3n;
import defpackage.b64;
import defpackage.bhg0;
import defpackage.bvf0;
import defpackage.eya0;
import defpackage.gj41;
import defpackage.gm60;
import defpackage.heh;
import defpackage.hq60;
import defpackage.ib20;
import defpackage.ike;
import defpackage.ilu;
import defpackage.jhg0;
import defpackage.jl40;
import defpackage.jm60;
import defpackage.jyj0;
import defpackage.k6h;
import defpackage.l6h;
import defpackage.lig0;
import defpackage.lyj0;
import defpackage.mdh;
import defpackage.mkf;
import defpackage.ngd0;
import defpackage.o430;
import defpackage.o6h;
import defpackage.ooc;
import defpackage.ord;
import defpackage.oza0;
import defpackage.prd;
import defpackage.q5z;
import defpackage.qc20;
import defpackage.rhg0;
import defpackage.rig0;
import defpackage.roc;
import defpackage.s2b0;
import defpackage.sb20;
import defpackage.sjh;
import defpackage.sya0;
import defpackage.syj0;
import defpackage.tb20;
import defpackage.ub20;
import defpackage.udq0;
import defpackage.ugz;
import defpackage.uyj;
import defpackage.uza0;
import defpackage.vx;
import defpackage.w511;
import defpackage.w5h;
import defpackage.x8o;
import defpackage.xa20;
import defpackage.xc41;
import defpackage.xc90;
import defpackage.xch;
import defpackage.xl60;
import defpackage.xw91;
import defpackage.y3h;
import defpackage.y5e;
import defpackage.y5h;
import defpackage.yc90;
import defpackage.yeh;
import defpackage.yei0;
import defpackage.zc90;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class a {
    private static final rhg0 Companion = new rhg0();
    public final Context a;
    public final ahg0 b;
    public boolean c;
    public final ike d;
    public final ArrayList e;
    public final qc20 f;
    public ord g;
    public prd h;
    public final xw91 i;
    public final yc90 j;
    public final xw91 k;
    public ub20 l;
    public final mkf m;
    public ad90 n;
    public ad90 o;
    public final zc90 p;
    public final mkf q;
    public final mkf r;

    public a(Context context, ahg0 ahg0Var) {
        this.a = context;
        this.b = ahg0Var;
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(mdh.b.plus(jl40.a()));
        this.e = new ArrayList();
        this.f = new qc20(ahg0Var.a);
        xw91 xw91Var = xw91.c;
        this.i = xw91Var;
        this.j = new yc90(new l6h(0));
        this.k = xw91Var;
        this.l = tb20.a;
        mkf mkfVar = mkf.a;
        this.m = mkfVar;
        zc90 zc90Var = zc90.a;
        this.n = zc90Var;
        this.o = zc90Var;
        this.p = zc90Var;
        this.q = mkfVar;
        this.r = mkfVar;
        new b3n();
    }

    public static void c(Object obj, x8o x8oVar, xa20 xa20Var) {
        if (obj instanceof ugz) {
            ((ugz) obj).d(x8oVar);
        }
        if (obj instanceof ib20) {
            ((xc41) ((ib20) obj)).o(xa20Var);
        }
    }

    public final syj0 a() {
        xa20 yehVar;
        Object invoke;
        Object obj;
        syj0 u = this.c ? y5e.u(yei0.y, "QuarkInitializerImpl.initiate() should be called only once") : q5z.N();
        jyj0 jyj0Var = u instanceof jyj0 ? (jyj0) u : null;
        if (jyj0Var != null && (obj = jyj0Var.a) != null) {
            return new jyj0((jhg0) obj);
        }
        try {
            ub20 ub20Var = this.l;
            int i = QuarkInitializerImpl$makeMetrica$1.b;
            int i2 = QuarkInitializerImpl$makeMetrica$2.b;
            if (ub20Var instanceof tb20) {
                yehVar = new gm60();
            } else {
                if (!(ub20Var instanceof sb20)) {
                    throw new NoWhenBranchMatchedException();
                }
                yehVar = new yeh(((sb20) ub20Var).a);
            }
            xw91 xw91Var = this.k;
            heh hehVar = new heh(this.b.f);
            x8o x8oVar = new x8o(new x8o(hehVar, yehVar, 0), "QuarkLog", 1);
            udq0.E(hehVar, x8oVar, xw91Var);
            ArrayList arrayList = new ArrayList();
            s2b0 s2b0Var = new s2b0(this.a);
            prd b = b(x8oVar, yehVar);
            roc rocVar = new roc();
            bhg0 D = ooc.D(this.b, this.f);
            ike ikeVar = this.d;
            ilu iluVar = (ilu) QuarkInitializerImpl$makeHistogramRecorder$histogramRecorder$1.b.invoke();
            c(iluVar, x8oVar, yehVar);
            vx vxVar = ngd0.b;
            zc90 zc90Var = this.p;
            if (vxVar != null) {
                udq0.E(vxVar, x8oVar, zc90Var);
            }
            c(vxVar, x8oVar, yehVar);
            mkf mkfVar = this.q;
            y3h y3hVar = o430.w;
            if (y3hVar != null) {
                udq0.E(y3hVar, x8oVar, mkfVar);
            }
            c(y3hVar, x8oVar, yehVar);
            ahg0 ahg0Var = this.b;
            xch xchVar = new xch(ahg0Var.b.a, ahg0Var.e.c);
            gj41 gj41Var = new gj41();
            ad90 ad90Var = this.o;
            QuarkInitializerImpl$makePermissionChecker$1 quarkInitializerImpl$makePermissionChecker$1 = QuarkInitializerImpl$makePermissionChecker$1.b;
            QuarkInitializerImpl$makePermissionChecker$2 quarkInitializerImpl$makePermissionChecker$2 = QuarkInitializerImpl$makePermissionChecker$2.b;
            if (ad90Var instanceof xc90) {
                invoke = ((xc90) ad90Var).a;
            } else {
                if (!(ad90Var instanceof zc90)) {
                    if (!(ad90Var instanceof yc90)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quarkInitializerImpl$makePermissionChecker$2.invoke(((yc90) ad90Var).a);
                    throw null;
                }
                invoke = quarkInitializerImpl$makePermissionChecker$1.invoke();
            }
            if (invoke != null) {
                udq0.E(invoke, x8oVar, ad90Var);
            }
            ord ordVar = new ord((eya0) invoke);
            this.g = ordVar;
            hq60 hq60Var = new hq60(new ord(ordVar, x8oVar));
            c(hq60Var, x8oVar, yehVar);
            mkf mkfVar2 = this.m;
            Object invoke2 = QuarkInitializerImpl$initiate$quark$1.b.invoke();
            if (invoke2 != null) {
                udq0.E(invoke2, x8oVar, mkfVar2);
            }
            Context context = this.a;
            qc20 qc20Var = new qc20();
            qc20Var.a = context.getSharedPreferences("quark_permissions_last_request_time", 0);
            sya0 sya0Var = new sya0(hq60Var, b, (uza0) invoke2, s2b0Var, qc20Var);
            yc90 yc90Var = this.j;
            k6h k6hVar = new k6h();
            udq0.E(k6hVar, x8oVar, yc90Var);
            c(k6hVar, x8oVar, yehVar);
            y5h y5hVar = new y5h();
            xw91 xw91Var2 = this.i;
            o6h o6hVar = new o6h();
            bvf0.c(Boolean.FALSE);
            udq0.E(o6hVar, x8oVar, xw91Var2);
            c(o6hVar, x8oVar, yehVar);
            b bVar = new b(D, ikeVar, x8oVar, yehVar, iluVar, vxVar, y3hVar, sya0Var, gj41Var, k6hVar, y5hVar, o6hVar, new a6h(), new w5h(x8oVar), new xl60(), xchVar, rocVar, new ate0(4, this));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                synchronized (bVar) {
                    bVar.g.add(null);
                }
            }
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                rig0 rig0Var = (rig0) it2.next();
                x8oVar.c("QuarkInitializerImpl", "Module provided: " + rig0Var.getClass().getName());
                bVar.a(rig0Var);
            }
            this.c = true;
            return new lyj0(bVar);
        } catch (Exception e) {
            return y5e.u(new lig0(e), "Failed to initialize Quark JS: " + e.getMessage());
        }
    }

    public final prd b(x8o x8oVar, xa20 xa20Var) {
        Object jm60Var;
        ad90 ad90Var = this.n;
        int i = QuarkInitializerImpl$makePermissionRequester$baseRequester$1.b;
        if (ad90Var instanceof xc90) {
            jm60Var = ((xc90) ad90Var).a;
        } else {
            if (!(ad90Var instanceof zc90)) {
                if (ad90Var instanceof yc90) {
                    b64.D(((yc90) ad90Var).a);
                    throw null;
                }
                w511.b();
                return null;
            }
            jm60Var = new jm60();
        }
        if (jm60Var != null) {
            udq0.E(jm60Var, x8oVar, ad90Var);
        }
        prd prdVar = new prd((oza0) jm60Var);
        this.h = prdVar;
        prd prdVar2 = new prd(new prd(new prd(prdVar, x8oVar, 2), x8oVar, 1));
        c(prdVar2, x8oVar, xa20Var);
        return prdVar2;
    }
}
