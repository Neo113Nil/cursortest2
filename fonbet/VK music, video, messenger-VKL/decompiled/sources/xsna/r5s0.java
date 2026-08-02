package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: VideoBlockAction.kt */
/* loaded from: classes16.dex */
public final class r5s0 implements t5s0 {
    public final BlockId b;
    public final gmq c;

    public r5s0(BlockId blockId, gmq gmqVar) {
        this.b = blockId;
        this.c = gmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5s0)) {
            return false;
        }
        r5s0 r5s0Var = (r5s0) obj;
        return epx.f(this.b, r5s0Var.b) && epx.f(this.c, r5s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(blockId=" + this.b + ", videoFile=" + this.c + ')';
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return this.b;
    }
}
