package defpackage;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableSet;
import com.squareup.moshi.Moshi;
import com.ybsdk.api.e;
import com.ybsdk.common.domain.d;
import com.ybsdk.common.repositiories.supportchat.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.di.modules.features.f;
import com.ybsdk.di.modules.features.g;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.common.c;

/* loaded from: classes3.dex */
public final class ayf implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ ayf(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                h9g h9gVar = (h9g) tw51Var;
                fjg fjgVar = h9gVar.b;
                x8g x8gVar = h9gVar.v;
                return new ajg((wt51) x8gVar.W.get(), (b) x8gVar.A.get(), (ut51) x8gVar.W0.get());
            case 1:
                return ((h9g) tw51Var).g();
            case 2:
                h9g h9gVar2 = (h9g) tw51Var;
                fjg fjgVar2 = h9gVar2.b;
                return new f((c) h9gVar2.I0.get());
            case 3:
                h9g h9gVar3 = (h9g) tw51Var;
                fjg fjgVar3 = h9gVar3.b;
                return new g(new d((a) h9gVar3.v.S1.get()));
            case 4:
                h9g h9gVar4 = (h9g) tw51Var;
                fjg fjgVar4 = h9gVar4.b;
                return new gly0((com.ybsdk.common.repositiories.auth.f) h9gVar4.v.G.get());
            case 5:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 6:
                zon zonVar = (zon) ((h9g) tw51Var).m0.get();
                q5z.h(zonVar);
                return zonVar;
            case 7:
                return ((h9g) tw51Var).j();
            case 8:
                fdr fdrVar = (fdr) ((h9g) tw51Var).D0.get();
                q5z.h(fdrVar);
                return fdrVar;
            case 9:
                h9g h9gVar5 = (h9g) tw51Var;
                fjg fjgVar5 = h9gVar5.b;
                return new com.ybsdk.di.modules.features.d((com.ybsdk.common.repositiories.user.a) h9gVar5.v.F.get());
            case 10:
                tvv tvvVar = (tvv) ((h9g) tw51Var).v.U.get();
                q5z.h(tvvVar);
                return tvvVar;
            case 11:
                n860 n860Var = (n860) ((h9g) tw51Var).B0.get();
                q5z.h(n860Var);
                return n860Var;
            case 12:
                h9g h9gVar6 = (h9g) tw51Var;
                fjg fjgVar6 = h9gVar6.b;
                return new tv3((b) h9gVar6.v.A.get());
            case 13:
                awa0 awa0Var = (awa0) ((h9g) tw51Var).v.w0.get();
                q5z.h(awa0Var);
                return awa0Var;
            case 14:
                return ((h9g) tw51Var).o();
            case 15:
                return ((h9g) tw51Var).p();
            case 16:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 17:
                com.ybsdk.core.common.data.cache.b bVar = (com.ybsdk.core.common.data.cache.b) ((h9g) tw51Var).B.get();
                q5z.h(bVar);
                return bVar;
            case 18:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 19:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 20:
                h9g h9gVar7 = (h9g) tw51Var;
                fjg fjgVar7 = h9gVar7.b;
                return new djg(h9gVar7.v.e);
            case 21:
                h9g h9gVar8 = (h9g) tw51Var;
                fjg fjgVar8 = h9gVar8.b;
                return new ejg(h9gVar8.c, 0);
            case 22:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 23:
                ppp0 ppp0Var = (ppp0) ((h9g) tw51Var).v.w.get();
                q5z.h(ppp0Var);
                return ppp0Var;
            case 24:
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                return d;
            case 25:
                r0h r0hVar = (r0h) ((h9g) tw51Var).D1.get();
                q5z.h(r0hVar);
                return r0hVar;
            case 26:
                ((h9g) tw51Var).getClass();
                return new m501(18);
            case 27:
                a3h a3hVar = (a3h) ((h9g) tw51Var).v.T0.get();
                q5z.h(a3hVar);
                return a3hVar;
            case 28:
                h9g h9gVar9 = (h9g) tw51Var;
                h9gVar9.getClass();
                return new zgf(16, new u470((b) h9gVar9.v.A.get()));
            default:
                h9g h9gVar10 = (h9g) tw51Var;
                k6v k6vVar = h9gVar10.o;
                int i3 = 1;
                j6v j6vVar = new j6v(h9gVar10.c(), i3);
                j6v j6vVar2 = new j6v(h9gVar10.c(), i2);
                uu01 uu01Var = h9gVar10.j;
                m2h m2hVar = new m2h((ccf) h9gVar10.w1.get());
                n2h n2hVar = h9gVar10.p;
                x8g x8gVar2 = h9gVar10.v;
                ContextThemeWrapper contextThemeWrapper = x8gVar2.a;
                int i4 = 2;
                v1h v1hVar = new v1h(contextThemeWrapper, 2);
                s1h s1hVar = new s1h(3, (com.ybsdk.di.modules.features.nfc.a) h9gVar10.w0.get(), (tfl0) h9gVar10.S.get());
                e2h e2hVar = new e2h(z0s0.e(h9gVar10), 20);
                e2h e2hVar2 = new e2h(z0s0.e(h9gVar10), 24);
                z1h z1hVar = new z1h((tcm0) h9gVar10.k1.get(), i4);
                z1h z1hVar2 = new z1h((tcm0) h9gVar10.k1.get(), i3);
                l1h l1hVar = new l1h(i4, tl3.a(h9gVar10));
                h2h h2hVar = new h2h(vqa0.e(h9gVar10), 1);
                h2h h2hVar2 = new h2h(vqa0.e(h9gVar10), 2);
                u1h u1hVar = new u1h((com.ybsdk.screens.registration.a) h9gVar10.R.get(), 1);
                d2h d2hVar = new d2h(n2hVar, (b) x8gVar2.A.get(), new com.ybsdk.screens.notice.presentation.b(h9gVar10.C()), flx0.a(uu01Var, h9gVar10));
                e2h e2hVar3 = new e2h(jde0.e(h9gVar10), 9);
                kh90 kh90Var = h9gVar10.k;
                e2h e2hVar4 = new e2h(g680.a(kh90Var, h9gVar10), 3);
                e2h e2hVar5 = new e2h(g680.a(kh90Var, h9gVar10), 2);
                e2h e2hVar6 = new e2h(g680.a(kh90Var, h9gVar10), 1);
                m2h m2hVar2 = new m2h((ccf) h9gVar10.w1.get(), flx0.a(uu01Var, h9gVar10));
                e2h e2hVar7 = new e2h(flx0.a(uu01Var, h9gVar10), 21);
                htt0 htt0Var = h9gVar10.q;
                k2h k2hVar = new k2h(cys0.a(htt0Var, h9gVar10), 0);
                k2h k2hVar2 = new k2h(cys0.a(htt0Var, h9gVar10), 2);
                k2h k2hVar3 = new k2h(cys0.a(htt0Var, h9gVar10), 1);
                m1h m1hVar = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 5);
                l1h l1hVar2 = new l1h(18, (AppAnalyticsReporter) x8gVar2.q.get());
                x1h x1hVar = new x1h(1, (f5o) x8gVar2.U1.get(), (kbo) h9gVar10.h1.get(), (w4o) x8gVar2.i.get());
                l1h l1hVar3 = new l1h(5, (kbo) h9gVar10.h1.get());
                l2h l2hVar = new l2h((vf01) h9gVar10.y0.get(), 0);
                o1h o1hVar = new o1h((AppAnalyticsReporter) x8gVar2.q.get(), (b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 0);
                f2h f2hVar = new f2h((np41) h9gVar10.M.get(), 0);
                s1h s1hVar2 = new s1h((tfl0) h9gVar10.S.get(), (AppAnalyticsReporter) x8gVar2.q.get(), 1);
                l1h l1hVar4 = new l1h(4, (tfl0) h9gVar10.S.get());
                h5c h5cVar = new h5c((e) x8gVar2.p1.get(), (com.ybsdk.common.e) x8gVar2.T.get(), contextThemeWrapper);
                kg51 kg51Var = x8gVar2.e;
                s1h s1hVar3 = new s1h(h5cVar, kg51Var, (tfl0) h9gVar10.S.get(), h9gVar10.l(), 2);
                FragmentActivity fragmentActivity = h9gVar10.d;
                x1h x1hVar2 = new x1h(fragmentActivity, h9gVar10.E, jpf0.a(h9gVar10.m, h9gVar10), (AppAnalyticsReporter) x8gVar2.q.get());
                v1h v1hVar2 = new v1h(contextThemeWrapper, 0);
                l1h l1hVar5 = new l1h(9, (com.ybsdk.core.utils.ext.d) h9gVar10.z1.get());
                j2h j2hVar = new j2h(fragmentActivity, 0);
                CardFeatureModule cardFeatureModule = h9gVar10.h;
                r1h r1hVar = new r1h(dx7.a(cardFeatureModule, h9gVar10), 3);
                s1h s1hVar4 = new s1h(0, (AppAnalyticsReporter) x8gVar2.q.get(), dx7.a(cardFeatureModule, h9gVar10));
                m1h m1hVar2 = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 2);
                fjg fjgVar9 = h9gVar10.b;
                int i5 = 0;
                x1h x1hVar3 = new x1h(i5, (b) x8gVar2.A.get(), h9gVar10.g(), wif.a(fjgVar9, h9gVar10));
                y1h y1hVar = new y1h(wif.a(fjgVar9, h9gVar10), i5);
                int i6 = 1;
                y1h y1hVar2 = new y1h(wif.a(fjgVar9, h9gVar10), i6);
                c2h c2hVar = new c2h((p400) h9gVar10.N0.get(), i6);
                fj3 fj3Var = (fj3) x8gVar2.e.c.invoke(h9gVar10);
                q5z.i(fj3Var);
                q1h q1hVar = new q1h((di51) x8gVar2.l.get(), (j3h) h9gVar10.E.get(), new u470((b) x8gVar2.A.get()), (tfl0) h9gVar10.S.get(), kg51Var, fj3Var, h9gVar10.l());
                f2h f2hVar2 = new f2h((np41) h9gVar10.M.get(), 1);
                m1h m1hVar3 = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 4);
                l1h l1hVar6 = new l1h(13, m7q0.f(h9gVar10));
                l1h l1hVar7 = new l1h(0, p4.a(h9gVar10.e, h9gVar10));
                m1h m1hVar4 = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 1);
                m1h m1hVar5 = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 0);
                s1h s1hVar5 = new s1h(10, jde0.d(h9gVar10), (b) x8gVar2.A.get());
                w1h w1hVar = new w1h((nvd) x8gVar2.Q1.get(), 1);
                l1h l1hVar8 = new l1h(16, jde0.d(h9gVar10));
                int i7 = 1;
                n1h n1hVar = new n1h(i7, (ii01) h9gVar10.l1.get());
                l1h l1hVar9 = new l1h(i7, (r90) h9gVar10.x0.get());
                w1h w1hVar2 = new w1h((nvd) x8gVar2.Q1.get(), 0);
                r1h r1hVar2 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 4);
                s1h s1hVar6 = new s1h(13, (AppAnalyticsReporter) x8gVar2.q.get(), h9gVar10.l());
                s1h s1hVar7 = new s1h(12, (AppAnalyticsReporter) x8gVar2.q.get(), (com.ybsdk.screens.registration.a) h9gVar10.R.get());
                n1h n1hVar2 = new n1h(0, (ik) h9gVar10.a1.get());
                s1h s1hVar8 = new s1h(5, contextThemeWrapper, h9gVar10.E);
                v1h v1hVar3 = new v1h(contextThemeWrapper, 1);
                z1h z1hVar3 = new z1h((tcm0) h9gVar10.k1.get(), 10);
                r1h r1hVar3 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 2);
                r1h r1hVar4 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 11);
                r1h r1hVar5 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 1);
                t1h t1hVar = new t1h((b) x8gVar2.A.get(), (j3h) h9gVar10.E.get(), (r39) h9gVar10.f1.get(), 1);
                t1h t1hVar2 = new t1h((b) x8gVar2.A.get(), (j3h) h9gVar10.E.get(), (r39) h9gVar10.f1.get(), 0);
                n1h n1hVar3 = new n1h(2, tl3.a(h9gVar10));
                n1h n1hVar4 = new n1h(4, tl3.a(h9gVar10));
                n1h n1hVar5 = new n1h(3, tl3.a(h9gVar10));
                e2h e2hVar8 = new e2h(tl3.a(h9gVar10), 10);
                n1h n1hVar6 = new n1h(6, n2y0.c(h9gVar10));
                n1h n1hVar7 = new n1h(5, n2y0.c(h9gVar10));
                r1h r1hVar6 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 0);
                r1h r1hVar7 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 5);
                n1h n1hVar8 = new n1h(18, p6f.d(h9gVar10));
                n1h n1hVar9 = new n1h(28, p6f.d(h9gVar10));
                n1h n1hVar10 = new n1h(19, p6f.d(h9gVar10));
                n1h n1hVar11 = new n1h(7, p6f.d(h9gVar10));
                e2h e2hVar9 = new e2h(flx0.a(uu01Var, h9gVar10), 22);
                e2h e2hVar10 = new e2h(flx0.a(uu01Var, h9gVar10), 23);
                z1h z1hVar4 = new z1h((tcm0) h9gVar10.k1.get(), 5);
                z1h z1hVar5 = new z1h((tcm0) h9gVar10.k1.get(), 6);
                z1h z1hVar6 = new z1h((tcm0) h9gVar10.k1.get(), 3);
                z1h z1hVar7 = new z1h((tcm0) h9gVar10.k1.get(), 4);
                z1h z1hVar8 = new z1h((tcm0) h9gVar10.k1.get(), 8);
                z1h z1hVar9 = new z1h((tcm0) h9gVar10.k1.get(), 9);
                z1h z1hVar10 = new z1h((tcm0) h9gVar10.k1.get(), 7);
                l2h l2hVar2 = new l2h((vf01) h9gVar10.y0.get(), 1);
                i2h i2hVar = new i2h();
                m1h m1hVar6 = new m1h((b) x8gVar2.A.get(), h9gVar10.E, (np41) h9gVar10.M.get(), 3);
                u1h u1hVar2 = new u1h((com.ybsdk.screens.registration.a) h9gVar10.R.get(), 0);
                e2h e2hVar11 = new e2h((com.ybsdk.feature.pin.internal.a) h9gVar10.O.get(), 7);
                u1h u1hVar3 = new u1h((com.ybsdk.screens.registration.a) h9gVar10.R.get(), 2);
                u1h u1hVar4 = new u1h((com.ybsdk.screens.registration.a) h9gVar10.R.get(), 3);
                x1h x1hVar4 = new x1h(3, h9gVar10.E, (np41) h9gVar10.M.get(), h9gVar10.c);
                j2h j2hVar2 = new j2h(fragmentActivity, 1);
                mu31 mu31Var = h9gVar10.g;
                com.ybsdk.di.modules.d dVar = new com.ybsdk.di.modules.d(1, mu31Var, fragmentActivity);
                p1h p1hVar = new p1h(k1w.a(h9gVar10), 2);
                p1h p1hVar2 = new p1h(k1w.a(h9gVar10), 1);
                p1h p1hVar3 = new p1h(k1w.a(h9gVar10), 0);
                p1h p1hVar4 = new p1h(k1w.a(h9gVar10), 3);
                tfl0 tfl0Var = (tfl0) h9gVar10.S.get();
                fk3 fk3Var = (fk3) x8gVar2.c0.get();
                fj3 fj3Var2 = (fj3) x8gVar2.e.c.invoke(h9gVar10);
                q5z.i(fj3Var2);
                x1h x1hVar5 = new x1h(fk3Var, tfl0Var, kg51Var, fj3Var2, h9gVar10.l());
                h2h h2hVar3 = new h2h(vqa0.e(h9gVar10), 0);
                l1h l1hVar10 = new l1h(14, (b7g0) h9gVar10.M0.get());
                l1h l1hVar11 = new l1h(3, (com.ybsdk.core.common.data.cache.b) h9gVar10.B.get());
                int i8 = 1;
                com.ybsdk.di.modules.a aVar = new com.ybsdk.di.modules.a(i8, (nbp0) x8gVar2.u.get(), (Moshi) x8gVar2.k.get(), (com.ybsdk.core.common.data.cache.b) h9gVar10.B.get());
                b2h b2hVar = new b2h((gnx) h9gVar10.g1.get(), i8);
                b2h b2hVar2 = new b2h((gnx) h9gVar10.g1.get(), 0);
                e2h e2hVar12 = new e2h((qa60) h9gVar10.c0.get(), 14);
                e2h e2hVar13 = new e2h((qa60) h9gVar10.c0.get(), 18);
                e2h e2hVar14 = new e2h((qa60) h9gVar10.c0.get(), 15);
                e2h e2hVar15 = new e2h((qa60) h9gVar10.c0.get(), 19);
                e2h e2hVar16 = new e2h((qa60) h9gVar10.c0.get(), 16);
                e2h e2hVar17 = new e2h((qa60) h9gVar10.c0.get(), 13);
                e2h e2hVar18 = new e2h((qa60) h9gVar10.c0.get(), 17);
                c2h c2hVar2 = new c2h((p400) h9gVar10.N0.get(), 4);
                r1h r1hVar8 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 7);
                r1h r1hVar9 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 6);
                r1h r1hVar10 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 8);
                c2h c2hVar3 = new c2h((p400) h9gVar10.N0.get(), 2);
                c2h c2hVar4 = new c2h((p400) h9gVar10.N0.get(), 3);
                l1h l1hVar12 = new l1h(11, mam0.a(h9gVar10.r, h9gVar10));
                c2h c2hVar5 = new c2h((p400) h9gVar10.N0.get(), 0);
                l1h l1hVar13 = new l1h(17, flx0.a(uu01Var, h9gVar10));
                e2h e2hVar19 = new e2h(flx0.a(uu01Var, h9gVar10), 12);
                e2h e2hVar20 = new e2h(flx0.a(uu01Var, h9gVar10), 0);
                n1h n1hVar12 = new n1h(29, flx0.a(uu01Var, h9gVar10));
                n1h n1hVar13 = new n1h(22, flx0.a(uu01Var, h9gVar10));
                n1h n1hVar14 = new n1h(23, flx0.a(uu01Var, h9gVar10));
                n1h n1hVar15 = new n1h(9, flx0.a(uu01Var, h9gVar10));
                n1h n1hVar16 = new n1h(8, flx0.a(uu01Var, h9gVar10));
                n1h n1hVar17 = new n1h(10, flx0.a(uu01Var, h9gVar10));
                com.ybsdk.di.modules.a aVar2 = new com.ybsdk.di.modules.a(0, fragmentActivity, x8gVar2.a, h9gVar10.E);
                e2h e2hVar21 = new e2h(flx0.a(uu01Var, h9gVar10), 6);
                e2h e2hVar22 = new e2h(flx0.a(uu01Var, h9gVar10), 11);
                s1h s1hVar9 = new s1h(7, (j3h) h9gVar10.E.get(), new u470((b) x8gVar2.A.get()));
                l1h l1hVar14 = new l1h(8, (com.ybsdk.screens.initial.deeplink.b) h9gVar10.A1.get());
                l1h l1hVar15 = new l1h(19, new tfs0(x8gVar2.a, fragmentActivity, (np41) h9gVar10.M.get(), (b) x8gVar2.A.get(), (j3h) h9gVar10.E.get(), (AppAnalyticsReporter) x8gVar2.q.get(), h9gVar10.E, (c) h9gVar10.I0.get(), (AppAnalyticsReporter) x8gVar2.q.get()));
                s1h s1hVar10 = new s1h(4, (tu4) h9gVar10.l0.get(), fragmentActivity);
                ContextThemeWrapper contextThemeWrapper2 = x8gVar2.a;
                lhk lhkVar = (lhk) h9gVar10.B1.a;
                bhk bhkVar = (bhk) h9gVar10.u0.get();
                o1h o1hVar2 = new o1h(contextThemeWrapper2, fragmentActivity, bhkVar, lhkVar, 1);
                gsl gslVar = h9gVar10.a;
                a2h a2hVar = new a2h(oti.a(gslVar, h9gVar10), 1);
                a2h a2hVar2 = new a2h(oti.a(gslVar, h9gVar10), 0);
                s1h s1hVar11 = new s1h((Moshi) x8gVar2.k.get(), (AppAnalyticsReporter) x8gVar2.q.get(), 11);
                l1h l1hVar16 = new l1h(12, (ot11) h9gVar10.C1.get());
                n1h n1hVar18 = new n1h(24, flx0.a(uu01Var, h9gVar10));
                s1h s1hVar12 = new s1h(16, (p400) h9gVar10.N0.get(), fragmentActivity);
                n1h n1hVar19 = new n1h(20, flx0.a(uu01Var, h9gVar10));
                s1h s1hVar13 = new s1h(6, x8gVar2.a(), h9gVar10.E);
                l2h l2hVar3 = new l2h((vf01) h9gVar10.y0.get(), 2);
                s1h s1hVar14 = new s1h(9, (b) x8gVar2.A.get(), vqa0.f(h9gVar10));
                s1h s1hVar15 = new s1h(vqa0.f(h9gVar10), x8gVar2.a, fragmentActivity);
                z1h z1hVar11 = new z1h((tcm0) h9gVar10.k1.get(), 0);
                l1h l1hVar17 = new l1h(15, h9gVar10.l());
                s1h s1hVar16 = new s1h(14, (b) x8gVar2.A.get(), cys0.b(h9gVar10.s, h9gVar10));
                d2h d2hVar2 = new d2h((b) x8gVar2.A.get(), flx0.a(uu01Var, h9gVar10), 3);
                n1h n1hVar20 = new n1h(27, br10.a(h9gVar10));
                n1h n1hVar21 = new n1h(16, ig7.a(h9gVar10));
                com.ybsdk.di.modules.d dVar2 = new com.ybsdk.di.modules.d(2, (nbp0) x8gVar2.u.get(), (g3d0) h9gVar10.E0.get());
                e2h e2hVar23 = new e2h((g3d0) h9gVar10.E0.get(), 8);
                n1h n1hVar22 = new n1h(25, mvy.d(h9gVar10));
                n1h n1hVar23 = new n1h(26, mvy.d(h9gVar10));
                d2h d2hVar3 = new d2h((b) x8gVar2.A.get(), mvy.d(h9gVar10), 0);
                n1h n1hVar24 = new n1h(21, c4p.a(h9gVar10.t, h9gVar10));
                r1h r1hVar11 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 9);
                r1h r1hVar12 = new r1h(dx7.a(cardFeatureModule, h9gVar10), 10);
                g2h g2hVar = new g2h((g5f0) x8gVar2.P0.get(), 0);
                ContextThemeWrapper contextThemeWrapper3 = x8gVar2.a;
                lhk lhkVar2 = (lhk) h9gVar10.B1.a;
                x1h x1hVar6 = new x1h(4, contextThemeWrapper3, fragmentActivity, lhkVar2);
                g2h g2hVar2 = new g2h((g5f0) x8gVar2.P0.get(), 1);
                s1h s1hVar17 = new s1h(wif.a(fjgVar9, h9gVar10), x8gVar2.e, (tfl0) h9gVar10.S.get(), (p400) h9gVar10.N0.get(), 17);
                fj3 fj3Var3 = (fj3) x8gVar2.e.c.invoke(h9gVar10);
                q5z.i(fj3Var3);
                ImmutableSet r2 = ImmutableSet.r(j6vVar, j6vVar2, m2hVar, v1hVar, s1hVar, e2hVar, e2hVar2, z1hVar, z1hVar2, l1hVar, h2hVar, h2hVar2, u1hVar, d2hVar, e2hVar3, e2hVar4, e2hVar5, e2hVar6, m2hVar2, e2hVar7, k2hVar, k2hVar2, k2hVar3, m1hVar, l1hVar2, x1hVar, l1hVar3, l2hVar, o1hVar, f2hVar, s1hVar2, l1hVar4, s1hVar3, x1hVar2, v1hVar2, l1hVar5, j2hVar, r1hVar, s1hVar4, m1hVar2, x1hVar3, y1hVar, y1hVar2, c2hVar, q1hVar, f2hVar2, m1hVar3, l1hVar6, l1hVar7, m1hVar4, m1hVar5, s1hVar5, w1hVar, l1hVar8, n1hVar, l1hVar9, w1hVar2, r1hVar2, s1hVar6, s1hVar7, n1hVar2, s1hVar8, v1hVar3, z1hVar3, r1hVar3, r1hVar4, r1hVar5, t1hVar, t1hVar2, n1hVar3, n1hVar4, n1hVar5, e2hVar8, n1hVar6, n1hVar7, r1hVar6, r1hVar7, n1hVar8, n1hVar9, n1hVar10, n1hVar11, e2hVar9, e2hVar10, z1hVar4, z1hVar5, z1hVar6, z1hVar7, z1hVar8, z1hVar9, z1hVar10, l2hVar2, i2hVar, m1hVar6, u1hVar2, e2hVar11, u1hVar3, u1hVar4, x1hVar4, j2hVar2, dVar, p1hVar, p1hVar2, p1hVar3, p1hVar4, x1hVar5, h2hVar3, l1hVar10, l1hVar11, aVar, b2hVar, b2hVar2, e2hVar12, e2hVar13, e2hVar14, e2hVar15, e2hVar16, e2hVar17, e2hVar18, c2hVar2, r1hVar8, r1hVar9, r1hVar10, c2hVar3, c2hVar4, l1hVar12, c2hVar5, l1hVar13, e2hVar19, e2hVar20, n1hVar12, n1hVar13, n1hVar14, n1hVar15, n1hVar16, n1hVar17, aVar2, e2hVar21, e2hVar22, s1hVar9, l1hVar14, l1hVar15, s1hVar10, o1hVar2, a2hVar, a2hVar2, s1hVar11, l1hVar16, n1hVar18, s1hVar12, n1hVar19, s1hVar13, l2hVar3, s1hVar14, s1hVar15, z1hVar11, l1hVar17, s1hVar16, d2hVar2, n1hVar20, n1hVar21, dVar2, e2hVar23, n1hVar22, n1hVar23, d2hVar3, n1hVar24, r1hVar11, r1hVar12, g2hVar, x1hVar6, g2hVar2, s1hVar17, new e2h(fj3Var3, 25), new l1h(6, (uop0) x8gVar2.W1.get()), new e2h((qwu0) x8gVar2.X1.get(), fragmentActivity), new d2h((b) x8gVar2.A.get(), (twu0) x8gVar2.R1.get(), 1), new l1h(10, (p7g0) h9gVar10.v0.get()), new l1h(7, (e7a0) h9gVar10.o0.get()), new s1h(15, (k1x0) x8gVar2.b0.get(), x8gVar2.a), new e2h(l180.f(h9gVar10), 4), new com.ybsdk.di.modules.d(h9gVar10.a(), mu31Var, fragmentActivity), new n1h(17, h9gVar10.a()), new n1h(13, (r59) h9gVar10.u1.get()), new n1h(15, (r59) h9gVar10.u1.get()), new n1h(14, (r59) h9gVar10.u1.get()), new n1h(11, (r59) h9gVar10.u1.get()), new n1h(12, (r59) h9gVar10.u1.get()), new s1h(18, (np41) h9gVar10.M.get(), (vop0) x8gVar2.H0.get()));
                q5z.h(r2);
                return r2;
        }
    }
}
