package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$VideoSubscribeEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ae0;
import xsna.dt70;
import xsna.j5h;
import xsna.kdh0;
import xsna.kh00;
import xsna.oap;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class zd0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ae0 ae0Var = (ae0) obj4;
                gzs gzsVar = (gzs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1635194955, intValue, -1, "com.vk.ads.impl.adchoice.AdChoicesBottomSheetRedesign.Content.<anonymous>.<anonymous> (AdChoicesBottomSheetRedesign.kt:65)");
                    }
                    ae0.a aVar2 = ae0Var.a;
                    ArrayList arrayList = aVar2.b;
                    z0n z0nVar = aVar2.c;
                    boolean y = aVar.y(ae0Var) | aVar.J(gzsVar);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new td0(r6 ? 1 : 0, ae0Var, gzsVar);
                        aVar.R(x);
                    }
                    de0.b(arrayList, z0nVar, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((j5h.g) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                crz.c((kdh0.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((kh00.a) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                y410.a aVar3 = (y410.a) obj4;
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = MarketItemReviewsFragment.w0;
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1945747857, intValue2, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment.handleCreateReviewButton.<anonymous> (MarketItemReviewsFragment.kt:461)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-374811508, new uqc(6, aVar3, marketItemReviewsFragment), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                zs70.d((dt70.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                x1c x1cVar = (x1c) obj4;
                bod0 bod0Var = (bod0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1872012059, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterCheckboxHolder.bind.<anonymous> (ProductFilterCheckboxHolder.kt:35)");
                    }
                    Object x2 = aVar5.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.k.b(null);
                        aVar5.R(x2);
                    }
                    rrv0.d(null, null, null, null, kai.c(555439168, new vy7(x1cVar, bod0Var, (wh50) x2), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 7:
                UserId userId = (UserId) obj4;
                VideoNotificationsStatus videoNotificationsStatus = (VideoNotificationsStatus) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                for (UIBlock uIBlock : uIBlockList.y) {
                    if (uIBlock instanceof UIBlockSearchAuthor) {
                        UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                        if (uIBlockSearchAuthor.Pb().equals(userId)) {
                            oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
                            if (oapVar instanceof oap.b) {
                                ((Group) ((oap.b) oapVar).a).k0 = videoNotificationsStatus.i();
                                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ALL_AUTHORS, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new MobileOfficialAppsGroupsStat$VideoSubscribeEvent(kk70.a(videoNotificationsStatus)), 30), 2)).q();
                            } else {
                                if (!(oapVar instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return uIBlockList;
            case 8:
                com.vk.messagetemplates.impl.details.f fVar = (com.vk.messagetemplates.impl.details.f) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(543509940, intValue4, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreenContent.<anonymous> (TemplateDetailsScreenContent.kt:34)");
                    }
                    s8o0.a(fVar.b, izsVar, null, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                djo0.a((nmo0) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
        }
    }

    public /* synthetic */ zd0(UserId userId, VideoNotificationsStatus videoNotificationsStatus, com.vk.catalog2.common.ui.holders.c cVar) {
        this.b = 7;
        this.c = userId;
        this.d = videoNotificationsStatus;
    }

    public /* synthetic */ zd0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
