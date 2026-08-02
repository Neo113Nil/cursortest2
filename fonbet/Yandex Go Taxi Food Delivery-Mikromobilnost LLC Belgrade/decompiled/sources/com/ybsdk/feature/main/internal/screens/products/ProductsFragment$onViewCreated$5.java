package com.ybsdk.feature.main.internal.screens.products;

import defpackage.l0p;
import defpackage.n7f0;
import defpackage.n800;
import defpackage.q400;
import defpackage.tls;
import defpackage.uc5;
import defpackage.x4e;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ProductsFragment$onViewCreated$5 extends FunctionReferenceImpl implements tls {
    public ProductsFragment$onViewCreated$5(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onProductClick", "onProductClick(Lcom/ybsdk/feature/main/internal/widgets/ProductCardView$State;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        n7f0 n7f0Var = (n7f0) obj;
        a aVar = (a) this.receiver;
        n800 n800Var = aVar.B;
        String str = n7f0Var.k;
        ((q400) n800Var).a(str);
        l0p l0pVar = aVar.C.T;
        String str2 = n7f0Var.a;
        String str3 = n7f0Var.s;
        LinkedHashMap t = x4e.t(4, "action", str, "product_type", str2);
        if (str3 != null) {
            t.put("skin_id", str3);
        }
        l0pVar.a.a("products_screen.product.click", t);
        return zy11.a;
    }
}
