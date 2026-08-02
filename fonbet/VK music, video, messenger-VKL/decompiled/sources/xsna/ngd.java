package xsna;

import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.music.MusicTrack;

/* compiled from: ClipsAudioAction.kt */
/* loaded from: classes16.dex */
public abstract class ngd implements kj50 {

    /* compiled from: ClipsAudioAction.kt */
    public static final class a extends ngd {
        public static final a b = new a();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class b extends ngd {
        public static final b b = new b();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class c extends ngd {
        public static final c b = new c();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class d extends ngd {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnCreated(usedHeight="), this.b, ')');
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class e extends ngd {
        public static final e b = new e();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class f extends ngd {
        public static final f b = new f();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class g extends ngd {
        public static final g b = new g();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class h extends ngd {
        public static final h b = new h();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class i extends ngd {
        public static final i b = new i();
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class j extends ngd {
        public final ClipsEditorMusicInfo b;

        public j(ClipsEditorMusicInfo clipsEditorMusicInfo) {
            this.b = clipsEditorMusicInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetMusicInfo(musicInfo=" + this.b + ')';
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class k extends ngd {
        public final MusicTrack b;

        public k(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            MusicTrack musicTrack = this.b;
            if (musicTrack == null) {
                return 0;
            }
            return musicTrack.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("SetTrack(track="), this.b, ')');
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class l extends ngd {
        public final float b;

        public l(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.b, ((l) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("UpdateFragmentDuration(duration="));
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class m extends ngd {
        public final int b;
        public final int c;

        public m(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.c == mVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateTrackBounds(startMs=");
            sb.append(this.b);
            sb.append(", endMs=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class n extends ngd {
        public final MusicTrack b;

        public n(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            MusicTrack musicTrack = this.b;
            if (musicTrack == null) {
                return 0;
            }
            return musicTrack.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("UpdateTrackMeta(track="), this.b, ')');
        }
    }

    /* compiled from: ClipsAudioAction.kt */
    public static final class o extends ngd {
        public final int b;

        public o(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateTrackPosition(positionMs="), this.b, ')');
        }
    }
}
