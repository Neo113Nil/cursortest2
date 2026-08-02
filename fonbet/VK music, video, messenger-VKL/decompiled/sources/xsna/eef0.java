package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.music.Playlist;

/* compiled from: RecommendedPlaylistEvent.kt */
/* loaded from: classes.dex */
public interface eef0 extends smk {

    /* compiled from: RecommendedPlaylistEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements eef0 {
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

    /* compiled from: RecommendedPlaylistEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements eef0 {
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

    /* compiled from: RecommendedPlaylistEvent.kt */
    /* loaded from: classes16.dex */
    public static final class c implements eef0 {
        public final BlockId a;
        public final Playlist b;
        public final String c;
        public final String d;

        public c(BlockId blockId, Playlist playlist, String str, String str2) {
            this.a = blockId;
            this.b = playlist;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenSnippet(blockId=");
            sb.append(this.a);
            sb.append(", playlist=");
            sb.append(this.b);
            sb.append(", trackToStartMid=");
            sb.append(this.c);
            sb.append(", sectionId=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
