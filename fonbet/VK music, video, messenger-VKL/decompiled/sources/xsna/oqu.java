package xsna;

import android.database.Cursor;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetByIdExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.money.dto.MoneyGetTransferMethodsResponseDto;
import com.vk.api.generated.money.dto.MoneyTransferMethodDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingGroupInfo;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bs70;
import xsna.ls70;
import xsna.p410;
import xsna.tlo0;
import xsna.wy30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqu implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oqu(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null) {
                    return EmptyList.b;
                }
                List<GroupsGroupFullDto> list = d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : list) {
                    UserId e = fkq0.e(groupsGroupFullDto.P0());
                    String r3 = groupsGroupFullDto.r3();
                    boolean equals = r3 != null ? r3.equals("1") : false;
                    boolean f = epx.f(groupsGroupFullDto.B3(), Boolean.TRUE);
                    boolean z2 = groupsGroupFullDto.o3() == BaseBoolIntDto.YES;
                    GroupsGroupAdminLevelDto f2 = groupsGroupFullDto.f();
                    arrayList.add(new PostingGroupInfo(e, equals, f, z2, f2 != null ? f2.i() : 0));
                }
                return arrayList;
            case 1:
                bzu bzuVar = bzu.b;
                bn40.f("HSNMan", "try to show default notification info");
                bzu.f((SuggestMusicNotificationInfo) bzu.m.getValue());
                return s3q0.a;
            case 2:
                return String.valueOf(com.vk.im.engine.models.im_item.b.a(((a5w) obj).y9()));
            case 3:
                ((ojt) obj).b = 100;
                return s3q0.a;
            case 4:
                return fl3.J((Cursor) obj);
            case 5:
                return new p410.j(((n410) obj).f);
            case 6:
                return (MarketMarketItemFullDto) j5g.Y(((MarketGetByIdExtendedResponseDto) obj).d());
            case 7:
                return l710.a((MarketLinkedContentState) obj);
            case 8:
                MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
                Preference.C("menu_items_vk_apps", (String) MenuApiApplicationsCache.c.getValue());
                MenuApiApplicationsCache.e.remove(MenuApiApplicationsCache.AppsType.APP);
                return s3q0.a;
            case 9:
                ((vak0) co20.m).g(((Float) obj).floatValue());
                return s3q0.a;
            case 10:
                iuc0 iuc0Var = iuc0.b;
                iuc0.k0(Collections.singletonList((NewsEntry) obj));
                return s3q0.a;
            case 11:
                List<MoneyTransferMethodDto> d2 = ((MoneyGetTransferMethodsResponseDto) obj).d();
                if (d2 != null) {
                    Iterator it = d2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((MoneyTransferMethodDto) next).getType(), "sbp")) {
                                r3 = next;
                            }
                        }
                    }
                    MoneyTransferMethodDto moneyTransferMethodDto = (MoneyTransferMethodDto) r3;
                    if (moneyTransferMethodDto != null && moneyTransferMethodDto.d()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                wy30.a aVar = (wy30.a) obj;
                aVar.c = SystemClock.uptimeMillis();
                aVar.h = false;
                aVar.g = "unknown";
                return s3q0.a;
            case 13:
                qgi0.r((tgi0) obj, "MusicPickerPreviewCellSnippetSettingsButton");
                return s3q0.a;
            case 14:
                return j5g.O0((VKList) obj);
            case 15:
                return Boolean.valueOf(((sy40) obj).e.e);
            case 16:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 17:
                return s3q0.a;
            case 18:
                bs70 bs70Var = (bs70) obj;
                if (!(bs70Var instanceof bs70.c)) {
                    return null;
                }
                bs70.c cVar = (bs70.c) bs70Var;
                boolean z3 = cVar.e;
                ls70 ls70Var = cVar.b;
                ls70.d dVar = ls70Var.a;
                String str = dVar.a;
                String str2 = dVar.b;
                tlo0.h d3 = oq.d(tlo0.Companion, ls70Var.c);
                tlo0.h hVar = new tlo0.h(ls70Var.d);
                List<ls70.a> list2 = ls70Var.e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (ls70.a aVar2 : list2) {
                    arrayList2.add(new nr70(aVar2.c, aVar2.a, oq.d(tlo0.Companion, aVar2.b)));
                }
                ls70.c cVar2 = ls70Var.f;
                String str3 = cVar2.a;
                if (cVar2.b && !z3) {
                    z = true;
                }
                return new ObtainVerificationScreenContent(str, str2, d3, hVar, arrayList2, new ObtainVerificationScreenContent.a(str3, z, z3), cVar.c, cVar.d);
            case 19:
                return new b.d((String) obj);
            case 20:
                ((z5x) obj).getClass();
                return s3q0.a;
            case 21:
                ((vgg) obj).c();
                return s3q0.a;
            case 22:
                int i = PictureInPictureOverlayService.g;
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 23:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108607);
            case 24:
                PosterBackground posterBackground = (PosterBackground) obj;
                int i2 = posterBackground.b;
                UserId userId = posterBackground.c;
                int i3 = posterBackground.e;
                Image image = posterBackground.f;
                return new xac0(i2, userId, i3, image != null ? image.Fb() : null, posterBackground.h == null, posterBackground.i);
            case 25:
                return ((PostingState.Editing) obj).i.d;
            case 26:
                return Boolean.valueOf(((View) obj) instanceof RecyclerView);
            case 27:
                qgi0.r((tgi0) obj, "PrivacyBestFriendsListTestTag");
                return s3q0.a;
            case 28:
                return (VkPaginationList) obj;
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ oqu(es70 es70Var) {
        this.b = 18;
    }
}
