package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;

/* compiled from: VideosListView.kt */
/* loaded from: classes.dex */
public final class vst0 implements r2a {
    public final BlockId.CompositeId b;
    public final VideoCellViewState c;
    public final String d;

    public vst0(BlockId.CompositeId compositeId, VideoCellViewState videoCellViewState, String str) {
        this.b = compositeId;
        this.c = videoCellViewState;
        this.d = str;
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
