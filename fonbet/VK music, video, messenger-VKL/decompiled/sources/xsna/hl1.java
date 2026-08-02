package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketProfileInfoLocationDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyGridState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.photoflow.presentation.l;
import com.vk.profile.core.content.albums.AlbumView;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import com.vk.search.params.api.domain.model.MarketSearchSortingOptions;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Parameters;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogSectionDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.aw9;
import xsna.e8v0;
import xsna.g5y;
import xsna.gm50;
import xsna.iqb;
import xsna.iya;
import xsna.l7x0;
import xsna.r2c;
import xsna.s2s;
import xsna.v0h;
import xsna.w710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hl1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = null;
        boolean z = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                VKImageView vKImageView = ((AlbumView) obj4).t;
                ImageSize Cb = ((PhotoAlbum) obj3).u.Cb(vKImageView.getWidth(), true, true);
                vKImageView.load(Cb != null ? Cb.d.d : null);
                return s3q0.a;
            case 1:
                androidx.compose.foundation.gestures.c cVar = (androidx.compose.foundation.gestures.c) obj4;
                fz1 fz1Var = (fz1) obj3;
                long j = ((d.b) obj).a;
                cVar.getClass();
                long g = ov70.g((itl.f(cVar).A == LayoutDirection.Rtl && cVar.L == Orientation.Horizontal) ? -1.0f : 1.0f, j);
                fz1Var.a(cVar.K.e(Float.intBitsToFloat((int) (cVar.L == Orientation.Vertical ? g & 4294967295L : g >> 32))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 2:
                L.e("[Push][Onboarding]: Onboarding error");
                L.i((Throwable) obj);
                ((d83) obj4).b.a((PromoSessionInfo) obj3);
                return s3q0.a;
            case 3:
                vcb0 vcb0Var = (vcb0) obj4;
                PlaylistCatalogDo playlistCatalogDo = (PlaylistCatalogDo) obj3;
                PlaylistScreenState playlistScreenState = (PlaylistScreenState) obj;
                PlaylistCatalogSectionDo playlistCatalogSectionDo = playlistCatalogDo.b;
                CatalogSectionParams catalogSectionParams = new CatalogSectionParams(playlistCatalogSectionDo.b, false, true, true, false, vcb0Var.c);
                PlaylistScreenData playlistScreenData = new PlaylistScreenData(playlistCatalogSectionDo, new CatalogSectionStateFlow(new CatalogSectionState(catalogSectionParams.d, catalogSectionParams.b, null, catalogSectionParams.f ? new ParcelableLazyGridState(new dsy(0, 0)) : new ParcelableLazyListState(ParcelableLazyListState.d()), false, false, null, null, catalogSectionParams.e, null, null, null, null, 7924, null).j(playlistCatalogSectionDo.e)));
                f4a.a(vcb0Var, playlistScreenData);
                return PlaylistScreenState.a(playlistScreenState, null, playlistScreenData, false, false, playlistCatalogDo.d, playlistCatalogDo.e, playlistCatalogDo.c, 239);
            case 4:
                int i2 = ChannelDonutSupportFragment.V;
                gm50.a.a((ChannelDonutSupportFragment) obj4, ((iya.a) obj).a, new aya(1, (com.vk.channels.impl.donut.c) obj3, com.vk.channels.impl.donut.c.class, "accept", "accept(Lcom/vk/channels/impl/donut/ui/state/ChannelDonutSupportViewState$Data$Content;)V", 0));
                return s3q0.a;
            case 5:
                ItemReactions itemReactions = (ItemReactions) obj3;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                int i3 = ((n6b) obj4).d;
                Msg e = y.b.e(i3);
                MsgFromChannel msgFromChannel = e != null ? (MsgFromChannel) e : null;
                if (msgFromChannel != null) {
                    msgFromChannel.kc(itemReactions);
                    xgl0Var.y().o(msgFromChannel);
                }
                xgl0Var.y().D(i3, null);
                return s3q0.a;
            case 6:
                iqb.a aVar = (iqb.a) obj3;
                ViewGroup viewGroup = (ViewGroup) obj;
                if (((cqb) obj4).h) {
                    int i4 = aqb.p;
                    return new aqb(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_item_new, viewGroup, false), aVar);
                }
                int i5 = bqb.r;
                return new bqb(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_item, viewGroup, false), aVar);
            case 7:
                z4c z4cVar = (z4c) obj4;
                z4cVar.T(aw9.a.C2577a.b);
                z4cVar.c0((Throwable) obj, (r2c.n) obj3);
                return s3q0.a;
            case 8:
                ah3 ah3Var = (ah3) obj4;
                String str = (String) obj3;
                MarketProfileInfoLocationDto marketProfileInfoLocationDto = (MarketProfileInfoLocationDto) obj;
                MarketProfileInfoLocationDto marketProfileInfoLocationDto2 = (MarketProfileInfoLocationDto) ah3Var.c;
                u4a u4aVar = (u4a) ah3Var.b;
                boolean f = epx.f(marketProfileInfoLocationDto2, marketProfileInfoLocationDto);
                ah3Var.c = marketProfileInfoLocationDto;
                if (!f) {
                    String str2 = u4aVar.b.a;
                    String d = marketProfileInfoLocationDto.d();
                    if (d == null) {
                        d = "";
                    }
                    av00.a(new qu00(str2, d, marketProfileInfoLocationDto.e(), marketProfileInfoLocationDto.f(), true));
                    av00.a(new pu00(u4aVar.b.a, str));
                }
                return s3q0.a;
            case 9:
                ((com.vk.clips.entrypoints.ui.d) obj4).a.a((VkOnboardingCampaign) obj3, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 10:
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj3;
                izs<? super SdkVideoFile, s3q0> izsVar = ((xle) obj4).g;
                if (izsVar != null) {
                    izsVar.invoke(sdkClipVideoFile);
                }
                return s3q0.a;
            case 11:
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                ((com.vk.clips.playlists.di.a) ((ClipsPlaylistsComponent) ((kue) obj4).f.getValue()).b()).f.put((UserId) obj3, Integer.valueOf(shortVideoGetPlaylistsResponseDto.getCount()));
                return shortVideoGetPlaylistsResponseDto;
            case 12:
                ((l2v0) obj).f(((ComposeView) obj4).getContext(), ((v0h.a) obj3).itemView);
                return s3q0.a;
            case 13:
                ab abVar = (ab) obj4;
                MiniWidgetItem miniWidgetItem = (MiniWidgetItem) obj3;
                iyu0 iyu0Var = (iyu0) obj;
                if (!epx.f(miniWidgetItem.getType(), SuperAppMiniWidgetItemDto.TypeDto.MW_STEPS.i())) {
                    z = miniWidgetItem.i();
                } else if (!miniWidgetItem.i() || !jyu0.a(iyu0Var)) {
                    z = false;
                }
                abVar.invoke(Boolean.valueOf(z));
                return s3q0.a;
            case 14:
                nvl nvlVar = (nvl) obj4;
                nvlVar.d.h7(l7x0.b.a);
                b7d0 b7d0Var = nvlVar.d;
                b7d0Var.i7((Throwable) obj);
                b7d0Var.b7((Poll) ((mkl) obj3).b);
                return s3q0.a;
            case 15:
                z480 z480Var = (z480) obj4;
                i2s i2sVar = (i2s) obj3;
                t2s t2sVar = (t2s) obj;
                yyr yyrVar = t2sVar.c.get(Integer.valueOf(z480Var.b));
                if (yyrVar != null) {
                    i2sVar.n(new s2s.c(R.string.vkim_folder_delete_failed, yyrVar.getName()));
                }
                Set R0 = j5g.R0(t2sVar.g);
                R0.remove(Integer.valueOf(z480Var.b));
                return i2s.u(t2s.a(t2sVar, null, false, null, null, false, null, R0, false, 0, 447));
            case 16:
                ((com.vk.geo.impl.presentation.b) obj4).Z((Map) obj3, (CameraBounds) obj);
                return s3q0.a;
            case 17:
                g5y.a aVar2 = (g5y.a) obj3;
                ((g5y) obj4).k(aVar2.a, aVar2.b);
                return s3q0.a;
            case 18:
                ((x7y) obj4).L0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, ((Throwable) obj).getMessage(), new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), ((GetGroupInfo$Parameters) obj3).f(), 1, null));
                return s3q0.a;
            case 19:
                VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) obj4;
                VkMarketSearchParams vkMarketSearchParams2 = (VkMarketSearchParams) obj3;
                xwz xwzVar = (xwz) obj;
                b920.l(xwzVar, vkMarketSearchParams);
                MarketSearchSortingOptions.a aVar3 = MarketSearchSortingOptions.Companion;
                String str3 = vkMarketSearchParams.c;
                aVar3.getClass();
                Iterator<E> it = MarketSearchSortingOptions.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((MarketSearchSortingOptions) next).i(), str3)) {
                            obj2 = next;
                        }
                    }
                }
                MarketSearchSortingOptions marketSearchSortingOptions = (MarketSearchSortingOptions) obj2;
                if (marketSearchSortingOptions == null) {
                    marketSearchSortingOptions = MarketSearchSortingOptions.DEFAULT;
                }
                int i6 = w710.a.$EnumSwitchMapping$0[marketSearchSortingOptions.ordinal()];
                if (i6 == 1) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_sort_new_first), true);
                } else if (i6 == 2) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_sort_price_asc), true);
                } else if (i6 == 3) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_sort_price_desc), true);
                } else if (i6 != 4) {
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_rating_desc), true);
                }
                fxh0<Integer> fxh0Var = vkMarketSearchParams2.d;
                if (fxh0Var != null) {
                    xwzVar.b(new exz(fxh0Var.b), true);
                }
                Integer num = vkMarketSearchParams2.g;
                Integer num2 = vkMarketSearchParams2.h;
                if (num != null || num2 != null) {
                    xwzVar.b(kn4.k(new sf4(11, num, num2)), true);
                }
                Boolean bool = vkMarketSearchParams.n;
                Boolean bool2 = Boolean.TRUE;
                if (epx.f(bool, bool2)) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_online_payment), true);
                }
                if (epx.f(vkMarketSearchParams.o, bool2)) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_discount), true);
                }
                MarketSearchDeliveryType marketSearchDeliveryType = vkMarketSearchParams.s;
                if (marketSearchDeliveryType != null) {
                    int i7 = w710.a.$EnumSwitchMapping$1[marketSearchDeliveryType.ordinal()];
                    if (i7 == 1) {
                        xwzVar.getClass();
                        xwzVar.b(xwz.e(R.string.search_params_market_delivery_type_pickup), true);
                    } else if (i7 == 2) {
                        xwzVar.getClass();
                        xwzVar.b(xwz.e(R.string.search_params_market_delivery_type_courier), true);
                    } else if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (epx.f(vkMarketSearchParams.p, bool2)) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_seller_high_rating), true);
                }
                if (epx.f(vkMarketSearchParams.q, bool2)) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_friends_reviews), true);
                }
                if (epx.f(vkMarketSearchParams.r, bool2)) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_market_friends_wishlist), true);
                }
                return s3q0.a;
            case 20:
                o43 o43Var = (o43) obj4;
                MiniWidgetItem miniWidgetItem2 = (MiniWidgetItem) obj3;
                iyu0 iyu0Var2 = (iyu0) obj;
                if (!epx.f(miniWidgetItem2.getType(), SuperAppMiniWidgetItemDto.TypeDto.MW_STEPS.i())) {
                    z = miniWidgetItem2.i();
                } else if (!miniWidgetItem2.i() || !jyu0.a(iyu0Var2)) {
                    z = false;
                }
                o43Var.invoke(Boolean.valueOf(z));
                return s3q0.a;
            case 21:
                AttachGift attachGift = (AttachGift) obj3;
                pk30 pk30Var = ((wq30) obj4).u;
                if (pk30Var != null) {
                    pk30Var.k(attachGift);
                }
                return s3q0.a;
            case 22:
                jai0 jai0Var = (jai0) obj;
                d640.m((xg50) obj4, (obi0) obj3, jai0Var, 0, jai0Var.f.a.a.c.length());
                return s3q0.a;
            case 23:
                ec40 ec40Var = (ec40) obj4;
                r840 r840Var = (r840) obj3;
                if (ec40Var.j) {
                    r840Var.n.b(ec40Var);
                }
                return s3q0.a;
            case 24:
                ((pr50) obj4).M.a(((Integer) obj).intValue(), (NewsEntry) obj3);
                return s3q0.a;
            case 25:
                float floatValue = ((Float) obj).floatValue();
                mc90 mc90Var = ((wc90) obj4).b;
                ((wak0) mc90Var.q).C(mc90Var.j(mc90Var.k() + an10.b(mc90Var.q() != 0 ? floatValue / mc90Var.q() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                return s3q0.a;
            case 26:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                l.b bVar = (l.b) obj;
                boolean z2 = bVar.a;
                boolean z3 = bVar.c;
                if (!z3) {
                    jVar.o.d(false);
                } else if (!jVar.o.y) {
                    ref$BooleanRef.element = true;
                }
                jVar.o.y = z3;
                PhotoFlowHeaderView photoFlowHeaderView = jVar.k;
                bwt0.p0(photoFlowHeaderView, z2);
                photoFlowHeaderView.setIsInMultiselectMode(z3);
                photoFlowHeaderView.setAddPhotoButtonVisible(bVar.b);
                photoFlowHeaderView.setMultiSelectOptionsVisible(bVar.d);
                jVar.h.setHeaderVisible(z2);
                return s3q0.a;
            case 27:
                return Long.valueOf(((pec0) obj4).b.i((hyg0) obj, (kec0) obj3));
            case 28:
                Post post = (Post) obj4;
                Context context = (Context) obj3;
                VKList vKList = (VKList) obj;
                iuc0 iuc0Var = iuc0.b;
                UserProfile userProfile = new UserProfile();
                Owner owner = post.o;
                UserId userId = post.m;
                userProfile.c = owner.b;
                userProfile.e = owner.c;
                userProfile.h = owner.e;
                if (vKList.size() > 0) {
                    UserProfile userProfile2 = (UserProfile) j5g.Y(vKList);
                    if (fkq0.c(userProfile2.c)) {
                        iuc0.h0(fkq0.e(userId), userProfile2, context);
                    } else {
                        UserId e2 = fkq0.e(userId);
                        userProfile.s.putAll(userProfile2.s);
                        s3q0 s3q0Var2 = s3q0.a;
                        iuc0.h0(e2, userProfile, context);
                    }
                } else {
                    iuc0.h0(fkq0.e(userId), userProfile, context);
                }
                return s3q0.a;
            default:
                return new e6d0((wh50) obj4, (PreviewViewState.v) obj3);
        }
    }

    public /* synthetic */ hl1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
