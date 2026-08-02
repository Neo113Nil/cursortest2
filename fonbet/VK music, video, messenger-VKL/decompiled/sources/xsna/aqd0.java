package xsna;

import com.vk.ecomm.product_list.router.ProductListInternalParams;
import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: ProductListMviState.kt */
/* loaded from: classes18.dex */
public final class aqd0 implements lm50 {
    public final ProductListInternalParams b;
    public final tlo0.f c;
    public final boolean d;
    public final List<vpd0> e;
    public final Exception f;

    public aqd0(ProductListInternalParams productListInternalParams, tlo0.f fVar, boolean z, List list, Exception exc) {
        this.b = productListInternalParams;
        this.c = fVar;
        this.d = z;
        this.e = list;
        this.f = exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aqd0 a(aqd0 aqd0Var, boolean z, ArrayList arrayList, Exception exc, int i) {
        ProductListInternalParams productListInternalParams = aqd0Var.b;
        tlo0.f fVar = aqd0Var.c;
        if ((i & 4) != 0) {
            z = aqd0Var.d;
        }
        boolean z2 = z;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = aqd0Var.e;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            exc = aqd0Var.f;
        }
        aqd0Var.getClass();
        return new aqd0(productListInternalParams, fVar, z2, list2, exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd0)) {
            return false;
        }
        aqd0 aqd0Var = (aqd0) obj;
        return epx.f(this.b, aqd0Var.b) && this.c.equals(aqd0Var.c) && this.d == aqd0Var.d && epx.f(this.e, aqd0Var.e) && epx.f(this.f, aqd0Var.f);
    }

    public final int hashCode() {
        int a = fw3.a(qoy.b(shy.a(this.c.a, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        Exception exc = this.f;
        return a + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        return "ProductListMviState(params=" + this.b + ", title=" + this.c + ", isLoading=" + this.d + ", products=" + this.e + ", exception=" + this.f + ')';
    }
}
