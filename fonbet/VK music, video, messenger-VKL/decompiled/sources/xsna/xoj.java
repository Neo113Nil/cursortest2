package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xoj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xoj(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                mnj mnjVar = (mnj) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-250345048, intValue, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.kt:134)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new boj();
                        aVar.R(x);
                    }
                    boj bojVar = (boj) x;
                    bojVar.a.clear();
                    izsVar.invoke(bojVar);
                    bojVar.a(mnjVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                h2e0 h2e0Var = (h2e0) this.c;
                wh50 wh50Var = h2e0Var.a;
                q630 q630Var = (q630) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1681225751, intValue2, -1, "com.vk.ecomm.design.compose.inputfield.ProgressHintsCaptionImpl.Content.<anonymous> (ReviewTextInputField.kt:135)");
                }
                mtk0 b = hg2.b(((y9k) ((zak0) wh50Var).getValue()).a, null, null, null, aVar2, 0, 30);
                mtk0 b2 = hg2.b(((y9k) ((zak0) wh50Var).getValue()).d, jq2.d(300, 0, luo.d, 2), null, null, aVar2, 0, 28);
                boolean J = aVar2.J(b2);
                Object x2 = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x2 == c0012a) {
                    x2 = new w910(b2, 17);
                    aVar2.R(x2);
                }
                q630 a = rdu.a(q630Var, (izs) x2);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 0);
                int hashCode = Long.hashCode(n34.n(aVar2));
                sy90 D = aVar2.D();
                q630 c = qri.c(aVar2, a);
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
                k9q0.w(aVar2, a2, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar2, cri.a.h);
                k9q0.w(aVar2, c, cri.a.d);
                q630.a aVar4 = q630.a.a;
                q630 q = txj0.q(aVar4, 16);
                float f = ((y9k) ((zak0) wh50Var).getValue()).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-718195002, 0, -1, "com.vk.ecomm.design.compose.inputfield.ProgressHintsCaptionImpl.provideColorByProgress (ReviewTextInputField.kt:169)");
                }
                if (f > 0.67f) {
                    aVar2.K(1304342898);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().i;
                    aVar2.j();
                } else if (f > 0.33f) {
                    aVar2.K(1304345073);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().p;
                    aVar2.j();
                } else {
                    aVar2.K(1304346610);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getIcon().h;
                    aVar2.j();
                }
                long j2 = j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean J2 = aVar2.J(b);
                Object x3 = aVar2.x();
                if (J2 || x3 == c0012a) {
                    x3 = new fr20(b, 26);
                    aVar2.R(x3);
                }
                h2e0Var.b(384, j2, aVar2, (gzs) x3, q);
                f9t.e(txj0.v(aVar4, 4), aVar2, 6);
                ijk.a(((y9k) ((zak0) wh50Var).getValue()).b, null, null, "ProgressHintText", nki.a, aVar2, 27648, 6);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
