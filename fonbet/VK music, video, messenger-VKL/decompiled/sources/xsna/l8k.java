package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.core.snackbar.HideReason;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.k840;
import xsna.mbv;
import xsna.qr60;
import xsna.wih0;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l8k implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ l8k(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        LinkedHashMap linkedHashMap7;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "errorTitle");
                return s3q0.a;
            case 1:
                LinkedHashMap linkedHashMap8 = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_groups_receive_msg_disable);
            case 2:
                rpm rpmVar = (rpm) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(rpmVar.a);
                sb.append(' ');
                sb.append(rpmVar.c);
                return sb.toString();
            case 3:
                j170 j170Var = (j170) obj;
                return new i4n(new qr60.a.f(j170Var.a, j170Var.b, j170Var.d));
            case 4:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return Boolean.valueOf(((d6n) obj).b.e);
            case 5:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.LOADING_PAGINATION, 0, false, false, 59);
            case 6:
                p870 f = p870.f();
                s3q0 s3q0Var = s3q0.a;
                f.e(1200, s3q0Var);
                return s3q0Var;
            case 7:
                ShortVideoGetSubscriptionsShortVideosResponseDto shortVideoGetSubscriptionsShortVideosResponseDto = (ShortVideoGetSubscriptionsShortVideosResponseDto) obj;
                k2r0 k2r0Var = k5f.a;
                List<ShortVideoGetSubscriptionsShortVideosFeedItemDto> d = shortVideoGetSubscriptionsShortVideosResponseDto.f().d();
                List<UsersUserFullDto> k = shortVideoGetSubscriptionsShortVideosResponseDto.k();
                List<GroupsGroupFullDto> g = shortVideoGetSubscriptionsShortVideosResponseDto.g();
                List<ShortVideoAudioDto> d2 = shortVideoGetSubscriptionsShortVideosResponseDto.d();
                List<MasksEffectDto> e = shortVideoGetSubscriptionsShortVideosResponseDto.e();
                List<MasksMaskDto> H2 = shortVideoGetSubscriptionsShortVideosResponseDto.H2();
                List<MarketMarketItemDto> i = shortVideoGetSubscriptionsShortVideosResponseDto.i();
                List<ShortVideoCompilationInfoDto> H4 = shortVideoGetSubscriptionsShortVideosResponseDto.H4();
                List<PlacesPlaceDto> j = shortVideoGetSubscriptionsShortVideosResponseDto.j();
                k5f.b.getClass();
                LinkedHashMap b = j2r0.b(k);
                k5f.d.getClass();
                LinkedHashMap b2 = dqu.b(g);
                Map map = jgp.b;
                Map b3 = k != null ? k5f.a.b(k) : map;
                if (g != null) {
                    k5f.c.getClass();
                    map = equ.b(g);
                }
                LinkedHashMap n = pn00.n(b3, map);
                if (d2 != null) {
                    List<ShortVideoAudioDto> list = d2;
                    int e2 = on00.e(c5g.u(list, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    LinkedHashMap linkedHashMap9 = new LinkedHashMap(e2);
                    for (Object obj2 : list) {
                        ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) obj2;
                        linkedHashMap9.put(new c14(shortVideoAudioDto.q(), shortVideoAudioDto.getId()), obj2);
                    }
                    linkedHashMap = linkedHashMap9;
                } else {
                    linkedHashMap = null;
                }
                if (i != null) {
                    List<MarketMarketItemDto> list2 = i;
                    int e3 = on00.e(c5g.u(list2, 10));
                    if (e3 < 16) {
                        e3 = 16;
                    }
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap(e3);
                    for (Object obj3 : list2) {
                        MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj3;
                        linkedHashMap10.put(new c14(marketMarketItemDto.q(), marketMarketItemDto.getId()), obj3);
                    }
                    linkedHashMap2 = linkedHashMap10;
                } else {
                    linkedHashMap2 = null;
                }
                if (j != null) {
                    List<PlacesPlaceDto> list3 = j;
                    int e4 = on00.e(c5g.u(list3, 10));
                    if (e4 < 16) {
                        e4 = 16;
                    }
                    LinkedHashMap linkedHashMap11 = new LinkedHashMap(e4);
                    for (Object obj4 : list3) {
                        linkedHashMap11.put(Integer.valueOf(((PlacesPlaceDto) obj4).getId()), obj4);
                    }
                    linkedHashMap3 = linkedHashMap11;
                } else {
                    linkedHashMap3 = null;
                }
                if (H2 != null) {
                    List<MasksMaskDto> list4 = H2;
                    int e5 = on00.e(c5g.u(list4, 10));
                    if (e5 < 16) {
                        e5 = 16;
                    }
                    LinkedHashMap linkedHashMap12 = new LinkedHashMap(e5);
                    for (Object obj5 : list4) {
                        MasksMaskDto masksMaskDto = (MasksMaskDto) obj5;
                        linkedHashMap12.put(new c14(masksMaskDto.q(), masksMaskDto.getId()), obj5);
                    }
                    linkedHashMap4 = linkedHashMap12;
                } else {
                    linkedHashMap4 = null;
                }
                if (e != null) {
                    List<MasksEffectDto> list5 = e;
                    int e6 = on00.e(c5g.u(list5, 10));
                    if (e6 < 16) {
                        e6 = 16;
                    }
                    linkedHashMap5 = new LinkedHashMap(e6);
                    for (Object obj6 : list5) {
                        MasksEffectDto masksEffectDto = (MasksEffectDto) obj6;
                        linkedHashMap5.put(new c14(masksEffectDto.q(), masksEffectDto.getId()), obj6);
                    }
                } else {
                    linkedHashMap5 = null;
                }
                if (H4 != null) {
                    List<ShortVideoCompilationInfoDto> list6 = H4;
                    int e7 = on00.e(c5g.u(list6, 10));
                    LinkedHashMap linkedHashMap13 = new LinkedHashMap(e7 >= 16 ? e7 : 16);
                    for (Object obj7 : list6) {
                        Integer e8 = ((ShortVideoCompilationInfoDto) obj7).e();
                        linkedHashMap13.put(Integer.valueOf(e8 != null ? e8.intValue() : 0), obj7);
                    }
                    linkedHashMap6 = linkedHashMap13;
                } else {
                    linkedHashMap6 = null;
                }
                ArrayList arrayList = new ArrayList();
                for (ShortVideoGetSubscriptionsShortVideosFeedItemDto shortVideoGetSubscriptionsShortVideosFeedItemDto : d) {
                    if (shortVideoGetSubscriptionsShortVideosFeedItemDto instanceof ShortVideoGetSubscriptionsShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) {
                        j2r0 j2r0Var = qgj0.a;
                        linkedHashMap7 = linkedHashMap5;
                        arrayList.add(new wih0.a(new ClipVideoFileAdapter(qgj0.b(((ShortVideoGetSubscriptionsShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) shortVideoGetSubscriptionsShortVideosFeedItemDto).d(), n, b, b2, linkedHashMap, linkedHashMap7, linkedHashMap4, linkedHashMap2, linkedHashMap6, linkedHashMap3, null)), null));
                    } else {
                        linkedHashMap7 = linkedHashMap5;
                    }
                    linkedHashMap5 = linkedHashMap7;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!epx.f(xih0.a((wih0) next), "0_0")) {
                        arrayList2.add(next);
                    }
                }
                int size = shortVideoGetSubscriptionsShortVideosResponseDto.f().d().size();
                int size2 = shortVideoGetSubscriptionsShortVideosResponseDto.f().d().size() - arrayList2.size();
                PaginationKey paginationKey = PaginationKey.LoadedFull.b;
                String e9 = shortVideoGetSubscriptionsShortVideosResponseDto.f().e();
                return new qih0(arrayList2, size, size2, paginationKey, (e9 == null || e9.length() == 0 || e9.equals("null")) ? paginationKey : new PaginationKey.Next(e9), null, null, null);
            case 8:
                int i2 = FriendsFragment.q0;
                return Integer.valueOf(((aus) obj).b);
            case 9:
                return (mbv.d) obj;
            case 10:
                return ((Pair) obj).i();
            case 11:
                return String.valueOf(com.vk.im.engine.models.im_item.b.a(((v7w) obj).b));
            case 12:
                return Boolean.valueOf(((Map.Entry) obj).getValue() instanceof vaw);
            case 13:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return io.reactivex.rxjava3.core.q.B0(5000L, TimeUnit.MILLISECONDS);
            case 14:
                return ((zk10) obj).b().get(1).toLowerCase(Locale.ROOT);
            case 15:
                return new iig0((ViewGroup) obj, 0);
            case 16:
                return y410.d.a;
            case 17:
                return Boolean.valueOf(((y810) obj).D);
            case 18:
                int i3 = MediaPickerFragment.Q;
                ((ikv0) obj).a();
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                float f2 = sx20.a;
                return Boolean.TRUE;
            case 21:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 22:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 23:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 24:
                return Integer.valueOf(((MusicPickerState) obj).j.size());
            case 25:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "musicTitle");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 26:
                if (((HideReason) obj) == HideReason.Swipe) {
                    s750 s750Var = k840.a.e;
                    (s750Var != null ? s750Var : null).q();
                }
                return s3q0.a;
            case 27:
                qcy<Object>[] qcyVarArr2 = NewsfeedCustomFragment2.r0;
                return Boolean.valueOf(((zg60) obj).c.e);
            case 28:
                return (NewsEntry) ((List) obj).get(0);
            default:
                ((Throwable) obj).printStackTrace();
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
        }
    }
}
