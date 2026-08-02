package xsna;

import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.mih0;

/* compiled from: ClipsFeedPrivacyInfoBadgesMapper.kt */
/* loaded from: classes17.dex */
public final class m8e {
    public final rhh0 a;
    public final jih0 b;

    public m8e(rhh0 rhh0Var, jih0 jih0Var) {
        this.a = rhh0Var;
        this.b = jih0Var;
    }

    public final mih0.m a(SdkClipVideoFile sdkClipVideoFile) {
        Integer n;
        SdkOwner s = sdkClipVideoFile.s();
        if (epx.f(s != null ? s.b : null, this.b.c()) && (n = ((qwe) this.a.b).n(k15.A(sdkClipVideoFile))) != null) {
            return new mih0.m(sdkClipVideoFile, tq.h(tlo0.Companion, n.intValue()));
        }
        return null;
    }
}
