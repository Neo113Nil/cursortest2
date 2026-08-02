package xsna;

import android.content.Context;
import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseMarkBadgeAsClickedDataDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuBadgeDto;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.market.album.MarketAlbumImagePickerView;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.folders.impl.configure.g;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.design.view.listitem.infobar.FriendsBirthdayInfoBarView;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.aex;
import xsna.bex0;
import xsna.bqw;
import xsna.c2r;
import xsna.i6w;
import xsna.it80;
import xsna.lqw;
import xsna.p810;
import xsna.pzx;
import xsna.qr60;
import xsna.suq;
import xsna.tlo0;
import xsna.wk50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sop implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sop(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [V extends xsna.x65, xsna.x65] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vk.superapp.api.dto.menu.BadgeInfo] */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.vk.superapp.api.dto.menu.BadgeInfo] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.vk.superapp.api.dto.menu.BadgeInfo] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.vk.superapp.api.dto.menu.BadgeInfo] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MarketAlbumImagePickerView marketAlbumImagePickerView;
        StoryEntry b;
        wc1 loadDefaultAlbum$lambda$5;
        int i = 14;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                vop vopVar = (vop) this.c;
                sp.v(vopVar.a, vopVar.b, null);
                return s3q0.a;
            case 1:
                return ((gpq) this.c).b.e(new hpq((qr60.a) obj));
            case 2:
                ((wk50.a) this.c).b(new c2r.i((Set) obj));
                return s3q0.a;
            case 3:
                cdr cdrVar = (cdr) this.c;
                cdrVar.l.invoke(Integer.valueOf(cdrVar.getBindingAdapterPosition()));
                return s3q0.a;
            case 4:
                g.b bVar = (g.b) this.c;
                ayr ayrVar = (ayr) obj;
                List<hfz> list = ayrVar.a;
                ArrayList arrayList = new ArrayList(list);
                Iterator<hfz> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (!(it.next() instanceof fxj)) {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    throw new NoSuchElementException("No CounterChangeSettingsItem found but expected");
                }
                fxj fxjVar = (fxj) list.get(i4);
                arrayList.set(i4, new fxj(fxjVar.b, fxjVar.c, bVar.c));
                return ayr.a(ayrVar, arrayList, false, false, null, null, null, null, null, null, null, false, 16382);
            case 5:
                ((j6s) this.c).l.invoke(a.f.e.b);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).Ab(), ((FragmentEntry) this.c).d));
            case 7:
                com.vk.newsfeed.common.recycler.holders.attachments.a aVar = (com.vk.newsfeed.common.recycler.holders.attachments.a) this.c;
                int i5 = FriendsBirthdayInfoBarView.B;
                aVar.invoke();
                return s3q0.a;
            case 8:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.c;
                int i6 = FriendsCleanupFragment.W;
                xns fo = friendsCleanupFragment.fo();
                fo.a.setVisibility(8);
                fo.b.setVisibility(8);
                fo.c.setVisibility(8);
                VkPlaceholder vkPlaceholder = fo.d;
                vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12));
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.friends_cleanup_empty_list_title)), new VkPlaceholder.b.C0859b(i, new tlo0.f(R.string.friends_cleanup_empty_list_description))));
                vkPlaceholder.setVisibility(0);
                return s3q0.a;
            case 9:
                bpn0 bpn0Var = ((yit) this.c).a;
                SuperAppShowcaseMarkBadgeAsClickedDataDto superAppShowcaseMarkBadgeAsClickedDataDto = (SuperAppShowcaseMarkBadgeAsClickedDataDto) obj;
                if (superAppShowcaseMarkBadgeAsClickedDataDto instanceof SuperAppShowcaseMarkBadgeAsClickedDataDto.SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto) {
                    SuperAppBadgeInfoDto d = ((SuperAppShowcaseMarkBadgeAsClickedDataDto.SuperAppShowcaseMarkBadgeAsClickedShowcaseMenuDataDto) superAppShowcaseMarkBadgeAsClickedDataDto).d();
                    if (d != null) {
                        ((ykg) bpn0Var.getValue()).getClass();
                        String g = d.g();
                        if (g == null) {
                            g = "";
                        }
                        String str = g;
                        Boolean j = d.j();
                        boolean booleanValue = j != null ? j.booleanValue() : false;
                        Boolean e = d.e();
                        boolean booleanValue2 = e != null ? e.booleanValue() : false;
                        Integer d2 = d.d();
                        int intValue = d2 != null ? d2.intValue() : 0;
                        Boolean i7 = d.i();
                        boolean booleanValue3 = i7 != null ? i7.booleanValue() : false;
                        Boolean f = d.f();
                        r5 = new BadgeInfo(str, booleanValue, booleanValue2, intValue, booleanValue3, f != null ? f.booleanValue() : false);
                    }
                } else if (superAppShowcaseMarkBadgeAsClickedDataDto instanceof SuperAppShowcaseMarkBadgeAsClickedDataDto.SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto) {
                    ykg ykgVar = (ykg) bpn0Var.getValue();
                    SuperAppShowcaseServicesMenuBadgeDto d3 = ((SuperAppShowcaseMarkBadgeAsClickedDataDto.SuperAppShowcaseMarkBadgeAsClickedServicesMenuDataDto) superAppShowcaseMarkBadgeAsClickedDataDto).d();
                    ykgVar.getClass();
                    if (d3 instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeCounterDto) {
                        marketAlbumImagePickerView = new BadgeInfo(null, false, false, ((SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeCounterDto) d3).getCount(), false, false, 55, null);
                    } else if (d3 instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeDotDto) {
                        marketAlbumImagePickerView = new BadgeInfo(null, false, true, 0, false, false, 59, null);
                    } else if (d3 instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeNewDto) {
                        marketAlbumImagePickerView = new BadgeInfo(null, true, false, 0, false, false, 61, null);
                    }
                    r5 = marketAlbumImagePickerView;
                }
                if (r5 != null) {
                    return r5;
                }
                BadgeInfo.CREATOR.getClass();
                return BadgeInfo.h;
            case 10:
                hot hotVar = (hot) this.c;
                it80.a aVar2 = it80.b;
                FeatureId featureId = hotVar.a;
                suq suqVar = new suq(featureId, hotVar.a(featureId), new suq.c.b((List) obj));
                aVar2.getClass();
                return new it80(suqVar);
            case 11:
                dvt dvtVar = (dvt) this.c;
                Throwable th = (Throwable) obj;
                String str2 = "VkStepsGetStepsHealthConnectCommand.handleOpenSettings() -> Error message for getPermissionsStatus: " + th.getMessage() + ", stackTrace: " + mnh0.A(th);
                xgx0.a.getClass();
                xgx0.b(str2);
                r6y r6yVar = dvtVar.b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.GET_STEPS, VkAppsErrors.Client.CUSTOM_ERROR, str2, null, null, 56);
                }
                return s3q0.a;
            case 12:
                GoodPreviewFragment goodPreviewFragment = (GoodPreviewFragment) this.c;
                int i8 = GoodPreviewFragment.X;
                goodPreviewFragment.getClass();
                xn50.a.c(goodPreviewFragment, (m5u) obj);
                return s3q0.a;
            case 13:
                wxu wxuVar = (wxu) this.c;
                wxuVar.c.ed(true, false);
                qdc0 qdc0Var = wxuVar.b;
                if (qdc0Var != null) {
                    qdc0Var.G4();
                }
                return s3q0.a;
            case 14:
                HidePushContentService hidePushContentService = (HidePushContentService) this.c;
                int i9 = HidePushContentService.j;
                hidePushContentService.a();
                r57.b().d(hidePushContentService.getApplicationContext());
                hidePushContentService.stopSelf();
                return s3q0.a;
            case 15:
                ((ImItemListFragment.f) this.c).invoke(new i6w.c0((Set) obj));
                return s3q0.a;
            case 16:
                ImportContactsFragment importContactsFragment = (ImportContactsFragment) this.c;
                bqw bqwVar = (bqw) obj;
                int i10 = ImportContactsFragment.Q;
                if (epx.f(bqwVar, bqw.a.a)) {
                    ((oqw) importContactsFragment.O.getValue()).b(importContactsFragment);
                } else if (epx.f(bqwVar, bqw.b.a)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context requireContext = importContactsFragment.requireContext();
                    permissionHelper.getClass();
                    PermissionHelper.l(permissionHelper, requireContext, PermissionHelper.y, new cnh(importContactsFragment, i), new n9w(i3), 4);
                } else {
                    if (!epx.f(bqwVar, bqw.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    new lqw.a(importContactsFragment.requireContext(), new owv(importContactsFragment, i3)).a().Wn(importContactsFragment.getChildFragmentManager(), lqw.class.getName());
                }
                return s3q0.a;
            case 17:
                wex wexVar = (wex) this.c;
                aex.a aVar3 = wexVar.z0;
                if (aVar3 != null && (b = aVar3.b()) != null) {
                    Parcel obtain = Parcel.obtain();
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.g gVar = new Serializer.g(obtain);
                        gVar.i0(b);
                        obtain.setDataPosition(0);
                        Serializer.StreamParcelable G = gVar.G(StoryEntry.class.getClassLoader());
                        obtain.recycle();
                        StoryEntry storyEntry = (StoryEntry) G;
                        if (storyEntry != null) {
                            pdx pdxVar = wexVar.s0;
                            Context context = wexVar.itemView.getContext();
                            pdxVar.b(context, storyEntry);
                        }
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                }
                return s3q0.a;
            case 18:
                tdu tduVar = (tdu) obj;
                float floatValue = ((fw20) this.c).a.d().floatValue();
                float g2 = nix.g(tduVar, floatValue);
                float h = nix.h(tduVar, floatValue);
                tduVar.B(h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : g2 / h);
                tduVar.Y0(nix.c);
                return s3q0.a;
            case 19:
                ((kzx) this.c).T(new pzx.a.C3540a((Throwable) obj));
                return s3q0.a;
            case 20:
                ((j6y) this.c).a.z(JsApiMethodType.TRANSLATE, (Throwable) obj);
                return s3q0.a;
            case 21:
                ((qjz) this.c).e.invoke();
                return s3q0.a;
            case 22:
                loadDefaultAlbum$lambda$5 = LocalGalleryProvider.loadDefaultAlbum$lambda$5((LocalGalleryProvider) this.c, (List) obj);
                return loadDefaultAlbum$lambda$5;
            case 23:
                ((nxz) this.c).b1((GeoLocation) obj);
                return s3q0.a;
            case 24:
                VkSpinner vkSpinner = ((MarketAllReviewsFragment) this.c).S;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, true);
                }
                return s3q0.a;
            case 25:
                Photo photo = (Photo) obj;
                MarketAlbumImagePickerView marketAlbumImagePickerView2 = ((MarketEditAlbumCoverFragment) this.c).Q;
                (marketAlbumImagePickerView2 != null ? marketAlbumImagePickerView2 : null).setDefaultPhoto(photo);
                return s3q0.a;
            case 26:
                f4g0 f4g0Var = (f4g0) obj;
                e2g0 e2g0Var = ((MarketItemReviewsFragment) this.c).R;
                if (e2g0Var != null) {
                    e2g0Var.n(f4g0Var.a(), f4g0Var.b(), f4g0Var.c());
                }
                return s3q0.a;
            case 27:
                ((f810) this.c).T((p810.q) obj);
                return s3q0.a;
            case 28:
                ia20 ia20Var = (ia20) this.c;
                if (!hg1.d(ia20Var.g)) {
                    int i11 = 27;
                    ia20Var.g = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.maybe.l(new io.reactivex.rxjava3.internal.operators.single.v(new ha20(ia20Var, i4)), new d9(new n9w(3), 20)), new vj0(new f410(ia20Var, i2), i11)), new do3(new d9j(ia20Var, i11), 24)).n(asu0.a.c()).subscribe(io.reactivex.rxjava3.kotlin.c.a(new bq00(ia20Var, 5)), io.reactivex.rxjava3.kotlin.c.c(new p99(L.a, 8)), io.reactivex.rxjava3.kotlin.c.b(io.reactivex.rxjava3.kotlin.c.c));
                }
                return s3q0.a;
            default:
                ((io.reactivex.rxjava3.subjects.d) this.c).onNext((ProfilesInfo) obj);
                return s3q0.a;
        }
    }
}
