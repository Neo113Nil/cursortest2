package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoPlaylistToolbarComposeVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class e5t0 extends FunctionReferenceImpl implements izs<VideoPlaylistBottomSheetRedesign.Action, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(VideoPlaylistBottomSheetRedesign.Action action) {
        VideoAlbumAnalyticsInfo.ClickTarget clickTarget;
        VideoPlaylistBottomSheetRedesign.Action action2 = action;
        VideoPlaylistToolbarComposeVh videoPlaylistToolbarComposeVh = (VideoPlaylistToolbarComposeVh) this.receiver;
        UIBlock uIBlock = videoPlaylistToolbarComposeVh.d;
        if (uIBlock != null) {
            int i = VideoPlaylistToolbarComposeVh.a.$EnumSwitchMapping$1[action2.ordinal()];
            if (i == 1) {
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.ShowAuthor;
            } else if (i == 2) {
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.CopyLink;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Share;
            }
            videoPlaylistToolbarComposeVh.c.a(new cfp0(uIBlock, new VideoAlbumAnalyticsInfo(clickTarget, null)));
        }
        return s3q0.a;
    }
}
