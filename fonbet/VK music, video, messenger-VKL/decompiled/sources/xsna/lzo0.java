package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TitleImpl.kt */
/* loaded from: classes17.dex */
public final class lzo0 implements tnj {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);
    public final wh50 c;

    public lzo0(us2 us2Var, boolean z) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.tnj
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(1762864714);
        int i2 = (M.J(q630.a.a) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1762864714, i2, -1, "com.vk.core.compose.component.context.menu.TitleImpl.Content (TitleImpl.kt:30)");
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), (SemanticsConfiguration) ((zak0) this.b).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.r;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            int i3 = (i2 >> 6) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1163831025, i3, -1, "com.vk.core.compose.component.context.menu.TitleImpl.textColor (TitleImpl.kt:51)");
            }
            if (((Boolean) ((zak0) this.c).getValue()).booleanValue()) {
                M.K(-1580855807);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().k;
                M.j();
            } else {
                M.K(-1580802270);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().m;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.K(1739862130);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.T;
            M.j();
            aVar2 = M;
            ntu0.c(us2Var, null, frv0Var, j, 1, false, false, false, null, 0, null, 0, null, aVar2, 0, 0, 8098);
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
            s.d = new pg(this, i, 10);
        }
    }
}
