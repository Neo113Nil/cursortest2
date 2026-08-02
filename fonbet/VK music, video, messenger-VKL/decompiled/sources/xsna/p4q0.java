package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import xsna.q630;

/* compiled from: UnlinkBidProfileModal.kt */
/* loaded from: classes18.dex */
public final class p4q0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final q630 e;
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;
    public final q630 j;

    public p4q0(ynr0 ynr0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        this.a = androidx.compose.runtime.k.b(ynr0Var);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(gzsVar2);
        this.d = androidx.compose.runtime.k.b(gzsVar3);
        q630.a aVar = q630.a.a;
        q630 f = txj0.f(aVar, 1.0f);
        this.e = f;
        float f2 = 16;
        this.f = s200.D(f, f2);
        this.g = txj0.h(aVar, f2);
        this.h = txj0.h(aVar, 32);
        this.i = txj0.h(aVar, 12);
        this.j = txj0.h(aVar, 8);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1906644926);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1906644926, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.UnlinkBidProfileModalImpl.Content (UnlinkBidProfileModal.kt:87)");
            }
            Mode mode = Mode.Card;
            gzs gzsVar = (gzs) ((zak0) this.d).getValue();
            jai c = kai.c(-196299612, new n0r(this, 2), M);
            q630Var2 = q630.a.a;
            aVar2 = M;
            a030.b(mode, gzsVar, q630Var2, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, c, aVar2, 390, 100663296, 262136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m9c(this, q630Var2, i, 9);
        }
    }
}
