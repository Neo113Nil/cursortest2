package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: OfflineCacheStatEvent.kt */
/* loaded from: classes3.dex */
public abstract class lt70 extends l5m {

    /* compiled from: OfflineCacheStatEvent.kt */
    public static final class a extends lt70 {
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int q;
        public final int r;
        public final int u;
        public final int v;
        public final int w;
        public final int x;
        public final int y;
        public final int z;
        public final String p = "corrupted_mark";
        public final int s = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL.l() ? 1 : 0;
        public final int t = MusicOfflineCacheStorage.SD_CARD.l() ? 1 : 0;

        public a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6) {
            this.h = z;
            this.i = z2;
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.n = i5;
            this.o = i6;
            this.q = z ? 1 : 0;
            this.r = z2 ? 1 : 0;
            this.u = i;
            this.v = i2;
            this.w = i3;
            this.x = i4;
            this.y = i5;
            this.z = i6;
        }

        @Override // xsna.lt70
        public final Integer B() {
            return Integer.valueOf(this.r);
        }

        @Override // xsna.lt70
        public final Integer C() {
            return Integer.valueOf(this.s);
        }

        @Override // xsna.lt70
        public final Integer D() {
            return Integer.valueOf(this.t);
        }

        @Override // xsna.lt70
        public final Integer E() {
            return Integer.valueOf(this.u);
        }

        @Override // xsna.lt70
        public final Integer F() {
            return Integer.valueOf(this.v);
        }

        @Override // xsna.lt70
        public final Integer G() {
            return Integer.valueOf(this.w);
        }

        @Override // xsna.lt70
        public final Integer H() {
            return Integer.valueOf(this.x);
        }

        @Override // xsna.lt70
        public final Integer I() {
            return Integer.valueOf(this.y);
        }

        @Override // xsna.lt70
        public final String J() {
            return this.p;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.o) + shy.a(this.n, shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, qoy.b(Boolean.hashCode(this.h) * 31, 31, this.i), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CorruptedMarked(isSubscribed=");
            sb.append(this.h);
            sb.append(", oneVideoOn=");
            sb.append(this.i);
            sb.append(", unknownCount=");
            sb.append(this.j);
            sb.append(", manifestDbCount=");
            sb.append(this.k);
            sb.append(", manifestPlaylistCount=");
            sb.append(this.l);
            sb.append(", segmentCount=");
            sb.append(this.m);
            sb.append(", sdCardCount=");
            sb.append(this.n);
            sb.append(", malformedCount=");
            return vu5.b(sb, this.o, ')');
        }

        @Override // xsna.lt70
        public final Integer w() {
            return Integer.valueOf(this.q);
        }

        @Override // xsna.lt70
        public final Integer x() {
            return Integer.valueOf(this.z);
        }
    }

    /* compiled from: OfflineCacheStatEvent.kt */
    public static final class b extends lt70 {
        public final String h;
        public final Exception i;
        public final boolean j;
        public final String k;
        public final String l;
        public final boolean m;
        public final String n = "one_video_migration_error";
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final int s;
        public final int t;

        public b(String str, Exception exc, boolean z, String str2, String str3, boolean z2) {
            this.h = str;
            this.i = exc;
            this.j = z;
            this.k = str2;
            this.l = str3;
            this.m = z2;
            this.o = str;
            this.p = lt70.v(this, exc);
            this.q = str2;
            this.r = str3;
            this.s = z ? 1 : 0;
            this.t = z2 ? 1 : 0;
        }

        @Override // xsna.lt70
        public final Integer B() {
            return Integer.valueOf(this.t);
        }

        @Override // xsna.lt70
        public final String J() {
            return this.n;
        }

        @Override // xsna.lt70
        public final String P() {
            return this.o;
        }

        @Override // xsna.lt70
        public final String Q() {
            return this.p;
        }

        @Override // xsna.lt70
        public final String R() {
            return this.q;
        }

