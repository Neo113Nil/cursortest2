package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: VideoTrailerView.kt */
/* loaded from: classes16.dex */
public final class pmt0 implements omt0 {
    public final BlockId b;

    public pmt0(BlockId blockId) {
        this.b = blockId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmt0) && epx.f(this.b, ((pmt0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnReplayClicked(blockId=" + this.b + ')';
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return this.b;
    }
}
