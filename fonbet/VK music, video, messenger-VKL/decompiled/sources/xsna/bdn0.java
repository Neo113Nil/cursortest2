package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SuperAppWidgetRedesignV6Holder.kt */
/* loaded from: classes6.dex */
public final class bdn0 extends ucn0<cdn0> {
    public final ComposeView p;

    public bdn0(View view) {
        super(view, null);
        this.p = (ComposeView) this.itemView;
    }

    public static void s6(oio oioVar, float f, float f2) {
        float I0 = oioVar.I0(2);
        long j = l5g.b;
        oio.V1(oioVar, j, f2, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 56);
        oio.V1(oioVar, j, f2 - I0, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f + f2) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        this.p.setContent(new jai(926953307, new cv4(this, 9), true));
    }

    public final void g6(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-214102308);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-214102308, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.AvatarStackSkeleton (SuperAppWidgetRedesignV6Holder.kt:190)");
            }
            final float f = 44;
            final float f2 = 10;
            q630 h = txj0.h(txj0.f(q630Var, 1.0f), f);
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new izs(f, f2, this) { // from class: xsna.adn0
                    public final /* synthetic */ float b;
                    public final /* synthetic */ float c;

                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float I0 = oioVar.I0(this.b);
                        float f3 = 2;
                        float f4 = I0 / f3;
                        float I02 = I0 - oioVar.I0(this.c);
                        bdn0.s6(oioVar, f3 * I02, f4);
                        bdn0.s6(oioVar, I02, f4);
                        bdn0.s6(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x2(this, q630Var, i, 10);
        }
    }

    public final void h6(jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i) {
        jdj0 jdj0Var2;
        androidx.compose.runtime.a M = aVar.M(1236487431);
        int i2 = (M.y(jdj0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1236487431, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.FirstHalfTile (SuperAppWidgetRedesignV6Holder.kt:158)");
            }
            float f = 4;
            jdj0Var2 = jdj0Var;
            q6(jdj0Var2, s200.G(q630.a.a, 16, f, f, f), kai.c(1585219831, new it7(this, 8), M), M, (i2 & 14) | 392 | ((i2 << 6) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jdj0Var2 = jdj0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(this, jdj0Var2, i, 10);
        }
    }

    public final void i6(jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-95925732);
        int i2 = (M.y(jdj0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-95925732, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.FirstRow (SuperAppWidgetRedesignV6Holder.kt:94)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            int i3 = (i2 & 14) | 8;
            int i4 = (i2 & 112) | i3;
            h6(jdj0Var, M, i4);
            o6(jdj0Var, M, i4);
            M.G();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            j6(jdj0Var, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, i3 | ((i2 << 3) & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a73(this, jdj0Var, i, 6);
        }
    }

    public final void j6(jdj0 jdj0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1073722523);
        int i2 = (M.y(jdj0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.y(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1073722523, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.FirstTile (SuperAppWidgetRedesignV6Holder.kt:128)");
            }
            float f = 4;
            q6(jdj0Var, s200.G(q630Var, f, f, 16, f), ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.a, M, (i2 & 14) | 392 | ((i2 << 3) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m3j0(this, jdj0Var, q630Var, i, 1);
        }
    }

    public final void l6(jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i) {
        jdj0 jdj0Var2;
        androidx.compose.runtime.a M = aVar.M(324062061);
        int i2 = (M.y(jdj0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(324062061, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.ScrollStub (SuperAppWidgetRedesignV6Holder.kt:73)");
            }
            float f = 16;
            jdj0Var2 = jdj0Var;
            q6(jdj0Var2, s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 4, 2), kai.c(-1732078211, new l71(this, 8), M), M, (i2 & 14) | 440 | ((i2 << 6) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jdj0Var2 = jdj0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0k(this, jdj0Var2, i, 6);
        }
    }

    public final void m6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1591119511);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1591119511, i, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.ScrollStubItem (SuperAppWidgetRedesignV6Holder.kt:108)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(txj0.v(aVar2, 72), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            akv0.a(SkeletonType.Circle, txj0.q(aVar2, 48), M, 54);
            float f = 12;
            f9t.e(txj0.h(aVar2, f), M, 6);
            akv0.a(SkeletonType.Block, txj0.s(aVar2, 56, f), M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y2(this, i, 7);
        }
    }

    public final void o6(jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i) {
        jdj0 jdj0Var2;
        androidx.compose.runtime.a M = aVar.M(8740071);
        int i2 = (M.y(jdj0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(8740071, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.SecondHalfTile (SuperAppWidgetRedesignV6Holder.kt:234)");
            }
            float f = 4;
            jdj0Var2 = jdj0Var;
            q6(jdj0Var2, s200.G(q630.a.a, 16, f, f, f), ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.b, M, (i2 & 14) | 392 | ((i2 << 6) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jdj0Var2 = jdj0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(this, jdj0Var2, i, 11);
        }
    }

    public final void q6(jdj0 jdj0Var, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1255601979);
        if ((i & 6) == 0) {
            i2 = i | (M.y(jdj0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1255601979, i2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.WidgetSkeletonCard (SuperAppWidgetRedesignV6Holder.kt:305)");
            }
            uog0 b = vog0.b(12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().r;
            float f = (float) 0.33d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jaiVar2 = jaiVar;
            phu0.a(q630Var2, b, j, 0L, aqw.a(f, ylu0Var2.p().e), 0.7f, kai.c(-1924527171, new e3(15, jdj0Var, jaiVar2), M), M, ((i2 >> 3) & 14) | 1769472, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gw9(this, jdj0Var, q630Var, jaiVar2, i);
        }
    }
}
