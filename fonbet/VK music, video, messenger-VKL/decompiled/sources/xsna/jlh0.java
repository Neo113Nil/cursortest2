package xsna;

import android.content.Context;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;

/* compiled from: SdkUserLinksViewerRenderer.kt */
/* loaded from: classes17.dex */
public interface jlh0 {
    boolean a(SdkVideoFile sdkVideoFile);

    CharSequence b(Context context, SdkActionLink sdkActionLink, boolean z, SdkVideoFileModeration sdkVideoFileModeration);
}
