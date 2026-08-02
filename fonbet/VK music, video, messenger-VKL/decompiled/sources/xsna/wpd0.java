package xsna;

import com.vk.ecomm.product_list.presentation.ProductListMviTask;
import com.vk.ecomm.product_list.router.ProductListContentType;
import com.vk.ecomm.product_list.router.ProductListInternalParams;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.tlo0;

/* compiled from: ProductListMviBootstrapper.kt */
/* loaded from: classes18.dex */
public final class wpd0 implements vj50<aqd0, on50, ProductListMviTask, com.vk.ecomm.product_list.presentation.k> {
    public final ProductListInternalParams a;

    /* compiled from: ProductListMviBootstrapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductListContentType.values().length];
            try {
                iArr[ProductListContentType.PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductListContentType.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductListContentType.PRODUCTS_AND_SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wpd0(ProductListInternalParams productListInternalParams) {
        this.a = productListInternalParams;
    }

    @Override // xsna.vj50
    public final aqd0 a() {
        tlo0.f h;
        ProductListInternalParams productListInternalParams = this.a;
        int i = a.$EnumSwitchMapping$0[productListInternalParams.d.ordinal()];
        if (i == 1) {
            h = tq.h(tlo0.Companion, R.string.product_list_title_products);
        } else if (i == 2) {
            h = tq.h(tlo0.Companion, R.string.product_list_title_services);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h = tq.h(tlo0.Companion, R.string.product_list_title_products_and_services);
        }
        return new aqd0(productListInternalParams, h, false, EmptyList.b, null);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ com.vk.ecomm.product_list.presentation.k b() {
        return null;
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ List<ProductListMviTask> c(aqd0 aqd0Var) {
        return null;
    }
}
