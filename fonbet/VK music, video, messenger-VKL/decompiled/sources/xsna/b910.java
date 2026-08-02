package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;

/* compiled from: MarketMultiPickerViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class b910 {

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class a extends b910 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -168771712;
        }

        public final String toString() {
            return "ClickCreateGoodEvent";
        }
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class b extends b910 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1425090630;
        }

        public final String toString() {
            return "ClickEnableMarketEvent";
        }
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class c extends b910 {
        public final MultipickerProductId a;

        public c(MultipickerProductId multipickerProductId) {
            this.a = multipickerProductId;
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
            return "ClickOnMarketItemEvent(itemId=" + this.a + ')';
        }
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class d extends b910 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnSearchQueryUpdate(query=null)";
        }
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class e extends b910 {
        public static final e a = new e();
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class f extends b910 {
        public static final f a = new f();
    }

    /* compiled from: MarketMultiPickerViewEvent.kt */
    public static final class g extends b910 {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PageLoadingOffsetReached(type="), this.a, ')');
        }
    }
}
