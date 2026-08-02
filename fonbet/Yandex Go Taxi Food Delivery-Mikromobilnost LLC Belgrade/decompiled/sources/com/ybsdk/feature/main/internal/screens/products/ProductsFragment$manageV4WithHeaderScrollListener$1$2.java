package com.ybsdk.feature.main.internal.screens.products;

import com.ybsdk.core.utils.ColorModel;
import defpackage.bms;
import defpackage.lsz0;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ProductsFragment$manageV4WithHeaderScrollListener$1$2 extends FunctionReferenceImpl implements bms {
    public ProductsFragment$manageV4WithHeaderScrollListener$1$2(ProductsFragment productsFragment) {
        super(4, productsFragment, ProductsFragment.class, "setStatusBarAndToolbarColors", "setStatusBarAndToolbarColors(Lcom/ybsdk/feature/main/internal/screens/products/toolbar/ToolbarBackground;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/design/SystemBarColors;)V", 0);
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((ProductsFragment) this.receiver).setStatusBarAndToolbarColors((lsz0) obj, (ColorModel) obj2, (ColorModel) obj3, (z1x0) obj4);
        return zy11.a;
    }
}
