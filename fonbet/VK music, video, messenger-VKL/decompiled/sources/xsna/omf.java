package xsna;

import android.content.DialogInterface;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.api.generated.groups.dto.GroupsGetBannerResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.attachments.impl.views.video.b;
import com.vk.core.serialize.Serializer;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.DonutBanner;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.TopBarSubscriptionManageType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.log.L;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.settings.impl.presentation.base.fragment.communities.ManageCommunitiesNotificationsFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ch00;
import xsna.dr00;
import xsna.drz;
import xsna.gm50;
import xsna.h7u0;
import xsna.hpz;
import xsna.hsk0;
import xsna.i3v;
import xsna.kyg;
import xsna.l2s;
import xsna.lru;
import xsna.o2j;
import xsna.qg00;
import xsna.tj50;
import xsna.tls;
import xsna.vms;
import xsna.wms;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class omf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ omf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        BaseLinkButtonActionDto d;
        int i = this.b;
        int i2 = 4;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                pmf pmfVar = (pmf) obj2;
                tj50.a aVar = (tj50.a) obj;
                g15 g15Var = new g15(pmfVar, 3);
                ao8 ao8Var = ao8.d;
                return new b.a(aVar.a(g15Var, ao8Var), aVar.a(new a2a(pmfVar, 1), ao8Var), aVar.a(new py(12), ao8Var), aVar.a(new ol(11), ao8Var), aVar.a(new yy(14), ao8Var));
            case 1:
                rxf rxfVar = (rxf) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                d040 o = xgl0Var.o();
                Peer peer = rxfVar.d;
                long j = peer.b;
                int i3 = rxfVar.e;
                Integer a0 = o.a0(i3, j);
                r6 = a0 != null ? a0.intValue() : 0;
                rxfVar.g = r6;
                if (r6 > 0) {
                    xgl0Var.o().w0(i3, peer.b, rxfVar.f);
                }
                return s3q0.a;
            case 2:
                UploadImageModel uploadImageModel = (UploadImageModel) obj;
                ProgressInfo.None none = ProgressInfo.None.b;
                Photo photo = ((kyg.d.a) obj2).c;
                return UploadImageModel.a(uploadImageModel, null, photo != null ? Integer.valueOf(photo.c) : null, none, 51);
            case 3:
                fch fchVar = (fch) obj2;
                GroupsGetBannerResponseDto groupsGetBannerResponseDto = (GroupsGetBannerResponseDto) obj;
                GroupsBannerDto d2 = groupsGetBannerResponseDto.d();
                String title = d2 != null ? d2.getTitle() : null;
                GroupsBannerDto d3 = groupsGetBannerResponseDto.d();
                String e = d3 != null ? d3.e() : null;
                ne6 ne6Var = (ne6) fchVar.c;
                GroupsBannerDto d4 = groupsGetBannerResponseDto.d();
                List<BaseImageDto> l = d4 != null ? d4.l() : null;
                ne6Var.getClass();
                Image a = ne6.a(l);
                GroupsBannerDto d5 = groupsGetBannerResponseDto.d();
                String url = (d5 == null || (d = d5.d()) == null) ? null : d.getUrl();
                GroupsBannerDto d6 = groupsGetBannerResponseDto.d();
                return new nwg(title, e, url, d6 != null ? d6.r() : null, a);
            case 4:
                ptk ptkVar = (ptk) obj2;
                ((ExtendedCommunityProfile) ptkVar.a).u2 = (DonutBanner) ((it80) obj).a;
                return ptkVar;
            case 5:
                ((zak0) ((CommunityReviewsFragment) obj2).j0).setValue((TopBarSubscriptionManageType) obj);
                return s3q0.a;
            case 6:
                L.g("Error on closing rooms list", (Throwable) obj);
                ((a2j) obj2).T(o2j.g.b);
                return s3q0.a;
            case 7:
                l8j l8jVar = (l8j) obj2;
                l8jVar.r.a(((ipm) obj).a(l8jVar.n.b));
                return s3q0.a;
            case 8:
                return new iuj((gho0) obj2, r6);
            case 9:
                y6k y6kVar = (y6k) obj2;
                y6kVar.t.g = ((hpz.a) obj).a;
                y6kVar.Z0();
                return s3q0.a;
            case 10:
                return new p7p((ViewGroup) obj, ((DialogsListAdapter) obj2).j);
            case 11:
                Throwable th = (Throwable) obj;
                if (((com.vk.im.ui.components.dialogs_list.c) obj2).f() != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 12:
                ((p7p) obj2).l.z();
                throw null;
            case 13:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj2;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                gom0.a(gom0Var, noq.b, new com.vk.movika.tools.controls.seekbar.p(faveFeedFragment, i2));
                gom0.a(gom0Var, ooq.b, new com.vk.movika.tools.controls.seekbar.q(faveFeedFragment, 8));
                gom0.a(gom0Var, poq.b, new com.vk.movika.tools.controls.seekbar.r(faveFeedFragment, i2));
                gom0.a(gom0Var, qoq.b, new com.vk.movika.tools.controls.seekbar.s(faveFeedFragment, 7));
                gom0.a(gom0Var, roq.b, new com.vk.movika.tools.controls.seekbar.t(faveFeedFragment, 6));
                return s3q0.a;
            case 14:
                ((z0s) obj2).c.d(h580.b);
                return s3q0.a;
            case 15:
                i2s i2sVar = (i2s) obj2;
                drz.a aVar2 = (drz.a) obj;
                l2s l2sVar = i2sVar.k;
                if (!(l2sVar instanceof l2s.b)) {
                    return io.reactivex.rxjava3.core.q.T(aVar2);
                }
                c1s c1sVar = i2sVar.h;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                int i4 = 22;
                return c1sVar.d(Peer.a.b(((l2s.b) l2sVar).a)).w().U(new j7(new nvg(aVar2, 21), i4)).U(new l7(new n6f(i2sVar, 25), i4));
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((v1z) obj2).d).setValue(bool);
                return s3q0.a;
            case 17:
                FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = (FriendsAndFollowersRootFragment) obj2;
                tls.a aVar3 = (tls.a) obj;
                int i5 = FriendsAndFollowersRootFragment.Z;
                gm50.a.a(friendsAndFollowersRootFragment, aVar3.b, new nv2(20, friendsAndFollowersRootFragment, aVar3));
                gm50.a.a(friendsAndFollowersRootFragment, aVar3.a, new t1e(friendsAndFollowersRootFragment, 24));
                return s3q0.a;
            case 18:
                wms wmsVar = (wms) obj2;
                kym0 kym0Var = (kym0) obj;
                SubscribeStatus subscribeStatus = kym0Var.a;
                UserId userId = kym0Var.b;
                int i6 = wms.a.$EnumSwitchMapping$0[subscribeStatus.ordinal()];
                if (i6 == 1) {
                    wmsVar.a.b(new vms.a(userId));
                } else if (i6 == 2 || i6 == 3 || i6 == 4) {
                    wmsVar.a.b(new vms.b(userId));
                }
                return s3q0.a;
            case 19:
                ((t3t) obj2).d.invoke((List) obj);
                return s3q0.a;
            case 20:
                return Float.valueOf(((com.vk.geo.impl.presentation.b) obj2).V((BoundingBox) obj));
            case 21:
                GlobalSearchMarketCatalogRootVh globalSearchMarketCatalogRootVh = (GlobalSearchMarketCatalogRootVh) obj2;
                d2u d2uVar = globalSearchMarketCatalogRootVh.H;
                String str = globalSearchMarketCatalogRootVh.p;
                UIBlockList uIBlockList = ((sa80) obj).a;
                d2uVar.getClass();
                if (str.length() != 0) {
                    lt00 lt00Var = d2uVar.b;
                    String str2 = uIBlockList.b;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.SEARCH_GOODS;
                    int i7 = lt00.a;
                    lt00Var.c(str2, commonMarketStat$TypeRefSource);
                }
                return s3q0.a;
            case 22:
                ((tdu) obj).f(pco.b(((pco) ((zak0) ((ibu) obj2).d).getValue()).b, 0));
                return s3q0.a;
            case 23:
                return f870.s((Group) obj2, ((Integer) obj).intValue());
            case 24:
                j3i j3iVar = (j3i) obj;
                hd60.a().T("show_group_suggestion", new GroupSuggestion(j3iVar.b, null, null, j3iVar.c, null), ((lru) ((lru.a) obj2).m).i);
                return s3q0.a;
            case 25:
                ctu ctuVar = (ctu) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                ctuVar.a.invoke(new gu80(jSONObject.optBoolean("isAd", false), f370.A("predId", jSONObject), f370.A("erId", jSONObject)));
                return new JSONObject();
            case 26:
                y2v y2vVar = (y2v) obj2;
                i3v i3vVar = (i3v) obj;
                if (i3vVar instanceof i3v.a) {
                    n97 n97Var = (n97) y2vVar.k1.getValue();
                    hsk0.e eVar = ((i3v.a) i3vVar).a;
                    int a2 = ((k47) y2vVar.j1.getValue()).a(y2vVar.requireContext());
                    n97Var.getClass();
                    n97.a(eVar, a2);
                } else {
                    int i8 = y2v.m1;
                }
                return s3q0.a;
            case 27:
                ((fiz) obj2).a.invoke();
                return s3q0.a;
            case 28:
                final ManageCommunitiesNotificationsFragment manageCommunitiesNotificationsFragment = (ManageCommunitiesNotificationsFragment) obj2;
                ch00 ch00Var = (ch00) obj;
                int i9 = ManageCommunitiesNotificationsFragment.S;
                if (ch00Var.equals(ch00.b.a)) {
                    ui70 d7 = z4g.d();
                    manageCommunitiesNotificationsFragment.requireContext();
                    oz50 M = d7.M();
                    if (M != null) {
                        M.g(1, manageCommunitiesNotificationsFragment);
                    }
                } else if (ch00Var instanceof ch00.c) {
                    ui70 d8 = z4g.d();
                    manageCommunitiesNotificationsFragment.requireContext();
                    ch00.c cVar2 = (ch00.c) ch00Var;
                    oz50 h = d8.h(cVar2.a, cVar2.b);
                    if (h != null) {
                        h.g(2, manageCommunitiesNotificationsFragment);
                    }
                } else if (ch00Var.equals(ch00.a.a)) {
                    manageCommunitiesNotificationsFragment.finish();
                } else if (ch00Var instanceof ch00.d) {
                    final ch00.d dVar = (ch00.d) ch00Var;
                    int i10 = h7u0.p;
                    h7u0.a c = h7u0.b.c(manageCommunitiesNotificationsFragment.requireContext());
                    c.g0(R.string.manage_communities_confirm);
                    c.a.f = manageCommunitiesNotificationsFragment.getString(R.string.manage_communities_confirm_disable, dVar.b);
                    c.c0(R.string.manage_communities_yes, new DialogInterface.OnClickListener() { // from class: xsna.ug00
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = ManageCommunitiesNotificationsFragment.S;
                            ManageCommunitiesNotificationsFragment.this.getFeature().C(new qg00.d(dVar.a));
                        }
                    });
                    c.W(R.string.manage_communities_cancel, new vg00(r6));
                    c.m();
                } else {
                    if (!(ch00Var instanceof ch00.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.w(j03.g(manageCommunitiesNotificationsFragment.requireContext(), ((ch00.e) ch00Var).a, R.string.error), false);
                }
                return s3q0.a;
            default:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) obj2;
                gm50.a.a(bVar, ((dr00.a) obj).a, new k7f(bVar, 29));
                return s3q0.a;
        }
    }
}
