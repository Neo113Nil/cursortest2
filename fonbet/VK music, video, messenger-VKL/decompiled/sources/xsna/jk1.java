package xsna;

import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import xsna.a6t0;
import xsna.mr3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jk1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jk1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                nk1.a((rl1) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                fr3 fr3Var = (fr3) this.d;
                izs<? super br3, s3q0> izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1692495122, intValue, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListBottomSheetContentView.ThemedContent.<anonymous> (ArtistListBottomSheetContentView.kt:38)");
                    }
                    fr3Var.h((mr3.a) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                nr8.c((hkr0) this.d, (String) this.c, (VkBlurContentView) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                h8q.a((us2) this.d, (q630) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((umd0) this.d).a((umd0) this.c, (ProductCardTopBarControlAction) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                c3e0.a((d3e0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((a6t0) this.d).b((a6t0.a) this.c, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jk1(us2 us2Var, q630 q630Var, izs izsVar, int i) {
        this.b = 3;
        this.d = us2Var;
        this.e = q630Var;
        this.c = izsVar;
    }

    public /* synthetic */ jk1(fr3 fr3Var, izs izsVar, wh50 wh50Var) {
        this.b = 1;
        this.d = fr3Var;
        this.c = izsVar;
        this.e = wh50Var;
    }
}
