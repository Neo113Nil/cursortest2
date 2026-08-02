package xsna;

import android.content.Context;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipLinkModerationStatus;

/* compiled from: UserLinksViewerRenderer.kt */
/* loaded from: classes16.dex */
public interface pkq0 {
    boolean a(VideoFile videoFile);

    CharSequence b(Context context, ActionLink actionLink, boolean z, ClipLinkModerationStatus clipLinkModerationStatus);
}
