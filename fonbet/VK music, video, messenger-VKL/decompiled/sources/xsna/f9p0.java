package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TopPlayerControls.kt */
/* loaded from: classes3.dex */
public final class f9p0 {
    public static final void a(Object obj, q630 q630Var, final l5g l5gVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1415224392);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(l5gVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1415224392, i3, -1, "com.vk.music.stickyplayer.presentation.components.MusicTrackImage (TopPlayerControls.kt:80)");
            }
            float f = a9p0.a;
            String f2 = z3r0.f((Thumb) obj, f, M, 48);
            int length = f2.length();
            q630.a aVar3 = q630.a.a;
            if (length == 0) {
                M.K(-1550611238);
                nsa0.a(a9p0.b, 48, M, ahn.E(txj0.q(aVar3, f), "trackCover"));
                M.j();
                aVar2 = aVar3;
            } else {
                M.K(-1550296464);
                aVar2 = aVar3;
                fwu0.c(rte0.d(txj0.q(aVar3, f), vog0.b(a9p0.b)), null, f2, null, null, null, null, kai.c(1461107117, new a0t() { // from class: xsna.e9p0
                    @Override // xsna.a0t
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i4;
                        q630 g;
                        chs chsVar = (chs) obj3;
                        lg90 lg90Var = (lg90) obj4;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 48) == 0) {
                            i4 = (aVar4.J(chsVar) ? 32 : 16) | intValue;
                        } else {
                            i4 = intValue;
                        }
                        if ((intValue & 384) == 0) {
                            i4 |= (intValue & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar4.t(i4 & 1, (i4 & 1169) != 1168)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1461107117, i4, -1, "com.vk.music.stickyplayer.presentation.components.MusicTrackImage.<anonymous> (TopPlayerControls.kt:96)");
                            }
                            boolean z = chsVar instanceof chs.b;
                            q630.a aVar5 = q630.a.a;
                            if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                                aVar4.K(-330360770);
                                nsa0.a(a9p0.b, 54, aVar4, txj0.d(aVar5, 1.0f));
                                aVar4.j();
                            } else {
                                aVar4.K(-1651026200);
                                q630 d = txj0.d(aVar5, 1.0f);
                                l5g l5gVar2 = l5g.this;
                                if (l5gVar2 != null && (g = d.g(hr80.m(aVar5, l5gVar2.a, androidx.compose.ui.graphics.e.a))) != null) {
                                    d = g;
                                }
                                float f3 = (float) 0.5d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a = aqw.a(f3, ylu0Var.getImage().a);
                                float f4 = a9p0.b;
                                vjw.a(lg90Var, null, ahn.E(rte0.d(r18.b(a.a, a.b, d, vog0.b(f4)), vog0.b(f4)), "trackCover"), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 56 | ((i4 >> 6) & 14), 120);
                                aVar4.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 100663296, 250);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b6v(obj, q630Var2, l5gVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Object obj, final b9p0 b9p0Var, final c9p0 c9p0Var, final q630 q630Var, l5g l5gVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        l5g l5gVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1248654776);
        if ((i & 6) == 0) {
            i3 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(b9p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(c9p0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            l5gVar2 = l5gVar;
            i3 |= M.J(l5gVar2) ? 16384 : 8192;
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
            } else {
                if (i4 != 0) {
                    l5gVar2 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1248654776, i3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls (TopPlayerControls.kt:53)");
                }
                q630 d = txj0.d(q630Var, 1.0f);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
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
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                a(obj, null, l5gVar2, M, (i3 & 14) | ((i3 >> 6) & 896));
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                b9p0Var.a(s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f, true)), M, i3 & 112);
                c9p0Var.a(((i3 >> 3) & 112) | 6, M);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                final l5g l5gVar3 = l5gVar2;
                s.d = new wzs() { // from class: xsna.d9p0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        f9p0.b(obj, b9p0Var, c9p0Var, q630Var, l5gVar3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        l5gVar2 = l5gVar;
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
