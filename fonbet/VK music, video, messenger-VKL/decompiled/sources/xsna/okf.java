package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ClipsUploadTheme.kt */
/* loaded from: classes17.dex */
public final class okf {
    public static final pqo a = new pqo(new pr6(6));
    public static final a b = new a();

    /* compiled from: ClipsUploadTheme.kt */
    public static final class a extends lg90 {
        @Override // xsna.lg90
        public final long i() {
            return (Float.floatToRawIntBits(28.0f) << 32) | (Float.floatToRawIntBits(28.0f) & 4294967295L);
        }

        @Override // xsna.lg90
        public final void j(oio oioVar) {
            oio.V1(oioVar, l5g.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }

    public static final void a(egf egfVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1965795450);
        int i2 = (M.J(egfVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1965795450, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.theme.ClipsUploadTheme (ClipsUploadTheme.kt:20)");
            }
            rvi.a(a.b(egfVar == null ? new nkf() : egfVar), jaiVar, M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(egfVar, jaiVar, i, 2);
        }
    }
}
