package xsna;

import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.List;

/* compiled from: MarketLinkedContentPatch.kt */
/* loaded from: classes18.dex */
public interface u610 extends yl50 {

    /* compiled from: MarketLinkedContentPatch.kt */
    public static final class a implements u610 {
        public final List<MediaContentItem> a;

        public a(List<MediaContentItem> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("ItemsViewTracked(trackedItems="), this.a);
        }
    }

    /* compiled from: MarketLinkedContentPatch.kt */
    public static final class b implements u610 {
    }

    /* compiled from: MarketLinkedContentPatch.kt */
    public static final class c implements u610 {
        public final MediaContentItem a;

        public c(MediaContentItem mediaContentItem) {
            this.a = mediaContentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateItemConfirmed(item=" + this.a + ", isConfirmed=true)";
        }
    }
}
