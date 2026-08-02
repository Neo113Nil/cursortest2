package xsna;

import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.music.MusicTrack;

/* compiled from: ClipsAudioPatch.kt */
/* loaded from: classes16.dex */
public interface xgd extends xl50 {

    /* compiled from: ClipsAudioPatch.kt */
    public static final class a implements xgd {
        public final ClipsEditorMusicInfo b;

        public a(ClipsEditorMusicInfo clipsEditorMusicInfo) {
            this.b = clipsEditorMusicInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetMusicInfo(musicInfo=" + this.b + ')';
        }
    }

    /* compiled from: ClipsAudioPatch.kt */
    public static final class b implements xgd {
        public final MusicTrack b;

        public b(MusicTrack musicTrack) {
            this.b = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
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

    /* compiled from: ClipsAudioPatch.kt */
    public static final class c implements xgd {
        public final float b;

        public c(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.b, ((c) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("UpdateFragmentDuration(duration="));
        }
    }

    /* compiled from: ClipsAudioPatch.kt */
    public static final class d implements xgd {
        public final int b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;

        public d(int i, boolean z, int i2, boolean z2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateTrackMeta(startMs=");
            sb.append(this.b);
            sb.append(", endMs=");
            sb.append(this.c);
            sb.append(", recommendedTimeMs=");
            sb.append(this.d);
            sb.append(", isFromVideo=");
            sb.append(this.e);
            sb.append(", isBoundsUserUpdated=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsAudioPatch.kt */
    public static final class e implements xgd {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateTrackPosition(positionMs="), this.b, ')');
        }
    }

    /* compiled from: ClipsAudioPatch.kt */
    public static final class f implements xgd {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("VideoPauseToggle(isPaused="), this.b, ')');
        }
    }
}
