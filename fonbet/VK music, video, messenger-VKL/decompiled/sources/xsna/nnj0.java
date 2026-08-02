package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: SimilarSliderDelegate.kt */
/* loaded from: classes7.dex */
public interface nnj0 {

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class a implements nnj0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1487560298;
        }

        public final String toString() {
            return "CloseSlider";
        }
    }

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class b implements nnj0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1528523934;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class c implements nnj0 {
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
            return ho8.a(new StringBuilder("TabClicked(id="), this.a, ')');
        }
    }

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class d implements nnj0 {
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
            return ho8.a(new StringBuilder("TabShown(tabId="), this.a, ')');
        }
    }

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class e implements nnj0 {
        public final AboutVideoItem.SimilarVideoRedesign a;

        public e(AboutVideoItem.SimilarVideoRedesign similarVideoRedesign) {
            this.a = similarVideoRedesign;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoClicked(model=" + this.a + ')';
        }
    }
}
