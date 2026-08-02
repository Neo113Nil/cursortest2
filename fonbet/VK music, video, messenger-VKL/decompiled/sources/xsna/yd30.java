package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.mno0;

/* compiled from: MovieHeaderViewState.kt */
/* loaded from: classes.dex */
public final class yd30 implements r2a {
    public final BlockId b;
    public final mno0.i c;
    public final mno0 d;

    public yd30(BlockId blockId, mno0.i iVar, mno0 mno0Var) {
        this.b = blockId;
        this.c = iVar;
        this.d = mno0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd30)) {
            return false;
        }
        yd30 yd30Var = (yd30) obj;
        return this.b.equals(yd30Var.b) && this.c.equals(yd30Var.c) && epx.f(this.d, yd30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MovieHeaderViewState(blockId=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
