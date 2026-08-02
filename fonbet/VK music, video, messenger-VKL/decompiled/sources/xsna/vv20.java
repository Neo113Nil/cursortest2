package xsna;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.impl.ctabutton.di.ProductTileCtaButtonComponentImpl;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.imageloader.view.VKImageView;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.stories.StorySettingsActivity;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.TreeSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vv20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vv20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xsna.jv20] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((wv20) this.c).b.G8();
                return s3q0.a;
            case 1:
                return ((com.vk.im.ui.components.msg_list.a) this.c).A.d.t().r();
            case 2:
                ((vm30) this.c).u0 = null;
                return s3q0.a;
            case 3:
                ((MusicHidingToolbarVh) this.c).x.a();
                return s3q0.a;
            case 4:
                VKImageView vKImageView = (VKImageView) ((a850) this.c).findViewById(R.id.ivTrack);
                vKImageView.getHierarchy().u(RoundingParams.b(a850.g));
                return vKImageView;
            case 5:
                TreeSet treeSet = new TreeSet(((mh50) this.c).b);
                rl3.p0(new kh50[0], treeSet);
                return treeSet;
            case 6:
                NewsfeedMappersComponentImpl newsfeedMappersComponentImpl = (NewsfeedMappersComponentImpl) this.c;
                nwy nwyVar = newsfeedMappersComponentImpl.e;
                qcy<Object> qcyVar = NewsfeedMappersComponentImpl.o[1];
                return new ru0((uu0) nwyVar.c(), ((AdPixelStatsComponent) newsfeedMappersComponentImpl.c.getValue()).Ed());
            case 7:
                return (StoriesComponent) ((k7m) m7m.f((j070) this.c)).a(fpf0.a(StoriesComponent.class));
            case 8:
                return new com.vk.im.ui.formatters.a(((yk70) this.c).b);
            case 9:
                return ((xk80) this.c).f();
            case 10:
                gzs<s3q0> gzsVar = ((ik90) this.c).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((VkPeopleSearchParams) ((zak0) ((lv90) this.c).l1).getValue()).c != 1);
            case 12:
                j9a0 j9a0Var = (j9a0) this.c;
                j9a0Var.e.setSpanCount(an10.b((j9a0Var.h != null ? r2 : null).getMeasuredWidth() / j9a0Var.b.h()));
                return s3q0.a;
            case 13:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) this.c;
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                return new bdb0(new sdb0(new xga(), new uft0(), playlistScreenFragmentInternalComponent.Ef().d(), playlistScreenFragmentInternalComponent.i, playlistScreenFragmentInternalComponent.Ff().J()));
            case 14:
                PodcastEpisodesListFragment podcastEpisodesListFragment = (PodcastEpisodesListFragment) this.c;
                int i = PodcastEpisodesListFragment.d0;
                return ((BridgeComponent) m7m.d(podcastEpisodesListFragment).a(fpf0.a(BridgeComponent.class))).F();
            case 15:
                return ((NewsfeedRouterComponent) ((k7m) m7m.f((y1c0) this.c)).a(fpf0.a(NewsfeedRouterComponent.class))).l0();
            case 16:
                ((h4d0) this.c).e.e();
                return s3q0.a;
            case 17:
                return ((MarketComponent) ((rkd0) this.c).e.getValue()).U1();
            case 18:
                ProductTileCtaButtonComponentImpl productTileCtaButtonComponentImpl = (ProductTileCtaButtonComponentImpl) this.c;
                CartComponent cartComponent = productTileCtaButtonComponentImpl.a;
                fy9 f8 = cartComponent.f8();
                MarketComponent marketComponent = productTileCtaButtonComponentImpl.c;
                return new lsd0(f8, marketComponent.rc(), marketComponent.U1(), productTileCtaButtonComponentImpl.b.p(), new yd10(), new nw00(), marketComponent.Ob(), cartComponent.S3());
            case 19:
                ReactionListController reactionListController = (ReactionListController) this.c;
                Integer num = reactionListController.f.f;
                return Integer.valueOf(num != null ? num.intValue() : e3m.a(R.dimen.vkim_legacy_reactions_items_list_padding, reactionListController.a.getContext()));
            case 20:
                return Integer.valueOf(((pef0) this.c).getBindingAdapterPosition());
            case 21:
                rah0 rah0Var = (rah0) this.c;
                if (!rah0Var.b()) {
                    return s3q0.a;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    rah0Var.e(null);
                }
                rah0Var.b.l(false, false);
                rah0Var.k = false;
                rah0Var.f.onNext(Boolean.FALSE);
                rah0Var.a.H();
                return s3q0.a;
            case 22:
                ((CatalogPaginatedListViewHolder) this.c).s();
                return s3q0.a;
            case 23:
                ((io.reactivex.rxjava3.core.b) this.c).onComplete();
                return s3q0.a;
            case 24:
                SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
                int i2 = SettingsListFragment.X0;
                return ((VkClientMultiAccountComponent) m7m.d(settingsListFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 25:
                bkk0 bkk0Var = (bkk0) this.c;
                try {
                    dhr0.a.getClass();
                    AppCompatTextView appCompatTextView = new AppCompatTextView(new lpj(dhr0.E(), R.style.LiveDescription));
                    appCompatTextView.setMaxLines(2);
                    appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(bkk0Var.F, 1073741824), 0);
                    return appCompatTextView;
                } catch (Throwable unused) {
                    return null;
                }
            case 26:
                StickersRecyclerView stickersRecyclerView = (StickersRecyclerView) this.c;
                int i3 = StickersRecyclerView.w;
                stickersRecyclerView.i();
                return s3q0.a;
            case 27:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                int i4 = StoryMediaPickerFragment.d0;
                storyMediaPickerFragment.ko(null);
                return s3q0.a;
            case 28:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) this.c;
                int i5 = StorySettingsActivity.P;
                return ((NewsFeedComponent) m7m.a(storySettingsActivity).a(fpf0.a(NewsFeedComponent.class))).l0();
            default:
                return ((StoryViewerComponent) ((k7m) m7m.c(((uov) ((ykm0) this.c).a).getView())).a(fpf0.a(StoryViewerComponent.class))).l9();
        }
    }
}
