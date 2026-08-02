package xsna;

/* compiled from: MarketItemsForReviewEvent.kt */
/* loaded from: classes18.dex */
public interface w510 {

    /* compiled from: MarketItemsForReviewEvent.kt */
    public static final class a implements w510 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScrollToNextItem(position="), this.a, ')');
        }
    }
}
