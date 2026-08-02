package defpackage;

import android.content.Context;
import defpackage.hu4;
import defpackage.iu4;
import kotlin.a;
import ru.yandex.taxi.banners.cache.b;
import ru.yandex.taxi.banners.model.e;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.communications.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes9.dex */
public final class iu4 {
    public final i3y A;
    public final i3y C;
    public final i3y D;
    public final i3y E;
    public final i3y F;
    public final i3y G;
    public final i3y H;
    public final i3y I;
    public final Context a;
    public final wnt b;
    public final dxf0 c;
    public final d d;
    public final o9y0 e;
    public final hux0 f;
    public final b7z0 g;
    public final klf0 h;
    public final zpf0 i;
    public final gep0 j;
    public final pyc0 k;
    public final cv4 l;
    public final fuc m;
    public final dux0 n;
    public final tt2 o;
    public final c p;
    public final zuj0 q;
    public final pdc r;
    public final ju4 s;
    public final ltc t;
    public final vby0 u;
    public final ru.yandex.taxi.communications.c v;
    public final boolean w;
    public final lq2 x;
    public final bt4 y;
    public final i3y z;
    public final i3y B = a.a(new q03(22));
    public final i3y J = a.a(new sls() { // from class: ru.yandex.taxi.banners.di.a
        @Override // defpackage.sls
        public final Object invoke() {
            iu4 iu4Var = iu4.this;
            return new e(new hu4(new BannersComponent$compositeBannersStorage$2$1(iu4Var, iu4.class, "promotionsProvider", "getPromotionsProvider()Lru/yandex/taxi/banners/model/PromotionsProvider;", 0), 0), new hu4(new BannersComponent$compositeBannersStorage$2$2(iu4Var, iu4.class, "geoBannersInteractor", "getGeoBannersInteractor()Lru/yandex/taxi/banners/model/GeoBannersInteractor;", 0), 1));
        }
    });

    public iu4(Context context, wnt wntVar, dxf0 dxf0Var, d dVar, o9y0 o9y0Var, hux0 hux0Var, tay0 tay0Var, n9y0 n9y0Var, zpf0 zpf0Var, gep0 gep0Var, g9y0 g9y0Var, cv4 cv4Var, ru.yandex.taxi.communications.common.repository.a aVar, dux0 dux0Var, tt2 tt2Var, c cVar, zuj0 zuj0Var, pdc pdcVar, ju4 ju4Var, ltc ltcVar, vby0 vby0Var, ru.yandex.taxi.communications.c cVar2, kq2 kq2Var, boolean z, lq2 lq2Var, bt4 bt4Var) {
        this.a = context;
        this.b = wntVar;
        this.c = dxf0Var;
        this.d = dVar;
        this.e = o9y0Var;
        this.f = hux0Var;
        this.g = tay0Var;
        this.h = n9y0Var;
        this.i = zpf0Var;
        this.j = gep0Var;
        this.k = g9y0Var;
        this.l = cv4Var;
        this.m = aVar;
        this.n = dux0Var;
        this.o = tt2Var;
        this.p = cVar;
        this.q = zuj0Var;
        this.r = pdcVar;
        this.s = ju4Var;
        this.t = ltcVar;
        this.u = vby0Var;
        this.v = cVar2;
        this.w = z;
        this.x = lq2Var;
        this.y = bt4Var;
        this.z = a.a(kq2Var);
        final int i = 0;
        this.A = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                iu4 iu4Var = this.b;
                switch (i2) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i2 = 1;
        this.C = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i3 = 2;
        this.D = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i4 = 3;
        this.E = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i5 = 4;
        this.F = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i6 = 5;
        this.G = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i6;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i7 = 6;
        this.H = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i7;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
        final int i8 = 7;
        this.I = a.a(new sls(this) { // from class: gu4
            public final /* synthetic */ iu4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i8;
                iu4 iu4Var = this.b;
                switch (i22) {
                    case 0:
                        return new dsf0(iu4Var.a, iu4Var.b, iu4Var.o);
                    case 1:
                        return new bzs("suggest_banners", iu4Var.a, iu4Var.b);
                    case 2:
                        return new ir4(iu4Var.a);
                    case 3:
                        return new ru.yandex.taxi.banners.data.remote.a(iu4Var.a, iu4Var.o);
                    case 4:
                        ru.yandex.taxi.communications.c cVar3 = iu4Var.v;
                        wnt wntVar2 = iu4Var.b;
                        Context context2 = iu4Var.a;
                        return new ru.yandex.taxi.banners.cache.a(new b(cVar3, wntVar2, context2), iu4Var.a(), new fb7(context2), iu4Var.o);
                    case 5:
                        return new h(iu4Var.c, iu4Var.g, iu4Var.e, iu4Var.f, (dsf0) iu4Var.A.getValue(), (g) iu4Var.H.getValue(), (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (e) iu4Var.J.getValue(), (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.t, iu4Var.m, iu4Var.o, iu4Var.a, new usf0(iu4Var.s.a), new at4(iu4Var.a()), (puc) iu4Var.B.getValue(), iu4Var.w);
                    case 6:
                        return new g((dsf0) iu4Var.A.getValue(), iu4Var.g, (ru.yandex.taxi.banners.model.d) iu4Var.I.getValue(), (bzs) iu4Var.C.getValue(), iu4Var.t);
                    default:
                        return new ru.yandex.taxi.banners.model.d(iu4Var.a, iu4Var.o, (e) iu4Var.J.getValue(), iu4Var.m, iu4Var.a.getApplicationContext().getResources().getDisplayMetrics().densityDpi, (dsf0) iu4Var.A.getValue(), iu4Var.h, iu4Var.i, iu4Var.n, iu4Var.t, (ru.yandex.taxi.banners.cache.a) iu4Var.F.getValue(), iu4Var.a(), iu4Var.d, new at4(iu4Var.a()), (pav) iu4Var.z.getValue(), (ru.yandex.taxi.banners.data.remote.a) iu4Var.E.getValue(), iu4Var.u, (puc) iu4Var.B.getValue(), iu4Var.x);
                }
            }
        });
    }

    public final ir4 a() {
        return (ir4) this.D.getValue();
    }

    public final h b() {
        return (h) this.G.getValue();
    }
}
