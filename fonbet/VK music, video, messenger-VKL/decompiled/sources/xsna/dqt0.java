package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;

/* compiled from: VideoView.kt */
/* loaded from: classes.dex */
public final class dqt0 implements r2a {
    public final BlockId.CompositeId b;
    public final VideoCardViewState c;
    public final l8s0 d;

    public dqt0(BlockId.CompositeId compositeId, VideoCardViewState videoCardViewState, l8s0 l8s0Var) {
        this.b = compositeId;
        this.c = videoCardViewState;
        this.d = l8s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqt0)) {
            return false;
        }
        dqt0 dqt0Var = (dqt0) obj;
        return epx.f(this.b, dqt0Var.b) && epx.f(this.c, dqt0Var.c) && epx.f(this.d, dqt0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoCardViewState videoCardViewState = this.c;
        return this.d.hashCode() + ((hashCode + (videoCardViewState == null ? 0 : videoCardViewState.hashCode())) * 31);
    }

    public final String toString() {
        return "ViewState(blockId=" + this.b + ", videoCardViewState=" + this.c + ", videoCardSize=" + this.d + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
