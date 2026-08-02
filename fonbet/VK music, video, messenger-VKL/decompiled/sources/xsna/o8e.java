package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: ClipsFeedRecomEvent.kt */
/* loaded from: classes17.dex */
public final class o8e implements bxx {
    public final UserId b;
    public final int c;
    public final long d;
    public final a e;

    /* compiled from: ClipsFeedRecomEvent.kt */
    public interface a {

        /* compiled from: ClipsFeedRecomEvent.kt */
        /* renamed from: xsna.o8e$a$a, reason: collision with other inner class name */
        public static final class C3443a implements a {
            public static final C3443a a = new C3443a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3443a);
            }

            public final int hashCode() {
                return -449743947;
            }

            public final String toString() {
                return "Dislike";
            }
        }

        /* compiled from: ClipsFeedRecomEvent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1134394617;
            }

            public final String toString() {
                return "Like";
            }
        }

        /* compiled from: ClipsFeedRecomEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 967664597;
            }

            public final String toString() {
                return "Shared";
            }
        }

        /* compiled from: ClipsFeedRecomEvent.kt */
        public static final class d implements a {
            public final int a;
            public final int b;

            public d(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b == dVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Watch(videoDurationSec=");
                sb.append(this.a);
                sb.append(", watchTimeSec=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    public o8e(UserId userId, int i, a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.b = userId;
        this.c = i;
        this.d = currentTimeMillis;
        this.e = aVar;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new com.vk.movika.sdk.base.data.a(this, 24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8e)) {
            return false;
        }
        o8e o8eVar = (o8e) obj;
        return epx.f(this.b, o8eVar.b) && this.c == o8eVar.c && this.d == o8eVar.d && epx.f(this.e, o8eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "ClipsFeedRecomEvent(ownerId=" + this.b + ", videoId=" + this.c + ", timestampMs=" + this.d + ", type=" + this.e + ')';
    }
}
