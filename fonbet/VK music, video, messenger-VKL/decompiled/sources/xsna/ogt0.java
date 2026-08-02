package xsna;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.utils.VerifyInfoHelper;
import xsna.q630;

/* compiled from: VideoShowcaseViewHolder.kt */
/* loaded from: classes16.dex */
public final class ogt0 implements yzs<String, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ UIBlockVideo b;

    public ogt0(UIBlockVideo uIBlockVideo) {
        this.b = uIBlockVideo;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(String str, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1476015786, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder.Subtitle.<anonymous> (VideoShowcaseViewHolder.kt:279)");
            }
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            baf0 f = VerifyInfoHelper.f((Context) aVar2.r(AndroidCompositionLocals_androidKt.b), VerifyInfoHelper.ColorTheme.normal, this.b.B.Y());
            if (f == null) {
                aVar2.K(-110992336);
            } else {
                aVar2.K(-110992335);
                pzu0.b(new yjo(f), null, s200.H(txj0.q(q630.a.a, 16), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 0L, aVar2, 440, 8);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
