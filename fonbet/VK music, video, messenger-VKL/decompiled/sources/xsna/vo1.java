package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;

/* compiled from: AlbumsListView.kt */
/* loaded from: classes.dex */
public final class vo1 implements r2a {
    public final BlockId b;
    public final String c;
    public final VideoCellViewState d;
    public final boolean e;
    public final boolean f;

    public vo1(BlockId blockId, String str, VideoCellViewState videoCellViewState, boolean z, boolean z2) {
        this.b = blockId;
        this.c = str;
        this.d = videoCellViewState;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1)) {
            return false;
        }
        vo1 vo1Var = (vo1) obj;
        return epx.f(this.b, vo1Var.b) && epx.f(this.c, vo1Var.c) && epx.f(this.d, vo1Var.d) && this.e == vo1Var.e && this.f == vo1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumHorizontalViewState(blockId=");
        sb.append(this.b);
        sb.append(", videoTitle=");
        sb.append(this.c);
        sb.append(", videoCellViewState=");
        sb.append(this.d);
        sb.append(", newVideoBadge=");
        sb.append(this.e);
        sb.append(", isTablet=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
