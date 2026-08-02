package xsna;

/* compiled from: MarketItemsForReviewAction.kt */
/* loaded from: classes18.dex */
public abstract class e510 implements kj50 {

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class a extends e510 {
        public final long b;
        public final float c;
        public final boolean d;

        public a(long j, float f, boolean z) {
            this.b = j;
            this.c = f;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, Long.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleReviewResult(productId=");
            sb.append(this.b);
            sb.append(", rating=");
            sb.append(this.c);
            sb.append(", isReviewSent=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class b extends e510 {
        public static final b b = new b();
    }

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class c extends e510 {
        public static final c b = new c();
    }

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class d extends e510 {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnOfferItemClick(itemId="));
        }
    }

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class e extends e510 {
        public final long b;
        public final float c;

        public e(long j, float f) {
            this.b = j;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && Float.compare(this.c, eVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnRatingSelected(itemId=");
            sb.append(this.b);
            sb.append(", rating=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: MarketItemsForReviewAction.kt */
    public static final class f extends e510 {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectedPagePositionChanged(position="), this.b, ')');
        }
    }
}
