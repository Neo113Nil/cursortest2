package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.Arrays;

/* compiled from: DzenArticleEvent.kt */
/* loaded from: classes18.dex */
public interface fro extends pk50 {

    /* compiled from: DzenArticleEvent.kt */
    public static final class a implements fro {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1749750135;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DzenArticleEvent.kt */
    public static final class b implements fro {
        public final NewsEntry a;
        public final String[] b;

        public b(NewsEntry newsEntry, String[] strArr) {
            this.a = newsEntry;
            this.b = strArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenMyTargetReportScreen(newsEntry=");
            sb.append(this.a);
            sb.append(", complainTitles=");
            return ho8.a(sb, Arrays.toString(this.b), ')');
        }
    }

    /* compiled from: DzenArticleEvent.kt */
    public static final class c implements fro {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
        }
    }

    /* compiled from: DzenArticleEvent.kt */
    public static final class d implements fro {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Share(text="), this.a, ')');
        }
    }
}
