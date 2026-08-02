package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import xsna.p2p0;
import xsna.q630;

/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class eio0 extends p2p0.b {
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public eio0(String str) {
        this.d = androidx.compose.runtime.k.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(psv0 psv0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1515013095);
        if ((i & 6) == 0) {
            i2 = (M.J(psv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1515013095, i2, -1, "com.vk.core.compose.component.button.tool.TextImpl.Content (TextImpl.kt:22)");
            }
            aVar2 = M;
            yqv0.c((String) ((zak0) this.d).getValue(), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.e).getValue()), ((l5g) psv0Var.a(((Boolean) ((zak0) this.c).getValue()).booleanValue(), M, (i2 << 3) & 112).getValue()).a, null, null, 0, 0, null, 2, false, 0, 1, null, null, aVar2, 100663296, 48, 14072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ks3(this, psv0Var, i);
        }
    }
}
