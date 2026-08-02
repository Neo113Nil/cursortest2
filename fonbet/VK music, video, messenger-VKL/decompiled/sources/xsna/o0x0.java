package xsna;

import java.util.List;

/* compiled from: VoipSelectVideoPlaylistsState.kt */
/* loaded from: classes7.dex */
public abstract class o0x0 implements km50 {

    /* compiled from: VoipSelectVideoPlaylistsState.kt */
    public static final class a extends o0x0 {
        public final d b;
        public final boolean c;

        public a(d dVar, boolean z) {
            this.b = dVar;
            this.c = z;
        }

        public static a a(a aVar, d dVar, boolean z, int i) {
            if ((i & 1) != 0) {
                dVar = aVar.b;
            }
            if ((i & 2) != 0) {
                z = aVar.c;
            }
            aVar.getClass();
            return new a(dVar, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(playlists=");
            sb.append(this.b);
            sb.append(", isSwrLoading=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipSelectVideoPlaylistsState.kt */
    public static final class b extends o0x0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(error="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoPlaylistsState.kt */
    public static final class c extends o0x0 {
        public static final c b = new c();
    }

    /* compiled from: VoipSelectVideoPlaylistsState.kt */
    public static final class d {
        public final List<lvw0> a;
        public final a990<Integer> b;

        public d(List<lvw0> list, a990<Integer> a990Var) {
            this.a = list;
            this.b = a990Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaylistsResult(items=" + this.a + ", page=" + this.b + ')';
        }
    }
}
