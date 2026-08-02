package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: TopControls.kt */
/* loaded from: classes16.dex */
public final class p8p0 {
    public static final void a(ControlsState.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1391442480);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1391442480, i3, -1, "com.vk.fullscreenvideo.top.AutoplaySwitch (TopControls.kt:353)");
            }
            boolean z = bVar.j;
            q630.a aVar2 = q630.a.a;
            if (!z || bVar.g) {
                M.K(-1745339886);
            } else {
                M.K(-1733317528);
                boolean z2 = bVar.h;
                boolean z3 = bVar.i;
                int i4 = i3 & 112;
                boolean z4 = i4 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z4 || x == c0012a) {
                    x = new l9a(izsVar, 3);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean z5 = i4 == 32;
                Object x2 = M.x();
                if (z5 || x2 == c0012a) {
                    x2 = new px(izsVar, 6);
                    M.R(x2);
                }
                wh5.a(z2, z3, izsVar2, (gzs) x2, s200.D(txj0.h(aVar2, 48), 12), M, 0);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new urx(bVar, izsVar, q630Var, i);
        }
    }

    public static final void b(final ControlsState.b bVar, final rqj rqjVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-931478880);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rqjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-931478880, i3, -1, "com.vk.fullscreenvideo.top.BugControlIcon (TopControls.kt:331)");
            }
            dqj b = qqj.b(a.d.C1071a.a, bVar.n, rqjVar, M, ((i3 << 3) & 896) | 6);
            q630.a aVar2 = q630.a.a;
            if (b != null) {
                M.K(96796841);
                bqj.a(b, izsVar, txj0.q(ahn.E(aVar2, ods0.b(b.c)), 48), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, M, (i3 >> 3) & 112, 120);
            } else {
                M.K(85248194);
            }
            M.j();
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
            s.d = new wzs() { // from class: xsna.k8p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p8p0.b(ControlsState.b.this, rqjVar, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1367328104);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1367328104, i3, -1, "com.vk.fullscreenvideo.top.ChevronIcon (TopControls.kt:228)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-141445858, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDown24> (VkSdkIcons.kt:420)");
            }
            lg90 b = or.b(M, -450463739, R.drawable.vk_icon_chevron_down_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().b;
            String N = d370.N(R.string.video_accessibility_collapse_to_miniplayer, 0, M);
            q630Var2 = q630.a.a;
            q630 d = rte0.d(txj0.q(ahn.E(q630Var2, "fullscreen_chevron_icon"), 48), vog0.a);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dx(izsVar, 3);
                M.R(x);
            }
            pzu0.b(b, N, s200.D(ojc.c(d, false, null, null, (gzs) x, 15), 12), j, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dx7(izsVar, q630Var2, i, 3);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, ControlsState.b bVar, rqj rqjVar, izs izsVar, izs izsVar2, q630 q630Var) {
        int i2;
        izs izsVar3;
        rqj rqjVar2;
        izs izsVar4;
        ControlsState.b bVar2 = bVar;
        androidx.compose.runtime.a M = aVar.M(99254376);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            izsVar3 = izsVar;
            i2 |= M.y(izsVar3) ? 32 : 16;
        } else {
            izsVar3 = izsVar;
        }
        if ((i & 384) == 0) {
            rqjVar2 = rqjVar;
            i2 |= M.J(rqjVar2) ? 256 : 128;
        } else {
            rqjVar2 = rqjVar;
        }
        if ((i & 3072) == 0) {
            izsVar4 = izsVar2;
            i2 |= M.y(izsVar4) ? 2048 : 1024;
        } else {
            izsVar4 = izsVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(99254376, i3, -1, "com.vk.fullscreenvideo.top.Header (TopControls.kt:167)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = bVar2.o ? 2 : 0;
            q630.a aVar3 = q630.a.a;
            int i4 = i3 >> 3;
            i((i3 & 14) | (i4 & 112) | (i4 & 896) | ((i3 << 9) & 57344), M, bVar2, rqjVar2, izsVar4, izsVar3, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            M = M;
            bVar2 = bVar2;
            if (bVar2.p != ControlsState.ScreenState.FULLSCREEN ? bVar2.l : bVar2.o) {
                M.K(136131492);
            } else {
                M.K(142594496);
                if (k(bVar2.k, false)) {
                    M.K(142801948);
                    float f2 = 16;
                    q630 H = s200.H(txj0.f(aVar3, 1.0f), f2, 6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, H);
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
                    ur.d(hashCode2, M, bVar3, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    hkq0 hkq0Var = bVar2.c;
                    boolean z = bVar2.f;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    int i5 = (i3 << 3) & 896;
                    eww.c(hkq0Var, z, izsVar, new xpy(1.0f, true), M, i5);
                    f9t.e(txj0.q(aVar3, 12), M, 6);
                    h(bVar2.k, false, izsVar, txj0.h(aVar3, 32), M, i5 | 3120);
                    M.G();
                    M.j();
                } else {
                    M.K(143720478);
                    float f3 = 16;
                    eww.c(bVar2.c, bVar2.f, izsVar, s200.H(aVar3, f3, 6, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), M, (i3 << 3) & 896);
                    M.j();
                }
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qwq(i, bVar2, rqjVar, izsVar, izsVar2, q630Var);
        }
    }

    public static final void e(ControlsState.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1861499996);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1861499996, i2, -1, "com.vk.fullscreenvideo.top.LandscapeInfoColumn (TopControls.kt:249)");
            }
            boolean z = bVar.b;
            hkq0 hkq0Var = bVar.c;
            boolean z2 = bVar.o;
            boolean z3 = z && bVar.l && z2 && bVar.p == ControlsState.ScreenState.DISCOVERY;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (!z2 || z3) {
                M.K(176306996);
            } else {
                M.K(185417369);
                String str = hkq0Var.a;
                float f = 12;
                q630.a aVar3 = q630.a.a;
                eww.d((i2 & 112) | 384, M, str, izsVar, txj0.u(s200.H(aVar3, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                eww.a(hkq0Var.b, hkq0Var.c, hkq0Var.d, bVar.f, izsVar, s200.H(aVar3, f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), M, ((i2 << 9) & 57344) | 196608);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq2(i, 5, bVar, izsVar, q630Var);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, ControlsState.b bVar, rqj rqjVar, izs izsVar, izs izsVar2, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1712249599);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rqjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1712249599, i3, -1, "com.vk.fullscreenvideo.top.MainControlsButtons (TopControls.kt:378)");
            }
            xow<a.d> xowVar = bVar.m;
            ControlsState.c cVar = bVar.n;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.p;
            q630.a aVar3 = q630.a.a;
            qqj.a(xowVar, cVar, kai.c(596921345, new f8k(bVar, izsVar2, izsVar), M), rqjVar, s200.H(txj0.C(aVar3, aVar2, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), null, M, ((i3 << 6) & 7168) | 384, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n7t(i, bVar, rqjVar, izsVar, izsVar2, q630Var2);
        }
    }

    public static final void g(final Integer num, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final boolean z2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(612089747);
        int i2 = (M.J(num) ? 4 : 2) | i | (M.l(z) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(612089747, i2, -1, "com.vk.fullscreenvideo.top.Message (TopControls.kt:92)");
            }
            z2 = z;
            q630Var2 = q630Var;
            mm2.f(z2, q630Var2, anp.e(jq2.d(300, 0, null, 6), 2), anp.f(jq2.d(500, 0, null, 6), 2), null, kai.c(1679550395, new ua30(num, 2), M), M, ((i2 >> 3) & 14) | 200112, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(num, z2, q630Var2, i) { // from class: xsna.l8p0
                public final /* synthetic */ Integer b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    p8p0.g(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(final ControlsState.b.a aVar, final boolean z, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        ControlsState.b.a aVar3;
        int i2;
        boolean z2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar4;
        androidx.compose.runtime.a M = aVar2.M(-768119337);
        if ((i & 6) == 0) {
            aVar3 = aVar;
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            aVar3 = aVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-768119337, i2, -1, "com.vk.fullscreenvideo.top.SubscribeButton (TopControls.kt:284)");
            }
            if (!k(aVar, z)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    final ControlsState.b.a aVar5 = aVar3;
                    final boolean z3 = z2;
                    final q630 q630Var3 = q630Var2;
                    s.d = new wzs() { // from class: xsna.n8p0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p8p0.h(ControlsState.b.a.this, z3, izsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Outline;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            String N = d370.N(R.string.video_subscribe_author, 0, M);
            boolean z4 = (i2 & 896) == 256;
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                x = new j87(izsVar, 6);
                M.R(x);
            }
            aVar4 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar4, ((i2 << 3) & 57344) | X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar4 = M;
            aVar4.h();
        }
        androidx.compose.runtime.f s2 = aVar4.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.o8p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p8p0.h(ControlsState.b.a.this, z, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(int i, androidx.compose.runtime.a aVar, ControlsState.b bVar, rqj rqjVar, izs izsVar, izs izsVar2, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1129777936);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rqjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1129777936, i3, -1, "com.vk.fullscreenvideo.top.Toolbar (TopControls.kt:118)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            c((i3 >> 12) & 14, M, izsVar2, null);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar3, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i4 = (i3 & 14) | ((i3 >> 9) & 112);
            e(bVar, izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), M, i4);
            float f2 = 12;
            int i5 = (i3 >> 6) & 896;
            h(bVar.k, true, izsVar2, s200.H(q630.a.a, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), M, i5 | 3120);
            M.G();
            int i6 = (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | i5;
            b(bVar, rqjVar, izsVar2, null, M, i6);
            aVar2 = M;
            a(bVar, izsVar2, null, aVar2, i4);
            f(((i3 << 3) & 7168) | i6, aVar2, bVar, rqjVar, izsVar2, izsVar, null);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m8p0(i, bVar, rqjVar, izsVar, izsVar2, q630Var);
        }
    }

    public static final void j(ControlsState.b bVar, izs izsVar, q630 q630Var, izs izsVar2, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        ControlsState.b bVar2 = bVar;
        androidx.compose.runtime.a M = aVar.M(238630469);
        int i2 = i | (M.J(bVar2) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(238630469, i2, -1, "com.vk.fullscreenvideo.top.TopControls (TopControls.kt:59)");
            }
            boolean l = M.l(bVar2.q) | M.l(bVar2.g) | M.l(bVar2.o);
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                rqj rqjVar = new rqj(4, bVar2.q, bVar2.o, false, bVar2.g);
                M.R(rqjVar);
                x = rqjVar;
            }
            rqj rqjVar2 = (rqj) x;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630Var;
            q630 c = qri.c(M, q630Var2);
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
            q630.a aVar4 = q630.a.a;
            d((i2 & 7168) | (i2 & 14) | 24576 | (i2 & 112), M, bVar2, rqjVar2, izsVar, izsVar2, txj0.f(aVar4, 1.0f));
            aVar2 = M;
            bVar2 = bVar2;
            g(bVar2.d, bVar2.e, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar2, 384);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j8p0(bVar2, izsVar, q630Var2, izsVar2, i);
        }
    }

    public static final boolean k(ControlsState.b.a aVar, boolean z) {
        boolean z2 = aVar.b;
        if (z2 != z) {
            return false;
        }
        return aVar.a == ControlsState.ScreenState.FULLSCREEN && (z2 ? aVar.c : aVar.d) && aVar.e && aVar.f && !aVar.g && !aVar.h;
    }
}
