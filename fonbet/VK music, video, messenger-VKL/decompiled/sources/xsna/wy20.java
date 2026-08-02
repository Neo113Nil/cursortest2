package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.qy20;

/* compiled from: ModalCardTopImpl.kt */
/* loaded from: classes17.dex */
public final class wy20 extends qy20.d {
    public final boolean a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public wy20(lg90 lg90Var, boolean z) {
        this.a = z;
        this.b = androidx.compose.runtime.k.b(lg90Var);
    }

    @Override // xsna.qy20
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(174054549);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(174054549, i, -1, "com.vk.core.compose.component.modal.card.ModalCardImageImpl.Content (ModalCardTopImpl.kt:100)");
        }
        vjw.a((lg90) ((zak0) this.b).getValue(), null, com.vk.core.compose.component.semantics.b.b(txj0.f(sua.d(2.0f, q630Var, false), 1.0f), (SemanticsConfiguration) ((zak0) this.c).getValue()), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56, 120);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    @Override // xsna.qy20.d
    public final boolean b() {
        return this.a;
    }
}
