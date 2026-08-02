package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.request.GetExternalIdsByOkIds;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.b230;
import xsna.nqs;
import xsna.obz;
import xsna.scl0;
import xsna.tj50;
import xsna.txb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xht implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xht(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CharSequence mapToStringApiParam$lambda$0;
        ArrayList<UIBlock> arrayList;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        ArrayList arrayList2;
        switch (this.b) {
            case 0:
                return rdx0.B((rdx0) obj);
            case 1:
                mapToStringApiParam$lambda$0 = GetExternalIdsByOkIds.Companion.mapToStringApiParam$lambda$0((CallParticipant.ParticipantId) obj);
                return mapToStringApiParam$lambda$0;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                L.e("Profile successfully added to recents");
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((vya0) obj).a);
            case 5:
                sfc sfcVar = (sfc) obj;
                int i = 18;
                sfc.a(sfcVar, "JsonPrimitive", new f9y(new nd1(i)));
                sfc.a(sfcVar, "JsonNull", new f9y(new fn4(20)));
                sfc.a(sfcVar, "JsonLiteral", new f9y(new nh(15)));
                sfc.a(sfcVar, "JsonObject", new f9y(new sv0(22)));
                sfc.a(sfcVar, "JsonArray", new f9y(new uv0(i)));
                return s3q0.a;
            case 6:
                List list = (List) obj;
                return new xvy(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 7:
                return Boolean.valueOf(((obz) obj) instanceof obz.c);
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                return b230.d.a;
            case 10:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 11:
                return ((MsgReaction) obj).u2();
            case 12:
                ArrayList<UIBlock> arrayList3 = ((UIBlockList) obj).y;
                if (arrayList3 == null || !arrayList3.isEmpty()) {
                    for (UIBlock uIBlock : arrayList3) {
                        UIBlockMusicTrack uIBlockMusicTrack = uIBlock instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) uIBlock : null;
                        if (uIBlockMusicTrack == null || (musicTrack3 = uIBlockMusicTrack.z) == null || !musicTrack3.Pb()) {
                            UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack ? (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock : null;
                            if (uIBlockSearchHistoryTrack == null || (musicTrack2 = uIBlockSearchHistoryTrack.A) == null || !musicTrack2.Pb()) {
                                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                                if (uIBlockList != null && (arrayList = uIBlockList.y) != null && !arrayList.isEmpty()) {
                                    for (UIBlock uIBlock2 : arrayList) {
                                        UIBlockMusicTrack uIBlockMusicTrack2 = uIBlock2 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) uIBlock2 : null;
                                        if (uIBlockMusicTrack2 == null || (musicTrack = uIBlockMusicTrack2.z) == null || !musicTrack.Pb()) {
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(r4);
                        break;
                    }
                }
                r4 = false;
                return Boolean.valueOf(r4);
            case 13:
                int i2 = wg40.p;
                return null;
            case 14:
                NewsfeedGetResponse newsfeedGetResponse = new NewsfeedGetResponse(null);
                newsfeedGetResponse.reqListId = 0;
                return newsfeedGetResponse;
            case 15:
                return s3q0.a;
            case 16:
                return ((MsgFromUser) obj).m9(AttachVideoMsg.class, true, false);
            case 17:
                return new g.a(((tj50.a) obj).a(new ye40(5), ao8.d));
            case 18:
                nqs nqsVar = (nqs) obj;
                int i3 = PaginatedFriendsListFragment.p0;
                nqs.a aVar = nqsVar instanceof nqs.a ? (nqs.a) nqsVar : null;
                if (aVar != null) {
                    return aVar.a;
                }
                return null;
            case 19:
                qgi0.r((tgi0) obj, "trackCover");
                return s3q0.a;
            case 20:
                return txb0.b.a;
            case 21:
                return Boolean.valueOf(((v9c0) obj).e);
            case 22:
                return ((PostingState.Editing) obj).d.q.c;
            case 23:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 24:
                List<MarketMarketItemDto> d = ((MarketGetByIdResponseDto) obj).d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                for (MarketMarketItemDto marketMarketItemDto : d) {
                    List<BaseImageDto> W = marketMarketItemDto.W();
                    Image t = W != null ? atv0.t(W) : null;
                    SelectionProductId selectionProductId = new SelectionProductId(marketMarketItemDto.getId(), marketMarketItemDto.q());
                    String title = marketMarketItemDto.getTitle();
                    ProductPrice v = pli.v(marketMarketItemDto.F());
                    Boolean v0 = marketMarketItemDto.v0();
                    Boolean bool = Boolean.TRUE;
                    boolean f = epx.f(v0, bool);
                    boolean f2 = epx.f(marketMarketItemDto.D0(), bool);
                    boolean f3 = epx.f(marketMarketItemDto.y0(), bool);
                    UserId q = marketMarketItemDto.q();
                    Long valueOf = Long.valueOf(marketMarketItemDto.getId());
                    MarketItemRejectInfoDto K = marketMarketItemDto.K();
                    c530 c530Var = new c530(f, f2, f3, null, new d530(q, valueOf, K != null ? new h530(K.getDescription(), K.f(), K.i()) : null, t));
                    MarketItemRejectInfoDto K2 = marketMarketItemDto.K();
                    boolean z = K2 != null && K2.e();
                    List<List<BaseImageDto>> a0 = marketMarketItemDto.a0();
                    if (a0 != null) {
                        List<List<BaseImageDto>> list2 = a0;
                        arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(atv0.t((List) it.next()));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    arrayList4.add(new kei0(selectionProductId, title, v, c530Var, z, t, arrayList2, epx.f(marketMarketItemDto.w0(), Boolean.TRUE), marketMarketItemDto.d().i() == MarketMarketItemAvailabilityDto.AVAILABLE.i(), marketMarketItemDto.getUrl(), marketMarketItemDto.r()));
                }
                return arrayList4;
            case 25:
                List<UsersUserFullDto> d2 = ((FriendsGetFieldsResponseDto) obj).d();
                ArrayList arrayList5 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((UsersUserFullDto) it2.next()).s1());
                }
                return arrayList5;
            case 26:
                return Boolean.valueOf(((scl0.b) obj) != null);
            case 27:
                return ((CatalogBlockData) obj).g().w();
            case 28:
                View view = (View) obj;
                return Boolean.valueOf(view.getVisibility() != 0 && (view instanceof ViewGroup));
            default:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM stickers_recommendations");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
