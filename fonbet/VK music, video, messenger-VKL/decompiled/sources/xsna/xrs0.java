package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;

/* compiled from: VideoLargeListViewState.kt */
/* loaded from: classes.dex */
public final class xrs0 implements r2a {
    public final BlockId.CompositeId b;
    public final VideoCardViewState c;
    public final q5b0 d;
    public final dg0 e;
    public final kjz f;

    public xrs0(BlockId.CompositeId compositeId, VideoCardViewState videoCardViewState, q5b0 q5b0Var, dg0 dg0Var, kjz kjzVar) {
        this.b = compositeId;
        this.c = videoCardViewState;
        this.d = q5b0Var;
        this.e = dg0Var;
        this.f = kjzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrs0)) {
            return false;
        }
        xrs0 xrs0Var = (xrs0) obj;
        return epx.f(this.b, xrs0Var.b) && epx.f(this.c, xrs0Var.c) && epx.f(this.d, xrs0Var.d) && epx.f(this.e, xrs0Var.e) && epx.f(this.f, xrs0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoCardViewState videoCardViewState = this.c;
        int hashCode2 = (hashCode + (videoCardViewState == null ? 0 : videoCardViewState.hashCode())) * 31;
        q5b0 q5b0Var = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (q5b0Var == null ? 0 : q5b0Var.hashCode())) * 31)) * 31;
        kjz kjzVar = this.f;
        return hashCode3 + (kjzVar != null ? kjzVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoLargeListViewState(blockId=" + this.b + ", videoCardViewState=" + this.c + ", playerWithAdControlsViewState=" + this.d + ", adInstreamRedirectViewState=" + this.e + ", liveInlineHolderViewState=" + this.f + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
