package xsna;

import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;

/* compiled from: MarketLinkedContentEvent.kt */
/* loaded from: classes18.dex */
public interface t610 extends pk50 {

    /* compiled from: MarketLinkedContentEvent.kt */
    public static final class a implements t610 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1742853866;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: MarketLinkedContentEvent.kt */
    public static final class b implements t610 {
        public final MediaContentItem a;

        public b(MediaContentItem mediaContentItem) {
            this.a = mediaContentItem;
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
            return "OpenMedia(mediaItem=" + this.a + ')';
        }
    }
}
