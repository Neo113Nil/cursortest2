package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.VideoFile;
import java.util.Collections;

/* compiled from: ClipsRouterImpl.kt */
/* loaded from: classes2.dex */
public final class c2f implements y1f {
    public final boolean a;
    public final boolean b;
    public z1f c;

    public c2f(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // xsna.y1f
    public final void a(Activity activity, String str, VideoFile videoFile, fh5 fh5Var) {
        SdkVideoFile c = g620.f().e0().c(videoFile);
        if (this.a) {
            ClipsRouter.b(g620.f().a(), activity, c(c, str), fh5Var, null, null, null, this.b, 120);
        } else {
            ClipsRouter.c(g620.f().a(), activity, Collections.singletonList(c(c, str)), fh5Var, null, null, null, null, this.b, null, 1912);
        }
    }

    @Override // xsna.y1f
    public final void b(z1f z1fVar) {
        this.c = z1fVar;
    }

    public final ClipFeedTab c(SdkVideoFile sdkVideoFile, String str) {
        SdkNewsMonotheme v1;
        z1f z1fVar = this.c;
        if (z1fVar != null) {
            return new ClipFeedTab.SingleClipWithDecoration(sdkVideoFile, str, z1fVar.e, z1fVar.a, z1fVar.b, z1fVar.c, z1fVar.d, null, z1fVar.f.invoke(), 128, null);
        }
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        return (sdkClipVideoFile == null || (v1 = sdkClipVideoFile.v1()) == null) ? new ClipFeedTab.SingleClip(sdkVideoFile, str, null, false, false, null, null, null, 252, null) : new ClipFeedTab.NewsMonotheme(v1.b, v1.c, sdkVideoFile, null, 8, null);
    }
}
