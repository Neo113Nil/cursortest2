package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class ce0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ce0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                de0.a((z0n) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((cd5) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                wzs wzsVar = (wzs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1801987660, intValue, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetLayout.kt:262)");
                    }
                    wzsVar.invoke(aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                tqc tqcVar = (tqc) obj3;
                View view = (View) obj;
                UIBlockVideo uIBlockVideo = (UIBlockVideo) obj2;
                String r = uIBlockVideo.B.r();
                if (r != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                }
                ((wqc) tqcVar.F.getValue()).e(view, uIBlockVideo);
                break;
            case 4:
                com.vk.ecomm.market.good.ui.restriction.a aVar3 = (com.vk.ecomm.market.good.ui.restriction.a) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(618567149, intValue2, -1, "com.vk.ecomm.market.good.ui.restriction.GoodFragmentRestrictionsBinderImpl.<anonymous>.<anonymous> (GoodFragmentRestrictionsBinderImpl.kt:41)");
                    }
                    ProductCardRestrictionViewState a = aVar3.a();
                    if (a == null) {
                        aVar4.K(-1970696401);
                    } else {
                        aVar4.K(-1970696400);
                        rrv0.d(null, null, null, null, kai.c(-1489864818, new uqc(4, a, aVar3), aVar4), aVar4, 24576, 15);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 5:
                u6u u6uVar = (u6u) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-513482474, intValue3, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewMarketHeaderItemViewHolder.<anonymous>.<anonymous> (GoodPreviewMarketHeaderItemViewHolder.kt:29)");
                    }
                    Object x = aVar5.x();
                    if (x == a.C0011a.a) {
                        x = new lwh(u6uVar, 15);
                        aVar5.R(x);
                    }
                    brd0.a(54, aVar5, (izs) x, txj0.f(aVar, 1.0f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                po40.c(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.h0) obj3).a(tpg0.a, aVar, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 8:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                PhotoViewer photoViewer = q4a0.this.f;
                if (!photoViewer.s) {
                    if (booleanValue) {
                        photoViewer.t();
                    } else {
                        photoViewer.h();
                    }
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((h1h0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((xqq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((vuq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int i2 = VideoProfileCreatorOnboardingItemsView.q;
                ((VideoProfileCreatorOnboardingItemsView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((vox0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ce0(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
