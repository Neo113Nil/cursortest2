package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.gfj0;
import xsna.tlo0;

/* compiled from: ShopsClipsGridBlockBadgeMapper.kt */
/* loaded from: classes17.dex */
public final class yej0 implements xae {
    public final ebe a;

    public yej0(ebe ebeVar) {
        this.a = ebeVar;
    }

    @Override // xsna.xae
    public final vae a(SdkClipVideoFile sdkClipVideoFile) {
        gfj0.a a;
        if (!this.a.a || (a = gfj0.a(sdkClipVideoFile)) == null) {
            return null;
        }
        tlo0.h d = oq.d(tlo0.Companion, a.a);
        String str = a.b;
        return new vae(d, str != null ? new tlo0.h(str) : null);
    }
}
