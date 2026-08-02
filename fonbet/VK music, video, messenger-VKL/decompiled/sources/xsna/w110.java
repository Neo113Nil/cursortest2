package xsna;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.provider.Settings;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendPreviewProfileDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsMarketInfoDto;
import com.vk.api.generated.groups.dto.GroupsMarketShopConditionsStateDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingDto;
import com.vk.api.generated.market.dto.MarketCustomButtonAvailableDayDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketCustomButtonInaccessibilityMessageDto;
import com.vk.api.generated.market.dto.MarketDeliveryInfoDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetItemCardQuickMessagesResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetItemCardResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetProductLinkedContentResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetPromoteUrlResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetRelatedCategoriesBlockResponseObjectDto;
import com.vk.api.generated.market.dto.MarketGetSellerResponseTimeResponseObjectDto;
import com.vk.api.generated.market.dto.MarketItemAddressesDto;
import com.vk.api.generated.market.dto.MarketItemBannerDto;
import com.vk.api.generated.market.dto.MarketItemCardGetButtonsResponseObjectDto;
import com.vk.api.generated.market.dto.MarketItemCardQuickMessageDto;
import com.vk.api.generated.market.dto.MarketItemCardVideoGetResponseObjectDto;
import com.vk.api.generated.market.dto.MarketItemCharacteristicDto;
import com.vk.api.generated.market.dto.MarketItemCharacteristicValueDto;
import com.vk.api.generated.market.dto.MarketItemLabelDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketItemPropertyVariantsDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketGetItemResponseObjectDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemIntegrationInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemOtherItemsDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketMarketOtherItemsResponseObjectDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.market.dto.MarketRelatedCategoriesBlockDto;
import com.vk.api.generated.market.dto.MarketRelatedCategoryDto;
import com.vk.api.generated.market.dto.MarketServicesDurationDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import com.vk.api.generated.market.dto.MarketVariantsGridPropertyDto;
import com.vk.api.generated.market.dto.MarketVariantsGridPropertyVariantDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.mvp.holder.container.ProfileShowFiltersVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.DeliveryInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.OtherGoods;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.AvailablePeriod;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.RelatedCategoryItem;
import com.vk.dto.market.CharacteristicsItem;
import com.vk.dto.market.GoodVariantItem;
import com.vk.dto.market.MarketBanner;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.market.Variant;
import com.vk.dto.market.VariantGroup;
import com.vk.dto.market.VariantGroupType;
import com.vk.dto.money.MoneyTransferLinks;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.privacy.ListFriends;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.instantjobs.InstantJob;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stickers.keyboard.StickersView;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsResult;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dbe0;
import xsna.gxd0;
import xsna.k840;
import xsna.kxi0;
import xsna.nn20;
import xsna.nph0;
import xsna.ome0;
import xsna.pk9;
import xsna.pph0;
import xsna.q0j0;
import xsna.qn60;
import xsna.ro40;
import xsna.u4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w110 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w110(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        if (r13 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        List<String> list;
        ro40 ro40Var;
        MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) this.c;
        n3a n3aVar = (n3a) obj;
        if (n3aVar instanceof zra) {
            zra zraVar = (zra) n3aVar;
            ViewPagerVh viewPagerVh = musicMyAudiosCatalogRootVh.O;
            if (((Boolean) musicMyAudiosCatalogRootVh.K.getValue()).booleanValue()) {
                myc0.h(musicMyAudiosCatalogRootVh.E, null, null, new xo40(musicMyAudiosCatalogRootVh, zraVar, null), 3);
            }
            int i = MusicMyAudiosCatalogRootVh.a.$EnumSwitchMapping$0[zraVar.a.ordinal()];
            if (i == 1) {
                musicMyAudiosCatalogRootVh.v = true;
                musicMyAudiosCatalogRootVh.o0().zf("", false);
                musicMyAudiosCatalogRootVh.o0().setEnabled(false);
                musicMyAudiosCatalogRootVh.j0().setEnabled(false);
                DisableableViewPager disableableViewPager = viewPagerVh.o;
                (disableableViewPager != null ? disableableViewPager : null).setTouchEnabled(false);
                String str = musicMyAudiosCatalogRootVh.q;
                if (str != null) {
                    viewPagerVh.A(str);
                }
                musicMyAudiosCatalogRootVh.k0().c(false);
                musicMyAudiosCatalogRootVh.k0().d(false, true);
                AppBarShadowView appBarShadowView = musicMyAudiosCatalogRootVh.n0().g;
                if (appBarShadowView != null) {
                    appBarShadowView.setVisibility(0);
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                musicMyAudiosCatalogRootVh.v = false;
                musicMyAudiosCatalogRootVh.o0().setEnabled(true);
                DisableableViewPager disableableViewPager2 = viewPagerVh.o;
                (disableableViewPager2 != null ? disableableViewPager2 : null).setTouchEnabled(true);
                musicMyAudiosCatalogRootVh.j0().setEnabled(true);
                musicMyAudiosCatalogRootVh.k0().c(true);
                musicMyAudiosCatalogRootVh.k0().d(true, true);
                AppBarShadowView appBarShadowView2 = musicMyAudiosCatalogRootVh.n0().g;
                if (appBarShadowView2 != null) {
                    appBarShadowView2.setVisibility(4);
                }
            }
        } else if (n3aVar instanceof dq80) {
            if (!musicMyAudiosCatalogRootVh.v && (ro40Var = musicMyAudiosCatalogRootVh.x) != null) {
                ic40 w = lyd.g().w();
                Activity activity = ro40Var.a;
                Playlist playlist = ro40Var.e;
                ro40.a aVar = ro40Var.n;
                HashMap hashMap = MusicPlaybackLaunchContext.c;
                w.f(activity, playlist, aVar);
            }
        } else if ((n3aVar instanceof ron0) && musicMyAudiosCatalogRootVh.x != null) {
            MusicCollectionType musicCollectionType = musicMyAudiosCatalogRootVh.L;
            Set<String> set = ((ron0) n3aVar).b;
            if (musicCollectionType == MusicCollectionType.AUDIOS) {
                if (set != null) {
                    Set<String> set2 = set;
                    ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
                    Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(j5g.g0(j5g.H0(drm0.b0((String) it.next(), new char[]{'_'}, 0, 6), 2), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62));
                    }
                    list = j5g.O0(arrayList);
                }
                list = EmptyList.b;
                k840.a.d().J(list);
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7 != 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj) {
        ty80 ty80Var = (ty80) this.c;
        int intValue = ((Integer) obj).intValue();
        com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = ty80Var.b;
        ContextThemeWrapper contextThemeWrapper = ty80Var.a;
        int i = 0;
        if (Settings.System.getInt(contextThemeWrapper.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            ty80Var.d = true;
            if (ty80Var.c != intValue) {
                ty80Var.c = intValue;
                eVar.b(intValue);
            }
        } else if (ty80Var.d) {
            ty80Var.d = false;
            int i2 = Settings.System.getInt(contextThemeWrapper.getContentResolver(), "user_rotation", 0);
            if (i2 != 0) {
                if (i2 != 1) {
                    int i3 = i2 != 2 ? 3 : 2;
                    i = i3;
                } else {
                    i = 1;
                }
            }
            if (ty80Var.c != i) {
                ty80Var.c = i;
                eVar.b(i);
            }
        }
        return s3q0.a;
    }

    private final Object d(Object obj) {
        dra0.this.a.a(g.b.b);
        return s3q0.a;
    }

    private final Object e(Object obj) {
        vpc0 vpc0Var = ((qkc0) this.c).d;
        List<PostingStep> list = edi.t(((PostingState.Editing) obj).g).e;
        vpc0Var.getClass();
        return vpc0.a(list);
    }

    private final Object g(Object obj) {
        isc0 isc0Var = (isc0) this.c;
        WallWithCounters wallWithCounters = (WallWithCounters) obj;
        ftc0 ftc0Var = isc0Var.f;
        ftc0Var.b.a();
        return new io.reactivex.rxjava3.internal.operators.single.b(new m7j(ftc0Var.a, new qn60.b[]{new aic(), new xc3(wallWithCounters, null, ftc0Var.b, isc0Var.g, null, true, null)})).l(new dnz(new qw30(wallWithCounters, 20), 9));
    }

    private final Object h(Object obj) {
        exd0 exd0Var = (exd0) this.c;
        kqs kqsVar = (kqs) obj;
        FriendsListParams friendsListParams = exd0Var.d;
        List<Integer> list = exd0Var.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kq.d((Number) it.next(), arrayList);
        }
        Set S0 = j5g.S0(arrayList);
        List<UserId> list2 = exd0Var.f;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((UserId) it2.next()).b));
        }
        exd0Var.l = gxd0.a.a(friendsListParams, S0, j5g.S0(arrayList2), o25.a().c(), kqsVar, 2);
        if (exd0Var.p == null) {
            ArrayList d = exd0Var.l.d();
            ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
            Iterator it3 = d.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ProfileFriendItem) it3.next()).b);
            }
            exd0Var.p = j5g.S0(arrayList3);
        }
        for (ListFriends listFriends : exd0Var.l.a) {
            ListsFriendsDefaultList.a aVar = ListsFriendsDefaultList.Companion;
            int i = listFriends.b;
            aVar.getClass();
            if (ListsFriendsDefaultList.a.a(i)) {
                exd0Var.n.add(Integer.valueOf(listFriends.b));
            } else {
                exd0Var.o.add(Integer.valueOf(listFriends.b));
            }
        }
        if (exd0Var.m == null) {
            exd0Var.m = Boolean.valueOf(!kqsVar.a.isEmpty());
        }
        return kqsVar;
    }

    private final Object k(Object obj) {
        VkSubnavigationButton vkSubnavigationButton = (VkSubnavigationButton) this.c;
        Drawable drawable = (Drawable) obj;
        qcy<Object>[] qcyVarArr = ProfileShowFiltersVh.j;
        f4m.x(vkSubnavigationButton.getPaddingStart(), vkSubnavigationButton);
        drawable.setTint(R.attr.vk_ui_icon_primary);
        drawable.setColorFilter(dhr0.a.Z(R.attr.vk_ui_icon_primary, null), PorterDuff.Mode.SRC_IN);
        vkSubnavigationButton.P4(drawable, false);
        return s3q0.a;
    }

    private final Object l(Object obj) {
        PublishState publishState = (PublishState) obj;
        SettingsResult settingsResult = ((dbe0.a.C2717a) ((dbe0.a) this.c)).b;
        List<VideoFile> list = settingsResult.b;
        if (list == null) {
            list = publishState.v;
        }
        List<VideoFile> list2 = list;
        Boolean bool = settingsResult.c;
        boolean booleanValue = bool != null ? bool.booleanValue() : publishState.x;
        Boolean bool2 = settingsResult.d;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : publishState.y;
        Boolean bool3 = settingsResult.e;
        return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, list2, null, booleanValue, booleanValue2, bool3 != null ? bool3.booleanValue() : publishState.z, null, null, settingsResult.f, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -164626433, 2047);
    }

    private final Object n(Object obj) {
        InstantJob instantJob = (InstantJob) obj;
        return Boolean.valueOf((instantJob instanceof bqf0) && ((bqf0) instantJob).i == ((aqf0) this.c).h);
    }

    private final Object o(Object obj) {
        xlb0 xlb0Var = (xlb0) obj;
        ((wzs) this.c).invoke(xlb0Var, new ov70(fdi.E(xlb0Var, false)));
        xlb0Var.a();
        return s3q0.a;
    }

    private final Object p(Object obj) {
        ((wh50) this.c).setValue((tny) obj);
        return s3q0.a;
    }

    private final Object q(Object obj) {
        Set set;
        mdh0 mdh0Var = (mdh0) this.c;
        it80 it80Var = (it80) obj;
        if (it80Var != null && (set = (Set) it80Var.a) != null) {
            AccessibilityEvents accessibilityEvents = mdh0Var.a;
            List O0 = j5g.O0(set);
            ArrayList<CallMemberId> arrayList = mdh0Var.c;
            ArrayList u0 = j5g.u0(arrayList, O0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CallMemberId callMemberId = (CallMemberId) next;
                Object obj2 = linkedHashMap.get(callMemberId);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(callMemberId, obj2);
                }
                ((List) obj2).add(next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() == 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                g5g.y((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    CallMemberId callMemberId2 = (CallMemberId) it3.next();
                    if (!arrayList.contains(callMemberId2) && set.contains(callMemberId2)) {
                        arrayList3.add(new ndh0(callMemberId2, true));
                    }
                    if (arrayList.contains(callMemberId2) && !set.contains(callMemberId2)) {
                        arrayList3.add(new ndh0(callMemberId2, false));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (((ndh0) next2).b) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (!((ndh0) next3).b) {
                        arrayList5.add(next3);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((ndh0) it6.next()).a);
                    }
                    accessibilityEvents.getClass();
                    accessibilityEvents.d(new uk(0, accessibilityEvents, arrayList6));
                }
                if (!arrayList5.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(c5g.u(arrayList5, 10));
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(((ndh0) it7.next()).a);
                    }
                    accessibilityEvents.getClass();
                    accessibilityEvents.d(new xk(0, accessibilityEvents, arrayList7));
                }
                arrayList3.clear();
                arrayList.clear();
                arrayList.addAll(set);
            }
        }
        return s3q0.a;
    }

    private final Object r(Object obj) {
        return new nph0.c(((pph0.a) this.c).a, (Throwable) obj);
    }

    private final Object s(Object obj) {
        int intValue = ((rg50) this.c).getIntValue();
        if (intValue < 0) {
            intValue = 0;
        }
        return new h9x((0 << 32) | (intValue & 4294967295L));
    }

    private final Object t(Object obj) {
        ((kxi0) this.c).a.onNext(kxi0.a.ADMIN_TRANSITION);
        return s3q0.a;
    }

    private final Object v(Object obj) {
        return SettingsState.a((SettingsState) obj, null, false, null, null, null, Boolean.valueOf(((q0j0.d) ((q0j0) this.c)).b), null, null, null, 479);
    }

    private final Object w(Object obj) {
        bpj0 bpj0Var = (bpj0) this.c;
        brj0 brj0Var = bpj0Var.l;
        izs<? super brj0, s3q0> izsVar = bpj0Var.m;
        if (brj0Var != null && izsVar != null) {
            izsVar.invoke(brj0Var);
        }
        return s3q0.a;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Good good;
        MarketGetItemCardResponseDto marketGetItemCardResponseDto;
        UserId userId;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        UserId userId2;
        ArrayList arrayList6;
        LinkedHashMap<String, lpd0> linkedHashMap;
        OwnerResponseTime ownerResponseTime;
        MarketMarketItemFullDto d;
        MarketMarketItemIntegrationInfoDto D;
        MarketMarketItemFullDto d2;
        BaseBoolIntDto D0;
        MarketCommunityRatingDto i2;
        MarketCommunityRatingDto i22;
        MarketMarketItemFullDto d3;
        List<MarketItemLabelDto> K;
        List<MarketItemCardQuickMessageDto> d4;
        MarketRelatedCategoriesBlockDto d5;
        List<MarketRelatedCategoryDto> d6;
        MarketRelatedCategoriesBlockDto d7;
        String title;
        GroupsMarketShopConditionsStateDto d1;
        List<VideoVideoFullDto> d8;
        GroupsGroupFriendsDto D02;
        List<GroupsGroupFriendPreviewProfileDto> e;
        GroupsGroupFriendsDto D03;
        List<MarketCustomButtonFullDto> d9;
        ArrayList arrayList7;
        String str;
        String str2;
        GroupsMarketInfoDto b1;
        MarketPriceDto k;
        List<MarketMarketItemDto> d10;
        Boolean z3;
        Boolean K0;
        GroupsMarketInfoDto b12;
        PagesWikipageFullDto n;
        GroupsMarketInfoDto b13;
        PagesWikipageFullDto n2;
        Boolean N3;
        Boolean N32;
        GroupsMarketInfoDto b14;
        Integer e2;
        ArrayList<OtherGoods> arrayList8;
        MarketGetItemCardResponseDto marketGetItemCardResponseDto2;
        Object obj2;
        MarketMarketItemFullDto d11;
        List<MarketMarketItemOtherItemsDto> T;
        MarketMarketItemFullDto d12;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        MarketItemType marketItemType;
        ArrayList arrayList12;
        ArrayList arrayList13;
        Photo[] photoArr;
        ArrayList arrayList14;
        ArrayList arrayList15;
        MarketBanner marketBanner;
        LinkButton linkButton;
        Action b;
        List<GroupsAddressDto> d13;
        t3u t3uVar;
        Long l;
        Activity h;
        int i = this.b;
        int i3 = 0;
        int i4 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                x110 x110Var = (x110) obj3;
                MarketGetItemCardResponseDto marketGetItemCardResponseDto3 = (MarketGetItemCardResponseDto) obj;
                x110Var.getClass();
                MarketMarketGetItemResponseObjectDto i5 = marketGetItemCardResponseDto3.i();
                int i6 = 10;
                if (i5 == null || (d12 = i5.d()) == null) {
                    good = null;
                } else {
                    t3u zb = Good.zb();
                    zb.f = b210.i(d12.a0());
                    zb.a = d12.getId();
                    UserId q = d12.q();
                    MarketItemOwnerInfoDto W = d12.W();
                    zb.B = new Owner(q, W != null ? W.e() : null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194300, null);
                    zb.b = d12.q();
                    zb.l = d12.f().i();
                    zb.g = d12.n().getId();
                    zb.h = d12.n().d();
                    zb.d = d12.getDescription();
                    List<MarketItemCharacteristicDto> o = d12.o();
                    if (o != null) {
                        List<MarketItemCharacteristicDto> list = o;
                        arrayList9 = new ArrayList(c5g.u(list, 10));
                        for (MarketItemCharacteristicDto marketItemCharacteristicDto : list) {
                            int id = marketItemCharacteristicDto.getId();
                            String d14 = marketItemCharacteristicDto.d();
                            List<MarketItemCharacteristicValueDto> e3 = marketItemCharacteristicDto.e();
                            ArrayList arrayList16 = new ArrayList(c5g.u(e3, 10));
                            Iterator<T> it = e3.iterator();
                            while (it.hasNext()) {
                                arrayList16.add(new CharacteristicsItem.Value(((MarketItemCharacteristicValueDto) it.next()).d()));
                            }
                            arrayList9.add(new CharacteristicsItem(id, d14, arrayList16));
                        }
                    } else {
                        arrayList9 = null;
                    }
                    zb.W = arrayList9;
                    zb.c = d12.getTitle();
                    Integer p = d12.p();
                    zb.k = p != null ? p.intValue() : 0;
                    zb.e = d12.B();
                    zb.L = d12.C();
                    Boolean d15 = d12.d1();
                    Boolean bool = Boolean.TRUE;
                    zb.y = epx.f(d15, bool);
                    zb.F = epx.f(d12.s1(), bool);
                    MarketServicesDurationDto w0 = d12.w0();
                    zb.J = w0 != null ? w0.d() : 0;
                    MarketServicesDurationDto w02 = d12.w0();
                    zb.K = w02 != null ? w02.e() : null;
                    zb.q = d12.U0();
                    List<MarketItemPropertyVariantsDto> P0 = d12.P0();
                    if (P0 != null) {
                        List<MarketItemPropertyVariantsDto> list2 = P0;
                        arrayList10 = new ArrayList(c5g.u(list2, 10));
                        for (MarketItemPropertyVariantsDto marketItemPropertyVariantsDto : list2) {
                            arrayList10.add(new GoodVariantItem(marketItemPropertyVariantsDto.e(), marketItemPropertyVariantsDto.d().i(), epx.f(marketItemPropertyVariantsDto.g(), Boolean.TRUE), marketItemPropertyVariantsDto.f()));
                        }
                    } else {
                        arrayList10 = null;
                    }
                    zb.p = arrayList10;
                    List<MarketVariantsGridPropertyDto> S0 = d12.S0();
                    if (S0 != null) {
                        List<MarketVariantsGridPropertyDto> list3 = S0;
                        arrayList11 = new ArrayList(c5g.u(list3, 10));
                        for (MarketVariantsGridPropertyDto marketVariantsGridPropertyDto : list3) {
                            String d16 = marketVariantsGridPropertyDto.d();
                            List<MarketVariantsGridPropertyVariantDto> e4 = marketVariantsGridPropertyDto.e();
                            ArrayList arrayList17 = new ArrayList(c5g.u(e4, i6));
                            for (MarketVariantsGridPropertyVariantDto marketVariantsGridPropertyVariantDto : e4) {
                                int i7 = marketVariantsGridPropertyVariantDto.i();
                                String f = marketVariantsGridPropertyVariantDto.f();
                                if (marketVariantsGridPropertyVariantDto.e() != null) {
                                    t3uVar = zb;
                                    l = Long.valueOf(r15.intValue());
                                } else {
                                    t3uVar = zb;
                                    l = null;
                                }
                                Boolean j = marketVariantsGridPropertyVariantDto.j();
                                Boolean bool2 = Boolean.TRUE;
                                boolean f2 = epx.f(j, bool2);
                                boolean f3 = epx.f(marketVariantsGridPropertyVariantDto.k(), bool2);
                                String g = marketVariantsGridPropertyVariantDto.g();
                                List<BaseImageDto> d17 = marketVariantsGridPropertyVariantDto.d();
                                arrayList17.add(new Variant(i7, f, l, f2, f3, g, d17 != null ? b210.f(d17) : null));
                                zb = t3uVar;
                            }
                            VariantGroupType.a aVar = VariantGroupType.Companion;
                            String type = marketVariantsGridPropertyDto.getType();
                            aVar.getClass();
                            arrayList11.add(new VariantGroup(d16, arrayList17, VariantGroupType.a.a(type)));
                            i6 = 10;
                        }
                    } else {
                        arrayList11 = null;
                    }
                    t3u t3uVar2 = zb;
                    t3uVar2.t = arrayList11;
                    Integer l2 = d12.l();
                    t3uVar2.r = l2 != null ? l2.intValue() : 0;
                    MarketDeliveryInfoDto u = d12.u();
                    t3uVar2.m = u != null ? new DeliveryInfo(u.d()) : null;
                    MarketMarketItemIntegrationInfoDto D2 = d12.D();
                    t3uVar2.n = D2 != null ? new IntegrationInfo(D2.getTitle()) : null;
                    t3uVar2.E = d12.F0();
                    List<BaseImageDto> K02 = d12.K0();
                    t3uVar2.j = K02 != null ? b210.f(K02) : null;
                    List<MarketBadgeDto> g2 = d12.g();
                    t3uVar2.D = g2 != null ? b210.d(g2) : null;
                    t3uVar2.M = d12.r();
                    MarketItemRejectInfoDto v0 = d12.v0();
                    t3uVar2.N = v0 != null ? b210.h(v0) : null;
                    Boolean b15 = d12.b1();
                    t3uVar2.P = b15 != null ? b15.booleanValue() : false;
                    Boolean o1 = d12.o1();
                    t3uVar2.O = o1 != null ? o1.booleanValue() : false;
                    Boolean n1 = d12.n1();
                    t3uVar2.Q = n1 != null ? n1.booleanValue() : false;
                    t3uVar2.R = d12.R();
                    t3uVar2.S = d12.M();
                    MarketMarketItemRatingDto F = d12.F();
                    t3uVar2.o = F == null ? null : new MarketItemRating(Float.valueOf(F.d()), Integer.valueOf(F.e()), F.f());
                    t3uVar2.T = "base";
                    MarketMarketItemTypeDto G = d12.G();
                    if (G != null) {
                        MarketItemType.a aVar2 = MarketItemType.Companion;
                        Integer valueOf = Integer.valueOf(G.i());
                        aVar2.getClass();
                        marketItemType = MarketItemType.a.a(valueOf);
                    } else {
                        marketItemType = null;
                    }
                    t3uVar2.X = marketItemType;
                    List<List<BaseImageDto>> N0 = d12.N0();
                    if (N0 != null) {
                        List<List<BaseImageDto>> list4 = N0;
                        arrayList12 = new ArrayList(c5g.u(list4, 10));
                        Iterator<T> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList12.add(b210.f((List) it2.next()));
                        }
                    } else {
                        arrayList12 = null;
                    }
                    t3uVar2.U = arrayList12;
                    List<MarketCustomButtonFullDto> j2 = d12.j();
                    if (j2 != null) {
                        List<MarketCustomButtonFullDto> list5 = j2;
                        arrayList13 = new ArrayList(c5g.u(list5, 10));
                        Iterator<T> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList13.add(b210.b((MarketCustomButtonFullDto) it3.next()));
                        }
                    } else {
                        arrayList13 = null;
                    }
                    t3uVar2.V = arrayList13;
                    BaseBoolIntDto k2 = d12.k();
                    BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                    t3uVar2.v = k2 == baseBoolIntDto;
                    t3uVar2.w = d12.y0() == baseBoolIntDto;
                    Integer V0 = d12.V0();
                    t3uVar2.x = V0 != null ? V0.intValue() : 0;
                    Integer H0 = d12.H0();
                    t3uVar2.s = H0 != null ? H0.intValue() : -1;
                    List<PhotosPhotoDto> Z = d12.Z();
                    if (Z != null) {
                        List<PhotosPhotoDto> list6 = Z;
                        ArrayList arrayList18 = new ArrayList(c5g.u(list6, 10));
                        Iterator<T> it4 = list6.iterator();
                        while (it4.hasNext()) {
                            arrayList18.add(xfa0.a((PhotosPhotoDto) it4.next()));
                        }
                        photoArr = (Photo[]) arrayList18.toArray(new Photo[0]);
                    } else {
                        photoArr = null;
                    }
                    t3uVar2.u = photoArr != null ? new ArrayList<>(Arrays.asList(photoArr)) : null;
                    t3uVar2.v = d12.k() == BaseBoolIntDto.YES;
                    MarketItemAddressesDto e5 = d12.e();
                    if (e5 == null || (d13 = e5.d()) == null) {
                        arrayList14 = null;
                    } else {
                        List<GroupsAddressDto> list7 = d13;
                        arrayList14 = new ArrayList(c5g.u(list7, 10));
                        Iterator<T> it5 = list7.iterator();
                        while (it5.hasNext()) {
                            arrayList14.add(fz5.v((GroupsAddressDto) it5.next()));
                        }
                    }
                    t3uVar2.H = arrayList14;
                    MarketItemAddressesDto e6 = d12.e();
                    t3uVar2.I = e6 != null ? e6.getCount() : 0;
                    List<BaseLinkButtonDto> d18 = d12.d();
                    if (d18 != null) {
                        arrayList15 = new ArrayList();
                        for (BaseLinkButtonDto baseLinkButtonDto : d18) {
                            BaseLinkButtonActionDto e7 = baseLinkButtonDto.e();
                            if (e7 == null || (b = wf6.b(e7)) == null) {
                                linkButton = null;
                            } else {
                                String title2 = baseLinkButtonDto.getTitle();
                                if (title2 == null) {
                                    title2 = "";
                                }
                                BaseLinkButtonStyleDto o2 = baseLinkButtonDto.o();
                                linkButton = new LinkButton(title2, b, o2 != null ? o2.name() : null);
                            }
                            if (linkButton != null) {
                                arrayList15.add(linkButton);
                            }
                        }
                    } else {
                        arrayList15 = null;
                    }
                    t3uVar2.G = arrayList15;
                    MarketItemBannerDto i8 = d12.i();
                    if (i8 != null) {
                        String title3 = i8.getTitle();
                        String e8 = i8.e();
                        if (e8 == null) {
                            e8 = "";
                        }
                        new ne6();
                        marketBanner = new MarketBanner(title3, e8, ne6.a(i8.d()));
                    } else {
                        marketBanner = null;
                    }
                    t3uVar2.C = marketBanner;
                    good = t3uVar2.a();
                }
                if (good != null) {
                    MarketMarketGetItemResponseObjectDto i9 = marketGetItemCardResponseDto3.i();
                    if (i9 == null || (d11 = i9.d()) == null || (T = d11.T()) == null) {
                        arrayList8 = null;
                    } else {
                        List<MarketMarketItemOtherItemsDto> list8 = T;
                        arrayList8 = new ArrayList(c5g.u(list8, 10));
                        for (MarketMarketItemOtherItemsDto marketMarketItemOtherItemsDto : list8) {
                            String title4 = marketMarketItemOtherItemsDto.getTitle();
                            String e9 = marketMarketItemOtherItemsDto.e();
                            String[] strArr = (String[]) marketMarketItemOtherItemsDto.d().toArray(new String[0]);
                            MarketMarketItemOtherItemsDto.ReferrerItemTypeDto f4 = marketMarketItemOtherItemsDto.f();
                            MobileOfficialAppsMarketStat$ReferrerItemType a = OtherGoods.a.a(f4 != null ? f4.i() : null);
                            MarketServicesViewTypeDto g3 = marketMarketItemOtherItemsDto.g();
                            arrayList8.add(new OtherGoods(title4, e9, strArr, a, g3 != null ? g3.i() : 1));
                        }
                    }
                    good.s = arrayList8;
                    MarketMarketOtherItemsResponseObjectDto l3 = marketGetItemCardResponseDto3.l();
                    List<MarketMarketItemDto> d19 = l3 != null ? l3.d() : null;
                    if (arrayList8 != null && d19 != null) {
                        for (OtherGoods otherGoods : arrayList8) {
                            ArrayList arrayList19 = new ArrayList();
                            String[] strArr2 = otherGoods.d;
                            if (strArr2 != null) {
                                int i10 = i3;
                                while (i10 < strArr2.length) {
                                    int i11 = i10 + 1;
                                    try {
                                        String str3 = strArr2[i10];
                                        Iterator<T> it6 = d19.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj2 = it6.next();
                                                MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj2;
                                                StringBuilder sb = new StringBuilder();
                                                marketGetItemCardResponseDto2 = marketGetItemCardResponseDto3;
                                                sb.append(marketMarketItemDto.q());
                                                sb.append('_');
                                                sb.append(marketMarketItemDto.getId());
                                                if (!epx.f(str3, sb.toString())) {
                                                    marketGetItemCardResponseDto3 = marketGetItemCardResponseDto2;
                                                }
                                            } else {
                                                marketGetItemCardResponseDto2 = marketGetItemCardResponseDto3;
                                                obj2 = null;
                                            }
                                        }
                                        MarketMarketItemDto marketMarketItemDto2 = (MarketMarketItemDto) obj2;
                                        if (marketMarketItemDto2 != null) {
                                            arrayList19.add(b210.c(marketMarketItemDto2));
                                        }
                                        i10 = i11;
                                        marketGetItemCardResponseDto3 = marketGetItemCardResponseDto2;
                                    } catch (ArrayIndexOutOfBoundsException e10) {
                                        throw new NoSuchElementException(e10.getMessage());
                                    }
                                }
                            }
                            otherGoods.g = arrayList19;
                            marketGetItemCardResponseDto3 = marketGetItemCardResponseDto3;
                            i3 = 0;
                        }
                    }
                    marketGetItemCardResponseDto = marketGetItemCardResponseDto3;
                    good.s = arrayList8;
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    marketGetItemCardResponseDto = marketGetItemCardResponseDto3;
                }
                GroupsGroupFullDto d20 = marketGetItemCardResponseDto.d();
                if (d20 == null || (userId = d20.P0()) == null) {
                    userId = UserId.d;
                }
                GroupsGroupFullDto d21 = marketGetItemCardResponseDto.d();
                UserId userId3 = new UserId((d21 == null || (b14 = d21.b1()) == null || (e2 = b14.e()) == null) ? 0L : e2.intValue());
                GroupsGroupFullDto d22 = marketGetItemCardResponseDto.d();
                String y1 = d22 != null ? d22.y1() : null;
                GroupsGroupFullDto d23 = marketGetItemCardResponseDto.d();
                String V1 = d23 != null ? d23.V1() : null;
                GroupsGroupFullDto d24 = marketGetItemCardResponseDto.d();
                String G2 = d24 != null ? d24.G2() : null;
                GroupsGroupFullDto d25 = marketGetItemCardResponseDto.d();
                boolean booleanValue = (d25 == null || (N32 = d25.N3()) == null) ? false : N32.booleanValue();
                GroupsGroupFullDto d26 = marketGetItemCardResponseDto.d();
                if (d26 == null || (groupsGroupIsClosedDto = d26.u3()) == null) {
                    groupsGroupIsClosedDto = GroupsGroupIsClosedDto.OPEN;
                }
                int i12 = groupsGroupIsClosedDto.i();
                GroupsGroupFullDto d27 = marketGetItemCardResponseDto.d();
                String W2 = d27 != null ? d27.W() : null;
                GroupsGroupFullDto d28 = marketGetItemCardResponseDto.d();
                String Z2 = d28 != null ? d28.Z() : null;
                GroupsGroupFullDto e11 = marketGetItemCardResponseDto.e();
                String y12 = e11 != null ? e11.y1() : null;
                GroupsGroupFullDto e12 = marketGetItemCardResponseDto.e();
                String V12 = e12 != null ? e12.V1() : null;
                GroupsGroupFullDto e13 = marketGetItemCardResponseDto.e();
                boolean booleanValue2 = (e13 == null || (N3 = e13.N3()) == null) ? false : N3.booleanValue();
                GroupsGroupFullDto d29 = marketGetItemCardResponseDto.d();
                String title5 = (d29 == null || (b13 = d29.b1()) == null || (n2 = b13.n()) == null) ? null : n2.getTitle();
                GroupsGroupFullDto d30 = marketGetItemCardResponseDto.d();
                String e14 = (d30 == null || (b12 = d30.b1()) == null || (n = b12.n()) == null) ? null : n.e();
                GroupsGroupFullDto d31 = marketGetItemCardResponseDto.d();
                boolean booleanValue3 = (d31 == null || (K0 = d31.K0()) == null) ? false : K0.booleanValue();
                GroupsGroupFullDto d32 = marketGetItemCardResponseDto.d();
                boolean booleanValue4 = (d32 == null || (z3 = d32.z3()) == null) ? false : z3.booleanValue();
                MarketMarketOtherItemsResponseObjectDto l4 = marketGetItemCardResponseDto.l();
                if (l4 == null || (d10 = l4.d()) == null) {
                    arrayList = null;
                } else {
                    List<MarketMarketItemDto> list9 = d10;
                    ArrayList arrayList20 = new ArrayList(c5g.u(list9, 10));
                    Iterator<T> it7 = list9.iterator();
                    while (it7.hasNext()) {
                        arrayList20.add(b210.c((MarketMarketItemDto) it7.next()));
                    }
                    arrayList = arrayList20;
                }
                GroupsGroupFullDto d33 = marketGetItemCardResponseDto.d();
                VerifyInfo verifyInfo = new VerifyInfo((d33 != null ? d33.O2() : null) == BaseBoolIntDto.YES, false, false, false, false, false, 62, null);
                MarketGetEditUrlResponseObjectDto g4 = marketGetItemCardResponseDto.g();
                String url = g4 != null ? g4.getUrl() : null;
                MarketGetPromoteUrlResponseObjectDto o3 = marketGetItemCardResponseDto.o();
                String url2 = o3 != null ? o3.getUrl() : null;
                GroupsGroupFullDto d34 = marketGetItemCardResponseDto.d();
                Price i13 = (d34 == null || (b1 = d34.b1()) == null || (k = b1.k()) == null) ? null : b210.i(k);
                MarketItemCardGetButtonsResponseObjectDto f5 = marketGetItemCardResponseDto.f();
                if (f5 == null || (d9 = f5.d()) == null) {
                    arrayList2 = null;
                } else {
                    List<MarketCustomButtonFullDto> list10 = d9;
                    ArrayList arrayList21 = new ArrayList(c5g.u(list10, 10));
                    for (MarketCustomButtonFullDto marketCustomButtonFullDto : list10) {
                        int i14 = marketCustomButtonFullDto.j().i();
                        String title6 = marketCustomButtonFullDto.getTitle();
                        String str4 = title6 == null ? "" : title6;
                        String g5 = marketCustomButtonFullDto.g();
                        Integer i15 = marketCustomButtonFullDto.i();
                        Boolean l5 = marketCustomButtonFullDto.l();
                        List<MarketCustomButtonAvailableDayDto> d35 = marketCustomButtonFullDto.d();
                        if (d35 != null) {
                            List<MarketCustomButtonAvailableDayDto> list11 = d35;
                            ArrayList arrayList22 = new ArrayList(c5g.u(list11, 10));
                            for (MarketCustomButtonAvailableDayDto marketCustomButtonAvailableDayDto : list11) {
                                boolean f6 = marketCustomButtonAvailableDayDto.f();
                                String d36 = marketCustomButtonAvailableDayDto.d();
                                if (d36 == null) {
                                    d36 = "";
                                }
                                String e15 = marketCustomButtonAvailableDayDto.e();
                                if (e15 == null) {
                                    e15 = "";
                                }
                                arrayList22.add(new AvailablePeriod(f6, d36, e15));
                            }
                            arrayList7 = arrayList22;
                        } else {
                            arrayList7 = null;
                        }
                        String k3 = marketCustomButtonFullDto.k();
                        UserId userId4 = marketCustomButtonFullDto.getUserId();
                        MarketCustomButtonInaccessibilityMessageDto f7 = marketCustomButtonFullDto.f();
                        if (f7 == null || (str = f7.getTitle()) == null) {
                            str = "";
                        }
                        MarketCustomButtonInaccessibilityMessageDto f8 = marketCustomButtonFullDto.f();
                        if (f8 == null || (str2 = f8.d()) == null) {
                            str2 = "";
                        }
                        arrayList21.add(new CallProducerButton(i14, str4, g5, i15, l5, arrayList7, k3, userId4, new InaccessibilityMessage(str, str2), marketCustomButtonFullDto.getUrl(), marketCustomButtonFullDto.e(), false, 2048, null));
                    }
                    arrayList2 = arrayList21;
                }
                GroupsGroupFullDto d37 = marketGetItemCardResponseDto.d();
                BaseBoolIntDto O3 = d37 != null ? d37.O3() : null;
                BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
                boolean z = O3 == baseBoolIntDto2;
                GroupsGroupFullDto d38 = marketGetItemCardResponseDto.d();
                boolean z2 = (d38 != null ? d38.I3() : null) == baseBoolIntDto2;
                GroupsGroupFullDto d39 = marketGetItemCardResponseDto.d();
                Integer o12 = d39 != null ? d39.o1() : null;
                GroupsGroupFullDto d40 = marketGetItemCardResponseDto.d();
                Integer valueOf2 = (d40 == null || (D03 = d40.D0()) == null) ? null : Integer.valueOf(D03.getCount());
                GroupsGroupFullDto d41 = marketGetItemCardResponseDto.d();
                if (d41 == null || (D02 = d41.D0()) == null || (e = D02.e()) == null) {
                    arrayList3 = null;
                } else {
                    ArrayList arrayList23 = new ArrayList();
                    Iterator<T> it8 = e.iterator();
                    while (it8.hasNext()) {
                        String e16 = ((GroupsGroupFriendPreviewProfileDto) it8.next()).e();
                        if (e16 != null) {
                            arrayList23.add(e16);
                        }
                    }
                    arrayList3 = arrayList23;
                }
                EmptyList emptyList = EmptyList.b;
                MarketItemCardVideoGetResponseObjectDto B = marketGetItemCardResponseDto.B();
                if (B == null || (d8 = B.d()) == null) {
                    arrayList4 = null;
                } else {
                    List<VideoVideoFullDto> list12 = d8;
                    ArrayList arrayList24 = new ArrayList(c5g.u(list12, 10));
                    Iterator<T> it9 = list12.iterator();
                    while (it9.hasNext()) {
                        arrayList24.add(ums0.d(ums0.a, (VideoVideoFullDto) it9.next(), null, null, null, 30));
                    }
                    arrayList4 = arrayList24;
                }
                GroupsGroupFullDto d42 = marketGetItemCardResponseDto.d();
                String i16 = (d42 == null || (d1 = d42.d1()) == null) ? null : d1.i();
                GroupMarketInfo.b bVar = GroupMarketInfo.b.C0909b.f;
                if (!epx.f(i16, bVar.a)) {
                    bVar = GroupMarketInfo.b.f.f;
                    if (!epx.f(i16, bVar.a)) {
                        bVar = GroupMarketInfo.b.c.f;
                        if (!epx.f(i16, bVar.a)) {
                            bVar = GroupMarketInfo.b.d.f;
                            if (!epx.f(i16, bVar.a)) {
                                bVar = GroupMarketInfo.b.e.f;
                                if (!epx.f(i16, bVar.a)) {
                                    bVar = GroupMarketInfo.b.a.f;
                                }
                            }
                        }
                    }
                }
                GroupMarketInfo.b bVar2 = bVar;
                MarketGetRelatedCategoriesBlockResponseObjectDto p2 = marketGetItemCardResponseDto.p();
                String str5 = (p2 == null || (d7 = p2.d()) == null || (title = d7.getTitle()) == null) ? "" : title;
                MarketGetRelatedCategoriesBlockResponseObjectDto p3 = marketGetItemCardResponseDto.p();
                if (p3 == null || (d5 = p3.d()) == null || (d6 = d5.d()) == null) {
                    arrayList5 = null;
                } else {
                    List<MarketRelatedCategoryDto> list13 = d6;
                    ArrayList arrayList25 = new ArrayList(c5g.u(list13, 10));
                    for (MarketRelatedCategoryDto marketRelatedCategoryDto : list13) {
                        String e17 = marketRelatedCategoryDto.e();
                        String description = marketRelatedCategoryDto.getDescription();
                        String url3 = marketRelatedCategoryDto.getUrl();
                        new ne6();
                        arrayList25.add(new RelatedCategoryItem(e17, description, url3, ne6.a(marketRelatedCategoryDto.d())));
                    }
                    arrayList5 = arrayList25;
                }
                MarketGetItemCardQuickMessagesResponseObjectDto j3 = marketGetItemCardResponseDto.j();
                if (j3 == null || (d4 = j3.d()) == null) {
                    userId2 = userId;
                    arrayList6 = null;
                } else {
                    List<MarketItemCardQuickMessageDto> list14 = d4;
                    ArrayList arrayList26 = new ArrayList(c5g.u(list14, 10));
                    for (MarketItemCardQuickMessageDto marketItemCardQuickMessageDto : list14) {
                        UserId userId5 = userId;
                        arrayList26.add(new QuickMessageItem(marketItemCardQuickMessageDto.getTitle(), marketItemCardQuickMessageDto.getMessage(), marketItemCardQuickMessageDto.e(), new UserId(marketItemCardQuickMessageDto.d()), marketItemCardQuickMessageDto.f() == MarketItemCardQuickMessageDto.TypeDto.CHATBUTTON));
                        userId = userId5;
                    }
                    userId2 = userId;
                    arrayList6 = arrayList26;
                }
                MarketGetProductLinkedContentResponseObjectDto n3 = marketGetItemCardResponseDto.n();
                List<MarketProductLinkedContentItemDto> d43 = n3 != null ? n3.d() : null;
                MarketMarketGetItemResponseObjectDto i17 = marketGetItemCardResponseDto.i();
                if (i17 == null || (d3 = i17.d()) == null || (K = d3.K()) == null) {
                    linkedHashMap = null;
                } else {
                    List<MarketItemLabelDto> list15 = K;
                    LinkedHashMap<String, MarketItemLabelDto> linkedHashMap2 = new LinkedHashMap<>(list15.size());
                    Iterator<MarketItemLabelDto> it10 = list15.iterator();
                    while (it10.hasNext()) {
                        linkedHashMap2.put(UUID.randomUUID().toString(), it10.next());
                    }
                    linkedHashMap = x110Var.a(linkedHashMap2);
                }
                MarketGetProductLinkedContentResponseObjectDto n4 = marketGetItemCardResponseDto.n();
                Integer valueOf3 = n4 != null ? Integer.valueOf(n4.e()) : null;
                MarketGetSellerResponseTimeResponseObjectDto u2 = marketGetItemCardResponseDto.u();
                if (u2 != null) {
                    long e18 = u2.e();
                    String f9 = u2.f();
                    if (f9 == null) {
                        f9 = "";
                    }
                    String d44 = u2.d();
                    ownerResponseTime = new OwnerResponseTime(e18, f9, d44 != null ? d44 : "");
                } else {
                    ownerResponseTime = null;
                }
                GroupsGroupFullDto d45 = marketGetItemCardResponseDto.d();
                Float g6 = (d45 == null || (i22 = d45.i2()) == null) ? null : i22.g();
                GroupsGroupFullDto d46 = marketGetItemCardResponseDto.d();
                Integer valueOf4 = (d46 == null || (i2 = d46.i2()) == null) ? null : Integer.valueOf(i2.j());
                MarketMarketGetItemResponseObjectDto i18 = marketGetItemCardResponseDto.i();
                boolean z4 = (i18 == null || (d2 = i18.d()) == null || (D0 = d2.D0()) == null) ? false : D0 == BaseBoolIntDto.YES;
                MarketGetItemReviewsResponseObjectDto k4 = marketGetItemCardResponseDto.k();
                List<List<BaseImageDto>> d47 = k4 != null ? k4.d() : null;
                MarketMarketGetItemResponseObjectDto i19 = marketGetItemCardResponseDto.i();
                return new d210(good, userId2, userId3, y1, V1, G2, booleanValue, i12, W2, Z2, y12, V12, booleanValue2, title5, e14, booleanValue3, booleanValue4, arrayList, verifyInfo, url, url2, i13, arrayList2, z, z2, o12, valueOf2, arrayList3, emptyList, arrayList4, bVar2, str5, arrayList5, arrayList6, d43, linkedHashMap, valueOf3, ownerResponseTime, g6, valueOf4, z4, d47, (i19 == null || (d = i19.d()) == null || (D = d.D()) == null) ? null : D.getTitle());
            case 1:
                f910 f910Var = (f910) obj3;
                ((i810) f910Var.v.getValue()).setItems((List) obj);
                VkSpinner vkSpinner = f910Var.l;
                if (vkSpinner != null) {
                    f4m.j(vkSpinner);
                }
                return s3q0.a;
            case 2:
                ((mmf0) obj).b = new etp((a220) obj3, 3);
                return s3q0.a;
            case 3:
                ((zak0) ((nn20.a) obj3).e).setValue((String) obj);
                return s3q0.a;
            case 4:
                ((kz20) obj3).e.Qc((String) obj);
                return s3q0.a;
            case 5:
                final MoneyTransferLinkFragment moneyTransferLinkFragment = (MoneyTransferLinkFragment) obj3;
                MoneyTransferLinks moneyTransferLinks = (MoneyTransferLinks) obj;
                int i20 = MoneyTransferLinkFragment.u0;
                if (moneyTransferLinks == null) {
                    moneyTransferLinkFragment.onError(new IllegalStateException("Empty transfer links."));
                    return s3q0.a;
                }
                String str6 = moneyTransferLinks.c;
                final String str7 = moneyTransferLinks.b;
                TextView textView = moneyTransferLinkFragment.l0;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(str7);
                if (str7 != null) {
                    TextView textView2 = moneyTransferLinkFragment.l0;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setOnClickListener(new c6u(i4, moneyTransferLinkFragment, str7));
                    View view = moneyTransferLinkFragment.m0;
                    if (view == null) {
                        view = null;
                    }
                    view.setOnClickListener(new View.OnClickListener() { // from class: xsna.z730
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i21 = MoneyTransferLinkFragment.u0;
                            MoneyTransferLinkFragment.this.uo(str7);
                        }
                    });
                }
                if (str6 != null) {
                    TextView textView3 = moneyTransferLinkFragment.n0;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    textView3.setOnClickListener(new eju(i4, moneyTransferLinkFragment, str6));
                    View view2 = moneyTransferLinkFragment.o0;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setOnClickListener(new stj(i4, moneyTransferLinkFragment, str6));
                }
                TextView textView4 = moneyTransferLinkFragment.n0;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(str6);
                moneyTransferLinkFragment.oo();
                if (str6 == null) {
                    return s3q0.a;
                }
                efx0 efx0Var = e370.k;
                efx0 efx0Var2 = efx0Var != null ? efx0Var : null;
                FragmentActivity activity = moneyTransferLinkFragment.getActivity();
                efx0Var2.getClass();
                new String();
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.s0(new nme0(i3, activity, new ome0.a(str6, null, new pk9.a(0), false, 1024, true))).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k130(new eiz(moneyTransferLinkFragment, 9), i4));
                FragmentActivity activity2 = moneyTransferLinkFragment.getActivity();
                if (activity2 != null && (h = e3m.h(activity2)) != null) {
                    itg0.a(h, subscribe);
                }
                return s3q0.a;
            case 6:
                ck30 ck30Var = (ck30) obj3;
                List O0 = j5g.O0((Collection) obj);
                if (O0.isEmpty()) {
                    return jgp.b;
                }
                Cursor d48 = ck30Var.b.b().d("\n            SELECT dialog_id, server_is_empty_value, server_is_empty_phase\n            FROM messages_history_meta\n            WHERE dialog_id IN(" + p4g.k(O0, StringUtils.COMMA, null) + ")\n            ", null);
                HashMap hashMap = new HashMap(d48.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d48.moveToFirst()) {
                            while (!d48.isAfterLast()) {
                                hashMap.put(Long.valueOf(d48.getLong(0)), new yj30(d48.getInt(2), d48.getLong(0), fl3.w(d48, 1)));
                                d48.moveToNext();
                            }
                        }
                        return hashMap;
                    } finally {
                        d48.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 7:
                UIBlockLink uIBlockLink = (UIBlockLink) obj3;
                return new tt70(1, 0L, pe40.e(pe40.d((List) obj, uIBlockLink), uIBlockLink));
            case 8:
                return a(obj);
            case 9:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj3;
                ((ikv0) obj).a();
                u4a.a aVar3 = musicOfflineCatalogRootVh.m.b;
                nda.e(aVar3.b, musicOfflineCatalogRootVh.b, aVar3.s, "", "", null, null, null, PsExtractor.VIDEO_STREAM_MASK);
                return s3q0.a;
            case 10:
                return new tvf0((NewsEntriesContainer) obj, (awq) obj3);
            case 11:
                yp80 yp80Var = (yp80) obj3;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 12:
                return c(obj);
            case 13:
                d3a0 d3a0Var = (d3a0) obj3;
                vgg vggVar = (vgg) obj;
                Throwable th2 = vggVar.a;
                xpu0 xpu0Var = d3a0Var.A;
                if (xpu0Var != null) {
                    xpu0Var.dismiss();
                }
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    d3a0Var.u0(th2);
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 14:
                return d(obj);
            case 15:
                return e(obj);
            case 16:
                return g(obj);
            case 17:
                return h(obj);
            case 18:
                return k(obj);
            case 19:
                return l(obj);
            case 20:
                return n(obj);
            case 21:
                return o(obj);
            case 22:
                return p(obj);
            case 23:
                return q(obj);
            case 24:
                return r(obj);
            case 25:
                return s(obj);
            case 26:
                return t(obj);
            case 27:
                return v(obj);
            case 28:
                return w(obj);
            default:
                ((StickersView) obj3).getClass();
                return Boolean.valueOf(obj instanceof xvg0);
        }
    }

    public /* synthetic */ w110(pe40 pe40Var, UIBlockLink uIBlockLink) {
        this.b = 7;
        this.c = uIBlockLink;
    }
}
