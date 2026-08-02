package xsna;

import com.vk.catalog.mvi.block.music.models.MusicMviAnalyticsInfo;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicCatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public interface yc40 extends rmk {

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public interface a {
        MusicMviAnalyticsInfo getInfo();
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class b implements yc40, a {
        public final String a;
        public final MusicMviAnalyticsInfo b;

        public b(String str, MusicMviAnalyticsInfo musicMviAnalyticsInfo) {
            this.a = str;
            this.b = musicMviAnalyticsInfo;
        }

        public final String a() {
            return this.a;
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

        @Override // xsna.yc40.a
        public final MusicMviAnalyticsInfo getInfo() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RecommendedPlaylistEvent(blockId=" + this.a + ", info=" + this.b + ')';
        }
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class c implements yc40 {
        public final String a;
        public final MusicTrack b;

        public c(MusicTrack musicTrack, String str) {
            this.a = str;
            this.b = musicTrack;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendedPlaylistPlayTrackEvent(blockId=");
            sb.append(this.a);
            sb.append(", musicTrack=");
            return rq.c(sb, this.b, ')');
        }
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class d implements yc40 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SaveMusicPlaylistEvent(blockId="), this.a, ')');
        }
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class e implements yc40 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SelectMusicFilterEvent(replaceId="), this.a, ')');
        }
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class f implements yc40, a {
        public final String a;
        public final MusicMviAnalyticsInfo b;

        public f(String str, MusicMviAnalyticsInfo musicMviAnalyticsInfo) {
            this.a = str;
            this.b = musicMviAnalyticsInfo;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        @Override // xsna.yc40.a
        public final MusicMviAnalyticsInfo getInfo() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SmartPlaylistEvent(blockId=" + this.a + ", info=" + this.b + ')';
        }
    }

    /* compiled from: MusicCatalogAnalyticsEvent.kt */
    public static final class g implements yc40, a {
        public final String a;
        public final MusicMviAnalyticsInfo b;

        public g(String str, MusicMviAnalyticsInfo musicMviAnalyticsInfo) {
            this.a = str;
            this.b = musicMviAnalyticsInfo;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        @Override // xsna.yc40.a
        public final MusicMviAnalyticsInfo getInfo() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TogglePlayArtistMix(blockId=" + this.a + ", info=" + this.b + ')';
        }
    }
}
