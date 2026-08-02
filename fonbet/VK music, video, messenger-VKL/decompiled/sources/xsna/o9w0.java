package xsna;

import com.vk.vmoji.character.model.VmojiProductModel;

/* compiled from: VmojiProductsState.kt */
/* loaded from: classes7.dex */
public abstract class o9w0 implements kj50 {

    /* compiled from: VmojiProductsState.kt */
    public static final class a extends o9w0 {
        public static final a b = new a();
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class b extends o9w0 {
        public final VmojiProductModel b;

        public b(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BuyVmojiProduct(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class c extends o9w0 {
        public final VmojiProductModel b;

        public c(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BuyVmojiProductConfirmed(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class d extends o9w0 {
        public static final d b = new d();
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class e extends o9w0 {
        public static final e b = new e();
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class f extends o9w0 {
        public static final f b = new f();
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class g extends o9w0 {
        public final VmojiProductModel b;

        public g(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectVmojiProduct(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class h extends o9w0 {
        public final VmojiProductModel b;

        public h(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TryOnVmojiProduct(product=" + this.b + ')';
        }
    }
}
