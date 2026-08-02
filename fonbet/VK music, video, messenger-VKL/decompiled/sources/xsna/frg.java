package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.MarkerOptions;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.Poll;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.j;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import java.util.List;
import java.util.Map;
import xsna.as30;
import xsna.cos;
import xsna.d3h;
import xsna.fys;
import xsna.gm50;
import xsna.o9t;
import xsna.tlo0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class frg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ frg(UIBlockGroupFilter uIBlockGroupFilter, GroupFilterTileVh groupFilterTileVh) {
        this.b = 21;
        this.c = uIBlockGroupFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Context mo2getContext;
        int i = 12;
        int i2 = 17;
        int i3 = 2;
        int i4 = 14;
        boolean z = false;
        r8 = false;
        boolean z2 = false;
        z = false;
        int i5 = 3;
        switch (this.b) {
            case 0:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                Address address = (Address) obj;
                CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
                if (gVar == null) {
                    gVar = null;
                }
                gVar.g(true, address);
                edr0 edr0Var = new edr0(address.c, address.d);
                wwf<tqg> wwfVar = communityAddressesFragment.s0;
                if (wwfVar != null) {
                    wwfVar.k();
                }
                wwf<tqg> wwfVar2 = communityAddressesFragment.s0;
                if (wwfVar2 != null) {
                    vj00 vj00Var = ofx.a;
                    if (vj00Var == null) {
                        vj00Var = null;
                    }
                    rdr0 c = vj00Var.c();
                    MarkerOptions markerOptions = c.a;
                    c.b(edr0Var);
                    markerOptions.f = 0.5f;
                    markerOptions.g = 0.5f;
                    qrg qrgVar = communityAddressesFragment.t0;
                    c.a(qrgVar != null ? qrgVar.i : null);
                    markerOptions.o = 10.0f;
                    wwfVar2.i(c);
                }
                return s3q0.a;
            case 1:
                d4h d4hVar = (d4h) this.c;
                CatchUpBanner catchUpBanner = (CatchUpBanner) obj;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = d4hVar.m;
                CatchUpBanner.Style style = catchUpBanner.l;
                int i6 = style == null ? -1 : d3h.b.$EnumSwitchMapping$1[style.ordinal()];
                if (i6 == 1) {
                    UserId a = fkq0.a(userId);
                    String str = catchUpBanner.b;
                    if (str == null) {
                        str = "";
                    }
                    tfx tfxVar = new tfx("groups.executeBannerAction", new dq(14), new com.vk.movika.sdk.base.model.n(i));
                    tfx.n(tfxVar, "group_id", a, 1L, 0L, 8);
                    tfx.o(tfxVar, "banner_id", str, 0, 0, 12);
                    int i7 = 13;
                    d3hVar.c.m(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new tf1(new h6g(d3hVar, i5), i7), new el6(new ci7(16), i7)));
                } else if (i6 == 2 && (mo2getContext = d3hVar.a.mo2getContext()) != null) {
                    rml0.a(d3hVar.n, mo2getContext, userId, null, 28);
                }
                return s3q0.a;
            case 2:
                return kn00.a((kn00) obj, null, null, null, 0, null, null, (kdh) this.c, 1791);
            case 3:
                puj pujVar = (puj) this.c;
                wh50 wh50Var = pujVar.t.t;
                Boolean bool = Boolean.TRUE;
                ((zak0) wh50Var).setValue(bool);
                ((zak0) pujVar.t.s).setValue(bool);
                puj.l2(pujVar.t, (String) ((xbr) obj).b(), pujVar.u, pujVar.v);
                return bool;
            case 4:
                return new gak((ViewGroup) obj, (lwh) this.c);
            case 5:
                ((ImageView) this.c).setImageDrawable((RLottieDrawable) obj);
                return s3q0.a;
            case 6:
                d0l d0lVar = (d0l) this.c;
                int i8 = ((efn) obj).a;
                Long f = d0lVar.f();
                if (f != null) {
                    d0lVar.d(d0lVar.c.f(f.longValue()).e);
                }
                ((zak0) d0lVar.g).setValue(new efn(i8));
                return s3q0.a;
            case 7:
                ugl uglVar = (ugl) this.c;
                dj00 dj00Var = (dj00) obj;
                uglVar.w = dj00Var;
                if (!uglVar.t) {
                    uglVar.u = null;
                    io.reactivex.rxjava3.disposables.b bVar = uglVar.q;
                    fbx fbxVar = uglVar.h;
                    Map<String, String> map = dj00Var.b;
                    long j = fbxVar.a.I0().b;
                    int o0 = fbxVar.a.o0();
                    String C1 = fbxVar.a.C1();
                    tfx tfxVar2 = new tfx("video.getInteractiveVideoInfo", new d4r0(i3), new e630(i));
                    tfx.m(tfxVar2, "owner_id", j, 0L, 12);
                    tfx tfxVar3 = tfxVar2;
                    tfx.l(tfxVar3, "video_id", o0, 0, 0, 8);
                    if (C1 != null) {
                        tfx.o(tfxVar3, "access_key", C1, 0, 0, 12);
                        tfxVar3 = tfxVar3;
                    }
                    dz2 x = yfb.x(tfxVar3);
                    x.c = true;
                    x.d = true;
                    bVar.b(xa4.H(rsg0.y0(x, null, null, 3), 3, 1007).U(new bk1(new ebx(map, z ? 1 : 0), 21)).subscribe(new jz(new xa9(uglVar, 3), 17), new hv(new whe(uglVar, 2), 16)));
                }
                io.reactivex.rxjava3.disposables.c cVar = uglVar.p;
                if (cVar != null) {
                    cVar.dispose();
                }
                uglVar.p = null;
                return s3q0.a;
            case 8:
                itm itmVar = (itm) this.c;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof ka80) {
                    synchronized (itmVar) {
                        itmVar.j(((ka80) sxpVar).c);
                        itmVar.d.addAll(((ka80) sxpVar).c.Db().h());
                    }
                }
                return s3q0.a;
            case 9:
                DiscoverId discoverId = (DiscoverId) this.c;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                return (!m6n.b(discoverId, newsEntriesContainer) || newsEntriesContainer.c.isEmpty()) ? DiscoverNewsEntriesRepository.a.a(discoverId, true, DiscoverCustomIntent.FEED_BLOCK, false, new krk0(7, null)).b : io.reactivex.rxjava3.core.q.T(new ovz(newsEntriesContainer)).a0(asu0.a.d());
            case 10:
                wzo wzoVar = (wzo) this.c;
                Post post = (Post) wzoVar.q6();
                if (post != null) {
                    wzoVar.E.H(wzoVar.itemView.getContext(), post, false, post.Z1() ? MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT : null);
                }
                return s3q0.a;
            case 11:
                FiltersView filtersView = (FiltersView) this.c;
                tcr tcrVar = (tcr) obj;
                wzs<? super FilterType, ? super Float, s3q0> wzsVar = filtersView.w;
                if (wzsVar != null) {
                    wzsVar.invoke(tcrVar.a, Float.valueOf(tcrVar.f));
                }
                filtersView.P4(tcrVar);
                return s3q0.a;
            case 12:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.c;
                int i9 = FriendsCleanupFragment.W;
                xns fo = friendsCleanupFragment.fo();
                fo.a.setVisibility(0);
                fo.b.setVisibility(8);
                fo.c.setVisibility(8);
                fo.d.setVisibility(8);
                gm50.a.a(friendsCleanupFragment, ((cos.a) obj).a, new igh(friendsCleanupFragment, i4));
                return s3q0.a;
            case 13:
                fws fwsVar = (fws) this.c;
                if (((String) obj).length() > 0 && ((Boolean) fwsVar.j.invoke()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                cys cysVar = (cys) this.c;
                if (cysVar.e instanceof fys.b) {
                    cysVar.c.invoke();
                }
                return s3q0.a;
            case 15:
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.c;
                int i10 = GalleryFragmentImpl.R0;
                MediaStoreEntry mediaStoreEntry2 = obj instanceof MediaStoreEntry ? (MediaStoreEntry) obj : null;
                if (mediaStoreEntry2 != null && mediaStoreEntry2.getId() == mediaStoreEntry.getId()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 16:
                s90 s90Var = (s90) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                String str2 = s90Var.h;
                if (str2 != null) {
                    qgi0.h(tgi0Var, str2);
                }
                return s3q0.a;
            case 17:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) this.c;
                int i11 = GamesCatalogFragment.i0;
                o9t.i iVar = new o9t.i((String) obj);
                gamesCatalogFragment.getClass();
                xn50.a.c(gamesCatalogFragment, iVar);
                return s3q0.a;
            case 18:
                GeoFragment geoFragment = (GeoFragment) this.c;
                j.a aVar = (j.a) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                gm50.a.a(geoFragment, aVar.a, new uy7(new yad(geoFragment, 29), i5));
                gm50.a.a(geoFragment, aVar.b, new uy7(new pwk(geoFragment, i4), i5));
                gm50.a.a(geoFragment, aVar.c, new uy7(new wcg(geoFragment, i2), i5));
                return s3q0.a;
            case 19:
                GoodFragment goodFragment = (GoodFragment) this.c;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                goodFragment.Qo().b((ejd0) obj);
                return s3q0.a;
            case 20:
                ((jcu) this.c).d.invoke(new wbu((Bitmap) obj));
                return s3q0.a;
            case 21:
                return Boolean.valueOf(GroupFilterTileVh.p((UIBlockList) obj, (UIBlockGroupFilter) this.c));
            case 22:
                as30.a aVar2 = ((com.vk.im.video.a) this.c).q;
                (aVar2 != null ? aVar2 : null).c();
                return Boolean.TRUE;
            case 23:
                ((c5w) this.c).d.a((Throwable) obj);
                return s3q0.a;
            case 24:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.c;
                cVar2.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar2.c;
                dVar.e(true);
                dVar.d((Poll) obj, true);
                return s3q0.a;
            case 25:
                drx drxVar = (drx) this.c;
                tlo0.a aVar3 = tlo0.Companion;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                aVar3.getClass();
                drxVar.Y(new tlo0.h(message));
                return s3q0.a;
            case 26:
                ((x6y) this.c).z(JsApiMethodType.VALIDATE_PHONE, (Throwable) obj);
                return s3q0.a;
            case 27:
                ((cgy) this.c).l.invoke();
                return s3q0.a;
            case 28:
                List list = (List) obj;
                l010 l010Var = ((MarketItemCommentsFragment) this.c).S;
                if (l010Var != null) {
                    l010Var.setItems(list);
                }
                return s3q0.a;
            default:
                int i12 = MarketItemReviewsFragment.w0;
                ((MarketItemReviewsFragment) this.c).fo((k7p0) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ frg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
