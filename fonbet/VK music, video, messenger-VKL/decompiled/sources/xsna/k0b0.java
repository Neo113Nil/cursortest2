package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: PlayerContentView.kt */
/* loaded from: classes3.dex */
public final class k0b0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ivs ivsVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(286513404);
        if ((i & 6) == 0) {
            i2 = (M.J(ivsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(286513404, i2, -1, "com.vk.music.stickyplayer.presentation.FullMusicPlayer (PlayerContentView.kt:106)");
            }
            wh50 c = jk50.c(ivsVar.a.b, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x);
            }
            kg50 kg50Var = (kg50) x;
            gfp0.b.c cVar = (gfp0.b.c) ivsVar.b;
            q630 d = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 8;
            q630 D = s200.D(hr80.m(d, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), f);
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new j0b0(kg50Var, izsVar);
                M.R(x2);
            }
            q630 b = skn0.b(D, s3q0Var, (PointerInputEventHandler) x2);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            vkf0.c(new hwu(ivsVar.a, ivsVar.b, ivsVar.c, ivsVar.g, ivsVar.h, !ivsVar.f.a), izsVar, null, M, i3);
            tkf0.a(((dz40.g) c.getValue()).a(), null, M, 0);
            hmf0.a(cVar, izsVar, null, M, i3);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            zlf0.f(ivsVar, izsVar, null, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            xkf0.a(i3, M, izsVar, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pt6(i, 4, ivsVar, izsVar, q630Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(dz40.t tVar, f3b0 f3b0Var, final BottomPlayerAppearance bottomPlayerAppearance, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        dz40.f fVar = tVar.a;
        androidx.compose.runtime.a M = aVar.M(209767486);
        if ((i & 6) == 0) {
            i2 = (M.J(tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(f3b0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(bottomPlayerAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(209767486, i3, -1, "com.vk.music.stickyplayer.presentation.RedesignedMusicWithBottomPlayer (PlayerContentView.kt:42)");
            }
            wh50 c = jk50.c(tVar.d, M);
            wh50 c2 = jk50.c(tVar.e, M);
            wh50 c3 = jk50.c(fVar.d, M);
            wh50 c4 = jk50.c(fVar.b, M);
            wh50 c5 = jk50.c(fVar.a, M);
            final wh50 c6 = jk50.c(fVar.e, M);
            final wh50 c7 = jk50.c(fVar.f, M);
            final wh50 c8 = jk50.c(fVar.i, M);
            final b78 c9 = vmj.c((gfp0.b) c.getValue(), new c78(((Number) c5.getValue()).intValue() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Number) c4.getValue()).intValue() / ((Number) c5.getValue()).intValue(), ((Boolean) c3.getValue()).booleanValue(), !((dz40.c) c2.getValue()).a, false), izsVar, M, (i3 >> 3) & 896);
            aVar2 = M;
            vmj.b(f3b0Var.c(), ((vak0) f3b0Var.b).getFloatValue(), bottomPlayerAppearance, kai.c(-1037780822, new oha(1, new ivs(tVar, (gfp0.b) c.getValue(), f3b0Var, ((Number) c4.getValue()).intValue(), ((Number) c5.getValue()).intValue(), (dz40.c) c2.getValue(), ((Boolean) c7.getValue()).booleanValue(), ((Boolean) c3.getValue()).booleanValue()), izsVar), M), kai.c(1174635115, new yzs() { // from class: xsna.h0b0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1174635115, intValue, -1, "com.vk.music.stickyplayer.presentation.RedesignedMusicWithBottomPlayer.<anonymous> (PlayerContentView.kt:86)");
                        }
                        vmj.a(b78.this, bottomPlayerAppearance, ((Boolean) c6.getValue()).booleanValue(), ((Boolean) c7.getValue()).booleanValue(), ((Boolean) c8.getValue()).booleanValue(), ahn.E(q630.a.a, "smallPlayer").g(q630Var), aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), !(((gfp0.b) c.getValue()) instanceof gfp0.b.C2940b), aVar2, (i3 & 896) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n48(i, 2, tVar, f3b0Var, bottomPlayerAppearance, izsVar);
        }
    }
}
