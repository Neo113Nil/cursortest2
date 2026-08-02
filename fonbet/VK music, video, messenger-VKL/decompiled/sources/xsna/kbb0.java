package xsna;

import com.vk.music.playlist.display.domain.AlbumType;

/* compiled from: PlaylistMetadata.kt */
/* loaded from: classes3.dex */
public interface kbb0 {

    /* compiled from: PlaylistMetadata.kt */
    public static final class a implements kbb0, e {
        public final boolean a;
        public final int b;
        public final AlbumType c;
        public final int d;
        public final String e;
        public final ybb0 f;
        public final boolean g;

        public a(boolean z, int i, AlbumType albumType, int i2, String str, ybb0 ybb0Var, boolean z2) {
            this.a = z;
            this.b = i;
            this.c = albumType;
            this.d = i2;
            this.e = str;
            this.f = ybb0Var;
            this.g = z2;
        }

        @Override // xsna.kbb0.e
        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + urd0.a(shy.a(this.d, (this.c.hashCode() + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31), 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Album(isPaid=");
            sb.append(this.a);
            sb.append(", listeningCount=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", year=");
            sb.append(this.d);
            sb.append(", genre=");
            sb.append(this.e);
            sb.append(", artist=");
            sb.append(this.f);
            sb.append(", isExclusive=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: PlaylistMetadata.kt */
    public interface b extends kbb0 {
        int a();
    }

    /* compiled from: PlaylistMetadata.kt */
    public static final class c implements b {
        public final int a;
        public final long b;
        public final String c;

        public c(int i, long j, String str) {
            this.a = i;
            this.b = j;
            this.c = str;
        }

        @Override // xsna.kbb0.b
        public final int a() {
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
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChatPlaylist(listeningCount=");
            sb.append(this.a);
            sb.append(", timeSinceUpdated=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: PlaylistMetadata.kt */
    public static final class d implements kbb0 {
        public static final d a = new d();
    }

    /* compiled from: PlaylistMetadata.kt */
    public interface e {
        boolean b();
    }

    /* compiled from: PlaylistMetadata.kt */
    public static final class f implements b, e {
        public final int a;
        public final long b;
        public final boolean c;
        public final ybb0 d;
        public final boolean e;
        public final boolean f;

        public f(int i, long j, boolean z, ybb0 ybb0Var, boolean z2, boolean z3) {
            this.a = i;
            this.b = j;
            this.c = z;
            this.d = ybb0Var;
            this.e = z2;
            this.f = z3;
        }

        @Override // xsna.kbb0.b
        public final int a() {
            return this.a;
        }

        @Override // xsna.kbb0.e
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && epx.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + qoy.b(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playlist(listeningCount=");
            sb.append(this.a);
            sb.append(", timeSinceUpdated=");
            sb.append(this.b);
            sb.append(", isPaid=");
            sb.append(this.c);
            sb.append(", owner=");
            sb.append(this.d);
            sb.append(", isMine=");
            sb.append(this.e);
            sb.append(", isCurator=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: PlaylistMetadata.kt */
    public static final class g implements kbb0 {
        public final long a;
        public final String b;

        public g(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServicePlaylist(timeSinceUpdated=");
            sb.append(this.a);
            sb.append(", subtitle=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
