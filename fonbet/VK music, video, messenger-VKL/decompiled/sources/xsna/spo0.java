package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ThemedEmptyComposeView.kt */
/* loaded from: classes17.dex */
public final class spo0 extends rpo0 {
    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1688308940);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1688308940, i, -1, "com.vk.core.tool.view.ThemedEmptyComposeView.ThemedContent (ThemedEmptyComposeView.kt:16)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cdi.e, M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om9(this, i, 16);
        }
    }
}
