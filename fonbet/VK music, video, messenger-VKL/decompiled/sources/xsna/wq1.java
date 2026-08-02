package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;

/* compiled from: AlbumsSliderView.kt */
/* loaded from: classes.dex */
public final class wq1 implements r2a {
    public final BlockId b;
    public final String c;
    public final VideoCardViewState d;
    public final boolean e;
    public final VideoCardViewState.Size f;
    public final float g;

    public wq1(BlockId blockId, String str, VideoCardViewState videoCardViewState, boolean z, VideoCardViewState.Size size, float f) {
        this.b = blockId;
        this.c = str;
        this.d = videoCardViewState;
        this.e = z;
        this.f = size;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq1)) {
            return false;
        }
        wq1 wq1Var = (wq1) obj;
        return this.b.equals(wq1Var.b) && this.c.equals(wq1Var.c) && this.d.equals(wq1Var.d) && this.e == wq1Var.e && this.f == wq1Var.f && pco.b(this.g, wq1Var.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ((this.f.hashCode() + qoy.b((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumVerticalViewState(blockId=");
        sb.append(this.b);
        sb.append(", videoTitle=");
        sb.append(this.c);
        sb.append(", videoCardViewState=");
        sb.append(this.d);
        sb.append(", newVideoBadge=");
        sb.append(this.e);
        sb.append(", size=");
        sb.append(this.f);
        sb.append(", width=");
        return ir.f(')', this.g, sb);
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
