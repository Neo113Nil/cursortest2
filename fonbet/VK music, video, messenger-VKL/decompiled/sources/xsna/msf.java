package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;

/* compiled from: ClipsWrapperNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface msf {

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class a implements msf {
        public static final a a = new a();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class b implements msf {
        public final VideoFile a;

        public b(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("ClipPromotion(videoFile="), this.a, ')');
        }
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class c implements msf {
        public final VideoFile a;

        public c(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("ClipStatistics(videoFile="), this.a, ')');
        }
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class d implements msf {
        public final String a;
        public final String b;
        public final MusicTrack c;

        public d(MusicTrack musicTrack, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = musicTrack;
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            MusicTrack musicTrack = this.c;
            return hashCode2 + (musicTrack != null ? musicTrack.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateClip(trackCode=");
            sb.append(this.a);
            sb.append(", trendingHashtag=");
            sb.append(this.b);
            sb.append(", musicTrack=");
            return rq.c(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class e implements msf {
        public static final e a = new e();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class f implements msf {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LiveRecordingStatistics(videoFile=null)";
        }
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class g implements msf {
        public static final g a = new g();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class h implements msf {
        public static final h a = new h();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class i implements msf {
        public final boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MoreMenu(withShare="), this.a, ')');
        }
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class j implements msf {
        public static final j a = new j();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class k implements msf {
        public static final k a = new k();
    }

    /* compiled from: ClipsWrapperNavigationEvent.kt */
    public static final class l implements msf {
        public static final l a = new l();
    }
}
