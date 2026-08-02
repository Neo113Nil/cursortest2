package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoPlaylistToolbarVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class i5t0 extends FunctionReferenceImpl implements izs<VideoPlaylistBottomSheet.Action, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(VideoPlaylistBottomSheet.Action action) {
        VideoAlbumAnalyticsInfo.ClickTarget clickTarget;
        VideoPlaylistBottomSheet.Action action2 = action;
        VideoPlaylistToolbarVh videoPlaylistToolbarVh = (VideoPlaylistToolbarVh) this.receiver;
        UIBlock uIBlock = videoPlaylistToolbarVh.d;
        if (uIBlock != null) {
            int i = VideoPlaylistToolbarVh.a.$EnumSwitchMapping$0[action2.ordinal()];
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
            videoPlaylistToolbarVh.c.a(new cfp0(uIBlock, new VideoAlbumAnalyticsInfo(clickTarget, null)));
        }
        return s3q0.a;
    }
}
