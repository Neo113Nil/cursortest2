package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistUiAction.kt */
/* loaded from: classes16.dex */
public interface zqe extends kj50 {

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class a implements zqe {
        public final UserId b;
        public final String c;
        public final Integer d;
        public final int e;
        public final String f;

        public a(int i, Integer num, UserId userId, String str, String str2) {
            this.b = userId;
            this.c = str;
            this.d = num;
            this.e = i;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
            Integer num = this.d;
            int a2 = shy.a(this.e, (a + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.f;
            return a2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(ownerId=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", size=");
            sb.append(this.d);
            sb.append(", id=");
            sb.append(this.e);
            sb.append(", targetClipId=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class b implements zqe {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class c implements zqe {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class d implements zqe {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnClipClick(videoId="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public interface e extends zqe {

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class a implements e {
            public static final a b = new a();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class b implements e {
            public static final b b = new b();
        }
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class f implements zqe {
        public static final f b = new f();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class g implements zqe {
        public static final g b = new g();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class h implements zqe {
        public static final h b = new h();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public interface i extends zqe {

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class a implements i {
            public static final a b = new a();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class b implements i {
            public final int b;
            public final int c;

            public b(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipMove(from=");
                sb.append(this.b);
                sb.append(", to=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class c implements i {
            public static final c b = new c();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class d implements i {
            public static final d b = new d();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class e implements i {
            public static final e b = new e();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class f implements i {
            public static final f b = new f();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class g implements i {
            public static final g b = new g();
        }

        /* compiled from: ClipsPlaylistUiAction.kt */
        public static final class h implements i {
            public static final h b = new h();
        }
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class j implements zqe {
        public static final j b = new j();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class k implements zqe {
        public static final k b = new k();
    }

    /* compiled from: ClipsPlaylistUiAction.kt */
    public static final class l implements zqe {
        public final ClipsPlaylist b;

        public l(ClipsPlaylist clipsPlaylist) {
            this.b = clipsPlaylist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ReloadPlaylist(playlist=" + this.b + ')';
        }
    }
}
