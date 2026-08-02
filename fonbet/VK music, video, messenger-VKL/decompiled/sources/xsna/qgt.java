package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.o9t;
import xsna.q630;
import xsna.qgt;
import xsna.udt;
import xsna.x9k0;

/* compiled from: GamesWithBadgesHorizontalList.kt */
/* loaded from: classes17.dex */
public final class qgt {

    /* compiled from: GamesWithBadgesHorizontalList.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<o9t, s3q0> b;
        public final /* synthetic */ h8t c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super o9t, s3q0> izsVar, h8t h8tVar) {
            this.b = izsVar;
            this.c = h8tVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new o9t.b(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: GamesWithBadgesHorizontalList.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ izs<o9t, s3q0> b;
        public final /* synthetic */ h8t c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super o9t, s3q0> izsVar, h8t h8tVar) {
            this.b = izsVar;
            this.c = h8tVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new o9t.a(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ whd b;
        public final /* synthetic */ wow c;

        public c(whd whdVar, wow wowVar) {
            this.b = whdVar;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public d(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ int c;
        public final /* synthetic */ izs d;
        public final /* synthetic */ udt.h e;
        public final /* synthetic */ rha f;
        public final /* synthetic */ xvy g;
        public final /* synthetic */ xvy h;
        public final /* synthetic */ boolean i;

        public e(wow wowVar, int i, izs izsVar, udt.h hVar, rha rhaVar, xvy xvyVar, xvy xvyVar2, boolean z) {
            this.b = wowVar;
            this.c = i;
            this.d = izsVar;
            this.e = hVar;
            this.f = rhaVar;
            this.g = xvyVar;
            this.h = xvyVar2;
            this.i = z;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            boolean z = true;
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                h8t h8tVar = (h8t) this.b.b.get(intValue);
                aVar2.K(231892080);
                int i2 = this.c;
                boolean o = aVar2.o(i2);
                if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z2 = o | z;
                Object x = aVar2.x();
                Object obj = a.C0011a.a;
                if (z2 || x == obj) {
                    x = "gameItem_" + i2 + '_' + intValue;
                    aVar2.R(x);
                }
                udt.h hVar = this.e;
                i8t i8tVar = new i8t(intValue, 0, hVar.d);
                q630 E = ahn.E(q630.a.a, (String) x);
                rha rhaVar = this.f;
                boolean z3 = rhaVar.b;
                String b = hVar.b();
                float f = rhaVar.c;
                izs izsVar = this.d;
                boolean J = aVar2.J(izsVar) | aVar2.J(h8tVar);
                Object x2 = aVar2.x();
                if (J || x2 == obj) {
                    x2 = new a(izsVar, h8tVar);
                    aVar2.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean J2 = aVar2.J(izsVar) | aVar2.J(h8tVar);
                Object x3 = aVar2.x();
                if (J2 || x3 == obj) {
                    x3 = new b(izsVar, h8tVar);
                    aVar2.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                if (z3) {
                    E = vbh0.g(E, this.g, this.h, this.i, f, b, gzsVar, gzsVar2, 8);
                } else {
                    float f2 = vbh0.a;
                }
                o7t.e(h8tVar, this.d, i8tVar, this.f, E, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(final udt.h hVar, final izs<? super o9t, s3q0> izsVar, final boolean z, final xvy xvyVar, final rha rhaVar, q630 q630Var, final int i, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        xvy xvyVar2;
        tpr tprVar;
        a.C0011a.C0012a c0012a;
        final xvy xvyVar3;
        int i5;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-109101058);
        int i6 = i2 | (M.J(hVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(rhaVar) ? 16384 : 8192);
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 = i6 | 196608;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i4 = i6 | (M.J(q630Var2) ? 131072 : 65536);
        }
        int i8 = i4 | (M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i8 & 1, (i8 & 599187) != 599186)) {
            q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-109101058, i8, -1, "com.vk.games.presentation.components.sections.GamesWithBadgesHorizontalList (GamesWithBadgesHorizontalList.kt:32)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new xvy(0, 3, 0);
                M.R(x);
            }
            xvy xvyVar4 = (xvy) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-46236736, 6, -1, "com.vk.games.presentation.utils.rememberInnerFlingBehavior (FlingBehavior.kt:12)");
            }
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = bbk0.b(new dgm(xvyVar4, 7));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = bbk0.b(new cfl(xvyVar4, 8));
                M.R(x3);
            }
            mtk0 mtk0Var2 = (mtk0) x3;
            if (((Boolean) mtk0Var.getValue()).booleanValue() || ((Boolean) mtk0Var2.getValue()).booleanValue()) {
                xvyVar2 = xvyVar4;
                M.K(-1483806001);
                M.j();
                tprVar = r270.a;
            } else {
                M.K(-1483805290);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-338621290, 6, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:116)");
                }
                Object x4 = M.x();
                if (x4 == c0012a2) {
                    x4 = new qvy(xvyVar4, x9k0.a.a);
                    M.R(x4);
                }
                v9k0 v9k0Var = (v9k0) x4;
                float f = r9k0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1921733134, 0, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
                }
                azl azlVar = (azl) M.r(uvi.h);
                l7l a2 = ilk0.a(M);
                boolean J = M.J(azlVar) | M.J(v9k0Var) | M.J(a2);
                Object x5 = M.x();
                if (J || x5 == c0012a2) {
                    xvyVar2 = xvyVar4;
                    x5 = new m9k0(v9k0Var, a2, jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5));
                    M.R(x5);
                } else {
                    xvyVar2 = xvyVar4;
                }
                tprVar = (h4o0) x5;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (rhaVar.b) {
                c0012a = c0012a2;
                aVar2 = M;
                xvyVar3 = xvyVar2;
                i5 = 16384;
                z2 = false;
                aVar2.K(1059484388);
            } else {
                M.K(1061169083);
                List f2 = hVar.f();
                boolean z3 = (i8 & 112) == 32;
                Object x6 = M.x();
                if (z3 || x6 == c0012a2) {
                    z2 = false;
                    x6 = new ngt(izsVar, 0);
                    M.R(x6);
                } else {
                    z2 = false;
                }
                izs izsVar2 = (izs) x6;
                c0012a = c0012a2;
                xvy xvyVar5 = xvyVar2;
                i5 = 16384;
                vbh0.b((i8 & 896) | 6, M, f2, izsVar2, xvyVar5, z);
                xvyVar3 = xvyVar5;
                aVar2 = M;
            }
            aVar2.j();
            float f3 = kqu0.u;
            u890 n = s200.n(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            q630 E = ahn.E(q630Var4, "horizontalItemList");
            boolean z4 = ((57344 & i8) == i5 ? true : z2) | ((i8 & 14) == 4 ? true : z2) | ((3670016 & i8) == 1048576 ? true : z2) | ((i8 & 112) == 32 ? true : z2) | ((i8 & 7168) == 2048 ? true : z2) | ((i8 & 896) != 256 ? z2 : true);
            Object x7 = aVar2.x();
            if (z4 || x7 == c0012a) {
                izs izsVar3 = new izs() { // from class: xsna.ogt
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        udt.h hVar2 = udt.h.this;
                        List f4 = hVar2.f();
                        wow wowVar = new wow(f4);
                        rha rhaVar2 = rhaVar;
                        whd whdVar = rhaVar2.a ? new whd(2) : null;
                        nvyVar.e(f4.size(), whdVar != null ? new qgt.c(whdVar, wowVar) : null, new qgt.d(wowVar), new jai(2039820996, new qgt.e(wowVar, i, izsVar, hVar2, rhaVar2, xvyVar, xvyVar3, z), true));
                        return s3q0.a;
                    }
                };
                aVar2.R(izsVar3);
                x7 = izsVar3;
            }
            lqy.b(E, xvyVar3, n, null, null, tprVar, false, null, (izs) x7, aVar2, 48, 440);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(izsVar, z, xvyVar, rhaVar, q630Var3, i, i2, i3) { // from class: xsna.pgt
                public final /* synthetic */ izs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ rha f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ int h;
                public final /* synthetic */ int i;

                {
                    this.i = i3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    qgt.a(udt.h.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I, this.i);
                    return s3q0.a;
                }
            };
        }
    }
}
