package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FullscreenOnboardingStepScope.kt */
/* loaded from: classes17.dex */
public final class oys implements kys {
    public final int a;
    public final wh50 b = androidx.compose.runtime.k.b(null);
    public final wh50 c = androidx.compose.runtime.k.b(Boolean.FALSE);

    public oys(int i) {
        this.a = i;
    }

    @Override // xsna.kys
    public final void a(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2001798306);
        if ((i & 6) == 0) {
            i2 = (M.J("This is a text") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2001798306, i2, -1, "com.vk.core.tool.compose.onboarding.fullscreen.FullscreenOnboardingStepScopeImpl.ImageStep (FullscreenOnboardingStepScope.kt:142)");
            }
            dt1.a.getClass();
            int i3 = i2 >> 3;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630 f = txj0.f(rte0.e(new xpy(1.0f, true)), 1.0f);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            jaiVar.invoke(ra8.a.a(q630.a.a), M, Integer.valueOf(i3 & 112));
            M.G();
            wkg.a("This is a text", M, i2 & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lys(i, 0, this, q630Var, jaiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    @Override // xsna.kys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wzs wzsVar;
        boolean z;
        oys oysVar = this;
        String str2 = str;
        jai jaiVar2 = cdi.b;
        wzs wzsVar2 = cdi.c;
        androidx.compose.runtime.a M = aVar.M(197732862);
        if ((i & 6) == 0) {
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(wzsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(oysVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(197732862, i3, -1, "com.vk.core.tool.compose.onboarding.fullscreen.FullscreenOnboardingStepScopeImpl.VideoStep (FullscreenOnboardingStepScope.kt:69)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            mc90 mc90Var = (mc90) ((zak0) oysVar.b).getValue();
            if (mc90Var != null) {
                wzsVar = wzsVar2;
                if (mc90Var.k() == oysVar.a && !mc90Var.k.a()) {
                    z = true;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 f = txj0.f(rte0.e(new xpy(1.0f, true)), 1.0f);
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    boolean z2 = z;
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, f);
                    if (M.N() != null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    Object x4 = M.x();
                    if (x4 == obj) {
                        oysVar = this;
                        x4 = new nys(wh50Var2, wh50Var, oysVar, wh50Var3);
                        M.R(x4);
                    } else {
                        oysVar = this;
                    }
                    jaiVar.invoke(Boolean.valueOf(z2), (nys) x4, ra8.a.a(o19.a(q630.a.a, (((Boolean) wh50Var3.getValue()).booleanValue() || ((Boolean) ((zak0) oysVar.c).getValue()).booleanValue()) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), M, Integer.valueOf(((i3 << 3) & 7168) | 48));
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        M.K(-1787958544);
                        jaiVar2.invoke(M, Integer.valueOf((i3 >> 9) & 14));
                    } else {
                        M.K(-1792087000);
                    }
                    M.j();
                    if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                        M.K(-1787873294);
                        wzsVar.invoke(M, Integer.valueOf((i3 >> 12) & 14));
                    } else {
                        M.K(-1792087000);
                    }
                    M.j();
                    M.G();
                    str2 = str;
                    wkg.a(str2, M, i3 & 14);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            } else {
                wzsVar = wzsVar2;
            }
            z = false;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            }
            q630 f2 = txj0.f(rte0.e(new xpy(1.0f, true)), 1.0f);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode22 = Long.hashCode(n34.n(M));
            boolean z22 = z;
            sy90 D22 = M.D();
            q630 c22 = qri.c(M, f2);
            if (M.N() != null) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mys(oysVar, str2, q630Var, jaiVar, i);
        }
    }
}
