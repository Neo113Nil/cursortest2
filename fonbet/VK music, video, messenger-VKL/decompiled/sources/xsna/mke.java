package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsListDataSourceParams.kt */
/* loaded from: classes17.dex */
public abstract class mke {

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class a extends mke implements g {
        public final String a;
        public final List<String> b;

        public a(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List<String> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Audio(id=");
            sb.append(this.a);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class b extends mke {
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
            return ho8.a(new StringBuilder("CatalogVideo(blockId="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class c extends mke {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CoauthorsInvitations(forUserId="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class d extends mke implements g {
        public final String a;
        public final List<String> b;

        public d(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.b;
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
            int hashCode = this.a.hashCode() * 31;
            List<String> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Compilation(id=");
            sb.append(this.a);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class e extends mke {
        public final String a;
        public final String b;
        public final String c;

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class f extends mke {
        public final String a;
        public final String b;
        public final String c;

        public f(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DecoratedClipsRecom(id=");
            sb.append(this.a);
            sb.append(", trackCode=");
            sb.append(this.b);
            sb.append(", recomClipsContextPayload=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public interface g {
        List<String> a();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class h extends mke {
        public final FavoriteFolderId a;

        public h(FavoriteFolderId favoriteFolderId) {
            this.a = favoriteFolderId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FavoriteFolder(folderId=" + this.a + ')';
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class i extends mke implements g {
        public final int a;
        public final List<String> b;

        public i(int i, List<String> list) {
            this.a = i;
            this.b = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            List<String> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GeoPlace(placeId=");
            sb.append(this.a);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class j extends mke implements g {
        public final String a;
        public final List<String> b;

        public j(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List<String> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Hashtag(text=");
            sb.append(this.a);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class k extends mke {
        public static final k a = new k();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class l extends mke {
        public static final l a = new l();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class m extends mke implements g {
        public final String a;
        public final List<String> b;

        public m(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List<String> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Mask(id=");
            sb.append(this.a);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class n extends mke {
        public final String a;

        public n(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MusicTemplateByAudio(id="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class o extends mke {
        public final String a;

        public o(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("MusicTemplateByClip(id="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class p extends mke {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            ((p) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NewsFeedBlock(blockTrackCode=null)";
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class q extends mke implements g {
        public final String a;
        public final String b;
        public final List<String> c;

        public q(String str, String str2, List<String> list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return epx.f(this.a, qVar.a) && epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsMonotheme(monothemeObjectId=");
            sb.append(this.a);
            sb.append(", header=");
            sb.append(this.b);
            sb.append(", deduplicationLastIds=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static abstract class r extends mke {

        /* compiled from: ClipsListDataSourceParams.kt */
        public static final class a extends r {
            public final UserId a;
            public final int b;
            public final String c;
            public final int d;

            public a(int i, UserId userId, int i2, String str) {
                this.a = userId;
                this.b = i;
                this.c = str;
                this.d = i2;
            }

            @Override // xsna.mke.r
            public final int b() {
                return this.b;
            }

            @Override // xsna.mke.r
            public final UserId c() {
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
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + urd0.a(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FromBeginning(playlistOwnerId=");
                sb.append(this.a);
                sb.append(", playlistId=");
                sb.append(this.b);
                sb.append(", playlistName=");
                sb.append(this.c);
                sb.append(", playlistSize=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: ClipsListDataSourceParams.kt */
        public static final class b extends r {
            public final UserId a;
            public final int b;
            public final String c;
            public final int d;
            public final String e;

            public b(int i, int i2, UserId userId, String str, String str2) {
                this.a = userId;
                this.b = i;
                this.c = str;
                this.d = i2;
                this.e = str2;
            }

            @Override // xsna.mke.r
            public final int b() {
                return this.b;
            }

            @Override // xsna.mke.r
            public final UserId c() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + shy.a(this.d, urd0.a(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FromMiddle(playlistOwnerId=");
                sb.append(this.a);
                sb.append(", playlistId=");
                sb.append(this.b);
                sb.append(", playlistName=");
                sb.append(this.c);
                sb.append(", playlistSize=");
                sb.append(this.d);
                sb.append(", focusedVideoId=");
                return ho8.a(sb, this.e, ')');
            }
        }

        public abstract int b();

        public abstract UserId c();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class s extends mke {
        public final UserId a;

        public s(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Profile(id="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class t extends mke {
        public final UserId a;

        public t(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ProfileLives(id="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class u extends mke {
        public final String a;

        public u(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(blockId="), this.a, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class v extends mke {
        public static final v a = new v();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class w extends mke {
        public static final w a = new w();
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class x extends mke implements g {
        public final List<String> a;
        public final String b;
        public final String c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public x() {
            this(r0, r0, 7);
            String str = null;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return epx.f(this.a, xVar.a) && epx.f(this.b, xVar.b) && epx.f(this.c, xVar.c);
        }

        public final int hashCode() {
            List<String> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Top(deduplicationLastIds=");
            sb.append(this.a);
            sb.append(", trackCode=");
            sb.append(this.b);
            sb.append(", productData=");
            return ho8.a(sb, this.c, ')');
        }

        public x(List<String> list, String str, String str2) {
            this.a = list;
            this.b = str;
            this.c = str2;
        }

        public /* synthetic */ x(String str, String str2, int i) {
            this((List<String>) null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class z extends mke {
        public final String a;
        public final String b;

        public z(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.a, zVar.a) && epx.f(this.b, zVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoFromBlock(trackCodeVideo=");
            sb.append(this.a);
            sb.append(", trackCodeBlock=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsListDataSourceParams.kt */
    public static final class y extends mke implements g {
        public final String a;
        public final String b;
        public final List<String> c;
        public final String d;

        public y(String str, String str2, List<String> list, String str3) {
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = str3;
        }

        @Override // xsna.mke.g
        public final List<String> a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return epx.f(this.a, yVar.a) && epx.f(this.b, yVar.b) && epx.f(this.c, yVar.c) && epx.f(this.d, yVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.c;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.d;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Video(id=");
            sb.append(this.a);
            sb.append(", trackCode=");
            sb.append(this.b);
            sb.append(", deduplicationLastIds=");
            sb.append(this.c);
            sb.append(", recomClipsContextPayload=");
            return ho8.a(sb, this.d, ')');
        }

        public /* synthetic */ y(String str, String str2, String str3, int i) {
            this(str, str2, (List<String>) null, (i & 8) != 0 ? null : str3);
        }
    }
}
