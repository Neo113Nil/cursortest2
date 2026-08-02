package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.nqd0;
import xsna.qqd0;
import xsna.sqd0;

/* compiled from: ProductManagementActor.kt */
/* loaded from: classes18.dex */
public final class oqd0 extends al50<apl0, nqd0, on50, dpl0, oml0, xll0> {

    /* compiled from: ProductManagementActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductsManagementActionType.values().length];
            try {
                iArr[ProductsManagementActionType.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void m(ProductsManagementActionType productsManagementActionType) {
        if (a.$EnumSwitchMapping$0[productsManagementActionType.ordinal()] == 1) {
            e(qqd0.a.a);
            return;
        }
        e(qqd0.a.a);
        e(new qqd0.b(true));
        a(new sqd0.a(productsManagementActionType));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        Map<ProductsManagementActionType, vsd0> map;
        nqd0 nqd0Var = (nqd0) lj50Var;
        if (!(nqd0Var instanceof nqd0.a)) {
            if (!(nqd0Var instanceof nqd0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m(((nqd0.b) nqd0Var).b);
            return;
        }
        tsd0 tsd0Var = ((apl0) this.b.getCurrentState()).m;
        if (tsd0Var != null && (map = tsd0Var.e) != null) {
            nqd0.a aVar = (nqd0.a) nqd0Var;
            if (map.containsKey(aVar.b)) {
                e(new qqd0.c(aVar.b));
                return;
            }
        }
        m(((nqd0.a) nqd0Var).b);
    }
}
