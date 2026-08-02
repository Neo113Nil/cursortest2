package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;

/* compiled from: VideoPlaylistVideosRepository.kt */
/* loaded from: classes2.dex */
public interface m5t0 {

    /* compiled from: VideoPlaylistVideosRepository.kt */
    public static final class a {
        public final int a;
        public final UserId b;
        public final String c;
        public final l5t0 d;
        public final boolean e;
        public final String f;
        public final C3323a g;

        /* compiled from: VideoPlaylistVideosRepository.kt */
        /* renamed from: xsna.m5t0$a$a, reason: collision with other inner class name */
        public static final class C3323a {
            public static final C3323a c = new C3323a(null, null);
            public final Integer a;
            public final String b;

            public C3323a(Integer num, String str) {
                this.a = num;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3323a)) {
                    return false;
                }
                C3323a c3323a = (C3323a) obj;
                return epx.f(this.a, c3323a.a) && epx.f(this.b, c3323a.b);
            }

            public final int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Shuffle(key=");
                sb.append(this.a);
                sb.append(", firstVideo=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public a(int i, UserId userId, String str, l5t0 l5t0Var, boolean z, String str2, C3323a c3323a) {
            this.a = i;
            this.b = userId;
            this.c = str;
            this.d = l5t0Var;
            this.e = z;
            this.f = str2;
            this.g = c3323a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
            String str = this.c;
            int b = qoy.b((this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
            String str2 = this.f;
            return this.g.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "GetPlaylistVideosParams(playlistId=" + this.a + ", playlistOwnerId=" + this.b + ", referrer=" + this.c + ", paginationParams=" + this.d + ", reverseSort=" + this.e + ", trackCode=" + this.f + ", shuffle=" + this.g + ')';
        }
    }

    io.reactivex.rxjava3.core.x<VideoListWithTotalCount> a(a aVar);
}
