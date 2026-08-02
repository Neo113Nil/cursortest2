package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.donut.DonutLevel;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.pdd0;
import xsna.q630;
import xsna.ty6;
import xsna.xcd0;

/* compiled from: PrivacyEditDonutLevelsView.kt */
/* loaded from: classes18.dex */
public final class tdd0 extends i6v0<udd0, xcd0> {

    /* compiled from: PrivacyEditDonutLevelsView.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<xcd0, s3q0> b;
        public final /* synthetic */ DonutLevel c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super xcd0, s3q0> izsVar, DonutLevel donutLevel) {
            this.b = izsVar;
            this.c = donutLevel;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new xcd0.c(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: PrivacyEditDonutLevelsView.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ izs<xcd0, s3q0> b;
        public final /* synthetic */ DonutLevel c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super xcd0, s3q0> izsVar, DonutLevel donutLevel) {
            this.b = izsVar;
            this.c = donutLevel;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new xcd0.c(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public c(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ mtk0 d;

        public d(List list, izs izsVar, mtk0 mtk0Var) {
            this.b = list;
            this.c = izsVar;
            this.d = mtk0Var;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            boolean z;
            String O;
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
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                DonutLevel donutLevel = (DonutLevel) this.b.get(intValue);
                aVar2.K(-2015375484);
                int i2 = donutLevel.b;
                int i3 = donutLevel.d;
                int i4 = DonutLevel.f.b;
                q630.a aVar3 = q630.a.a;
                Object obj = a.C0011a.a;
                mtk0 mtk0Var = this.d;
                izs izsVar = this.c;
                if (i2 == i4) {
                    aVar2.K(-2015357412);
                    z = ((DonutLevel) mtk0Var.getValue()).b == i2;
                    String N = d370.N(R.string.donut_all_dons_level, 0, aVar2);
                    boolean J = aVar2.J(izsVar) | aVar2.y(donutLevel);
                    Object x = aVar2.x();
                    if (J || x == obj) {
                        x = new a(izsVar, donutLevel);
                        aVar2.R(x);
                    }
                    afv0.b(z, N, (gzs) x, ahn.E(aVar3, "PrivacyVideoForDonutsAllSelector"), null, false, aVar2, 3072, 112);
                    aVar2.j();
                } else {
                    aVar2.K(-2014872882);
                    z = ((DonutLevel) mtk0Var.getValue()).b == i2;
                    String str = donutLevel.c;
                    if (donutLevel.e) {
                        aVar2.K(-619173140);
                        O = d370.O(R.string.donut_level_price_format, new Object[]{Integer.valueOf(i3)}, aVar2);
                        aVar2.j();
                    } else {
                        aVar2.K(-619178635);
                        O = d370.O(R.string.donut_level_price_and_higher_format, new Object[]{Integer.valueOf(i3)}, aVar2);
                        aVar2.j();
                    }
                    String str2 = O;
                    q630 E = ahn.E(aVar3, "PrivacyVideoForDonutsTitleLevel");
                    boolean J2 = aVar2.J(izsVar) | aVar2.y(donutLevel);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == obj) {
                        x2 = new b(izsVar, donutLevel);
                        aVar2.R(x2);
                    }
                    afv0.b(z, str, (gzs) x2, E, str2, false, aVar2, 3072, 96);
                    aVar2.j();
                }
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

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((udd0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(izs<? super xcd0, s3q0> izsVar, pdd0.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1667595691);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(aVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1667595691, i2, -1, "com.vk.donut.privacy.levels.PrivacyEditDonutLevelsView.ContentView (PrivacyEditDonutLevelsView.kt:80)");
            }
            wh50 c2 = jk50.c(aVar.a, M);
            wh50 c3 = jk50.c(aVar.b, M);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c4 = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c4, cri.a.d);
            float f = 16;
            jqu0.a(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            f9t.e(txj0.f(txj0.h(aVar3, f), 1.0f), M, 6);
            q630 E = ahn.E(txj0.d(aVar3, 1.0f), "PrivacyVideoForDonutsLevels");
            ty6.a aVar5 = dt1.a.o;
            boolean J = M.J(c2) | M.J(c3) | ((i2 & 14) == 4);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new cp9(c2, izsVar, c3, 4);
                M.R(x);
            }
            M = M;
            lqy.a(E, null, null, null, aVar5, null, false, null, (izs) x, M, 196614, 478);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qet(this, izsVar, aVar, i, 2);
        }
    }

    public final void i(final udd0 udd0Var, final izs<? super xcd0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1026259543);
        int i2 = i | (M.J(udd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1026259543, i2, -1, "com.vk.donut.privacy.levels.PrivacyEditDonutLevelsView.ThemedContent (PrivacyEditDonutLevelsView.kt:44)");
            }
            jai c2 = kai.c(-262201954, new com.vk.movika.tools.controls.seekbar.t(izsVar, 11), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(null, c2, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1435946573, new yzs() { // from class: xsna.sdd0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1435946573, intValue, -1, "com.vk.donut.privacy.levels.PrivacyEditDonutLevelsView.ThemedContent.<anonymous> (PrivacyEditDonutLevelsView.kt:66)");
                        }
                        pdd0.b bVar = pdd0.b.a;
                        n0u0[] n0u0VarArr = {udd0Var.a};
                        tdd0 tdd0Var = tdd0.this;
                        wh50 d2 = tdd0Var.d(bVar, n0u0VarArr, aVar3, 518);
                        pdd0 pdd0Var = (pdd0) d2.getValue();
                        if (pdd0Var instanceof pdd0.a) {
                            aVar3.K(-409899229);
                            tdd0Var.h(izsVar, (pdd0.a) ((pdd0) d2.getValue()), aVar3, 512);
                            aVar3.j();
                        } else {
                            if (!epx.f(pdd0Var, bVar)) {
                                throw alb0.c(-1260150766, aVar3);
                            }
                            aVar3.K(-1260143433);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ar0(i, 9, this, udd0Var, izsVar);
        }
    }
}
