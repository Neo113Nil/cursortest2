package xsna;

import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;

/* compiled from: ProductCardPatch.kt */
/* loaded from: classes18.dex */
public interface xld0 extends yl50 {

    /* compiled from: ProductCardPatch.kt */
    public static final class a implements xld0 {
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
            return vu5.b(new StringBuilder("ChangePhotoViewerPosition(photoPosition="), this.a, ')');
        }
    }

    /* compiled from: ProductCardPatch.kt */
    public static final class b implements xld0 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ChangePosition(position="), this.a, ')');
        }
    }

    /* compiled from: ProductCardPatch.kt */
    public static final class c implements xld0 {
        public final d210 a;

        public c(d210 d210Var) {
            this.a = d210Var;
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
            return "DataLoaded(data=" + this.a + ')';
        }
    }

    /* compiled from: ProductCardPatch.kt */
    public static final class d implements xld0 {
        public final ProductCardRestrictions a;

        public d(ProductCardRestrictions productCardRestrictions) {
            this.a = productCardRestrictions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            ProductCardRestrictions productCardRestrictions = this.a;
            if (productCardRestrictions == null) {
                return 0;
            }
            return productCardRestrictions.hashCode();
        }

        public final String toString() {
            return "RestrictionsLoaded(restrictions=" + this.a + ')';
        }
    }

    /* compiled from: ProductCardPatch.kt */
    public static final class e implements xld0 {
    }

    /* compiled from: ProductCardPatch.kt */
    public static final class f implements xld0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1785274251;
        }

        public final String toString() {
            return "StartRefresh";
        }
    }
}