        @Override // xsna.lt70
        public final String S() {
            return this.r;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && this.j == bVar.j && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && this.m == bVar.m;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.m) + urd0.a(urd0.a(qoy.b((this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OneVideoMigrationError(id=");
            sb.append(this.h);
            sb.append(", error=");
            sb.append(this.i);
            sb.append(", isOneVideoPlayerEnabled=");
            sb.append(this.j);
            sb.append(", manifestKeyFrom=");
            sb.append(this.k);
            sb.append(", manifestKeyTo=");
            sb.append(this.l);
            sb.append(", isMigrationSuccess=");
            return defpackage.q0.a(sb, this.m, ')');
        }

        @Override // xsna.lt70
        public final Integer w() {
            return Integer.valueOf(this.s);
        }
    }

    /* compiled from: OfflineCacheStatEvent.kt */
    public static final class c extends lt70 {
        public final String h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final String m;
        public final int n;
        public final int o;
        public final int p;
        public final String l = "playback_fatal_error";
        public final int q = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL.l() ? 1 : 0;
        public final int r = MusicOfflineCacheStorage.SD_CARD.l() ? 1 : 0;

        public c(String str, boolean z, boolean z2, boolean z3) {
            this.h = str;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.m = erm0.D0(256, str);
            this.n = z ? 1 : 0;
            this.o = z2 ? 1 : 0;
            this.p = z3 ? 1 : 0;
        }

        @Override // xsna.lt70
        public final Integer B() {
            return Integer.valueOf(this.o);
        }

        @Override // xsna.lt70
        public final Integer C() {
            return Integer.valueOf(this.p);
        }

        @Override // xsna.lt70
        public final Integer D() {
            return Integer.valueOf(this.q);
        }

        @Override // xsna.lt70
        public final Integer E() {
            return Integer.valueOf(this.r);
        }

        @Override // xsna.lt70
        public final String J() {
            return this.l;
        }

        @Override // xsna.lt70
        public final String P() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.h, cVar.h) && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + qoy.b(qoy.b(this.h.hashCode() * 31, 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaybackFatalError(message=");
            sb.append(this.h);
            sb.append(", isSubscribed=");
            sb.append(this.i);
            sb.append(", isDownloadManagerInitialized=");
            sb.append(this.j);
            sb.append(", canPlayNext=");
            return defpackage.q0.a(sb, this.k, ')');
        }

        @Override // xsna.lt70
        public final Integer w() {
            return Integer.valueOf(this.n);
        }
    }

    /* compiled from: OfflineCacheStatEvent.kt */
    public static final class d extends lt70 {
        public final String A;
        public final int B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        public final int G;
        public final int H;
        public final int I;
        public final int J;
        public final int K;
        public final int L;
        public final int M;
        public final int N;
        public final MusicTrack h;
        public final boolean i;
        public final boolean j;
        public final MusicOfflineCacheStorage k;
        public final oya0 l;
        public final ut70 m;
        public final String n = "playback_source_error";
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final String s;
        public final String t;
        public final String u;
        public final String v;
        public final String w;
        public final String x;
        public final String y;
        public final String z;

        public d(MusicTrack musicTrack, boolean z, boolean z2, MusicOfflineCacheStorage musicOfflineCacheStorage, oya0 oya0Var, ut70 ut70Var) {
            Float f;
            Long l;
            Integer num;
            Integer num2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Throwable cause;
            this.h = musicTrack;
            this.i = z;
            this.j = z2;
            this.k = musicOfflineCacheStorage;
            this.l = oya0Var;
            this.m = ut70Var;
            this.o = musicTrack.Fb();
            String str6 = musicTrack.d;
            this.p = str6 == null ? "" : str6;
            String k = musicOfflineCacheStorage != null ? musicOfflineCacheStorage.k() : null;
            this.q = k != null ? k : "";
            this.r = lt70.v(this, oya0Var != null ? oya0Var.a : null);
            this.s = (oya0Var == null || (cause = oya0Var.a.getCause()) == null) ? null : lt70.v(this, cause);
            this.t = lt70.v(this, oya0Var != null ? oya0Var.b : null);
            this.u = lt70.v(this, oya0Var != null ? oya0Var.k : null);
            this.v = oya0Var != null ? lt70.X(oya0Var.h) : null;
            this.w = (oya0Var == null || (str5 = oya0Var.c) == null) ? null : erm0.D0(256, str5);
            this.x = (oya0Var == null || (str4 = oya0Var.i) == null) ? null : lt70.X(str4);
            this.y = (oya0Var == null || (str3 = oya0Var.g) == null) ? null : erm0.D0(256, str3);
            this.z = (ut70Var == null || (str2 = ut70Var.f) == null) ? null : lt70.X(str2);
            this.A = (ut70Var == null || (str = ut70Var.g) == null) ? null : lt70.X(str);
            this.B = z ? 1 : 0;
            this.C = z2 ? 1 : 0;
            int i = 0;
            this.D = 0;
            Boolean bool = oya0Var != null ? oya0Var.d : null;
            if (bool != null && bool.booleanValue()) {
                i = 1;
            }
            this.E = i;
            int i2 = -1;
            this.F = -1;
            long j = -1;
            long longValue = oya0Var != null ? oya0Var.e.longValue() : -1L;
            this.G = (int) (longValue > 2147483647L ? 2147483647L : longValue);
            this.H = (oya0Var == null || (num2 = oya0Var.j) == null) ? -1 : num2.intValue();
            this.I = oya0Var != null ? oya0Var.f.intValue() : -1;
            this.J = ut70Var != null ? ut70Var.a.intValue() : -1;
            if (ut70Var != null && (num = ut70Var.b) != null) {
                i2 = num.intValue();
            }
            this.K = i2;
            long longValue2 = ut70Var != null ? ut70Var.c.longValue() : -1L;
            this.L = (int) (longValue2 > 2147483647L ? 2147483647L : longValue2);
            if (ut70Var != null && (l = ut70Var.e) != null) {
                j = l.longValue();
            }
            this.M = (int) (j <= 2147483647L ? j : 2147483647L);
            this.N = (int) ((ut70Var == null || (f = ut70Var.d) == null) ? -1.0f : f.floatValue());
        }

        @Override // xsna.lt70
        public final Integer A() {
            return Integer.valueOf(this.N);
        }

        @Override // xsna.lt70
        public final Integer B() {
            return Integer.valueOf(this.C);
        }

        @Override // xsna.lt70
        public final Integer C() {
            return Integer.valueOf(this.D);
        }

        @Override // xsna.lt70
        public final Integer D() {
            return Integer.valueOf(this.E);
        }

        @Override // xsna.lt70
        public final Integer E() {
            return Integer.valueOf(this.F);
        }

        @Override // xsna.lt70
        public final Integer F() {
            return Integer.valueOf(this.G);
        }

        @Override // xsna.lt70
        public final Integer G() {
            return Integer.valueOf(this.H);
        }

        @Override // xsna.lt70
        public final Integer H() {
            return Integer.valueOf(this.I);
        }

        @Override // xsna.lt70
        public final Integer I() {
            return Integer.valueOf(this.J);
        }

        @Override // xsna.lt70
        public final String J() {
            return this.n;
        }

        @Override // xsna.lt70
        public final String K() {
            return this.w;
        }

        @Override // xsna.lt70
        public final String L() {
            return this.x;
        }

        @Override // xsna.lt70
        public final String M() {
            return this.y;
        }

        @Override // xsna.lt70
        public final String N() {
            return this.z;
        }

        @Override // xsna.lt70
        public final String O() {
            return this.A;
        }

        @Override // xsna.lt70
        public final String P() {
            return this.o;
        }

        @Override // xsna.lt70
        public final String Q() {
            return this.p;
        }

        @Override // xsna.lt70
        public final String R() {
            return this.q;
        }

        @Override // xsna.lt70
        public final String S() {
            return this.r;
        }

        @Override // xsna.lt70
        public final String T() {
            return this.s;
        }

        @Override // xsna.lt70
        public final String U() {
            return this.t;
        }

        @Override // xsna.lt70
        public final String V() {
            return this.u;
        }

        @Override // xsna.lt70
        public final String W() {
            return this.v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.h, dVar.h) && this.i == dVar.i && this.j == dVar.j && this.k == dVar.k && epx.f(this.l, dVar.l) && epx.f(this.m, dVar.m);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.h.hashCode() * 31, 31, this.i), 31, this.j);
            MusicOfflineCacheStorage musicOfflineCacheStorage = this.k;
            int hashCode = (b + (musicOfflineCacheStorage == null ? 0 : musicOfflineCacheStorage.hashCode())) * 31;
            oya0 oya0Var = this.l;
            int hashCode2 = (hashCode + (oya0Var == null ? 0 : oya0Var.hashCode())) * 31;
            ut70 ut70Var = this.m;
            return hashCode2 + (ut70Var != null ? ut70Var.hashCode() : 0);
        }

        public final String toString() {
            return "PlaybackSourceError(track=" + this.h + ", downloaded=" + this.i + ", cached=" + this.j + ", storage=" + this.k + ", playerErrorInfo=" + this.l + ", downloadInfo=" + this.m + ')';
        }

        @Override // xsna.lt70
        public final Integer w() {
            return Integer.valueOf(this.B);
        }

        @Override // xsna.lt70
        public final Integer x() {
            return Integer.valueOf(this.K);
        }

        @Override // xsna.lt70
        public final Integer y() {
            return Integer.valueOf(this.L);
        }

        @Override // xsna.lt70
        public final Integer z() {
            return Integer.valueOf(this.M);
        }
    }

    /* compiled from: OfflineCacheStatEvent.kt */
    public static final class e extends lt70 {
        public final boolean h;
        public final MusicTrack i;
        public final String j = "playback_error_sub_check";
        public final String k;
        public final String l;
        public final int m;
        public final int n;
        public final int o;

        public e(MusicTrack musicTrack, boolean z) {
            this.h = z;
            this.i = musicTrack;
            this.k = musicTrack.Fb();
            String str = musicTrack.d;
            this.l = str == null ? "" : str;
            this.m = z ? 1 : 0;
            this.n = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL.l() ? 1 : 0;
            this.o = MusicOfflineCacheStorage.SD_CARD.l() ? 1 : 0;
        }

        @Override // xsna.lt70
        public final Integer B() {
            return Integer.valueOf(this.n);
        }

        @Override // xsna.lt70
        public final Integer C() {
            return Integer.valueOf(this.o);
        }

        @Override // xsna.lt70
        public final String J() {
            return this.j;
        }

        @Override // xsna.lt70
        public final String P() {
            return this.k;
        }

        @Override // xsna.lt70
        public final String Q() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.h == eVar.h && epx.f(this.i, eVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaybackSourceErrorSubCheck(isSubscribed=");
            sb.append(this.h);
            sb.append(", track=");
            return rq.c(sb, this.i, ')');
        }

        @Override // xsna.lt70
        public final Integer w() {
            return Integer.valueOf(this.m);
        }
    }

    public lt70() {
        super(null, null, 3);
    }

    public static String X(String str) {
        return str.length() <= 256 ? str : str.substring(0, 127).concat(str.substring(str.length() - 127));
    }

    public static String v(lt70 lt70Var, Throwable th) {
        if (th == null) {
            return null;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return erm0.D0(256, th.getClass().getName() + ": " + message);
    }

    public Integer A() {
        return null;
    }

    public abstract Integer B();

    public Integer C() {
        return null;
    }

    public Integer D() {
        return null;
    }

    public Integer E() {
        return null;
    }

    public Integer F() {
        return null;
    }

    public Integer G() {
        return null;
    }

    public Integer H() {
        return null;
    }

    public Integer I() {
        return null;
    }

    public abstract String J();

    public String K() {
        return null;
    }

    public String L() {
        return null;
    }

    public String M() {
        return null;
    }

    public String N() {
        return null;
    }

    public String O() {
        return null;
    }

    public String P() {
        return null;
    }

    public String Q() {
        return null;
    }

    public String R() {
        return null;
    }

    public String S() {
        return null;
    }

    public String T() {
        return null;
    }

    public String U() {
        return null;
    }

    public String V() {
        return null;
    }

    public String W() {
        return null;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.MUSIC_OFFLINE_PLAYBACK_ERROR.h(), null, J(), w(), P(), B(), Q(), C(), R(), D(), S(), E(), T(), F(), U(), G(), V(), H(), W(), I(), K(), x(), L(), y(), M(), z(), N(), A(), O(), null, null, null, null, null, -536870910, 3, null);
        return super.p();
    }

    public abstract Integer w();

    public Integer x() {
        return null;
    }

    public Integer y() {
        return null;
    }

    public Integer z() {
        return null;
    }
}
