package defpackage;

import com.yandex.go.navigator.analitycs.RouteCompletionType;
import com.yandex.go.navigator.providers.b;
import com.yandex.go.navigator.rate_route.d;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.TimeUnitsVisibility;
import ru.yandex.taxi.map_common.style.domain.a;

/* loaded from: classes12.dex */
public final class p7i0 extends ad5 {
    public final ya50 A;
    public final par B;
    public final zuj0 C;
    public final b D;
    public final a E;
    public final d F;
    public final com.yandex.go.navigator.rate_route.a G;
    public final r4v H;
    public final pwy0 I;
    public final r0 J;
    public pzt0 K;
    public final String L;
    public final i3y M;
    public final i3y N;
    public final aye0 x;
    public final RouteCompletionType y;
    public final ru.yandex.taxi.design.utils.b z;

    public p7i0(aye0 aye0Var, RouteCompletionType routeCompletionType, ru.yandex.taxi.design.utils.b bVar, ya50 ya50Var, par parVar, zuj0 zuj0Var, b bVar2, a aVar, d dVar, com.yandex.go.navigator.rate_route.a aVar2, r4v r4vVar, pwy0 pwy0Var) {
        super(m7i0.class);
        this.x = aye0Var;
        this.y = routeCompletionType;
        this.z = bVar;
        this.A = ya50Var;
        this.B = parVar;
        this.C = zuj0Var;
        this.D = bVar2;
        this.E = aVar;
        this.F = dVar;
        this.G = aVar2;
        this.H = r4vVar;
        this.I = pwy0Var;
        final int i = 0;
        this.J = bvf0.c(new cm21(0));
        zuj0 zuj0Var2 = parVar.a;
        long currentTimeMillis = System.currentTimeMillis() - parVar.f;
        this.L = qpb1.c(zuj0Var2, currentTimeMillis < 0 ? 0L : currentTimeMillis, TimeUnitsVisibility.ONE_TIME_UNIT);
        this.M = kotlin.a.a(new sls(this) { // from class: o7i0
            public final /* synthetic */ p7i0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                p7i0 p7i0Var = this.b;
                switch (i2) {
                    case 0:
                        return hua1.c(p7i0Var.C, p7i0Var.B.a());
                    default:
                        zuj0 zuj0Var3 = p7i0Var.C;
                        int i3 = kyh0.navigator_rate_route_kph;
                        par parVar2 = p7i0Var.B;
                        double d = parVar2.c.b;
                        double d2 = 0.0d;
                        if (d < 0.0d) {
                            d = 0.0d;
                        }
                        if (d == 0.0d) {
                            long currentTimeMillis2 = System.currentTimeMillis() - parVar2.f;
                            if (currentTimeMillis2 < 0) {
                                currentTimeMillis2 = 0;
                            }
                            float f = currentTimeMillis2 / 0.26666668f;
                            float a = ((float) parVar2.a()) / 1000.0f;
                            if (f != 0.0f && a != 0.0f) {
                                d2 = m810.a((a / f) / 3.6d);
                            }
                        } else {
                            d2 = d;
                        }
                        return ((avj0) zuj0Var3).i(i3, Integer.valueOf(xk91.c(d2)));
                }
            }
        });
        final int i2 = 1;
        this.N = kotlin.a.a(new sls(this) { // from class: o7i0
            public final /* synthetic */ p7i0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                p7i0 p7i0Var = this.b;
                switch (i22) {
                    case 0:
                        return hua1.c(p7i0Var.C, p7i0Var.B.a());
                    default:
                        zuj0 zuj0Var3 = p7i0Var.C;
                        int i3 = kyh0.navigator_rate_route_kph;
                        par parVar2 = p7i0Var.B;
                        double d = parVar2.c.b;
                        double d2 = 0.0d;
                        if (d < 0.0d) {
                            d = 0.0d;
                        }
                        if (d == 0.0d) {
                            long currentTimeMillis2 = System.currentTimeMillis() - parVar2.f;
                            if (currentTimeMillis2 < 0) {
                                currentTimeMillis2 = 0;
                            }
                            float f = currentTimeMillis2 / 0.26666668f;
                            float a = ((float) parVar2.a()) / 1000.0f;
                            if (f != 0.0f && a != 0.0f) {
                                d2 = m810.a((a / f) / 3.6d);
                            }
                        } else {
                            d2 = d;
                        }
                        return ((avj0) zuj0Var3).i(i3, Integer.valueOf(xk91.c(d2)));
                }
            }
        });
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = null;
    }

    public final void Kg() {
        cm21 cm21Var = (cm21) this.J.getValue();
        String str = cm21Var.a;
        ya50 ya50Var = this.A;
        if (str != null) {
            i650 i650Var = ya50Var.a;
            i650Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("rate", str);
            i650Var.a.a("navigation.route_complete.route_feedback.rate_route", hashMap, 1, new HashMap());
        }
        Set set = cm21Var.b;
        ya50Var.getClass();
        i650 i650Var2 = ya50Var.a;
        if (!set.isEmpty()) {
            List J0 = kotlin.collections.a.J0(set);
            i650Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("reason_tags", J0);
            i650Var2.a.a("navigation.route_complete.route_feedback.rating_reason_tags", hashMap2, 1, new HashMap());
        }
        String str2 = cm21Var.c;
        if (str2 != null) {
            i650Var2.getClass();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("comment", str2);
            i650Var2.a.a("navigation.route_complete.route_feedback.feedback_comment", hashMap3, 1, new HashMap());
        }
    }
}
