package xsna;

import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastListPage;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.music.view.vkmix.models.MusicMixMood;
import com.vk.music.view.vkmix.view.MusicMixAnimationView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.stickers.views.RLottieImageView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.c610;
import xsna.s270;
import xsna.xn50;
import xsna.y5h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lxz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lxz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                nxz nxzVar = (nxz) this.c;
                lzz lzzVar = nxzVar.k;
                lzzVar.e(nxzVar.Y0());
                lzzVar.i((List) obj, false);
                break;
            case 1:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                SwipeRefreshLayout swipeRefreshLayout = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(true);
                NestedScrollView nestedScrollView = marketAllReviewsFragment.U;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, false);
                }
                RecyclerView recyclerView = marketAllReviewsFragment.R;
                bwt0.p0(recyclerView != null ? recyclerView : null, true);
                VkSpinner vkSpinner = marketAllReviewsFragment.S;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, false);
                }
                break;
            case 2:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) this.c;
                pno0 pno0Var = (pno0) obj;
                int i = MarketEditAlbumGoodsFragment.c1;
                marketEditAlbumGoodsFragment.S0 = true ^ (pno0Var.d().length() == 0);
                marketEditAlbumGoodsFragment.X0 = pno0Var.d().toString();
                marketEditAlbumGoodsFragment.v0.clear();
                marketEditAlbumGoodsFragment.qo();
                break;
            case 3:
                o4g0 o4g0Var = (o4g0) obj;
                e2g0 e2g0Var = ((MarketItemReviewsFragment) this.c).R;
                if (e2g0Var != null) {
                    e2g0Var.p(o4g0Var.c(), o4g0Var.d(), o4g0Var.a(), o4g0Var.b());
                }
                break;
            case 4:
                ((x510) this.c).T(new c610.a((Throwable) obj));
                break;
            case 5:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                List<e0l0> list = (List) obj;
                ChatFragment.j jVar = aVar.s;
                if (jVar != null) {
                    imv imvVar = ChatFragment.this.J0;
                    (imvVar != null ? imvVar : null).i(list);
                }
                com.vk.im.ui.components.msg_list.c cVar = aVar.O0;
                cVar.getClass();
                cVar.l(true, new com.vk.movika.sdk.base.presenter.c(16, cVar, list));
                break;
            case 6:
                rx30 rx30Var = (rx30) this.c;
                int i2 = frr0.p;
                break;
            case 7:
                ((MusicMixAnimationView) this.c).setMood((MusicMixMood) obj);
                break;
            case 8:
                ((MusicPageInfoBlockNewVh) this.c).p = null;
                break;
            case 9:
                yj50 yj50Var = (yj50) this.c;
                yj50Var.c.H9(yj50Var, (yn50) obj);
                break;
            case 10:
                ((SwipeDrawableRefreshLayout) this.c).setProgressDrawableFactory((d2e0) obj);
                break;
            case 11:
                t270 t270Var = (t270) this.c;
                int i3 = t270.j1;
                s270.b bVar = s270.b.b;
                t270Var.getClass();
                xn50.a.c(t270Var, bVar);
                break;
            case 12:
                zvj.c((hpj) this.c, null);
                break;
            case 13:
                yp80 yp80Var = (yp80) this.c;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                u1a0 u1a0Var = (u1a0) this.c;
                u1a0Var.y1 = true;
                vdx0 vdx0Var = e370.e;
                rfn0 t = (vdx0Var != null ? vdx0Var : null).t();
                mgn0 mgn0Var = dgn0.a;
                u1a0Var.w1.b(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(t.a(BuildInfo.j() && !BuildInfo.e()), new hu50(new px30(u1a0Var, 14), 6)), new jg4(u1a0Var, 2)).subscribe(new xj50(new q130(u1a0Var, 12), 3)));
                break;
            case 17:
                ala0 ala0Var = (ala0) this.c;
                ((zak0) ala0Var.m).setValue((BadgeAlignment) ala0Var.d.get((String) obj));
                break;
            case 18:
                bi20 bi20Var = (bi20) this.c;
                break;
            case 19:
                com.vk.music.podcast.impl.ui.list.a aVar2 = (com.vk.music.podcast.impl.ui.list.a) this.c;
                PodcastListPage podcastListPage = (PodcastListPage) obj;
                mzp0 mzp0Var = aVar2.b;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                PodcastEpisodesListFragment podcastEpisodesListFragment = aVar2.c;
                podcastEpisodesListFragment.X.clear();
                TextView textView = podcastEpisodesListFragment.V;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(podcastListPage.b);
                VKImageView vKImageView = podcastEpisodesListFragment.U;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                vKImageView.load(podcastListPage.c);
                TextView textView2 = podcastEpisodesListFragment.W;
                if (textView2 == null) {
                    textView2 = null;
                }
                bwt0.p0(textView2, true);
                ArrayList<MusicTrack> arrayList = podcastListPage.d;
                VKList vKList = arrayList instanceof VKList ? (VKList) arrayList : null;
                if (vKList == null) {
                    break;
                }
                break;
            case 20:
                l6c0 l6c0Var = (l6c0) this.c;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (r2 = (GroupsGroupFullDto) j5g.a0(d)) != null) {
                    l6c0Var.m.getClass();
                    break;
                }
                break;
            case 21:
                ((rzq0) obj).b(((lcd0) this.c).b, com.vk.newsfeed.posting.privacy_picker.presentation.c.b);
                break;
            case 22:
                break;
            case 23:
                ((rbe0) this.c).b.invoke(new PostingAction.Navigation.Close(false, false, false, 4, null));
                break;
            case 24:
                RLottieImageView rLottieImageView = (RLottieImageView) this.c;
                int i4 = RLottieImageView.l;
                String str2 = ((AnimatedStickerInfo) obj).e;
                if (str2 != null) {
                    rLottieImageView.clear();
                    rLottieImageView.b = str2;
                    if (rLottieImageView.d > 0 && rLottieImageView.getMeasuredHeight() > 0 && (str = rLottieImageView.b) != null) {
                        rLottieImageView.W(rLottieImageView.getMeasuredWidth(), rLottieImageView.getMeasuredHeight(), str);
                    }
                    rLottieImageView.invalidate();
                    rLottieImageView.post(new yv6(rLottieImageView, 5));
                }
                break;
            case 25:
                ((c7h0) this.c).C(y5h0.g.b);
                break;
            case 26:
                int i5 = r9i0.j1;
                ((ixi0) this.c).a((SessionRoomId.Room) obj);
                break;
            case 27:
                ((p3h) this.c).invoke();
                break;
            case 28:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                cVar2.s = false;
                cVar2.r = null;
                cVar2.n(false);
                break;
            default:
                ((com.vk.sharing.core.view.l) this.c).setToggleFaveActionIsEnabled(true);
                break;
        }
        return s3q0.a;
    }
}
