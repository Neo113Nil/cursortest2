package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.util.List;

/* compiled from: MarketMultiPickerSideEffect.kt */
/* loaded from: classes18.dex */
public interface v810 {

    /* compiled from: MarketMultiPickerSideEffect.kt */
    public static final class a implements v810 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1580386341;
        }

        public final String toString() {
            return "ClearSearchQuery";
        }
    }

    /* compiled from: MarketMultiPickerSideEffect.kt */
    public static final class b implements v810 {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: MarketMultiPickerSideEffect.kt */
    public static abstract class c implements v810 {

        /* compiled from: MarketMultiPickerSideEffect.kt */
        public static final class a extends c {
            public final String a;

            public a(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("OpenCreateGoodMiniApp(url="), this.a, ')');
            }
        }

        /* compiled from: MarketMultiPickerSideEffect.kt */
        public static final class b extends c {
            public final List<MultipickerProduct> a;
            public final a910 b;

            public b(List<MultipickerProduct> list, a910 a910Var) {
                this.a = list;
                this.b = a910Var;
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
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ReturnResult(products=" + this.a + ", techMetrics=" + this.b + ')';
            }
        }
    }

    /* compiled from: MarketMultiPickerSideEffect.kt */
    public static final class d implements v810 {
        public final String a;

        public d(String str) {
            this.a = str;
        }
    }
}
