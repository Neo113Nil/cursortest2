package xsna;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.catalog2.feature.music.holders.vkmix.SimpleMusicVkMixVh;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryProviderComponent;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.user.UserProfile;
import com.vk.fave.di.FaveComponent;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vk.media.MediaUtils;
import com.vk.music.search.history.SearchHistoryModel;
import com.vk.network.kbh.ShowModalDecision;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.pushes.PushOpenActivity;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.mih0;
import xsna.u440;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class p1d0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1d0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ee errorView;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((q1d0) obj).q.f();
            case 1:
                cr4 cr4Var = ((d7d0) obj).D;
                return new lm4(cr4Var.a(), cr4Var.c(), null, 12);
            case 2:
                ((jmd0) obj).dismiss();
                return s3q0.a;
            case 3:
                return ((FaveComponent) ((zqd0) obj).a.getValue()).S8();
            case 4:
                int i2 = PushOpenActivity.f;
                ((PushOpenActivity) obj).Q1();
                return s3q0.a;
            case 5:
                ((UserProfile) obj).k = true;
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var == null) {
                    return null;
                }
                dw20Var.Pn(-5);
                return s3q0.a;
            case 6:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((Ref$BooleanRef) obj).element);
            case 8:
                SearchAuthorsListVh.a((SearchAuthorsListVh) obj);
                return s3q0.a;
            case 9:
                int i3 = SearchDocumentsListFragment.h0;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = ((SearchDocumentsListFragment) obj).T;
                if (vkRecyclerPaginatedView != null && (errorView = vkRecyclerPaginatedView.getErrorView()) != null) {
                    errorView.a();
                }
                return s3q0.a;
            case 10:
                SearchHistoryProviderComponent searchHistoryProviderComponent = (SearchHistoryProviderComponent) obj;
                gvh0<SearchHistoryModel> Mb = searchHistoryProviderComponent.b.Mb();
                fvh0 fvh0Var = searchHistoryProviderComponent.a;
                return new yp70(Mb, fvh0Var.a.b.a, fvh0Var.b);
            case 11:
                int i4 = SelectAlbumBottomSheet.p1;
                return ((PhotosComponent) ((k7m) m7m.f((SelectAlbumBottomSheet) obj)).a(fpf0.a(PhotosComponent.class))).i3();
            case 12:
                return (ljo0) ((jci0) obj).e.c;
            case 13:
                return ((vcy) ((List) obj).get(0)).k();
            case 14:
                SimpleMusicVkMixVh simpleMusicVkMixVh = (SimpleMusicVkMixVh) obj;
                LottieAnimationView lottieAnimationView = simpleMusicVkMixVh.n;
                if (lottieAnimationView == null) {
                    lottieAnimationView = null;
                }
                if (!lottieAnimationView.f.m()) {
                    LottieAnimationView lottieAnimationView2 = simpleMusicVkMixVh.n;
                    (lottieAnimationView2 != null ? lottieAnimationView2 : null).m0();
                }
                return s3q0.a;
            case 15:
                StickersBonusBalance stickersBonusBalance = (StickersBonusBalance) obj;
                float f = stickersBonusBalance.b / stickersBonusBalance.e;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 16:
                StoryCameraActivity storyCameraActivity = (StoryCameraActivity) obj;
                mzp0 mzp0Var = storyCameraActivity.B;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                storyCameraActivity.D.a();
                return s3q0.a;
            case 17:
                u440.b bVar = ((e2m0) obj).a;
                return new MediaUtils.d(bVar.b(), bVar.a());
            case 18:
                Context context = ((wjm0) obj).b.getContext();
                HashSet hashSet = iah0.a;
                return Integer.valueOf(fnj.d(context) ? 3 : 2);
            case 19:
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) obj).O;
                for (int i5 = 0; i5 < storiesViewPager.getChildCount(); i5++) {
                    if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i5)).setAudioMuted(false);
                    }
                }
                return s3q0.a;
            case 20:
                i5n0 i5n0Var = ((r4n0) obj).f;
                return new Result(i5n0Var.a.f(new txf0(), new kjj0(i5n0Var.b)));
            case 21:
                lcn0 lcn0Var = (lcn0) obj;
                kto0 h6 = lcn0Var.h6();
                Context context2 = lcn0Var.itemView.getContext();
                h6.getClass();
                return dhr0.M() ? context2.getDrawable(R.drawable.vk_icon_verified_dark_48) : context2.getDrawable(R.drawable.vk_icon_verified_light_48);
            case 22:
                ((kq2) obj).g = false;
                return s3q0.a;
            case 23:
                ((fuv0) obj).close();
                return s3q0.a;
            case 24:
                Integer num = ((mih0.q) obj).d;
                if (num != null) {
                    return new BaseBadgeHolder.a.C0709a(num.intValue(), R.attr.vk_ui_icon_contrast);
                }
                return null;
            case 25:
                return "UnstableNetworkDetector: decision is " + ((ShowModalDecision) obj);
            case 26:
                return new rmq0(((ynq0) obj).e);
            case 27:
                return new r4r0(((UxPollsComponentImpl) obj).a.a);
            case 28:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                return Boolean.valueOf(videoAutoPlay.e.k(videoAutoPlay.u));
            default:
                return (VideoAutoPlaySeekBarView2) ((VideoAutoPlaySeekBarLayout2) obj).findViewById(R.id.seek_bar);
        }
    }
}
