package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: PlaylistScreenCatalogBlockEvent.kt */
/* loaded from: classes16.dex */
public final class jcb0 implements wnk {
    public final BlockId.Simple a;

    public jcb0(BlockId.Simple simple) {
        this.a = simple;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcb0) && this.a.equals(((jcb0) obj).a);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    public final String toString() {
        return "SortPlaylistClicked(blockId=" + this.a + ')';
    }
}
