package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: MrcRepository.kt */
/* loaded from: classes14.dex */
public abstract class i9q0 {

    /* compiled from: MrcRepository.kt */
    public static final class a extends i9q0 {
        public final NewsEntry a;

        public a(NewsEntry newsEntry) {
            this.a = newsEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ck70.a(new StringBuilder("Ensure(newsEntry="), this.a, ')');
        }
    }

    /* compiled from: MrcRepository.kt */
    public static final class b extends i9q0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -365083538;
        }

        public final String toString() {
            return "Force";
        }
    }
}
