package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.music.Playlist;

/* compiled from: ArtistSliderEvent.kt */
/* loaded from: classes.dex */
public interface et3 extends smk {

    /* compiled from: ArtistSliderEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements et3 {
        public final BlockId a;
        public final Playlist b;

        public a(BlockId blockId, Playlist playlist) {
            this.a = blockId;
            this.b = playlist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenPlaylist(blockId=" + this.a + ", playlist=" + this.b + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: ArtistSliderEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements et3 {
        public final BlockId a;
        public final Playlist b;

        public b(BlockId blockId, Playlist playlist) {
            this.a = blockId;
            this.b = playlist;
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
            return "OpenPlaylistBottomSheet(blockId=" + this.a + ", playlist=" + this.b + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
