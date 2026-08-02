package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.oy20;
import xsna.q630;

/* compiled from: ModalCardButtonsImpl.kt */
/* loaded from: classes17.dex */
public final class ty20 extends oy20 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public ty20(sy20 sy20Var, oy20.a aVar, boolean z) {
        this.a = androidx.compose.runtime.k.b(sy20Var);
        this.b = androidx.compose.runtime.k.b(aVar);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.oy20
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1242028943);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1242028943, i, -1, "com.vk.core.compose.component.modal.card.ModalCardButtonsImpl.Content (ModalCardButtonsImpl.kt:32)");
        }
        if (((Boolean) ((zak0) this.c).getValue()).booleanValue()) {
            aVar.K(141080642);
            c(q630Var, aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            aVar.j();
        } else {
            aVar.K(141135264);
            b(q630Var, aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(468366667);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(468366667, i2, -1, "com.vk.core.compose.component.modal.card.ModalCardButtonsImpl.HorizontalButtons (ModalCardButtonsImpl.kt:41)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
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
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            oy20.a.b.a(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), (oy20.a) ((zak0) this.a).getValue(), M, 0);
            oy20.a aVar3 = (oy20.a) ((zak0) this.b).getValue();
            if (aVar3 == null) {
                M.K(-1503636621);
            } else {
                M.K(1198421582);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                oy20.a.b.a(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), aVar3, M, 0);
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
            s.d = new y78(this, q630Var, i, 3);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-900863587);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-900863587, i2, -1, "com.vk.core.compose.component.modal.card.ModalCardButtonsImpl.VerticalButtons (ModalCardButtonsImpl.kt:52)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
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
            q630.a aVar3 = q630.a.a;
            oy20.a.b.a(txj0.f(aVar3, 1.0f), (oy20.a) ((zak0) this.a).getValue(), M, 6);
            oy20.a aVar4 = (oy20.a) ((zak0) this.b).getValue();
            if (aVar4 == null) {
                M.K(-1500851217);
            } else {
                M.K(1475606098);
                oy20.a.b.a(txj0.f(aVar3, 1.0f), aVar4, M, 6);
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
            s.d = new wp8(this, q630Var, i, i3);
        }
    }
}
