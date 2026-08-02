package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.fn20;
import xsna.g8s;
import xsna.h8s;
import xsna.kyl;
import xsna.q630;
import xsna.s2x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ps7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ps7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                rs7.a((us7) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kxl.d((qow) this.c, (kyl.f) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                j710.d((m710) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.gallery.a.c((ProductGalleryItem.a) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((fn20) this.c).b((fn20.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((co20) this.c).g((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n750.n((b78.h) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                xq50 xq50Var = (xq50) this.c;
                wq50 wq50Var = (wq50) this.d;
                hi60 hi60Var = xq50Var.D;
                Context context = ((View) obj).getContext();
                MyTargetNativeAdEntry myTargetNativeAdEntry = wq50Var.i;
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.CARD, "DEFAULT", 11, (wix) obj2);
                u1c0 J0 = xq50Var.J0();
                hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar, J0 != null ? J0.k : -1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((f9d0) this.c).t((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                wzk0 wzk0Var = (wzk0) this.c;
                qod0 qod0Var = (qod0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1346570635, intValue, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSimplePickerHolder.bind.<anonymous>.<anonymous> (ProductFilterSimplePickerHolder.kt:35)");
                    }
                    boolean y = aVar2.y(wzk0Var);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new pod0(wzk0Var, 0);
                        aVar2.R(x);
                    }
                    hly hlyVar = null;
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    CatalogMarketStatusOption catalogMarketStatusOption = wzk0Var.f;
                    if (catalogMarketStatusOption == null || (str = catalogMarketStatusOption.b) == null) {
                        str = "";
                    }
                    String N = d370.N(R.string.market_search_choose_a_status, 0, aVar2);
                    boolean y2 = aVar2.y(qod0Var) | aVar2.y(wzk0Var);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new com.vk.voip.a(23, qod0Var, wzk0Var);
                        aVar2.R(x2);
                    }
                    u2x a2 = g8s.b.a.a(s2x.b.a.a(str, (gzs) x2, N, 0L, null, a, aVar2, 805306368, 248), null, false, null, aVar2, 24576, 14);
                    if (wzk0Var.e == null) {
                        aVar2.K(691969255);
                    } else {
                        aVar2.K(691969256);
                        hlyVar = h8s.a.a(wzk0Var.e, false, null, null, null, aVar2, 196608, 30);
                    }
                    aVar2.j();
                    nvu0.a(a2, q630.a.a, hlyVar, null, null, aVar2, 48, 24);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                n3j0.e(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 11:
                com.vk.newsfeed.impl.items.posting.item.modals.d dVar = (com.vk.newsfeed.impl.items.posting.item.modals.d) this.c;
                String str2 = (String) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-70467892, intValue2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.<anonymous> (SimplePostingCreateBottomSheet.kt:92)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1957748295, new i8c(10, dVar, str2), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                t7u0.b((String) this.c, (SemanticsConfiguration) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ps7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ps7(izs izsVar, q630 q630Var, int i) {
        this.b = 10;
        this.d = izsVar;
        this.c = q630Var;
    }
}
