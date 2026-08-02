package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;

/* compiled from: VideosStackedListView.kt */
/* loaded from: classes.dex */
public final class rtt0 implements r2a {
    public final BlockId.CompositeId b;
    public final VideoCardViewState c;
    public final boolean d;

    public rtt0(BlockId.CompositeId compositeId, VideoCardViewState videoCardViewState, boolean z) {
        this.b = compositeId;
        this.c = videoCardViewState;
        this.d = z;
        new hxm0(11);
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
