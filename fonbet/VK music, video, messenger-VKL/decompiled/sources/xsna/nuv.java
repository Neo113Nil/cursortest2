package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.ads.api.di.AdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.fave.di.FaveComponent;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import xsna.sf10;
import xsna.xn50;
import xsna.zq10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nuv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nuv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        switch (this.b) {
            case 0:
                return quv.f((quv) this.c);
            case 1:
                ImRequestsFragment imRequestsFragment = (ImRequestsFragment) this.c;
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                return new bzb0(imRequestsFragment.requireContext());
            case 2:
                return (Parcelable) this.c;
            case 3:
                return ((StoryViewerComponent) ((k7m) m7m.f((zex) this.c)).a(fpf0.a(StoryViewerComponent.class))).z3();
            case 4:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                int i = MarketAllReviewsFragment.d0;
                a.p pVar = a.p.b;
                marketAllReviewsFragment.getClass();
                xn50.a.c(marketAllReviewsFragment, pVar);
                return s3q0.a;
            case 5:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) this.c;
                qcy<Object>[] qcyVarArr2 = MarketItemReviewRepliesFragment.b0;
                Bundle arguments = marketItemReviewRepliesFragment.getArguments();
                if (arguments != null) {
                    String l = fpf0.a(MarketItemReviewRepliesArgs.class).l();
                    if (l == null) {
                        l = "";
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable(l, MarketItemReviewRepliesArgs.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        ?? parcelable5 = arguments.getParcelable(l);
                        parcelable = parcelable5 instanceof MarketItemReviewRepliesArgs ? parcelable5 : null;
                    }
                    r4 = (MarketItemReviewRepliesArgs) parcelable;
                }
                gxh D = ((DataRepositoryComponent) ((k7m) m7m.f(marketItemReviewRepliesFragment)).a(fpf0.a(DataRepositoryComponent.class))).D();
                iid iidVar = new iid(((AttachmentMappersComponent) m7m.d(marketItemReviewRepliesFragment).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3());
                return new g310(r4, new hoz(new o210(iidVar), new qob(iidVar)), new fy2(D), ((BridgeComponent) ((k7m) m7m.f(marketItemReviewRepliesFragment)).a(fpf0.a(BridgeComponent.class))).s());
            case 6:
                return new sf10.b((sf10) this.c);
            case 7:
                return new zq10.a((zq10) this.c);
            case 8:
                return ((VideoRestrictedUserActionsComponent) ((k7m) m7m.c((k120) this.c)).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 9:
                return Boolean.valueOf(((pa20) this.c).A());
            case 10:
                izs<? super MoreLessFeedbackView.FeedbackResult, s3q0> izsVar = ((MoreLessFeedbackView) this.c).d;
                if (izsVar != null) {
                    izsVar.invoke(MoreLessFeedbackView.FeedbackResult.MORE);
                }
                return s3q0.a;
            case 11:
                return go9.b("Cannot delete file with path ", (String) this.c);
            case 12:
                zf40 zf40Var = ((com.vk.catalog2.feature.music.configuration.b) this.c).P;
                return Boolean.valueOf(zf40Var != null ? zf40Var.c() : false);
            case 13:
                return ((PlayerUIComponent) ((k7m) m7m.f((ni40) this.c)).a(fpf0.a(PlayerUIComponent.class))).ub();
            case 14:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) this.c;
                vtk0.d().d(musicClipsSelectorCatalogRootVh.R(), new com.vk.catalog2.common.ui.mvp.holder.stories.a(musicClipsSelectorCatalogRootVh));
                return s3q0.a;
            case 15:
                ((wh50) this.c).setValue(Boolean.FALSE);
                return s3q0.a;
            case 16:
                return (BridgeComponent) ((mo60) this.c).c().a(fpf0.a(BridgeComponent.class));
            case 17:
                ((dw20) this.c).hide();
                return s3q0.a;
            case 18:
                return "onPlayerStartRendered() - wasFirstFrameRendered= " + ((wl80) this.c).T;
            case 19:
                ((ym90) this.c).b = null;
                return s3q0.a;
            case 20:
                PhotoTagsFragment photoTagsFragment = (PhotoTagsFragment) this.c;
                int i2 = PhotoTagsFragment.U;
                Parcelable parcelable6 = photoTagsFragment.requireArguments().getParcelable("uid");
                if (parcelable6 != null) {
                    return (UserId) parcelable6;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 21:
                ((com.vk.im.popup.b) this.c).c.b();
                return s3q0.a;
            case 22:
                return ((AdsComponent) ((k7m) m7m.f((y1c0) this.c)).mo408a(fpf0.a(AdsComponent.class))).h9();
            case 23:
                PostFragment postFragment = (PostFragment) this.c;
                if (!postFragment.a0()) {
                    h3p0.b(postFragment);
                }
                return s3q0.a;
            case 24:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                String[] strArr = PostViewFragment.T0;
                return ((AttachmentMappersComponent) m7m.d(postViewFragment).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 25:
                Bundle bundle = ((rbc0) this.c).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = bundle.getParcelable("post_data_for_editing", PostEditableData.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    ?? parcelable7 = bundle.getParcelable("post_data_for_editing");
                    parcelable3 = (PostEditableData) (parcelable7 instanceof PostEditableData ? parcelable7 : null);
                }
                return (PostEditableData) parcelable3;
            case 26:
                ikc0 ikc0Var = (ikc0) this.c;
                return new umc0(ikc0Var, ikc0Var, ikc0Var.h.b);
            case 27:
                return (ibc0) ((enc0) this.c).h.invoke();
            case 28:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr3 = PostponedPostsFragment.q0;
                return postponedPostsFragment.go();
            default:
                return ((FaveComponent) ((k7m) m7m.f((pid0) this.c)).mo408a(fpf0.a(FaveComponent.class))).xf();
        }
    }
}
