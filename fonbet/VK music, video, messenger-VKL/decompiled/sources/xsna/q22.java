package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: AndroidAutoPlayableId.kt */
/* loaded from: classes16.dex */
public interface q22 {

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class a implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Artist(artistId=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class b implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Curator(curatorId=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class c implements q22 {
        public final String a;
        public final boolean b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public c(String str, boolean z, String str2) {
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = MusicPlaybackLaunchContext.Fb(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FastPlay(ref=");
            sb.append(this.a);
            sb.append(", isShuffled=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class d implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public d(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playlist(pid=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class e implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Podcast(podcastId=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class f implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public f(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Track(secureMid=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AndroidAutoPlayableId.kt */
    public static final class g implements q22 {
        public final String a;
        public final String b;
        public final String c;
        public final MusicPlaybackLaunchContext d;

        public g(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = MusicPlaybackLaunchContext.Fb(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkMix(mixId=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", blockId=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
