package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: VideoTrailerView.kt */
/* loaded from: classes.dex */
public final class vmt0 implements r2a {
    public final BlockId b;
    public final PreviewViewState c;
    public final q5b0 d;

    public vmt0(BlockId blockId, PreviewViewState previewViewState, q5b0 q5b0Var) {
        this.b = blockId;
        this.c = previewViewState;
        this.d = q5b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmt0)) {
            return false;
        }
        vmt0 vmt0Var = (vmt0) obj;
        return epx.f(this.b, vmt0Var.b) && epx.f(this.c, vmt0Var.c) && epx.f(this.d, vmt0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        q5b0 q5b0Var = this.d;
        return hashCode + (q5b0Var == null ? 0 : q5b0Var.hashCode());
    }

    public final String toString() {
        return "ViewState(blockId=" + this.b + ", previewState=" + this.c + ", playerWithAdControlsViewState=" + this.d + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
