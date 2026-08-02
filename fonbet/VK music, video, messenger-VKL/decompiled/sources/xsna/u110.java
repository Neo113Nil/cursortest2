package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.R;
import xsna.cqc0;
import xsna.gfp0;
import xsna.m5u;
import xsna.mpr0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u110 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u110(SearchEntityVideoPlaylistAnswerVh searchEntityVideoPlaylistAnswerVh, VideoAlbum videoAlbum) {
        this.b = 16;
        this.c = videoAlbum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.ifx0] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        a210 a210Var;
        Parcelable parcelable;
        Object parcelable2;
        GetRequestPolicy initialize$lambda$220$lambda$124;
        int i = this.b;
        int i2 = 6;
        Object obj = this.c;
        switch (i) {
            case 0:
                v110 v110Var = (v110) obj;
                a210 a210Var2 = v110Var.p;
                a210Var = a210Var2 != null ? a210Var2 : null;
                MarketFavable marketFavable = new MarketFavable(a210Var.b, a210Var.c, null, v110Var.l, a210Var.k);
                isq.b(v110Var.o, v110Var.q.getContext(), marketFavable, null, new n87(marketFavable, v110Var, a210Var, 3), new ysd(marketFavable, v110Var, a210Var, 7), true, null, null, 448);
                return s3q0.a;
            case 1:
                int i3 = MediaPickerFragment.Q;
                Bundle requireArguments = ((MediaPickerFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("args", MediaPickerFragmentArguments.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("args");
                    parcelable = (MediaPickerFragmentArguments) (parcelable3 instanceof MediaPickerFragmentArguments ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (MediaPickerFragmentArguments) parcelable;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                VkImage vkImage = new VkImage(((jp20) obj).a, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ?? r2 = e370.c;
                a210Var = r2 != 0 ? r2 : null;
                float f = jp20.c;
                int m = krv0.m(R.attr.vk_ui_image_border_alpha, vkImage.getContext());
                a210Var.getClass();
                zq70.E(vkImage, 4.9d, f, m);
                vkImage.setPlaceholderImage(new enk0(4.9d, krv0.m(R.attr.vk_ui_icon_medium, vkImage.getContext())));
                return vkImage;
            case 3:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 4:
                return Boolean.valueOf(((gfp0) obj) instanceof gfp0.b.a);
            case 5:
                etv0 etv0Var = ((jd80) obj).d;
                if (etv0Var != null) {
                    etv0Var.b(false);
                }
                return s3q0.a;
            case 6:
                OrderFragment orderFragment = (OrderFragment) obj;
                return new pu80((sdz) orderFragment.T.getValue(), ((CartComponent) orderFragment.N.getValue()).e8());
            case 7:
                fxc0.B().d((VideoFile) obj);
                return s3q0.a;
            case 8:
                int i4 = PhotoFlowFragment.m0;
                return (BridgeComponent) m7m.d((PhotoFlowFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 9:
                gjb0 gjb0Var = ((sjb0) obj).n;
                return (gjb0Var.h4().Gb().equals("kids_section") ? MusicPlaybackLaunchContext.y : MusicPlaybackLaunchContext.x).Eb(32).Cb(gjb0Var.h4().Gb());
            case 10:
                return ((NewsFeedComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 11:
                lfg lfgVar = ((com.vk.newsfeed.impl.presenters.b) obj).H;
                if (lfgVar != null) {
                    lfgVar.p0();
                }
                return s3q0.a;
            case 12:
                int i5 = PostingFragment.L0;
                return new ud20(new PostingFragment.d(1, ((PostingFragment) obj).getFeature(), efc0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 13:
                cqc0.c cVar = (cqc0.c) obj;
                View inflate = LayoutInflater.from(cVar.a).inflate(R.layout.view_posting_visibility_counter_stack_item, (ViewGroup) cVar.h, false);
                bwt0.p0(inflate, true);
                ((PhotoStackView) inflate.findViewById(R.id.posting_visibility_counter_stack_images)).setOverlapOffset(0.85f);
                bwt0.p0(inflate.findViewById(R.id.posting_visibility_counter_stack_dropdown_image), false);
                return inflate;
            case 14:
                ((lbe) obj).invoke(m5u.f.b);
                return s3q0.a;
            case 15:
                hny hnyVar = new hny(((ViewGroup) obj).getContext());
                qog0 qog0Var = new qog0(-1);
                qog0Var.f(true);
                qog0Var.g(cn70.a() * 1.0f);
                hnyVar.b(qog0Var);
                abg0 abg0Var = dhr0.t;
                Drawable a = abg0Var.a(R.drawable.vk_icon_star_circle_12);
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(abg0Var.a(R.drawable.gradient_blue));
                rotateDrawable.setLevel(5000);
                s3q0 s3q0Var = s3q0.a;
                hnyVar.b(new og10(a, rotateDrawable));
                return hnyVar;
            case 16:
                SearchEntityVideoPlaylistAnswerVh.a((VideoAlbum) obj, false);
                return s3q0.a;
            case 17:
                initialize$lambda$220$lambda$124 = ServiceProvider.initialize$lambda$220$lambda$124((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$124;
            case 18:
                return (ImageButton) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_comment_input_common_clear_button);
            case 19:
                return new aim0((StoryStatisticsDatabase_Impl) obj);
            case 20:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return ((SuggestedPostsFragment) obj).eo();
            case 21:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                int i6 = SuperAppFragment.o0;
                if (!jjc.d().a()) {
                    if (((hlu0) superAppFragment.j0.getValue()).a()) {
                        ((jlu0) superAppFragment.k0.getValue()).e(superAppFragment, MultiAccountEntryPoint.LongTap.d);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 22:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 23:
                return new tuh(((DonutPriceComponent) ((boq0) obj).n.s.getValue()).kf());
            case 24:
                ((xpq0) obj).n.a(UserProfileAction.c.b);
                return s3q0.a;
            case 25:
                kfr0 kfr0Var = (kfr0) obj;
                VkUiView.a.a(kfr0Var.b, kfr0Var.a.getAppId(), true, new mll0(kfr0Var, 10), new pod0(kfr0Var, 20), false, 48);
                return s3q0.a;
            case 26:
                ppr0 ppr0Var = (ppr0) obj;
                mpr0.b bVar = mpr0.b.b;
                ppr0Var.getClass();
                xn50.a.c(ppr0Var, bVar);
                return s3q0.a;
            case 27:
                int i7 = VideoCatalogFragment.l0;
                ((VideoCatalogComponent) m7m.d((VideoCatalogFragment) obj).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
                return null;
            case 28:
                VideoContainerActivityWithPip videoContainerActivityWithPip = (VideoContainerActivityWithPip) obj;
                int i8 = VideoContainerActivityWithPip.G;
                if (gz80.a(26)) {
                    return new h4t0(videoContainerActivityWithPip, (y1s0) videoContainerActivityWithPip.D.getValue(), new lzl0(videoContainerActivityWithPip, i2));
                }
                return null;
            default:
                int i9 = VideoEditTimelineView.H;
                return (TimelineView) ((VideoEditTimelineView) obj).findViewById(R.id.timeline);
        }
    }

    public /* synthetic */ u110(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
