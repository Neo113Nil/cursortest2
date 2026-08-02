package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.Good;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.h4u;
import xsna.q630;

/* compiled from: GoodDescriptionComposeViewHolders.kt */
/* loaded from: classes18.dex */
public final class k4u {
    public static final void a(final g2m g2mVar, final Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-908630169);
        int i2 = (M.J(g2mVar) ? 4 : 2) | i | (M.J(obj) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-908630169, i2, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionCharacteristicsContent (GoodDescriptionComposeViewHolders.kt:127)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            final wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var2 = (wh50) x3;
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
            int intValue = rg50Var.getIntValue();
            List<h4u> list = g2mVar.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((h4u) it.next()).a));
            }
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new qcl(rg50Var, 17);
                M.R(x4);
            }
            r4u.a(intValue, arrayList, (izs) x4, M, 384);
            Integer valueOf = Integer.valueOf(rg50Var.getIntValue());
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new vsq(6);
                M.R(x5);
            }
            xh2.a(valueOf, null, (izs) x5, null, "GoodDescriptionContent", null, kai.c(-1558124505, new zzs() { // from class: xsna.j4u
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int intValue2 = ((Integer) obj3).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                    int intValue3 = ((Integer) obj5).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1558124505, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionCharacteristicsContent.<anonymous>.<anonymous> (GoodDescriptionComposeViewHolders.kt:149)");
                    }
                    h4u h4uVar = (h4u) j5g.b0(intValue2, g2m.this.a);
                    boolean z = h4uVar instanceof h4u.b;
                    q630.a aVar4 = q630.a.a;
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (z) {
                        aVar3.K(1919566055);
                        ynd0 ynd0Var = ((h4u.b) h4uVar).b;
                        CharSequence charSequence = ynd0Var.a;
                        CharSequence charSequence2 = ynd0Var.b;
                        Good good = ynd0Var.c;
                        n4u n4uVar = new n4u(charSequence, charSequence2, good.o, good.H, good.d, good.a0);
                        wh50 wh50Var3 = wh50Var;
                        boolean booleanValue = ((Boolean) wh50Var3.getValue()).booleanValue();
                        Object x6 = aVar3.x();
                        if (x6 == c0012a2) {
                            x6 = new x5i(wh50Var3, 24);
                            aVar3.R(x6);
                        }
                        q630 f = txj0.f(aVar4, 1.0f);
                        m4u.a(obj, n4uVar, booleanValue, (gzs) x6, f, aVar3, 27648);
                        aVar3.j();
                    } else if (h4uVar instanceof h4u.a) {
                        aVar3.K(1920146995);
                        ArrayList arrayList2 = ((h4u.a) h4uVar).b;
                        wh50 wh50Var4 = wh50Var2;
                        boolean booleanValue2 = ((Boolean) wh50Var4.getValue()).booleanValue();
                        Object x7 = aVar3.x();
                        if (x7 == c0012a2) {
                            x7 = new s1k(1, wh50Var4);
                            aVar3.R(x7);
                        }
                        y3u.a(arrayList2, booleanValue2, (gzs) x7, txj0.f(aVar4, 1.0f), aVar3, 3456);
                        aVar3.j();
                    } else {
                        if (h4uVar != null) {
                            throw alb0.c(1585938663, aVar3);
                        }
                        aVar3.K(1920611065);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1597824, 42);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xc4(i, 1, g2mVar, obj, q630Var);
        }
    }
}
