package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.QuestionnaireVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.ui.d;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.posting.presentation.video.VideoPickerFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.l2i0;
import xsna.qfa0;
import xsna.ram0;
import xsna.utq0.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ajd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ajd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        GetWebViewBridgeUseCase initialize$lambda$220$lambda$120;
        int i;
        int i2 = 1;
        switch (this.b) {
            case 0:
                d.a aVar = ((com.vk.ecomm.market.good.ui.e) this.c).m;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 1:
                return ((ClipsInternalNpsComponent) ((QuestionnaireVh) this.c).n.getValue()).ua();
            case 2:
                p6f0 p6f0Var = (p6f0) this.c;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setStartDelay(133L);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(new pkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f));
                ofFloat.addUpdateListener(new tez(p6f0Var, i2));
                return ofFloat;
            case 3:
                l2i0 l2i0Var = (l2i0) ((l2i0.a) this.c).m;
                if (l2i0Var != null) {
                    l2i0Var.g.invoke();
                }
                return s3q0.a;
            case 4:
                ((s8i0) this.c).r.invoke(Boolean.valueOf(!epx.f(r0.h, r0.s)));
                return s3q0.a;
            case 5:
                initialize$lambda$220$lambda$120 = ServiceProvider.initialize$lambda$220$lambda$120((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$120;
            case 6:
                return (LinearLayout) ((com.vk.sharing.core.view.f) this.c).findViewById(R.id.sharing_send_container);
            case 7:
                return new hvk0((uvx) this.c);
            case 8:
                Context context = (Context) this.c;
                urw f = xwk.d().f();
                int i3 = BonusCatalogFragment.f0;
                f.a(context, BonusCatalogFragment.b.a(), false);
                return s3q0.a;
            case 9:
                return new b4b0(((VkOnboardingComponent) ((k7m) m7m.c((jfl0) this.c)).a(fpf0.a(VkOnboardingComponent.class))).p3());
            case 10:
                PublishedKind publishedKind = (PublishedKind) this.c;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    return s3q0.a;
                }
                Window window = b.getWindow();
                if (window == null) {
                    return s3q0.a;
                }
                TypedValue typedValue = krv0.a;
                Context s = krv0.b == null ? null : dhr0.s();
                if (s == null) {
                    return s3q0.a;
                }
                ikv0.a aVar2 = new ikv0.a(s);
                int i4 = ram0.a.$EnumSwitchMapping$0[publishedKind.ordinal()];
                if (i4 == 1) {
                    i = R.string.story_clip_repost_failed;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.story_publish_failed;
                }
                aVar2.u = new ikv0.d(new ikv0.d.c(s.getString(i)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar2.o = Integer.valueOf(iah0.a(58));
                aVar2.b().d(window);
                return s3q0.a;
            case 11:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return new xq60(new u110(suggestedPostsFragment, 20), new in60(suggestedPostsFragment, 25), new lva0(suggestedPostsFragment, 26), new su80(suggestedPostsFragment, 29));
            case 12:
                return (AlbumsRecyclerPaginatedView) ((Activity) this.c).findViewById(R.id.albums_recycler);
            case 13:
                Boolean bool = (Boolean) ((mtk0) this.c).getValue();
                bool.booleanValue();
                return bool;
            case 14:
                ((etv0) this.c).b(false);
                return s3q0.a;
            case 15:
                return ((utq0) this.c).new a();
            case 16:
                return new AtomicReference(fkq0.d((UserId) ((AtomicReference) ((vxq0) this.c).r.getValue()).get()) ? "wall_user" : "wall_group");
            case 17:
                return ((OnboardingComponent) ((k7m) m7m.f((VideoAlbumVh) this.c)).a(fpf0.a(OnboardingComponent.class))).Yd();
            case 18:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
                int i5 = VideoCatalogFragment.l0;
                return ((CatalogInfoPopupComponent) m7m.d(videoCatalogFragment).mo408a(fpf0.a(CatalogInfoPopupComponent.class))).M5();
            case 19:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.c;
                int i6 = VideoCatalogRootVh.M0;
                return ((CastComponent) ((k7m) m7m.f(videoCatalogRootVh)).a(fpf0.a(CastComponent.class))).cd();
            case 20:
                VideoContainerActivity videoContainerActivity = (VideoContainerActivity) this.c;
                int i7 = VideoContainerActivity.B;
                return ((VideoPip2Component) videoContainerActivity.x.getValue()).sd();
            case 21:
                VideoPickerFragment videoPickerFragment = (VideoPickerFragment) this.c;
                int i8 = VideoPickerFragment.V;
                UserId userId = (UserId) videoPickerFragment.requireArguments().getParcelable("user_id_video");
                return userId == null ? UserId.d : userId;
            case 22:
                Context context2 = ((aht0) this.c).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context2));
            case 23:
                z8u0 z8u0Var = (z8u0) this.c;
                qfa0 F4 = ((PhotosComponent) ((k7m) m7m.f(z8u0Var)).a(fpf0.a(PhotosComponent.class))).F4();
                qfa0.h e = F4.e();
                UiTracker uiTracker = UiTracker.a;
                e.f(UiTracker.c());
                F4.e().k(z8u0Var.g);
                return F4;
            case 24:
                return ((ggu0) this.c).j();
            case 25:
                WriteBar writeBar = (WriteBar) this.c;
                int i9 = WriteBar.h0;
                return (ImageView) writeBar.findViewById(R.id.writebar_fullscreen_button);
            default:
                return ((c1y0) this.c).b().getWriteBarAttach();
        }
    }

    public /* synthetic */ ajd0(ram0 ram0Var, PublishedKind publishedKind) {
        this.b = 10;
        this.c = publishedKind;
    }
}
