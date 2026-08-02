package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: VideoBlockAction.kt */
/* loaded from: classes16.dex */
public final class s5s0 implements t5s0 {
    public final BlockId b;
    public final boolean c;
    public final gmq d;

    public s5s0(BlockId blockId, boolean z, gmq gmqVar) {
        this.b = blockId;
        this.c = z;
        this.d = gmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5s0)) {
            return false;
        }
        s5s0 s5s0Var = (s5s0) obj;
        return epx.f(this.b, s5s0Var.b) && this.c == s5s0Var.c && epx.f(this.d, s5s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "Succeeded(blockId=" + this.b + ", isAdded=" + this.c + ", videoFile=" + this.d + ')';
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return this.b;
    }
}
