package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: MusicPlaylistLauncher.kt */
/* loaded from: classes.dex */
public interface y050 {
    void a(Context context, b bVar);

    /* compiled from: MusicPlaylistLauncher.kt */
    /* loaded from: classes3.dex */
    public interface b {

        /* compiled from: MusicPlaylistLauncher.kt */
        /* renamed from: xsna.y050$b$b, reason: collision with other inner class name */
        public static final class C4065b implements b {
            public final UserId a;
            public final int b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;

            public C4065b(UserId userId, int i, String str, String str2, String str3, String str4, int i2) {
                str = (i2 & 4) != 0 ? null : str;
                str2 = (i2 & 8) != 0 ? null : str2;
                str3 = (i2 & 16) != 0 ? null : str3;
                str4 = (i2 & 64) != 0 ? "" : str4;
                this.a = userId;
                this.b = i;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // xsna.y050.b
            public final SearchStatsLoggingInfo a() {
                return null;
            }

            @Override // xsna.y050.b
            public final String b() {
                return this.e;
            }

            @Override // xsna.y050.b
            public final String c() {
                return this.f;
            }

            public final String d() {
                return this.c;
            }

            public final UserId e() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4065b)) {
                    return false;
                }
                C4065b c4065b = (C4065b) obj;
                return epx.f(this.a, c4065b.a) && this.b == c4065b.b && epx.f(this.c, c4065b.c) && epx.f(this.d, c4065b.d) && epx.f(this.e, c4065b.e) && epx.f(this.f, c4065b.f);
            }

            public final int f() {
                return this.b;
            }

            public final int hashCode() {
                int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
                String str = this.c;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.e;
                return this.f.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 961);
            }

            @Override // xsna.y050.b
            public final String n() {
                return this.d;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ById(ownerId=");
                sb.append(this.a);
                sb.append(", playlistId=");
                sb.append(this.b);
                sb.append(", accessKey=");
                sb.append(this.c);
                sb.append(", refer=");
                sb.append(this.d);
                sb.append(", catalogBlockId=");
                sb.append(this.e);
                sb.append(", searchStatsLoggingInfo=null, launchOrigin=");
                return ho8.a(sb, this.f, ')');
            }
        }

        SearchStatsLoggingInfo a();

        String b();

        String c();

        String n();

        /* compiled from: MusicPlaylistLauncher.kt */
        public static final class a implements b {
            public final Playlist a;
            public final String b;
            public final String c;
            public final SearchStatsLoggingInfo d;
            public final String e;

            public a(Playlist playlist, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, String str3) {
                this.a = playlist;
                this.b = str;
                this.c = str2;
                this.d = searchStatsLoggingInfo;
                this.e = str3;
            }

            @Override // xsna.y050.b
            public final SearchStatsLoggingInfo a() {
                return this.d;
            }

            @Override // xsna.y050.b
            public final String b() {
                return this.c;
            }

            @Override // xsna.y050.b
            public final String c() {
                return this.e;
            }

            public final Playlist d() {
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
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                SearchStatsLoggingInfo searchStatsLoggingInfo = this.d;
                return this.e.hashCode() + ((hashCode3 + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31);
            }

            @Override // xsna.y050.b
            public final String n() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ByEntity(playlist=");
                sb.append(this.a);
                sb.append(", refer=");
                sb.append(this.b);
                sb.append(", catalogBlockId=");
                sb.append(this.c);
                sb.append(", searchStatsLoggingInfo=");
                sb.append(this.d);
                sb.append(", launchOrigin=");
                return ho8.a(sb, this.e, ')');
            }

            public /* synthetic */ a(Playlist playlist, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, String str3, int i) {
                this(playlist, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : searchStatsLoggingInfo, (i & 16) != 0 ? "" : str3);
            }
        }
    }

    /* compiled from: MusicPlaylistLauncher.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final y050 STUB = new C4064a();

        public final y050 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicPlaylistLauncher.kt */
        /* renamed from: xsna.y050$a$a, reason: collision with other inner class name */
        public static final class C4064a implements y050 {
            @Override // xsna.y050
            public final void a(Context context, b bVar) {
            }
        }
    }
}
