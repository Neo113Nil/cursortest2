package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Counters.kt */
/* loaded from: classes17.dex */
public final class jyj {
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1825668332);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1825668332, i3, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.CountersBlock (Counters.kt:23)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), 58);
            uog0 b = vog0.b(20);
            jai c = kai.c(-1921385673, new wzs() { // from class: xsna.hyj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1921385673, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.CountersBlock.<anonymous> (Counters.kt:31)");
                        }
                        q630.a aVar3 = q630.a.a;
                        q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 1, txj0.d(aVar3, 1.0f));
                        a.i iVar = androidx.compose.foundation.layout.a.f;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(iVar, dt1.a.l, aVar2, 54);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c2 = qri.c(aVar2, F);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c2, cri.a.d);
                        aVar2.K(1970149875);
                        for (int i4 = 0; i4 < i; i4++) {
                            q630 s = txj0.s(aVar3, 54, 20);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            ja8.a(hr80.m(s, ylu0Var2.getBackground().x, wpu0.a), aVar2, 0);
                        }
                        if (gp.d(aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M);
            long a = l9g.a(0, j, M);
            float f = 1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-574573525, 1572870, -1, "androidx.compose.material.Card (Card.kt:63)");
            }
            yjn0.a(h, b, j, a, f, c, M, 1572870, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2) { // from class: xsna.iyj
                public final /* synthetic */ int b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    jyj.a(this.b, I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
