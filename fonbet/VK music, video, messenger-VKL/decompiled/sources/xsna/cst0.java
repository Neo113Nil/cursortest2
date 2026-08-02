package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.IconViewState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoViewerViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class cst0 implements izs<VideoViewerState, ldh0> {
    public final VideoViewerArguments b;

    public cst0(VideoViewerArguments videoViewerArguments) {
        this.b = videoViewerArguments;
    }

    @Override // xsna.izs
    public final ldh0 invoke(VideoViewerState videoViewerState) {
        IconViewState iconViewState;
        IconViewState iconViewState2;
        VideoViewerState videoViewerState2 = videoViewerState;
        xk80 xk80Var = videoViewerState2.b;
        VideoViewerArguments videoViewerArguments = this.b;
        boolean z = videoViewerArguments instanceof VideoViewerArguments.Local;
        if (z) {
            iconViewState = null;
        } else {
            if (!(videoViewerArguments instanceof VideoViewerArguments.RemoteAttachedClip)) {
                throw new NoWhenBranchMatchedException();
            }
            iconViewState = IconViewState.ARROW_LEFT;
        }
        if (z) {
            iconViewState2 = IconViewState.CANCEL;
        } else {
            if (!(videoViewerArguments instanceof VideoViewerArguments.RemoteAttachedClip)) {
                throw new NoWhenBranchMatchedException();
            }
            iconViewState2 = IconViewState.CHECK;
        }
        return new ldh0(xk80Var, iconViewState, iconViewState2, !videoViewerState2.d, videoViewerState2.e, videoViewerState2.f);
    }
}
