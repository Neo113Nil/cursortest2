package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import xsna.q22;

/* compiled from: VkAndroidAutoPlayableSerializer.kt */
/* loaded from: classes16.dex */
public final class k8u0 implements j8u0, h8u0 {
    public final i8u0<q22> a;

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class a implements j8u0, h8u0 {
        public static final a a = new a();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.a(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1782407284;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.a aVar = (q22.a) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = aVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = aVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "ArtistSerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class b implements j8u0, h8u0 {
        public static final b a = new b();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.b(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1218071315;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.b bVar = (q22.b) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = bVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = bVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "CuratorSerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class c implements j8u0, h8u0 {
        public static final c a = new c();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            Integer m = arm0.m(10, (String) b0.get(1));
            boolean z = m != null && m.intValue() == 1;
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = str2;
            }
            return new q22.c(str2, z, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1373599965;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.c cVar = (q22.c) obj;
            StringBuilder sb = new StringBuilder();
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = cVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            sb.append(cVar.b ? 1 : 0);
            sb.append('|');
            String str = cVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "FastPlaySerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class d implements j8u0, h8u0 {
        public static final d a = new d();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.d(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -425365889;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.d dVar = (q22.d) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = dVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = dVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "PlaylistSerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class e implements j8u0, h8u0 {
        public static final e a = new e();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.e(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -181597477;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.e eVar = (q22.e) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = eVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = eVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "PodcastSerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class f implements j8u0, h8u0 {
        public static final f a = new f();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.f(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1822944862;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.f fVar = (q22.f) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = fVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = fVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "TrackSerializer";
        }
    }

    /* compiled from: VkAndroidAutoPlayableSerializer.kt */
    public static final class g implements j8u0, h8u0 {
        public static final g a = new g();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            String str2 = (String) b0.get(0);
            String str3 = (String) b0.get(1);
            String a2 = cqm0.a((String) b0.get(2));
            if (a2 == null) {
                a2 = (String) b0.get(1);
            }
            return new q22.g(str2, str3, a2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 898159806;
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            q22.g gVar = (q22.g) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(gVar.a);
            sb.append('|');
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = gVar.d;
            sb.append(musicPlaybackLaunchContext.t());
            sb.append('|');
            String str = gVar.c;
            if (epx.f(str, musicPlaybackLaunchContext.t())) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }

        public final String toString() {
            return "VkMixSerializer";
        }
    }

    public k8u0(i8u0 i8u0Var) {
        this.a = i8u0Var;
    }

    @Override // xsna.h8u0
    public final Object a(String str) {
        return this.a.a(str);
    }

    @Override // xsna.j8u0
    public final String serialize(Object obj) {
        return this.a.serialize((q22) obj);
    }
}
