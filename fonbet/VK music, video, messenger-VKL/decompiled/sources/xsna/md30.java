package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.mno0;

/* compiled from: MovieDescriptionView.kt */
/* loaded from: classes.dex */
public final class md30 implements r2a {
    public final BlockId b;
    public final mno0.i c;
    public final boolean d;

    public md30(BlockId blockId, mno0.i iVar, boolean z) {
        this.b = blockId;
        this.c = iVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md30)) {
            return false;
        }
        md30 md30Var = (md30) obj;
        return this.b.equals(md30Var.b) && this.c.equals(md30Var.c) && this.d == md30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieDescriptionViewState(blockId=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", isExpanded=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
