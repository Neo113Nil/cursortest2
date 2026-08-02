package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AutoPlayNextVideoSwitch.kt */
/* loaded from: classes16.dex */
public final class wh5 {
    public static final void a(final boolean z, final boolean z2, final izs izsVar, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1255509185);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1255509185, i2, -1, "com.vk.fullscreenvideo.top.AutoPlayNextVideoSwitch (AutoPlayNextVideoSwitch.kt:42)");
            }
            final mtk0 b = hg2.b(z ? ((azl) M.r(uvi.h)).I0(mi5.a - mi5.c) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jq2.c(0.5f, 200.0f, null, 4), "", null, M, 3120, 20);
            rrv0.e(true, null, null, null, null, null, kai.c(176252670, new wzs() { // from class: xsna.qh5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(176252670, intValue, -1, "com.vk.fullscreenvideo.top.AutoPlayNextVideoSwitch.<anonymous> (AutoPlayNextVideoSwitch.kt:59)");
                        }
                        Object x = aVar2.x();
                        Object obj3 = a.C0011a.a;
                        if (x == obj3) {
                            x = ir.h(aVar2);
                        }
                        sg50 sg50Var = (sg50) x;
                        final boolean z3 = z2;
                        boolean l = aVar2.l(z3);
                        final gzs gzsVar2 = gzsVar;
                        boolean J = l | aVar2.J(gzsVar2);
                        final izs izsVar2 = izsVar;
                        boolean J2 = J | aVar2.J(izsVar2);
                        final boolean z4 = z;
                        boolean l2 = J2 | aVar2.l(z4);
                        Object x2 = aVar2.x();
                        if (l2 || x2 == obj3) {
                            x2 = new gzs() { // from class: xsna.sh5
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    if (z3) {
                                        gzsVar2.invoke();
                                    } else {
                                        izsVar2.invoke(Boolean.valueOf(!z4));
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar2.R(x2);
                        }
                        q630 b2 = ojc.b(q630.this, sg50Var, null, false, null, (gzs) x2, 28);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, b2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c, dVar);
                        q630 a = o19.a(txj0.h(txj0.v(s200.D(q630.a.a, 1), mi5.a), mi5.c), z3 ? 0.4f : 1.0f);
                        cp10 d2 = ja8.d(dt1.a.e, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, a);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d2, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        wh5.c(0, aVar2);
                        wh5.b(((Number) b.getValue()).floatValue(), z4, z3, aVar2, 0);
                        aVar2.G();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 1572870, 62);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z2, izsVar, gzsVar, q630Var, i) { // from class: xsna.rh5
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    wh5.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        long j;
        lg90 b;
        long c;
        androidx.compose.runtime.a M = aVar.M(1389384254);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.l(z2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1389384254, i2, -1, "com.vk.fullscreenvideo.top.SwitchThumb (AutoPlayNextVideoSwitch.kt:93)");
            }
            boolean z3 = (i2 & 14) == 4;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.uh5
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ((tdu) obj).o(f);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            uog0 uog0Var = vog0.a;
            q630 d = rte0.d(a5j0.b(txj0.q(rdu.a(aVar2, (izs) x), mi5.c), 1, uog0Var, false, 0L, 0L, 24), uog0Var);
            if (z) {
                M.K(-536544342);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().c;
                M.j();
            } else {
                M.K(-536542450);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.a().a;
                M.j();
            }
            q630 m = hr80.m(d, j, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (z) {
                M.K(446450250);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-326620644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Play12> (VkSdkIcons.kt:2862)");
                }
                b = or.b(M, 2040453711, R.drawable.vk_icon_play_12, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(446450891);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(137127348, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Pause12> (VkIcons.kt:8300)");
                }
                b = or.b(M, 647090105, R.drawable.vk_icon_pause_12, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            if (z) {
                M.K(955119662);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = l5g.c(14, ylu0Var3.getIcon().e, z2 ? 0.4f : 1.0f);
                M.j();
            } else {
                M.K(955236501);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = l5g.c(14, ylu0Var4.getIcon().c, z2 ? 0.4f : 1.0f);
                M.j();
            }
            pzu0.b(b, null, null, c, M, 56, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, f, z, z2) { // from class: xsna.vh5
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;

                {
                    this.b = f;
                    this.c = z;
                    this.d = z2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    wh5.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2094139549);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2094139549, i, -1, "com.vk.fullscreenvideo.top.SwitchTrack (AutoPlayNextVideoSwitch.kt:125)");
            }
            float f = mi5.b;
            q630 d = rte0.d(txj0.v(txj0.h(q630.a.a, f), mi5.a), vog0.b(f / 2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.getIcon().o, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new th5(i);
        }
    }
}
