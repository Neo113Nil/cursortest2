package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.d;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMyShelfPlayable;
import com.vk.catalog2.feature.music.holders.MusicLinksLineVh;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.dialogs.RecommendedFolder;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$OpenScreenEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c2i;
import xsna.drz;
import xsna.e8v0;
import xsna.f0r;
import xsna.fho;
import xsna.gm50;
import xsna.h1j0;
import xsna.i2s;
import xsna.jav;
import xsna.jow0;
import xsna.krt0;
import xsna.l3e0;
import xsna.oap;
import xsna.qls;
import xsna.s290;
import xsna.saj;
import xsna.tlo0;
import xsna.vab;
import xsna.wk50;
import xsna.x1s;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ab implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ab(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        yg5 R;
        ?? r3;
        float[] fArr;
        float[] fArr2;
        int h;
        String str;
        int i = this.b;
        float f = -1.0f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) obj3;
                qls.d dVar = (qls.d) obj;
                int i2 = AbsFriendsAndFollowersTabFragment.X;
                absFriendsAndFollowersTabFragment.fo().e.setVisibility(8);
                absFriendsAndFollowersTabFragment.fo().a.setVisibility(0);
                hks hksVar = absFriendsAndFollowersTabFragment.V;
                if (hksVar == null) {
                    hksVar = null;
                }
                hksVar.setItems(dVar.a);
                hks hksVar2 = absFriendsAndFollowersTabFragment.V;
                (hksVar2 != null ? hksVar2 : null).notifyDataSetChanged();
                absFriendsAndFollowersTabFragment.fo().a.setRefreshing(dVar.b);
                return s3q0.a;
            case 1:
                gg1 gg1Var = (gg1) obj3;
                Photo photo = (Photo) obj2;
                Integer num = (Integer) obj;
                f4z f4zVar = gg1Var.p;
                f4zVar.b(i.e.a);
                if (num != null && num.intValue() == 1) {
                    tlo0.Companion.getClass();
                    gg1Var.b0(null, null, new tlo0.f(R.string.album_details_photo_delete_success));
                    f4zVar.b(i.C1485i.a);
                } else {
                    gg1Var.X(photo);
                }
                return s3q0.a;
            case 2:
                ((etv0) obj).b(false);
                ((a24) obj3).c.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 3:
                mnt0 mnt0Var = (mnt0) obj3;
                vfz vfzVar = (vfz) obj2;
                kih0 j = ((pi5) obj).j();
                if (j != null && (R = d370.R(j)) != null) {
                    VideoTextureView mo407getVideoView = mnt0Var.mo407getVideoView();
                    if (mo407getVideoView == null) {
                        throw new IllegalStateException("VideoTextureView must not be null");
                    }
                    R.z0(mo407getVideoView, mnt0Var.getVideoConfig(), vfzVar);
                }
                return s3q0.a;
            case 4:
                iab iabVar = (iab) obj3;
                int i3 = iab.l1;
                yzt0<vab.a.C3876a> yzt0Var = ((vab.a) obj).a;
                jab jabVar = new jab(1, (uab) obj2, uab.class, "accept", "accept(Lcom/vk/channels/impl/reactions/quantity_selector/presentation/ui/state/ChannelReactionQuantitySelectorViewState$Data$Content;)V", 0);
                iabVar.getClass();
                gm50.a.a(iabVar, yzt0Var, jabVar);
                return s3q0.a;
            case 5:
                ((izs) obj3).invoke(((Pair) ((List) obj2).get(((ModalActionSheetListItem) obj).a)).j());
                return s3q0.a;
            case 6:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj3;
                ClipsEntryPointsFragment.b bVar = (ClipsEntryPointsFragment.b) obj2;
                int i4 = ClipsEntryPointsFragment.i0;
                p3t io2 = clipsEntryPointsFragment.io();
                if (io2 == null || io2.Wm()) {
                    xn50.a.c(clipsEntryPointsFragment, new a.e(((n4a0) bVar.f.getAdapter()).getCurrentList(), clipsEntryPointsFragment.ko(), (lbk) clipsEntryPointsFragment.U.getValue(), new l3e0.a(clipsEntryPointsFragment.ko(), new la0(7))));
                }
                return s3q0.a;
            case 7:
                c2i.a aVar = (c2i.a) obj3;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(((c2i) aVar.m).g.b.b, null, null, new MobileOfficialAppsGroupsStat$OpenScreenEvent(MobileOfficialAppsGroupsStat$OpenScreenEvent.OpenScreenEventType.OPEN_PURCHASE_INFO, null, 2, null), 30), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                me10.b(aVar.n, aVar.itemView.getContext(), ((c2i) obj2).g.b, null, null, 12);
                return s3q0.a;
            case 8:
                return new mjq(((LayoutInflater) obj3).inflate(R.layout.vkim_user_vh_old, (ViewGroup) obj, false), (saj.a) obj2);
            case 9:
                uil uilVar = (uil) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                awt0.u(uilVar.r, booleanValue);
                if (((DefaultMiniWidget) ((bjf0) obj2).a).p.length() > 0) {
                    awt0.u(uilVar.s, booleanValue);
                }
                boolean z = !booleanValue;
                awt0.v(uilVar.y, z);
                awt0.v(uilVar.z, z);
                return s3q0.a;
            case 10:
                List<Long> list = lsn.a;
                xuo0.a.getClass();
                Preference.F(xuo0.a() + (((Integer) obj).intValue() * 1000), "notifications_prefs", "dnd_end");
                ca70 ca70Var = ca70.a;
                sv1.C();
                ca70.f((Context) obj3).cancelAll();
                ((com.vk.notifications.dnd.impl.a) obj2).b.onNext(Boolean.TRUE);
                return s3q0.a;
            case 11:
                pgo pgoVar = (pgo) obj3;
                androidx.compose.foundation.gestures.j jVar = (androidx.compose.foundation.gestures.j) obj2;
                long j2 = ((d.b) obj).a;
                long g = jVar.P ? ov70.g(-1.0f, j2) : ov70.g(1.0f, j2);
                Orientation orientation = jVar.L;
                fho.a aVar2 = fho.a;
                pgoVar.a(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? g & 4294967295L : g >> 32)));
                return s3q0.a;
            case 12:
                f0r.u uVar = (f0r.u) obj3;
                wk50.a aVar3 = (wk50.a) obj2;
                qih0 qih0Var = (qih0) obj;
                gbq gbqVar = uVar.e;
                f0r.k(uVar, aVar3, qih0Var, gbqVar != null ? new k0r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null, null, 4);
                return s3q0.a;
            case 13:
                drz.a aVar4 = (drz.a) obj3;
                x1s x1sVar = (x1s) obj2;
                t2s t2sVar = (t2s) obj;
                if (t2sVar.i != 0) {
                    return t2s.a(t2sVar, null, false, null, null, false, null, null, false, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                }
                Collection<rpm> values = ((Map) aVar4.a).values();
                int e = on00.e(c5g.u(values, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (rpm rpmVar : values) {
                    Pair pair = new Pair(Integer.valueOf(rpmVar.a), new i2s.a(rpmVar.a, rpmVar.b, rpmVar.c));
                    linkedHashMap.put(pair.i(), pair.j());
                }
                if (x1sVar instanceof x1s.a) {
                    List<RecommendedFolder> list2 = ((x1s.a) x1sVar).a;
                    r3 = new ArrayList(c5g.u(list2, 10));
                    for (RecommendedFolder recommendedFolder : list2) {
                        r3.add(new i2s.b(recommendedFolder.b, recommendedFolder.c, recommendedFolder.d));
                    }
                } else {
                    r3 = EmptyList.b;
                }
                List list3 = r3;
                return i2s.u(t2s.a(t2sVar, i2s.s(linkedHashMap, list3), false, linkedHashMap, list3, false, null, null, aVar4.b, 0, 370));
            case 14:
                ((wh50) obj2).setValue(new pco(((azl) obj3).j1((int) (((q9x) obj).a & 4294967295L))));
                return s3q0.a;
            case 15:
                MusicLinksLineVh musicLinksLineVh = (MusicLinksLineVh) obj3;
                UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                VKImageView vKImageView = (VKImageView) obj;
                k7a k7aVar = musicLinksLineVh.d;
                Meta meta = uIBlockLink.y.g;
                ContentType contentType = meta != null ? meta.c : null;
                CatalogDataType catalogDataType = uIBlockLink.e;
                CatalogViewType catalogViewType = uIBlockLink.d;
                RoundingParams roundingParams = vKImageView.getHierarchy().c;
                k7aVar.b(vKImageView, contentType, catalogDataType, catalogViewType, (roundingParams == null || (fArr2 = roundingParams.c) == null) ? -1.0f : fArr2[0]);
                k7a k7aVar2 = musicLinksLineVh.d;
                CatalogDataType catalogDataType2 = uIBlockLink.e;
                CatalogViewType catalogViewType2 = uIBlockLink.d;
                RoundingParams roundingParams2 = vKImageView.getHierarchy().c;
                if (roundingParams2 != null && (fArr = roundingParams2.c) != null) {
                    f = fArr[0];
                }
                k7aVar2.d(vKImageView, catalogDataType2, catalogViewType2, f);
                return s3q0.a;
            case 16:
                mw50 mw50Var = (mw50) obj3;
                rfz.b(mw50Var.c, ne7.s((RequestUserProfile) obj2), new jav.e(mw50Var.a, (List) obj), null, 4);
                return s3q0.a;
            case 17:
                return new UIBlockMyShelfPlayable(((bi20) obj3).b(), (CatalogButtonOpenUrl) obj2, null, (AudioBook) obj, 4, null);
            case 18:
                oap oapVar = (oap) obj3;
                s290 s290Var = (s290) obj2;
                VideoOverlayView.VideoRestrictionSize videoRestrictionSize = (VideoOverlayView.VideoRestrictionSize) obj;
                if (oapVar == null) {
                    return null;
                }
                if (oapVar instanceof oap.b) {
                    Uri uri = (Uri) ((oap.b) oapVar).a;
                    if (uri != null) {
                        return uri.toString();
                    }
                    return null;
                }
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Image image = (Image) ((oap.a) oapVar).a;
                if (image == null) {
                    return null;
                }
                s290Var.getClass();
                int i5 = s290.a.$EnumSwitchMapping$0[videoRestrictionSize.ordinal()];
                if (i5 == 1) {
                    h = ImageScreenSize.SMALL.h();
                } else {
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h = ImageScreenSize.MID.h();
                }
                ImageSize Cb = image.Cb(h, false, false);
                if (Cb != null) {
                    return Cb.d.d;
                }
                return null;
            case 19:
                bn50 bn50Var = (bn50) obj3;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((h1j0) obj2).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new h1j0.a(bn50Var));
                return s3q0.a;
            case 20:
                NewsEntry newsEntry = (NewsEntry) obj2;
                Integer num2 = (Integer) obj;
                wvn wvnVar = ((cvj0) obj3).G;
                if (wvnVar != null) {
                    wvnVar.a(num2.intValue(), newsEntry);
                }
                return s3q0.a;
            case 21:
                izs izsVar = (izs) obj2;
                b.d dVar2 = (b.d) obj;
                Long l = ((xkm0) obj3).e;
                if (l != null) {
                    dVar2.b(Long.valueOf(l.longValue()), "loading_duration");
                }
                if (izsVar != null) {
                    izsVar.invoke(dVar2);
                }
                return s3q0.a;
            case 22:
                qdn0 qdn0Var = (qdn0) obj3;
                pdn0 pdn0Var = (pdn0) obj2;
                WebAction webAction = qdn0Var.e.q;
                if (webAction != null) {
                    pdn0Var.p.b(pdn0Var.itemView.getContext(), webAction, qdn0Var, null);
                }
                return s3q0.a;
            case 23:
                bn50 bn50Var2 = (bn50) obj3;
                g47 g47Var2 = (g47) obj;
                g47Var2.e(tci.l(bn50Var2), ((krt0) obj2).b);
                g47Var2.a(tci.k(bn50Var2));
                g47Var2.d(new krt0.a(bn50Var2));
                return s3q0.a;
            case 24:
                ljo0 ljo0Var = (ljo0) obj;
                ((izs) obj3).invoke(ljo0Var);
                ((wh50) obj2).setValue(ljo0Var);
                return s3q0.a;
            case 25:
                ((nfv0) obj3).d((String) obj2, (tnf0) obj);
                return s3q0.a;
            default:
                y4x0 y4x0Var = (y4x0) obj3;
                y4x0Var.f.put((Long) obj2, ((jow0.a) obj).a);
                io.reactivex.rxjava3.subjects.f<Object> fVar = y4x0Var.e;
                kr5 a = y4x0Var.a();
                dhw0 dhw0Var = com.vk.voip.ui.c.O;
                if (dhw0Var == null || (str = dhw0Var.l()) == null) {
                    str = "";
                }
                fVar.onNext(new et80(a, str, y4x0Var.b()));
                return s3q0.a;
        }
    }

    public /* synthetic */ ab(String str, mnt0 mnt0Var, vfz vfzVar) {
        this.b = 3;
        this.c = mnt0Var;
        this.d = vfzVar;
    }

    public /* synthetic */ ab(drz.a aVar, x1s x1sVar, i2s i2sVar) {
        this.b = 13;
        this.c = aVar;
        this.d = x1sVar;
    }
}
