package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;

/* compiled from: InteractiveVideoAction.kt */
/* loaded from: classes3.dex */
public abstract class acx {

    /* compiled from: InteractiveVideoAction.kt */
    public static final class a extends acx {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 167002298;
        }

        public final String toString() {
            return "ActivateExtendSeekBar";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class b extends acx {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1369398653;
        }

        public final String toString() {
            return "CloseExtendSeekBar";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class c extends acx {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -532271989;
        }

        public final String toString() {
            return "FastSeekBackward";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class d extends acx {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 68517149;
        }

        public final String toString() {
            return "FastSeekForward";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class e extends acx {
        public final VideoFile a;

        public e(VideoFile videoFile) {
            this.a = videoFile;
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
            return lq.a(new StringBuilder("OnRestrictedVideoConfirm(video="), this.a, ')');
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class f extends acx {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -514823485;
        }

        public final String toString() {
            return "OpenExtendSeekBar";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class g extends acx {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public g(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playback(play=");
            sb.append(this.a);
            sb.append(", byUser=");
            sb.append(this.b);
            sb.append(", isReplay=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class h extends acx {
        public final long a;

        public h(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Seek(position="));
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class i extends acx {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1838322351;
        }

        public final String toString() {
            return "SeekToPreviousChapter";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class j extends acx {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetContainersLocked(isLocked="), this.a, ')');
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class k extends acx {
        public final boolean a;

        public k(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetIsNotInterested(isNotInterested="), this.a, ')');
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class l extends acx {
        public final float a;

        public l(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.a, ((l) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("SetPlaybackSpeed(playbackSpeed="));
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class m extends acx {
        public final int a;

        public m(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SetQuality(quality="), this.a, ')');
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class n extends acx {
        public final float a;

        public n(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Float.compare(this.a, ((n) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("SetVolume(volume="));
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class o extends acx {
        public final Context a;

        public o(Context context) {
            this.a = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowOnboarding(context=" + this.a + ')';
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class p extends acx {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1853492812;
        }

        public final String toString() {
            return "SkipToEvent";
        }
    }

    /* compiled from: InteractiveVideoAction.kt */
    public static final class q extends acx {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 861313425;
        }

        public final String toString() {
            return "WatchLater";
        }
    }
}
