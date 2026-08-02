package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedTypeDto;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.data.VkAppsList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.ecomm.design.view.badge.MarketDiscountBadge;
import com.vk.ecomm.design.view.badge.MarketDiscountBadgeStyle;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.g9k0;
import xsna.go20;
import xsna.tj50;
import xsna.ve10;
import xsna.xqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pyz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pyz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.q U;
        int i = 5;
        int i2 = 6;
        int i3 = 0;
        switch (this.b) {
            case 0:
                return ((LocationSearchState) ((oyz) obj)).b;
            case 1:
                MarketDiscountBadge marketDiscountBadge = new MarketDiscountBadge((Context) obj, null, 6, 0);
                marketDiscountBadge.setDiscountFromValue(50);
                marketDiscountBadge.setStyle(MarketDiscountBadgeStyle.Contrast);
                return marketDiscountBadge;
            case 2:
                x410 x410Var = (x410) obj;
                return Boolean.valueOf(x410Var.g && x410Var.p == MarketItemType.VK);
            case 3:
                return new ve10.a.C3884a(((tj50.a) obj).a(new pey(i), ao8.d));
            case 4:
                List list = (List) obj;
                return list.isEmpty() ? io.reactivex.rxjava3.core.x.i(new RuntimeException("Empty list of music has been received in audioService.audioGetById")) : io.reactivex.rxjava3.core.x.k(j5g.Y(list));
            case 5:
                return ((VkAppsList) obj).d();
            case 6:
                ((zak0) go20.w).setValue((go20.d) obj);
                return s3q0.a;
            case 7:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(epx.f(((ib50) obj).a.c, o25.a().c()));
            case 9:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 10:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 11:
                return j5g.O0((VKList) obj);
            case 12:
                return ((Object[]) obj)[0];
            case 13:
                return Boolean.valueOf(((NewsEntry) obj) instanceof DzenNews);
            case 14:
                UtilsDomainResolvedDto utilsDomainResolvedDto = (UtilsDomainResolvedDto) obj;
                if (utilsDomainResolvedDto.e() == UtilsDomainResolvedTypeDto.GROUP || utilsDomainResolvedDto.e() == UtilsDomainResolvedTypeDto.PAGE || utilsDomainResolvedDto.e() == UtilsDomainResolvedTypeDto.EVENT) {
                    List singletonList = Collections.singletonList(new UserId(utilsDomainResolvedDto.d() != null ? r7.intValue() : 0L));
                    List singletonList2 = Collections.singletonList(GroupsFieldsDto.DONUT);
                    if ((4 & 2) != 0) {
                        singletonList2 = null;
                    }
                    U = rsg0.T(yfb.x(xqu.a.a(null, singletonList, singletonList2))).U(new uq80(new q8w(12), i3));
                } else {
                    U = io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                }
                return U.U(new ga40(new or50(utilsDomainResolvedDto, i2), 5));
            case 15:
                return ((pno0) obj).d().toString();
            case 16:
                return new lo90(R.layout.vk_view_default_list_loading, (ViewGroup) obj);
            case 17:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 18:
                return PlaylistScreenState.a((PlaylistScreenState) obj, null, null, false, true, null, null, null, 1919);
            case 19:
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "product_card_cart_button_subtext_test_tag");
                return s3q0.a;
            case 21:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -8193, 2047);
            case 22:
                return Boolean.valueOf(!((sy40) obj).e.c);
            case 23:
                qgi0.r((tgi0) obj, "RootTags.TOOLBAR_BACK");
                return s3q0.a;
            case 24:
                return new udo0(((Integer) obj).intValue());
            case 25:
                return new rsh0(((omh0) obj).b);
            case 26:
                return new b.a.e(((tj50.a) obj).a(new zos(28), ao8.d));
            case 27:
                return SettingsState.a((SettingsState) obj, null, false, null, null, null, null, null, null, g9k0.a.a, 255);
            case 28:
                qgi0.r((tgi0) obj, "storefront_top_bar_cart_icon");
                return s3q0.a;
            default:
                cul0 cul0Var = cul0.b;
                return ((gvg0) cul0.d.getValue()).a((StoriesEventsStack) obj, io.reactivex.rxjava3.schedulers.a.b());
        }
    }
}
