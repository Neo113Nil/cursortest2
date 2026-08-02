package xsna;

import android.app.Activity;
import android.view.GestureDetector;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.group.delegate.SimpleGroupItemDelegate;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.motion.touches.a.b;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vkontakte.android.R;
import xsna.ath0;
import xsna.ekk0;
import xsna.hyk0;
import xsna.k840;
import xsna.o880;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bbb0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bbb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        EditText editView;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                cbb0 cbb0Var = (cbb0) obj;
                int i2 = cbb0.q1;
                MusicPlaybackLaunchContext eo = cbb0.eo(cbb0Var.requireArguments());
                if (eo == null) {
                    eo = MusicPlaybackLaunchContext.d;
                }
                return new j7b0(eo, cbb0.co(cbb0Var.requireArguments()), (ModernPlaylistModel) cbb0Var.k1.getValue(), (u2b0) cbb0Var.j1.getValue(), k840.a.d());
            case 1:
                PodcastCatalogRootVh podcastCatalogRootVh = (PodcastCatalogRootVh) obj;
                vtk0.d().d(podcastCatalogRootVh.R(), new lgb0(podcastCatalogRootVh));
                return s3q0.a;
            case 2:
                return ((rbc0) obj).a.getString("author_name");
            case 3:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                return ((PostponedPostsFragment) obj).getActivity();
            case 4:
                return ((MarketComponent) ((k7m) m7m.f((pid0) obj)).a(fpf0.a(MarketComponent.class))).lc().a();
            case 5:
                tmq.a().e((Activity) obj);
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                return ((ReactionsFeedFragment) obj).eo();
            case 7:
                return ((c6f0) obj).b.b();
            case 8:
                qof0 qof0Var = (qof0) obj;
                xnf0 xnf0Var = qof0.y;
                if (xnf0Var != null) {
                    return xnf0Var;
                }
                xnf0 xnf0Var2 = (xnf0) qof0.z.invoke(qof0Var.a, qof0Var.a(), qof0Var.d(), qof0Var.e());
                qof0.y = xnf0Var2;
                return xnf0Var2;
            case 9:
                return (TextView) ((prf0) obj).a.findViewById(R.id.nativeads_advertising_text);
            case 10:
                return ((RepliesView) obj).f;
            case 11:
                gzs gzsVar = (gzs) ((zak0) ((rgg0) obj).c).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                int i3 = SearchCommunitiesOnMapFragment.e0;
                SearchMapPreviewStateWrapper a = ((SearchCommunitiesOnMapFragment) obj).jo().a();
                if (a != null) {
                    return (hyk0.a) SearchMapPreviewStateWrapper.c.get(a.b);
                }
                return null;
            case 13:
                return ((ath0.a) obj).j;
            case 14:
                VkSearchView vkSearchView = ((afi0) obj).i;
                if (vkSearchView == null || (editView = vkSearchView.getEditView()) == null) {
                    return null;
                }
                return new io.reactivex.rxjava3.internal.operators.observable.r1(bwt0.f(editView));
            case 15:
                return ((PostingComponent) ((k7m) m7m.f((e3j0) obj)).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 16:
                VkSearchView vkSearchView2 = (VkSearchView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_search_input);
                orl.a(vkSearchView2);
                return vkSearchView2;
            case 17:
                return (ucg0) ((ShowcaseVideoAutoPlayViewHolder) obj).J.getValue();
            case 18:
                com.vk.catalog2.common.ui.holders.group.a.c(((SimpleGroupItemDelegate) obj).o, false);
                return s3q0.a;
            case 19:
                SingleClipV2Holder singleClipV2Holder = (SingleClipV2Holder) obj;
                singleClipV2Holder.H = p880.a(singleClipV2Holder.H, false, 0, 2);
                singleClipV2Holder.b7(new o880.b(false));
                return s3q0.a;
            case 20:
                return new r5k0(((SmartCropFragmentInternalComponent) obj).a.a);
            case 21:
                ekk0.a aVar = ((SpeedView) obj).t;
                if (aVar != null) {
                    ekk0.this.f.b();
                }
                return s3q0.a;
            case 22:
                return new mvk0((nvk0) obj);
            case 23:
                return ((StoryViewerComponent) ((k7m) m7m.f((ctl0) obj)).a(fpf0.a(StoryViewerComponent.class))).b();
            case 24:
                int i4 = StoryMediaPickerFragment.d0;
                return ((GalleryPickerComponent) m7m.d((StoryMediaPickerFragment) obj).mo408a(fpf0.a(GalleryPickerComponent.class))).jf();
            case 25:
                ((nwk) obj).invoke();
                return s3q0.a;
            case 26:
                return ((g7n0) obj).d;
            case 27:
                com.vk.video.ui.discovery.minimizable.motion.touches.a aVar2 = (com.vk.video.ui.discovery.minimizable.motion.touches.a) obj;
                GestureDetector gestureDetector = new GestureDetector(aVar2.a, aVar2.new b());
                gestureDetector.setIsLongpressEnabled(false);
                return gestureDetector;
            case 28:
                int i5 = zfp0.x1;
                return ((MusicKidsModeComponent) m7m.d((zfp0) obj).a(fpf0.a(MusicKidsModeComponent.class))).n();
            default:
                qcy<Object>[] qcyVarArr3 = ipp0.m1;
                return (VideoGrowthComponent) m7m.d((ipp0) obj).a(fpf0.a(VideoGrowthComponent.class));
        }
    }
}
