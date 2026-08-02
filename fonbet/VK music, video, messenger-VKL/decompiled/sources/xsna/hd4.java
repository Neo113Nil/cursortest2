package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsActionButtonActionTypeDto;
import com.vk.api.generated.groups.dto.GroupsActionButtonDto;
import com.vk.api.generated.groups.dto.GroupsActionButtonTargetDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.groups.dto.GroupsMarketShopConditionsStateDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;
import com.vk.api.generated.market.dto.MarketCatalogStatusOptionDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingDto;
import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontResponseDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketStorefrontViewedProductsDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.b;
import com.vk.auth.validation.b;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.hints.HintId;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.ecomm.storefront.impl.community.presentation.model.LoadingState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.pan;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02fc, code lost:
    
        if (r10.equals("call_vk") == false) goto L190;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0350  */
    /* JADX WARN: Type inference failed for: r3v32, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.collections.EmptyList] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        ?? r4;
        String str;
        GroupMarketInfo.b bVar;
        ja9 ja9Var;
        ?? r3;
        uvw uvwVar;
        MarketIntegrationSettingsAdminBannerDto d;
        dly dlyVar;
        Boolean z3;
        MarketCommunityRatingDto i2;
        MarketCommunityRatingDto i22;
        Boolean F3;
        GroupsActionButtonDto d2;
        GroupsActionButtonTargetDto e;
        Boolean i;
        Integer d3;
        GroupsMarketShopConditionsStateDto d1;
        String V1;
        Integer o1;
        List<MarketCatalogStatusOptionDto> R;
        pan a;
        int i3 = this.b;
        int i4 = 2;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                kd4 kd4Var = (kd4) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-727273760, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content.<anonymous> (AudioBookBigPlayerControls.kt:37)");
                    }
                    kd4Var.d(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1126195762, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BigPlayerScaffold.kt:538)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((v0r) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj3;
                RepliesView repliesView = marketItemReviewRepliesFragment.T;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = marketItemReviewRepliesFragment.T;
                if (repliesView2 != null) {
                    repliesView2.b();
                }
                RepliesView repliesView3 = marketItemReviewRepliesFragment.T;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(8);
                }
                WriteBar writeBar = marketItemReviewRepliesFragment.S;
                if (writeBar != null) {
                    writeBar.setVisibility(8);
                }
                VkSpinner vkSpinner = marketItemReviewRepliesFragment.U;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                NestedScrollView nestedScrollView = marketItemReviewRepliesFragment.V;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(0);
                }
                return s3q0.a;
            case 4:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj3;
                int i5 = PhotoVideoAttachActivity.g0;
                Intent b = b.a.b((MediaStoreEntry) obj);
                b.putExtra("PRESELECTED_FILES", photoVideoAttachActivity.v.y());
                b.putExtra("FROM_COLLAGE", true);
                b.putExtra("COLLAGE_PARAMS", (Bundle) obj2);
                KeyEvent.Callback callback = photoVideoAttachActivity.Q;
                if (callback instanceof GalleryPickerPreview) {
                    b.putExtra("PREVIEW_STATE", ((GalleryPickerPreview) callback).getState());
                }
                photoVideoAttachActivity.V2(b);
                return s3q0.a;
            case 5:
                e2g0 e2g0Var = (e2g0) obj3;
                int intValue3 = ((Integer) obj).intValue();
                if (intValue3 == ((Integer) obj2).intValue()) {
                    int length = e2g0Var.a.getInput().getText().length();
                    q420 q420Var = e2g0Var.h;
                    if (q420Var != null) {
                        if (intValue3 > length) {
                            intValue3 = length;
                        }
                        q420Var.d(intValue3);
                    }
                }
                return s3q0.a;
            case 6:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1815153722, intValue4, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loading.<anonymous> (Screen.kt:98)");
                    }
                    ich0.k(izsVar, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                aqh0.b((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                lml0 lml0Var = (lml0) obj3;
                MarketGetStorefrontResponseDto marketGetStorefrontResponseDto = (MarketGetStorefrontResponseDto) obj;
                Integer d4 = ((MarketGetCountersResponseDto) obj2).d();
                bpn0 bpn0Var = lml0Var.d;
                ((vll0) bpn0Var.getValue()).getClass();
                MarketCatalogFilterDto g = marketGetStorefrontResponseDto.g();
                MarketCatalogSortingDto B = marketGetStorefrontResponseDto.B();
                igr igrVar = (g == null || B == null) ? null : new igr(g, B, marketGetStorefrontResponseDto.r());
                vll0 vll0Var = (vll0) bpn0Var.getValue();
                vll0Var.getClass();
                List<MarketMarketAlbumDto> d5 = marketGetStorefrontResponseDto.d();
                if (d5 != null) {
                    List<MarketMarketAlbumDto> list = d5;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (MarketMarketAlbumDto marketMarketAlbumDto : list) {
                        int id = marketMarketAlbumDto.getId();
                        UserId q = marketMarketAlbumDto.q();
                        String title = marketMarketAlbumDto.getTitle();
                        PhotosPhotoDto e2 = marketMarketAlbumDto.e();
                        Photo a2 = e2 != null ? xfa0.a(e2) : null;
                        int count = marketMarketAlbumDto.getCount();
                        int g2 = marketMarketAlbumDto.g();
                        MarketMarketAlbumDto.TypeDto f = marketMarketAlbumDto.f();
                        int i6 = f != null ? f.i() : 0;
                        Boolean j = marketMarketAlbumDto.j();
                        boolean booleanValue = j != null ? j.booleanValue() : false;
                        Boolean i7 = marketMarketAlbumDto.i();
                        arrayList.add(new GoodAlbum(id, q, title, a2, count, g2, i6, booleanValue, i7 != null ? i7.booleanValue() : false));
                    }
                } else {
                    arrayList = null;
                }
                String f2 = marketGetStorefrontResponseDto.f();
                boolean z = f2 != null && f2.length() > 0;
                Integer e3 = marketGetStorefrontResponseDto.e();
                int intValue5 = e3 != null ? e3.intValue() : 0;
                MarketStorefrontViewedProductsDto C = marketGetStorefrontResponseDto.C();
                hr1 hr1Var = new hr1(arrayList, z, intValue5, C != null ? vll0Var.a.f(C) : null);
                ArrayList arrayList2 = new ArrayList();
                lml0Var.a(arrayList2, HintId.MARKET_STOREFRONT_FILTERS_BUTTON, true, (igrVar == null || (R = igrVar.a.R()) == null || !(R.isEmpty() ^ true)) ? false : true);
                lml0Var.a(arrayList2, z ? HintId.ECOMM_STOREFRONT_VIEWED_PRODUCTS_ADMIN : HintId.ECOMM_STOREFRONT_VIEWED_PRODUCTS_USER, false, true);
                w4p0 w4p0Var = (w4p0) g5g.H(arrayList2);
                vll0 vll0Var2 = (vll0) bpn0Var.getValue();
                UserId userId = lml0Var.a;
                vll0Var2.getClass();
                GroupsGroupFullDto k = marketGetStorefrontResponseDto.k();
                int intValue6 = (k == null || (o1 = k.o1()) == null) ? 0 : o1.intValue();
                Integer j2 = marketGetStorefrontResponseDto.j();
                int intValue7 = j2 != null ? j2.intValue() : 0;
                List<GroupsUserXtrRoleDto> i8 = marketGetStorefrontResponseDto.i();
                if (i8 != null) {
                    List<GroupsUserXtrRoleDto> list2 = i8;
                    r4 = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String t1 = ((GroupsUserXtrRoleDto) it.next()).t1();
                        r4.add(t1 != null ? js5.a(200, t1) : null);
                    }
                } else {
                    r4 = EmptyList.b;
                }
                List list3 = r4;
                GroupsGroupFullDto k2 = marketGetStorefrontResponseDto.k();
                String a3 = (k2 == null || (V1 = k2.V1()) == null) ? null : js5.a(200, V1);
                GroupsGroupFullDto k3 = marketGetStorefrontResponseDto.k();
                if (k3 == null || (str = k3.y1()) == null) {
                    str = "";
                }
                String str2 = str;
                GroupsGroupFullDto k4 = marketGetStorefrontResponseDto.k();
                BaseBoolIntDto O2 = k4 != null ? k4.O2() : null;
                BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                boolean z2 = O2 == baseBoolIntDto;
                GroupsGroupFullDto k5 = marketGetStorefrontResponseDto.k();
                String z1 = k5 != null ? k5.z1() : null;
                GroupsGroupFullDto k6 = marketGetStorefrontResponseDto.k();
                if (k6 == null || (d1 = k6.d1()) == null) {
                    bVar = null;
                } else {
                    String i9 = d1.i();
                    GroupMarketInfo.b bVar2 = GroupMarketInfo.b.C0909b.f;
                    if (!epx.f(i9, bVar2.a)) {
                        bVar2 = GroupMarketInfo.b.f.f;
                        if (!epx.f(i9, bVar2.a)) {
                            bVar2 = GroupMarketInfo.b.c.f;
                            if (!epx.f(i9, bVar2.a)) {
                                bVar2 = GroupMarketInfo.b.d.f;
                                if (!epx.f(i9, bVar2.a)) {
                                    bVar2 = GroupMarketInfo.b.e.f;
                                    if (!epx.f(i9, bVar2.a)) {
                                        bVar2 = GroupMarketInfo.b.a.f;
                                    }
                                }
                            }
                        }
                    }
                    bVar = bVar2;
                }
                GroupsGroupFullDto k7 = marketGetStorefrontResponseDto.k();
                String e4 = k7 != null ? k7.e() : null;
                GroupsGroupFullDto k8 = marketGetStorefrontResponseDto.k();
                boolean z4 = (k8 != null ? k8.l() : null) == baseBoolIntDto;
                GroupsGroupFullDto k9 = marketGetStorefrontResponseDto.k();
                if (k9 == null || (d2 = k9.d()) == null) {
                    ja9Var = null;
                } else {
                    ((xgu) vll0Var2.c.getValue()).getClass();
                    ja9 ja9Var2 = new ja9();
                    ja9Var2.b = d2.getTitle();
                    GroupsActionButtonActionTypeDto d6 = d2.d();
                    String i10 = d6 != null ? d6.i() : null;
                    if (i10 != null) {
                        switch (i10.hashCode()) {
                            case -1699113812:
                                if (i10.equals("open_group_app")) {
                                    i4 = 6;
                                    break;
                                }
                                break;
                            case -1472831294:
                                if (i10.equals("open_internal_url")) {
                                    i4 = 4;
                                    break;
                                }
                                break;
                            case -706023217:
                                if (i10.equals("service_booking")) {
                                    i4 = 7;
                                    break;
                                }
                                break;
                            case -504325460:
                                if (i10.equals("open_app")) {
                                    i4 = 5;
                                    break;
                                }
                                break;
                            case -504306182:
                                if (i10.equals("open_url")) {
                                    i4 = 3;
                                    break;
                                }
                                break;
                            case 548631606:
                                break;
                            case 814528549:
                                if (i10.equals("send_email")) {
                                    i4 = 0;
                                    break;
                                }
                                break;
                            case 1928092749:
                                if (i10.equals("call_phone")) {
                                    i4 = 1;
                                    break;
                                }
                                break;
                        }
                        ja9Var2.a = i4;
                        e = d2.e();
                        if (e != null || (r3 = e.getUserId()) == null) {
                            UserId userId2 = UserId.d;
                        }
                        ja9Var2.c = userId2;
                        ja9Var2.e = e == null ? e.e() : null;
                        ja9Var2.f = e == null ? e.g() : null;
                        ja9Var2.g = e == null ? e.getUrl() : null;
                        ja9Var2.d = (e != null || (d3 = e.d()) == null) ? -1 : d3.intValue();
                        ja9Var2.h = (e != null || (i = e.i()) == null) ? false : i.booleanValue();
                        ja9Var2.i = e == null ? e.f() : null;
                        ja9Var = ja9Var2;
                    }
                    i4 = -1;
                    ja9Var2.a = i4;
                    e = d2.e();
                    if (e != null) {
                    }
                    UserId userId22 = UserId.d;
                    ja9Var2.c = userId22;
                    ja9Var2.e = e == null ? e.e() : null;
                    ja9Var2.f = e == null ? e.g() : null;
                    ja9Var2.g = e == null ? e.getUrl() : null;
                    ja9Var2.d = (e != null || (d3 = e.d()) == null) ? -1 : d3.intValue();
                    ja9Var2.h = (e != null || (i = e.i()) == null) ? false : i.booleanValue();
                    ja9Var2.i = e == null ? e.f() : null;
                    ja9Var = ja9Var2;
                }
                GroupsGroupFullDto k10 = marketGetStorefrontResponseDto.k();
                String o2 = k10 != null ? k10.o2() : null;
                GroupsGroupFullDto k11 = marketGetStorefrontResponseDto.k();
                String Z = k11 != null ? k11.Z() : null;
                GroupsGroupFullDto k12 = marketGetStorefrontResponseDto.k();
                GroupsGroupTypeDto L2 = k12 != null ? k12.L2() : null;
                GroupsGroupFullDto k13 = marketGetStorefrontResponseDto.k();
                boolean booleanValue2 = (k13 == null || (F3 = k13.F3()) == null) ? false : F3.booleanValue();
                GroupsGroupFullDto k14 = marketGetStorefrontResponseDto.k();
                Float g3 = (k14 == null || (i22 = k14.i2()) == null) ? null : i22.g();
                GroupsGroupFullDto k15 = marketGetStorefrontResponseDto.k();
                Integer valueOf = (k15 == null || (i2 = k15.i2()) == null) ? null : Integer.valueOf(i2.j());
                GroupsGroupFullDto k16 = marketGetStorefrontResponseDto.k();
                boolean z5 = (k16 != null ? k16.o3() : null) == baseBoolIntDto;
                GroupsGroupFullDto k17 = marketGetStorefrontResponseDto.k();
                boolean z6 = (k17 != null ? k17.I3() : null) == baseBoolIntDto;
                GroupsGroupFullDto k18 = marketGetStorefrontResponseDto.k();
                pju pjuVar = new pju(intValue6, intValue7, list3, a3, str2, z2, z1, bVar, userId, e4, z4, ja9Var, o2, Z, L2, booleanValue2, g3, valueOf, (k18 != null ? k18.I3() : null) == BaseBoolIntDto.NO ? Boolean.FALSE : null, z6, z5);
                List<MarketMarketItemDto> o = marketGetStorefrontResponseDto.o();
                if (o != null) {
                    List<MarketMarketItemDto> list4 = o;
                    r3 = new ArrayList(c5g.u(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        r3.add(lml0Var.b((MarketMarketItemDto) it2.next()));
                    }
                } else {
                    r3 = EmptyList.b;
                }
                Integer p = marketGetStorefrontResponseDto.p();
                t8u t8uVar = new t8u(r3, p != null ? p.intValue() : 0, r3.size());
                String f3 = marketGetStorefrontResponseDto.f();
                GroupsGroupFullDto k19 = marketGetStorefrontResponseDto.k();
                boolean booleanValue3 = (k19 == null || (z3 = k19.z3()) == null) ? false : z3.booleanValue();
                Integer u = marketGetStorefrontResponseDto.u();
                z7p0 z7p0Var = new z7p0(booleanValue3, d4 != null ? d4.intValue() : 0, u != null ? u.intValue() : 0);
                vll0 vll0Var3 = (vll0) bpn0Var.getValue();
                vll0Var3.getClass();
                MarketIntegrationsInfoBlockDto l = marketGetStorefrontResponseDto.l();
                if (l != null) {
                    List<BaseImageDto> e5 = l.e();
                    if (e5 != null) {
                        Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                        dlyVar = new dly(GoodBadge.a.c(e5), GoodBadge.a.a(e5), GoodBadge.a.d(e5), GoodBadge.a.b(e5));
                    } else {
                        dlyVar = null;
                    }
                    if (!vll0Var3.b) {
                        dlyVar = null;
                    }
                    uvwVar = new uvw(dlyVar, l.g(), l.d());
                } else {
                    uvwVar = null;
                }
                LoadingState loadingState = LoadingState.None;
                MarketIntegrationSettingsDto n = marketGetStorefrontResponseDto.n();
                return new apl0(pjuVar, igrVar, hr1Var, z7p0Var, t8uVar, uvwVar, arrayList2, w4p0Var, f3, loadingState, (n == null || (d = n.d()) == null) ? null : ((ssd0) lml0Var.e.getValue()).a(d), 9728);
            case 9:
                ((Integer) obj2).getClass();
                int i11 = SubscriptionInfoView.p;
                ((SubscriptionInfoView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                ((VideoAutoPlay) obj3).N((VideoFile) obj);
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                int i12 = VideoMinimizableDiscoveryFragment.p1;
                CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode = CommonVideoStat$TypeScreenMode.DISCOVERY;
                ((kfs0) obj3).getClass();
                a = new pan.a().a((RecyclerView) obj, commonVideoStat$TypeScreenMode, (r4 & 4) != 0 ? 0.5f : 0.8f, null);
                return a;
            default:
                ((b.a) obj3).d((dw20.b) obj, (String) obj2);
                return s3q0.a;
        }
    }

    public /* synthetic */ hd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
