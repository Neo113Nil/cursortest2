package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.ty6;

/* compiled from: ModalCardMainImpl.kt */
/* loaded from: classes17.dex */
public final class xy20 extends py20 {
    public final wh50 a;
    public final wh50 b;

    public xy20() {
        this(null, null);
    }

    @Override // xsna.py20
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String str;
        String str2;
        int i2;
        int i3;
        aVar.K(-1272258007);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1272258007, i, -1, "com.vk.core.compose.component.modal.card.ModalCardMainImpl.Content (ModalCardMainImpl.kt:25)");
        }
        q630 f = txj0.f(q630Var, 1.0f);
        dt1.a.getClass();
        ty6.a aVar2 = dt1.a.o;
        a.l lVar = androidx.compose.foundation.layout.a.a;
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.t), aVar2, aVar, 48);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, f);
        cri.h7.getClass();
        LayoutNode.a aVar3 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar3);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        us2 us2Var = (us2) ((zak0) this.a).getValue();
        if (us2Var == null) {
            aVar.K(-57106407);
            aVar.j();
            str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
            str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
        } else {
            aVar.K(-57106406);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
            str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            yqv0.d(us2Var, null, j, 3, null, 0, false, 0, null, null, wuv0Var.f, aVar, 0, 0, 8122);
            aVar.j();
        }
        us2 us2Var2 = (us2) ((zak0) this.b).getValue();
        if (us2Var2 == null) {
            aVar.K(-56805428);
            aVar.j();
        } else {
            aVar.K(-56805427);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                i3 = -1;
                androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
            } else {
                i2 = 0;
                i3 = -1;
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getText().n;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i2, i3, str);
            }
            wuv0 wuv0Var2 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(us2Var2, null, j2, 3, null, 0, false, 0, null, null, wuv0Var2.Y, aVar, 0, 0, 8122);
            aVar.j();
        }
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public xy20(us2 us2Var, us2 us2Var2) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(us2Var2);
    }
}
