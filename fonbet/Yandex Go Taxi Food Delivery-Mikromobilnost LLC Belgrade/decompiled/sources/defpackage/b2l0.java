package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamStyle;
import com.yandex.mapkit.navigation.JamTypeColor;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes6.dex */
public final class b2l0 {
    public final i3y a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public b2l0(final zuj0 zuj0Var, final ah00 ah00Var, final Context context, pdc pdcVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, new kqe0(18, zuj0Var, context, pdcVar));
        final int i = 0;
        this.b = a.b(lazyThreadSafetyMode, new sls() { // from class: z1l0
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new hx1(zuj0Var, context);
                    case 1:
                        return new r6l0(zuj0Var, context);
                    default:
                        return new zrz0(zuj0Var, context);
                }
            }
        });
        final int i2 = 1;
        this.c = a.b(lazyThreadSafetyMode, new sls() { // from class: z1l0
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new hx1(zuj0Var, context);
                    case 1:
                        return new r6l0(zuj0Var, context);
                    default:
                        return new zrz0(zuj0Var, context);
                }
            }
        });
        this.d = a.b(lazyThreadSafetyMode, new sls() { // from class: a2l0
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new af60(ah00Var, zuj0Var, context);
                    default:
                        return new kiq0(ah00Var, zuj0Var, context);
                }
            }
        });
        this.e = a.b(lazyThreadSafetyMode, new sls() { // from class: a2l0
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new af60(ah00Var, zuj0Var, context);
                    default:
                        return new kiq0(ah00Var, zuj0Var, context);
                }
            }
        });
        final int i3 = 2;
        this.f = a.b(lazyThreadSafetyMode, new sls() { // from class: z1l0
            @Override // defpackage.sls
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new hx1(zuj0Var, context);
                    case 1:
                        return new r6l0(zuj0Var, context);
                    default:
                        return new zrz0(zuj0Var, context);
                }
            }
        });
    }

    public final void a(w4e0 w4e0Var) {
        ((af60) this.d.getValue()).a(w4e0Var);
    }

    public final void b(w4e0 w4e0Var, kdc kdcVar, Float f, Float f2, Float f3, boolean z) {
        r6l0 r6l0Var = (r6l0) this.c.getValue();
        Context context = r6l0Var.e;
        r6l0Var.a(w4e0Var);
        w4e0Var.z(0.0f);
        w4e0Var.y(0);
        if (kdcVar != null) {
            w4e0Var.B(((Polyline) w4e0Var.h).getPoints().size() - 1, s8o.m(kdcVar, context));
        }
        if (f != null) {
            w4e0Var.p(f.floatValue());
        }
        if (f2 != null) {
            float floatValue = f2.floatValue();
            w4e0Var.p = floatValue;
            ((PolylineMapObject) w4e0Var.g).setArcApproximationStep(floatValue);
        }
        if (f3 != null) {
            w4e0Var.D(f3.floatValue());
        }
        if (z) {
            w4e0Var.C(Integer.valueOf(qje.t(xng0.textMain, context)));
            w4e0Var.p(2.8f);
            w4e0Var.u(4.0f);
            w4e0Var.s(4.0f);
            w4e0Var.v(false);
        }
    }

    public final void c(js00 js00Var) {
        Integer S;
        Integer S2;
        af60 af60Var = (af60) this.d.getValue();
        af60Var.f = js00Var;
        js00 d = af60Var.d();
        String str = d != null ? d.e : null;
        int t = qje.t(xng0.bgMain, af60Var.c);
        if (str != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null && (S2 = q5z.S(str)) != null) {
                t = S2.intValue();
            }
        }
        af60Var.e = t;
        HashSet hashSet = new HashSet();
        af60Var.e(hashSet);
        af60Var.d = !el00.a ? null : new JamStyle((List<JamTypeColor>) kotlin.collections.a.J0(hashSet));
        kiq0 kiq0Var = (kiq0) this.e.getValue();
        kiq0Var.f = js00Var;
        js00 d2 = kiq0Var.d();
        String str2 = d2 != null ? d2.e : null;
        int t2 = qje.t(xng0.bgMain, kiq0Var.c);
        if (str2 != null) {
            if (evu0.J(str2)) {
                str2 = null;
            }
            if (str2 != null && (S = q5z.S(str2)) != null) {
                t2 = S.intValue();
            }
        }
        kiq0Var.e = t2;
        HashSet hashSet2 = new HashSet();
        kiq0Var.e(hashSet2);
        kiq0Var.d = el00.a ? new JamStyle((List<JamTypeColor>) kotlin.collections.a.J0(hashSet2)) : null;
        hx1 hx1Var = (hx1) this.b.getValue();
        hx1Var.d = qje.t(xng0.bgMain, hx1Var.a);
        bf60 bf60Var = (bf60) this.a.getValue();
        bf60Var.d = qje.t(xng0.bgMain, bf60Var.a);
        zrz0 zrz0Var = (zrz0) this.f.getValue();
        zrz0Var.d = qje.t(xng0.bgMain, zrz0Var.a);
        r6l0 r6l0Var = (r6l0) this.c.getValue();
        r6l0Var.d = qje.t(xng0.bgMain, r6l0Var.a);
    }
}
