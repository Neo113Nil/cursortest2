package xsna;

import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;

/* compiled from: ProductCardTopBarAction.kt */
/* loaded from: classes18.dex */
public interface tmd0 {

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class a implements tmd0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 564458646;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class b implements tmd0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 564488911;
        }

        public final String toString() {
            return "ClickCart";
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class c implements tmd0 {
        public final ProductCardTopBarControlAction a;

        public c(ProductCardTopBarControlAction productCardTopBarControlAction) {
            this.a = productCardTopBarControlAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ClickControlAction(action=" + this.a + ')';
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class d implements tmd0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -424982069;
        }

        public final String toString() {
            return "ClickFavorite";
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class e implements tmd0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1769219479;
        }

        public final String toString() {
            return "ClickSearch";
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class f implements tmd0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 334255632;
        }

        public final String toString() {
            return "ClickShare";
        }
    }

    /* compiled from: ProductCardTopBarAction.kt */
    public static final class g implements tmd0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1522998549;
        }

        public final String toString() {
            return "ClickVoiceSearch";
        }
    }
}
