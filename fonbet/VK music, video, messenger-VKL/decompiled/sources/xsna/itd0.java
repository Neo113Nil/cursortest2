package xsna;

import com.vk.ecomm.products_selection.api.model.ProductsSelectionContextContent;
import com.vk.ecomm.products_selection.api.model.ProductsSelectionRefSource;

/* compiled from: ProductsSelectionAnalyticParams.kt */
/* loaded from: classes18.dex */
public final class itd0 {
    public final ProductsSelectionRefSource a;
    public final a b;

    /* compiled from: ProductsSelectionAnalyticParams.kt */
    public static final class a {
        public final ProductsSelectionContextContent a;
        public final int b;
        public final long c;

        public a(ProductsSelectionContextContent productsSelectionContextContent, int i, long j) {
            this.a = productsSelectionContextContent;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContextContentParams(content=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", ownerId=");
            return vu5.a(')', this.c, sb);
        }
    }

    public itd0(ProductsSelectionRefSource productsSelectionRefSource, a aVar) {
        this.a = productsSelectionRefSource;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itd0)) {
            return false;
        }
        itd0 itd0Var = (itd0) obj;
        return this.a == itd0Var.a && epx.f(this.b, itd0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ProductsSelectionAnalyticParams(refSource=" + this.a + ", contextContentParams=" + this.b + ')';
    }
}
