package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.movika.api.InteractiveData;

/* compiled from: InteractiveVideoView.kt */
/* loaded from: classes3.dex */
public interface rcx extends bcx, mnt0 {

    /* compiled from: InteractiveVideoView.kt */
    public static abstract class a {

        /* compiled from: InteractiveVideoView.kt */
        /* renamed from: xsna.rcx$a$a, reason: collision with other inner class name */
        public static final class C3604a extends a {
            public static final C3604a a = new C3604a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3604a);
            }

            public final int hashCode() {
                return 906927333;
            }

            public final String toString() {
                return "Ended";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1622201511;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1646588829;
            }

            public final String toString() {
                return "Paused";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class d extends a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 791987097;
            }

            public final String toString() {
                return "Playing";
            }
        }
    }

    /* compiled from: InteractiveVideoView.kt */
    public interface b {
        void b(c cVar);
    }

    /* compiled from: InteractiveVideoView.kt */
    public static final class c {
        public final boolean a;
        public final float b;
        public final a c;
        public final String d;
        public final String e;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Float.compare(this.b, cVar.b) == 0 && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(play=");
            sb.append(this.a);
            sb.append(", volume=");
            sb.append(this.b);
            sb.append(", interactivePlaybackState=");
            sb.append(this.c);
            sb.append(", sessionId=");
            sb.append(this.d);
            sb.append(", videoId=");
            return ho8.a(sb, this.e, ')');
        }

        public c(boolean z, float f, a aVar, String str, String str2) {
            this.a = z;
            this.b = f;
            this.c = aVar;
            this.d = str;
            this.e = str2;
        }

        public /* synthetic */ c(int i) {
            this(false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a.C3604a.a, null, null);
        }
    }

    /* compiled from: InteractiveVideoView.kt */
    public static abstract class d {

        /* compiled from: InteractiveVideoView.kt */
        public static final class a extends d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -835347979;
            }

            public final String toString() {
                return "CloseByPip";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class b extends d {
            public final String a;

            public b(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("OpenURIClick(uri="), this.a, ')');
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class c extends d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 815716995;
            }

            public final String toString() {
                return "PlaybackCompleted";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        /* renamed from: xsna.rcx$d$d, reason: collision with other inner class name */
        public static final class C3605d extends d {
            public static final C3605d a = new C3605d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3605d);
            }

            public final int hashCode() {
                return 200549560;
            }

            public final String toString() {
                return "SettingsClick";
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class e extends d {
            public final boolean a;
            public final boolean b;

            public e(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && this.b == eVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToggleControls(isShow=");
                sb.append(this.a);
                sb.append(", byUser=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: InteractiveVideoView.kt */
        public static final class f extends d {
            public final boolean a;

            public f(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("TogglePlayPause(isPaused="), this.a, ')');
            }
        }
    }

    /* compiled from: InteractiveVideoView.kt */
    public interface e {
        void ab(d dVar);
    }

    void E2(boolean z);

    void G3(com.vk.video.ui.discovery.minimizable.player.a aVar);

    void L1(e eVar);

    void X0(com.vk.video.ui.discovery.minimizable.player.a aVar);

    void b();

    void destroy();

    c getState();

    View getView();

    View o0();

    default boolean o4() {
        return false;
    }

    @ozl
    tn10 q3();

    void r2(e eVar);

    void y0(InteractiveData interactiveData);

    default void s2() {
    }

    default void b3(boolean z) {
    }

    default void t1(VideoFile videoFile) {
    }

    default void P(boolean z, boolean z2) {
    }

    default void j2(boolean z, boolean z2) {
    }
}
