package xsna;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommentScreenModeProviderImpl.kt */
/* loaded from: classes4.dex */
public final class gcg implements fgg {
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> a;

    public gcg(io.reactivex.rxjava3.subjects.d<VideoMinimizableState> dVar) {
        this.a = dVar;
    }

    @Override // xsna.fgg
    public final CommentScreenMode a() {
        VideoMinimizableState P0 = this.a.P0();
        if ((P0 instanceof VideoMinimizableState.Expanded.Compact) || (P0 instanceof VideoMinimizableState.Expanded.MatchRatio)) {
            return CommentScreenMode.DISCOVERY;
        }
        if (P0 instanceof VideoMinimizableState.FullscreenHorizontal) {
            return CommentScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (P0 instanceof VideoMinimizableState.FullscreenVertical) {
            return CommentScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (epx.f(P0, VideoMinimizableState.Hidden.b) || epx.f(P0, VideoMinimizableState.Pip.b) || epx.f(P0, VideoMinimizableState.PreparedToPip.b) || (P0 instanceof VideoMinimizableState.Animating) || (P0 instanceof VideoMinimizableState.Collapsed) || P0 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
