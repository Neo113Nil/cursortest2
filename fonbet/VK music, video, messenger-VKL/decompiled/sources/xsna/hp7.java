package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.c;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.stories.design.view.stickerbutton.ReactionStickerButton;
import com.vk.stories.design.view.stickerbutton.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.htd0;
import xsna.rvc0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hp7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hp7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((kp7) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                c2y0 c2y0Var = (c2y0) obj4;
                leg legVar = (leg) obj3;
                int intValue = ((Integer) obj).intValue();
                if (intValue == ((Integer) obj2).intValue()) {
                    int length = c2y0Var.getText().length();
                    q420 q420Var = legVar.l;
                    q420 q420Var2 = q420Var != null ? q420Var : null;
                    if (intValue > length) {
                        intValue = length;
                    }
                    q420Var2.d(intValue);
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                tth.a((q630) obj3, (yzs) obj4, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                DonutBannerKt.p((c.a) obj4, (et9) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                return ((oty) obj3).a(new qty((hty) obj4, (ztm0) obj), ((o6j) obj2).a);
            case 5:
                ((Integer) obj2).getClass();
                ((ou20) obj4).c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                e64 e64Var = (e64) obj4;
                e64 e64Var2 = (e64) obj3;
                em50 em50Var = (em50) obj;
                rvc0 rvc0Var = (rvc0) obj2;
                if (rvc0Var instanceof qvc0) {
                    return em50Var.a(e64Var, rvc0Var);
                }
                if (rvc0Var.equals(rvc0.a.a)) {
                    return em50Var.a(e64Var2, rvc0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj4;
                MarketFavable marketFavable = (MarketFavable) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                int i2 = ProductsSelectionBottomSheet.u1;
                enj.q(booleanValue ? R.string.product_selection_fave_add_product_successful : R.string.product_selection_fave_remove_product_successful, 0, productsSelectionBottomSheet.mo2getContext());
                if (gmqVar.equals(marketFavable)) {
                    xn50.a.c(productsSelectionBottomSheet, new htd0.e(new SelectionProductId(marketFavable.b, marketFavable.c), booleanValue));
                }
                return s3q0.a;
            case 8:
                a.C1830a c1830a = (a.C1830a) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = ReactionStickerButton.c;
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1863139318, intValue2, -1, "com.vk.stories.design.view.stickerbutton.ReactionStickerButton.setupHighlight.<anonymous>.<anonymous> (ReactionStickerButton.kt:61)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    boolean y = aVar.y(c1830a);
                    Object x2 = aVar.x();
                    if (y || x2 == c0012a) {
                        x2 = new kp5(24, c1830a, wh50Var);
                        aVar.R(x2);
                    }
                    bap.c(c1830a, (izs) x2, aVar, 0);
                    rrv0.e(true, null, null, null, null, null, kai.c(1742270771, new q2(6, wh50Var, composeView), aVar), aVar, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                o3j0 o3j0Var = (o3j0) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1595815383, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreen.<anonymous> (SettingsScreen.kt:59)");
                    }
                    s8k0.a(o3j0Var.i, izsVar, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ hp7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ hp7(q630 q630Var, yzs yzsVar, int i) {
        this.b = 2;
        this.d = q630Var;
        this.c = yzsVar;
    }
}
