package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketGetUserReviewsAggregatedResponseDto;
import com.vk.api.generated.market.dto.MarketItemForReviewDto;
import com.vk.api.generated.market.dto.MarketUserReviewsCommunitiesResponseObjectDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsForReviewObjectDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsResponseObjectDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveTwoVkMixesVh;
import com.vk.contacts.AndroidContact;
import com.vk.core.util.TrafficSaverInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.log.L;
import com.vk.money.pin.PinFragment;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.an90;
import xsna.dv00;
import xsna.hty;
import xsna.k840;
import xsna.lmn0;
import xsna.m4a0;
import xsna.n7a;
import xsna.sb40;
import xsna.tj50;
import xsna.ug30;
import xsna.up90;
import xsna.uxd0;
import xsna.xpb0;
import xsna.ye50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jjx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jjx(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040e  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.vk.photos.ui.base.BasePhotoListFragment] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r2;
        Boolean e;
        List<MarketItemForReviewDto> d;
        CatalogMarketCategoryContext.Context context;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto2;
        dz00 dz00Var;
        f600 f600Var;
        pk30 pk30Var;
        int i = this.b;
        int i2 = 11;
        int i3 = 10;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kjx) obj2).e.invoke(n7a.d.b);
                return s3q0.a;
            case 1:
                return new gty((hty.a) obj2, z ? 1 : 0);
            case 2:
                MarketGetUserReviewsAggregatedResponseDto marketGetUserReviewsAggregatedResponseDto = (MarketGetUserReviewsAggregatedResponseDto) obj;
                Object obj3 = ((smg) obj2).a;
                MarketUserReviewsItemsForReviewObjectDto e2 = marketGetUserReviewsAggregatedResponseDto.e();
                String title = e2 != null ? e2.getTitle() : null;
                MarketUserReviewsItemsForReviewObjectDto e3 = marketGetUserReviewsAggregatedResponseDto.e();
                int size = (e3 == null || (d = e3.d()) == null) ? 0 : d.size();
                MarketUserReviewsItemsForReviewObjectDto e4 = marketGetUserReviewsAggregatedResponseDto.e();
                List<MarketItemForReviewDto> d2 = e4 != null ? e4.d() : null;
                if (d2 != null) {
                    List<MarketItemForReviewDto> list = d2;
                    r2 = new ArrayList(c5g.u(list, 10));
                    for (MarketItemForReviewDto marketItemForReviewDto : list) {
                        UserId d3 = marketItemForReviewDto.d();
                        Integer valueOf = Integer.valueOf(marketItemForReviewDto.f());
                        long e5 = marketItemForReviewDto.e();
                        List<BaseImageDto> i4 = marketItemForReviewDto.i();
                        String title2 = marketItemForReviewDto.getTitle();
                        String d4 = marketItemForReviewDto.g().d();
                        if (d4 == null) {
                            d4 = "";
                        }
                        r2.add(new a610(d3, valueOf, e5, i4, title2, d4, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                } else {
                    r2 = EmptyList.b;
                }
                List list2 = r2;
                MarketUserReviewsItemsResponseObjectDto f = marketGetUserReviewsAggregatedResponseDto.f();
                String title3 = f != null ? f.getTitle() : null;
                MarketUserReviewsItemsResponseObjectDto f2 = marketGetUserReviewsAggregatedResponseDto.f();
                int count = f2 != null ? f2.getCount() : 0;
                MarketUserReviewsItemsResponseObjectDto f3 = marketGetUserReviewsAggregatedResponseDto.f();
                List b = zs00.b(f3 != null ? f3.d() : null);
                MarketUserReviewsCommunitiesResponseObjectDto d5 = marketGetUserReviewsAggregatedResponseDto.d();
                String title4 = d5 != null ? d5.getTitle() : null;
                MarketUserReviewsCommunitiesResponseObjectDto d6 = marketGetUserReviewsAggregatedResponseDto.d();
                int count2 = d6 != null ? d6.getCount() : 0;
                MarketUserReviewsCommunitiesResponseObjectDto d7 = marketGetUserReviewsAggregatedResponseDto.d();
                Integer valueOf2 = d7 != null ? Integer.valueOf(d7.f()) : null;
                MarketUserReviewsCommunitiesResponseObjectDto d8 = marketGetUserReviewsAggregatedResponseDto.d();
                List a = zs00.a(d8 != null ? d8.d() : null);
                MarketUserReviewsCommunitiesResponseObjectDto d9 = marketGetUserReviewsAggregatedResponseDto.d();
                if (d9 != null && (e = d9.e()) != null) {
                    z = e.booleanValue();
                }
                return new vr00(title, size, list2, title3, count, b, title4, count2, valueOf2, a, z);
            case 3:
                kr80 kr80Var = (kr80) obj2;
                MarketCatalogFilterVM marketCatalogFilterVM = (MarketCatalogFilterVM) obj;
                CatalogMarketFilter catalogMarketFilter = kr80Var.b;
                String str = kr80Var.f;
                MarketCatalogFilterVM.a aVar = marketCatalogFilterVM.d;
                int i5 = dv00.a.$EnumSwitchMapping$3[marketCatalogFilterVM.a.ordinal()];
                if (i5 == 1) {
                    context = CatalogMarketCategoryContext.Context.MARKET;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    context = CatalogMarketCategoryContext.Context.CLASSIFIEDS;
                }
                CatalogMarketCategoryContext.Context context2 = context;
                Long l = marketCatalogFilterVM.f;
                Long l2 = marketCatalogFilterVM.g;
                List<CatalogMarketCategoryContext> list3 = catalogMarketFilter.g;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (CatalogMarketCategoryContext catalogMarketCategoryContext : list3) {
                    MarketCatalogFilterVM.c cVar = catalogMarketCategoryContext.b == CatalogMarketCategoryContext.Context.MARKET ? marketCatalogFilterVM.c : aVar;
                    if (cVar != null) {
                        MarketBridgeCategory b2 = cVar.b();
                        catalogMarketCategoryContext = new CatalogMarketCategoryContext(catalogMarketCategoryContext.b, catalogMarketCategoryContext.c, catalogMarketCategoryContext.d, b2 != null ? Integer.valueOf(b2.b) : null);
                    }
                    arrayList.add(catalogMarketCategoryContext);
                }
                Integer num = aVar != null ? aVar.c : null;
                CatalogMarketStatusOption catalogMarketStatusOption = marketCatalogFilterVM.i;
                String str2 = catalogMarketStatusOption != null ? catalogMarketStatusOption.c : null;
                List<CatalogMarketStatusOption> list4 = marketCatalogFilterVM.j;
                Boolean bool = marketCatalogFilterVM.k;
                Boolean bool2 = marketCatalogFilterVM.l;
                Boolean bool3 = marketCatalogFilterVM.m;
                Boolean bool4 = marketCatalogFilterVM.n;
                Boolean bool5 = marketCatalogFilterVM.o;
                MarketDeliveryType marketDeliveryType = marketCatalogFilterVM.p;
                int i6 = marketDeliveryType == null ? -1 : dv00.a.$EnumSwitchMapping$2[marketDeliveryType.ordinal()];
                if (i6 == 1) {
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.ANY;
                } else if (i6 == 2) {
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.PICKUP;
                } else {
                    if (i6 != 3) {
                        catalogMarketDeliveryTypeDto2 = null;
                        av00.a(new mu00(str, new CatalogMarketFilter(context2, l, l2, catalogMarketFilter.e, catalogMarketFilter.f, arrayList, num, catalogMarketFilter.i, catalogMarketFilter.j, str2, list4, bool, bool2, bool3, bool4, bool5, catalogMarketDeliveryTypeDto2)));
                        dz00Var = marketCatalogFilterVM.e;
                        if (dz00Var != null) {
                            av00.a(new qu00(kr80Var.f, dz00Var.a, dz00Var.b, dz00Var.c, true));
                        }
                        av00.a(new pu00(str, kr80Var.g));
                        return s3q0.a;
                    }
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.COURIER;
                }
                catalogMarketDeliveryTypeDto2 = catalogMarketDeliveryTypeDto;
                av00.a(new mu00(str, new CatalogMarketFilter(context2, l, l2, catalogMarketFilter.e, catalogMarketFilter.f, arrayList, num, catalogMarketFilter.i, catalogMarketFilter.j, str2, list4, bool, bool2, bool3, bool4, bool5, catalogMarketDeliveryTypeDto2)));
                dz00Var = marketCatalogFilterVM.e;
                if (dz00Var != null) {
                }
                av00.a(new pu00(str, kr80Var.g));
                return s3q0.a;
            case 4:
                eiz eizVar = (eiz) obj2;
                TrafficSaverInfo trafficSaverInfo = (TrafficSaverInfo) ((it80) obj).a;
                if (trafficSaverInfo != null) {
                    eizVar.invoke(trafficSaverInfo);
                }
                return s3q0.a;
            case 5:
                ((st10) obj2).a.a(new e.b.h.c(new MediaPickerSelectedItem.LocalMedia((LocalMediaEntry) obj), true));
                return s3q0.a;
            case 6:
                ((z37) obj2).b(new a.b((String) obj));
                return s3q0.a;
            case 7:
                s820 s820Var = (s820) obj2;
                n1l0 n1l0Var = s820Var.q;
                if (n1l0Var != null && (f600Var = s820Var.m) != null) {
                    f600Var.c(n1l0Var.o2());
                }
                irc0 irc0Var = s820Var.n;
                if (irc0Var != null) {
                    irc0Var.invoke();
                }
                return s3q0.a;
            case 8:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                L.e("MlEnhanceDebug", "Write time: " + (currentTimeMillis - ref$LongRef.element));
                ref$LongRef.element = currentTimeMillis;
                return s3q0.a;
            case 9:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachVideoMsg) && ((AttachVideoMsg) attach).i == ((ui30) obj2).d);
            case 10:
                vm30 vm30Var = (vm30) obj2;
                lmn0.b bVar = (lmn0.b) obj;
                com.vk.metrics.eventtracking.b.a.n("messages_reply_swipe");
                vm30Var.u.setItemAnimator(null);
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.T(ug30.q.a, ((ntx0) bVar).G0());
                }
                return s3q0.a;
            case 11:
                mt30 mt30Var = (mt30) obj2;
                com.vk.im.engine.models.messages.a aVar2 = mt30Var.e;
                if (aVar2 != null && (pk30Var = mt30Var.d) != null) {
                    pk30Var.w(aVar2);
                }
                return s3q0.a;
            case 12:
                ((qb40) obj2).b(sb40.d.C3658d.a);
                return s3q0.a;
            case 13:
                ((MusicInteractiveTwoVkMixesVh) obj2).u(((Integer) obj).intValue(), true, true);
                return s3q0.a;
            case 14:
                qgi0.h((tgi0) obj, ((ma40) obj2).b);
                return s3q0.a;
            case 15:
                Artist artist = (Artist) obj2;
                bn40.g("AudioFollowArtist", (Integer) obj);
                artist.i = true;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new uq3(artist, true));
                return s3q0.a;
            case 16:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, ((ae50) obj2).c);
                qgi0.r(tgi0Var, "AudioTrackTitle");
                return s3q0.a;
            case 17:
                ((we50) obj2).T(new ye50.b(cdi.E((MixSettingsEntity) obj)));
                return s3q0.a;
            case 18:
                List<UsersUserFullDto> list5 = (List) obj;
                j2r0 j2r0Var = ((zi50) obj2).b;
                ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                for (UsersUserFullDto usersUserFullDto : list5) {
                    j2r0Var.getClass();
                    arrayList2.add(j2r0.a(usersUserFullDto));
                }
                return arrayList2;
            case 19:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) obj2;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                gom0.a(gom0Var, if60.b, new a86(newsfeedCustomFragment2, i2));
                gom0.a(gom0Var, new c4r(20), new z77(newsfeedCustomFragment2, i3));
                gom0.a(gom0Var, new z7w(9), new u61(newsfeedCustomFragment2, 8));
                gom0.a(gom0Var, new d4r(15), new w61(newsfeedCustomFragment2, 9));
                gom0.a(gom0Var, new l8k(27), new oa5(newsfeedCustomFragment2, 7));
                gom0.a(gom0Var, hf60.b, new bn7(newsfeedCustomFragment2, i2));
                return s3q0.a;
            case 20:
                mzp0 a2 = ((f170) obj2).a();
                if (a2 != null) {
                    a2.f();
                }
                return s3q0.a;
            case 21:
                PastAsrListFragment pastAsrListFragment = (PastAsrListFragment) obj2;
                an90 an90Var = (an90) obj;
                int i7 = PastAsrListFragment.U;
                if (!(an90Var instanceof an90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cvk.w(j03.g(pastAsrListFragment.requireContext(), ((an90.a) an90Var).a, R.string.error), false);
                return s3q0.a;
            case 22:
                ((tp90) obj2).c.a(new up90.a((Throwable) obj));
                return s3q0.a;
            case 23:
                m4a0 m4a0Var = (m4a0) obj2;
                zxd0 zxd0Var = (zxd0) obj;
                AndroidContact androidContact = m4a0Var.c;
                Context context3 = m4a0Var.a;
                iwv iwvVar = m4a0Var.b;
                if (zxd0Var instanceof zxd0.n) {
                    qxb qxbVar = ((zxd0.n) zxd0Var).a;
                    if (qxbVar instanceof m4a0.b) {
                        iwvVar.e(context3, (String) j5g.X(androidContact.e));
                    } else if (qxbVar instanceof m4a0.a) {
                        iwvVar.g(context3, Collections.singletonList(androidContact));
                    }
                } else if (zxd0Var instanceof zxd0.b) {
                    m4a0Var.f.onNext(new uxd0.b(0));
                }
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((View) obj).equals(((PhotoViewer) obj2).I));
            case 25:
                ((hha0) ((lha0) obj2).c).T2(((VKList) obj).i());
                return s3q0.a;
            case 26:
                PinFragment pinFragment = ((jma0) obj2).b;
                if (!((Boolean) obj).booleanValue()) {
                    View view = pinFragment.a0;
                    (view != null ? view : null).setVisibility(4);
                    pinFragment.Ob();
                }
                return s3q0.a;
            case 27:
                e2b0 e2b0Var = (e2b0) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    e2b0Var.S(str3);
                } else {
                    e2b0Var.getClass();
                }
                return s3q0.a;
            case 28:
                h7b0 h7b0Var = (h7b0) obj2;
                j7b0 j7b0Var = h7b0Var.d;
                Playlist playlist = h7b0Var.c;
                j7b0Var.B(xx1.k(playlist));
                playlist.t = false;
                playlist.g = null;
                return s3q0.a;
            default:
                dpb0 dpb0Var = (dpb0) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                r820 r820Var = new r820(dpb0Var, i2);
                ao8 ao8Var = ao8.d;
                return new xpb0.a(aVar3.a(r820Var, ao8Var), aVar3.a(new kpr(18), ao8Var), aVar3.a(new zsw(13), ao8Var), dpb0Var.f, dpb0Var.e, dpb0Var.g, dpb0Var.h, dpb0Var.i);
        }
    }

    public /* synthetic */ jjx(hb10 hb10Var, kr80 kr80Var) {
        this.b = 3;
        this.c = kr80Var;
    }
}
