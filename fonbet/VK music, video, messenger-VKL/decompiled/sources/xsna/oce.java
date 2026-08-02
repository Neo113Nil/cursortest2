package xsna;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.core.util.NoLocation;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.profile.Address;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.ecomm.reviews.impl.communities.yclients.f;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewResult;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aq;
import xsna.gm50;
import xsna.it80;
import xsna.kqe;
import xsna.ndw;
import xsna.u8m;
import xsna.x89;
import xsna.y6u;
import xsna.y7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class oce implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oce(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ClipVideoFile clipVideoFile;
        String str;
        Object U;
        ViewGroup.LayoutParams layoutParams;
        int i = 15;
        int i2 = 5;
        switch (this.b) {
            case 0:
                ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) this.c;
                int i3 = ClipsGridCommonClipsListFragment.q0;
                int bindingAdapterPosition = ((RecyclerView.e0) obj).getBindingAdapterPosition();
                Object b0 = j5g.b0(bindingAdapterPosition, clipsGridCommonClipsListFragment.jo().y0());
                vee veeVar = b0 instanceof vee ? (vee) b0 : null;
                if (veeVar == null || (clipVideoFile = veeVar.a) == null || (str = clipVideoFile.W) == null) {
                    return null;
                }
                return new lde(bindingAdapterPosition, str);
            case 1:
                yse yseVar = (yse) this.c;
                yseVar.T(new bte((ShortVideoPlaylistFullDto) obj));
                io.reactivex.rxjava3.subjects.f<kqe> fVar = iqe.a;
                iqe.a.onNext(new kqe.a(yseVar.g));
                return s3q0.a;
            case 2:
                s4f s4fVar = (s4f) this.c;
                vqt vqtVar = (vqt) obj;
                s170 s170Var = s4fVar.l;
                int i4 = vqtVar.b;
                VKList<NewsComment> vKList = vqtVar.a;
                s170Var.e(Math.max(0, i4 - vqtVar.c));
                com.vk.lists.c cVar = s4fVar.i;
                int i5 = vqtVar.c;
                int size = vKList.size();
                if (i5 > 0) {
                    size += i5;
                }
                cVar.q(size);
                if (cVar.i() >= vqtVar.b) {
                    cVar.r(false);
                }
                String j = cVar.j();
                if (j == null || j.length() == 0 || vKList.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 3:
                f4g f4gVar = (f4g) this.c;
                f4gVar.c = j4g.a(f4gVar.c, false, false, null, ((Boolean) obj).booleanValue(), 7);
                f4gVar.a();
                return s3q0.a;
            case 4:
                io.reactivex.rxjava3.subjects.d<kgg> dVar = ((xeg) this.c).i;
                dVar.onNext(((kgg) dVar.P0()) != null ? new kgg(Boolean.TRUE) : null);
                return s3q0.a;
            case 5:
                cch cchVar = (cch) ((bch) this.c).m;
                lp1 lp1Var = cchVar.h;
                if (lp1Var != null) {
                    lp1Var.invoke(cchVar.g.b);
                }
                return s3q0.a;
            case 6:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                Location location = (Location) ((it80) obj).a;
                if (location != null) {
                    if (location.equals(NoLocation.b)) {
                        U = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                    } else {
                        UserId a = fkq0.a(bwd0.i(extendedCommunityProfile));
                        Address address = extendedCommunityProfile.W1;
                        U = rsg0.T(new zst(a, location, address != null ? address.b : 0)).U(new w7(new puh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), i));
                    }
                    if (U != null) {
                        return U;
                    }
                }
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 7:
                ((View) this.c).performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                g.a aVar = (g.a) obj;
                int i6 = CommunityReviewsFragment.o0;
                mzp0 mzp0Var = communityReviewsFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                communityReviewsFragment.On().a();
                CommunityReviewsView communityReviewsView = communityReviewsFragment.a0;
                if (communityReviewsView != null) {
                    communityReviewsView.c();
                }
                NestedScrollView nestedScrollView = communityReviewsFragment.e0;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, false);
                }
                VkPlaceholder vkPlaceholder = communityReviewsFragment.d0;
                if (vkPlaceholder != null) {
                    bwt0.p0(vkPlaceholder, false);
                }
                ComposeView composeView = communityReviewsFragment.f0;
                if (composeView != null) {
                    bwt0.p0(composeView, false);
                }
                VkSpinner vkSpinner = communityReviewsFragment.c0;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, false);
                }
                CommunityReviewsView communityReviewsView2 = communityReviewsFragment.a0;
                if (communityReviewsView2 != null) {
                    bwt0.p0(communityReviewsView2, true);
                }
                CommunityReviewsView communityReviewsView3 = communityReviewsFragment.a0;
                if (communityReviewsView3 != null) {
                    bwt0.p0(communityReviewsView3, true);
                }
                LinearLayout linearLayout = communityReviewsFragment.b0;
                if (linearLayout != null) {
                    Boolean a2 = aVar.a.a();
                    bwt0.p0(linearLayout, a2 != null ? a2.booleanValue() : false);
                }
                gm50.a.a(communityReviewsFragment, aVar.b, new p4f(communityReviewsFragment, 6));
                gm50.a.a(communityReviewsFragment, aVar.c, new dsc(communityReviewsFragment, i));
                gm50.a.a(communityReviewsFragment, aVar.a, new b5h(communityReviewsFragment, 2));
                gm50.a.a(communityReviewsFragment, aVar.g, new fre(communityReviewsFragment, 11));
                gm50.a.a(communityReviewsFragment, aVar.i, new omf(communityReviewsFragment, i2));
                gm50.a.a(communityReviewsFragment, aVar.d, new nhe(communityReviewsFragment, 7));
                gm50.a.a(communityReviewsFragment, aVar.f, new zt4(communityReviewsFragment, 24));
                gm50.a.a(communityReviewsFragment, aVar.e, new t1e(communityReviewsFragment, 10));
                gm50.a.a(communityReviewsFragment, aVar.h, new vw4(communityReviewsFragment, 6));
                return s3q0.a;
            case 9:
                com.vk.profile.community.suggestions.impl.ui.suggestions.g gVar = (com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c;
                gVar.g.setItems((List) obj);
                RecyclerPaginatedView recyclerPaginatedView = gVar.h;
                recyclerPaginatedView.f0();
                recyclerPaginatedView.Mk();
                return s3q0.a;
            case 10:
                ((z37) this.c).b((OrderAction) obj);
                return s3q0.a;
            case 11:
                ((com.vk.ecomm.reviews.impl.communities.yclients.e) this.c).T(f.a.b);
                return s3q0.a;
            case 12:
                ((ddj) this.c).p.g(((pno0) obj).d());
                return s3q0.a;
            case 13:
                CreateMarketItemReviewFragment createMarketItemReviewFragment = (CreateMarketItemReviewFragment) this.c;
                y7k y7kVar = (y7k) obj;
                int i7 = CreateMarketItemReviewFragment.U;
                if (y7kVar instanceof y7k.b) {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    y7k.b bVar = (y7k.b) y7kVar;
                    bundle.putParcelable(fpf0.a(CreateMarketItemReviewResult.class).l(), new CreateMarketItemReviewResult(bVar.a, bVar.b, bVar.c, bVar.d));
                    s3q0 s3q0Var = s3q0.a;
                    intent.putExtra("create_market_item_result", bundle);
                    createMarketItemReviewFragment.Mf(-1, intent);
                }
                return s3q0.a;
            case 14:
                uil uilVar = (uil) this.c;
                jr20 jr20Var = uilVar.q;
                Object obj2 = uilVar.l;
                jr20Var.e2(((bjf0) (obj2 != null ? obj2 : null)).a.getType());
                return s3q0.a;
            case 15:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar2 = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c;
                u8m u8mVar = (u8m) obj;
                bVar2.getClass();
                if (!epx.f(u8mVar, u8m.w0.b) && !epx.f(u8mVar, u8m.h.b)) {
                    r4 = false;
                }
                efm efmVar = bVar2.e;
                if (efmVar != null) {
                    efmVar.o(r4);
                }
                bVar2.A(u8mVar);
                return s3q0.a;
            case 16:
                return ((ipm) obj).a(((DialogExt) this.c).e);
            case 17:
                return new nq20((ViewGroup) obj, ((DialogsListAdapter) this.c).j);
            case 18:
                com.vk.im.ui.components.dialogs_list.c cVar2 = (com.vk.im.ui.components.dialogs_list.c) this.c;
                ndw ndwVar = (ndw) obj;
                com.vk.im.ui.components.dialogs_list.e eVar = cVar2.h;
                if (ndwVar instanceof ndw.a) {
                    eVar.w = pn00.n(eVar.w, ((ndw.a) ndwVar).a);
                } else {
                    if (!epx.f(ndwVar, ndw.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.w = jgp.b;
                }
                cVar2.B(cVar2);
                return s3q0.a;
            case 19:
                return Boolean.valueOf(epx.f(((VideoDiscoverGridItem) obj).j.k.r1(), ((hxr0) ((bwr0) this.c)).a.r1()));
            case 20:
                pop popVar = (pop) this.c;
                ((Integer) obj).getClass();
                popVar.zn(1.0f);
                int intValue = ((Number) popVar.H.getValue()).intValue();
                ImageView imageView = popVar.s;
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    layoutParams.width = intValue;
                    layoutParams.height = intValue;
                }
                ImageView imageView2 = popVar.s;
                if (imageView2 != null) {
                    imageView2.requestLayout();
                }
                NestedScrollView nestedScrollView2 = popVar.m;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.post(new hv2(popVar, i2));
                }
                return s3q0.a;
            case 21:
                u1c0 u1c0Var = (u1c0) obj;
                return Boolean.valueOf(u1c0Var.g() && epx.f(u1c0Var.b, (NewsEntry) this.c));
            case 22:
                bcq bcqVar = (bcq) this.c;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                if (epx.f(o25.a().c(), extendedUserProfile.a.c)) {
                    bcqVar.b = extendedUserProfile;
                } else {
                    bcqVar.c.put(extendedUserProfile.a.c, extendedUserProfile);
                }
                return s3q0.a;
            case 23:
                ((m6r) this.c).a.a(new com.vk.newsfeed.posting.impl.domain.model.f(PlacesLoadingState.Error));
                return s3q0.a;
            case 24:
                return new zs90((ViewGroup) obj, ((txr) this.c).j);
            case 25:
                v1z v1zVar = (v1z) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) v1zVar.b).setValue(bool);
                return s3q0.a;
            case 26:
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) this.c;
                FriendsImportFragment.c cVar3 = (FriendsImportFragment.c) obj;
                int i8 = FriendsImportFragment.a0;
                return !cVar3.b.isEmpty() ? rsg0.T(new aq(friendsImportFragment.W, cVar3.b, cVar3.a, true)) : io.reactivex.rxjava3.core.q.T(new aq.b(0));
            case 27:
                ((k6u) this.c).T(y6u.e.b.b);
                return s3q0.a;
            case 28:
                ((uhu) this.c).X0(new x89.b(d370.v((Throwable) obj)));
                return s3q0.a;
            default:
                UIBlock uIBlock = ((UIBlockList) this.c).y.get(((Integer) obj).intValue());
                return new gpi(uIBlock.e, uIBlock.d);
        }
    }
}
