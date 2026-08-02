package xsna;

import java.util.List;

/* compiled from: ProductsSelectionPatch.kt */
/* loaded from: classes18.dex */
public interface ltd0 extends xl50 {

    /* compiled from: ProductsSelectionPatch.kt */
    public static final class a implements ltd0 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FullScreenErrorPatch(error="), this.b, ')');
        }
    }

    /* compiled from: ProductsSelectionPatch.kt */
    public static final class b implements ltd0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -9879546;
        }

        public final String toString() {
            return "FullScreenLoaderPatch";
        }
    }

    /* compiled from: ProductsSelectionPatch.kt */
    public static final class c implements ltd0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateCartCountValuePatch(cartCountValue="), this.b, ')');
        }
    }

    /* compiled from: ProductsSelectionPatch.kt */
    public static final class d implements ltd0 {
        public final List<kei0> b;

        public d(List<kei0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateItemsPatch(items="), this.b);
        }
    }
}
