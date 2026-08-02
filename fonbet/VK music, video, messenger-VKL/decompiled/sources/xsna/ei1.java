package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.video.VideoAlbum;

/* compiled from: AlbumEvent.kt */
/* loaded from: classes.dex */
public interface ei1 extends smk {

    /* compiled from: AlbumEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements ei1 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CreateNewAlbum(blockId=null)";
        }

        @Override // xsna.smk
        public final BlockId w() {
            return null;
        }
    }

    /* compiled from: AlbumEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements ei1 {
        public final BlockId a;
        public final VideoAlbum b;

        public b(BlockId blockId, VideoAlbum videoAlbum) {
            this.a = blockId;
            this.b = videoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenAlbum(blockId=" + this.a + ", album=" + this.b + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
