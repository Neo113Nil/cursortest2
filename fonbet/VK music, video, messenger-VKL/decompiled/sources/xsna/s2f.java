package xsna;

import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.comment.ReplyInfo;

/* compiled from: ClipsSdkAdapter.kt */
/* loaded from: classes17.dex */
public interface s2f {
    VideoFile a(SdkVideoFile sdkVideoFile);

    SdkReplyInfo b(ReplyInfo replyInfo);

    SdkVideoFile c(VideoFile videoFile);

    ClipsDraftablePlaylist d(SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist);

    SdkClipVideoFile e(ClipVideoFile clipVideoFile);
}
