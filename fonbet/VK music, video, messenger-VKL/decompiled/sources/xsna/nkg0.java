package xsna;

import com.vungle.ads.internal.protos.Sdk;
import xsna.tlh0;

/* compiled from: RightPairImpl.kt */
/* loaded from: classes17.dex */
public final class nkg0 extends tlh0.a {
    public final wh50 a;
    public final wh50 b;
    public final zhf0 c;

    public nkg0(tlh0 tlh0Var, fkg0 fkg0Var) {
        this.a = androidx.compose.runtime.k.b(tlh0Var);
        this.b = androidx.compose.runtime.k.b(fkg0Var);
        this.c = tlh0Var.d();
    }

    @Override // xsna.tlh0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(889914232);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(889914232, i2, -1, "com.vk.core.compose.component.search.RightPairImpl.Content (RightPairImpl.kt:21)");
            }
            M.K(509087524);
            int i3 = (i2 & 14) | 48;
            ((tlh0) ((zak0) this.a).getValue()).a(i3, M);
            M.j();
            ((tlh0) ((zak0) this.b).getValue()).a(i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mkg0(this, i);
        }
    }

    @Override // xsna.rzb0
    public final zhf0 d() {
        return this.c;
    }
}
