package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;
import xsna.zwj;

/* compiled from: CountersBlock.kt */
/* loaded from: classes16.dex */
public final class gyj {
    public static final void a(zwj zwjVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1287022976);
        int i2 = (M.J(zwjVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1287022976, i2, -1, "com.vk.clips.design.compose.counters.CounterItem (CountersBlock.kt:204)");
            }
            q630 E = s200.E(q630Var, 8, 10);
            gzs<s3q0> gzsVar = zwjVar.c;
            zwj.b bVar = zwjVar.a;
            zwj.a aVar3 = zwjVar.b;
            boolean z = gzsVar != null;
            if (gzsVar == null) {
                M.K(-528066464);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new gu0(11);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(121512341);
            }
            M.j();
            q630 c = ojc.c(E, z, null, null, gzsVar, 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            tlo0.h hVar = aVar3.a;
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            String obj = tlo0.b.a(hVar, (Context) M.r(iyk0Var)).toString();
            frv0 frv0Var = wlb0.l(M).E;
            long j = wlb0.h(M).getText().m;
            com.vk.core.compose.component.semantics.a aVar5 = aVar3.b;
            q630.a aVar6 = q630.a.a;
            aVar2 = M;
            yqv0.c(obj, com.vk.core.compose.component.semantics.b.b(aVar6, aVar5), j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, 100663296, 48, 5880);
            yqv0.c(tlo0.b.a(bVar.a, (Context) aVar2.r(iyk0Var)).toString(), com.vk.core.compose.component.semantics.b.b(aVar6, bVar.b), wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).m0, aVar2, 100663296, 48, 5880);
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
            s.d = new yf4(zwjVar, q630Var, i, 1);
        }
    }

    public static final void b(ArrayList arrayList, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1610664439);
        int i2 = (M.J(arrayList) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1610664439, i2, -1, "com.vk.clips.design.compose.counters.CounterItems (CountersBlock.kt:191)");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zwj zwjVar = (zwj) it.next();
                a(zwjVar, (q630) izsVar.invoke(zwjVar), M, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xf4(arrayList, izsVar, i, 5);
        }
    }

    public static final void c(kyj kyjVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(336993691);
        int i2 = (M.J(kyjVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(336993691, i2, -1, "com.vk.clips.design.compose.counters.CountersBlock (CountersBlock.kt:47)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            q630Var2 = q630.a.a;
            q630 f = txj0.f(q630Var2, 1.0f);
            dt1.a.getClass();
            phu0.a(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.z(f, dt1.a.l, 2)), vog0.b(20), j, 0L, null, 0, kai.c(-71230557, new com.vk.movika.tools.controls.seekbar.r(kyjVar, 3), M), M, 1769472, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(kyjVar, q630Var2, i, 4);
        }
    }

    public static final void d(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-55744645);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-55744645, i, -1, "com.vk.clips.design.compose.counters.CountersRow (CountersBlock.kt:93)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = fyj.a;
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(6, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qed(q630Var, jaiVar, i, 4);
        }
    }

    public static final void e(final int i, final int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1188500716);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1188500716, i3, -1, "com.vk.clips.design.compose.counters.PlaceholderItems (CountersBlock.kt:173)");
            }
            for (int i4 = 0; i4 < i; i4++) {
                q630 s = txj0.s(q630.a.a, 58, 20);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ja8.a(wdj0.a(hr80.m(s, ylu0Var.getBackground().x, wpu0.a), null), M, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(i, i2) { // from class: xsna.dyj
                public final /* synthetic */ int b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    gyj.e(this.b, I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
