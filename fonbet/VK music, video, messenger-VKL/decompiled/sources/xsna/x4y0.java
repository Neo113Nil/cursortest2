package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;

/* compiled from: YandexAdTextHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class x4y0 implements gn60<a, wm60> {

    /* compiled from: YandexAdTextHolderTransformer.kt */
    public static final class a {
        public final YandexNativeAdEntry a;
        public final NewsEntry b;
        public final boolean c;
        public final v1c0 d;

        public a(YandexNativeAdEntry yandexNativeAdEntry, NewsEntry newsEntry, boolean z, v1c0 v1c0Var) {
            this.a = yandexNativeAdEntry;
            this.b = newsEntry;
            this.c = z;
            this.d = v1c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(e630.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Params(entry=" + this.a + ", rootEntry=" + this.b + ", isInLegoTheme=" + this.c + ", postDisplayItemEntryContext=" + this.d + ')';
        }
    }
}
