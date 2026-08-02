package xsna;

import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.List;

/* compiled from: VmojiRecommendationsState.kt */
/* loaded from: classes7.dex */
public abstract class taw0 implements xl50 {

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class a extends taw0 {
        public final String b;
        public final String c;
        public final List<VmojiStickerPackPreviewModel> d;
        public final String e;

        public a(String str, String str2, List<VmojiStickerPackPreviewModel> list, String str3) {
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            String str = this.e;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(id=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", packs=");
            sb.append(this.d);
            sb.append(", nextBlockId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static abstract class b extends taw0 {

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiRecommendationsState.kt */
        /* renamed from: xsna.taw0$b$b, reason: collision with other inner class name */
        public static final class C3735b extends b {
            public final RecommendationsBlockModel b;

            public C3735b(RecommendationsBlockModel recommendationsBlockModel) {
                this.b = recommendationsBlockModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3735b) && epx.f(this.b, ((C3735b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(stickerPacksModel=" + this.b + ')';
            }
        }

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static abstract class c extends taw0 {

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class b extends c {
        }

        /* compiled from: VmojiRecommendationsState.kt */
        /* renamed from: xsna.taw0$c$c, reason: collision with other inner class name */
        public static final class C3736c extends c {
            public static final C3736c b = new C3736c();
        }
    }
}
