package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.impl.background.BackgroundEditorState;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsArgs;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.impl.di.VideoAdvertisementsComponentImpl;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.story.api.di.StoriesComponent;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xsna.bcp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class avj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ avj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                cvj0 cvj0Var = (cvj0) obj;
                RectF rectF = new RectF(bwt0.C(cvj0Var.Q));
                int measuredWidth = cvj0Var.P.getMeasuredWidth();
                FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = cvj0Var.Q;
                rectF.offsetTo(Math.abs(measuredWidth - fixedSizeVKEnhancedImageView.getMeasuredWidth()) / 2.0f, Math.abs(r1.getMeasuredHeight() - fixedSizeVKEnhancedImageView.getMeasuredHeight()) / 2.0f);
                return rectF;
            case 1:
                dwk0 dwk0Var = (dwk0) obj;
                return new qvk0(dwk0Var.b, dwk0Var.c, ((zvk0) dwk0Var.a.getValue()).d);
            case 2:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    StickerItem stickerItem = (StickerItem) obj2;
                    arrayList.add(new f4l0(stickerItem.b, stickerItem.d, stickerItem.e, stickerItem.f, stickerItem.g, stickerItem.h, stickerItem.i, stickerItem.j, stickerItem.k, i2, 2));
                    i2 = i3;
                }
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().E().c(arrayList);
                return s3q0.a;
            case 3:
                return (anm0) ((sbl0) obj).i.invoke();
            case 4:
                StorefrontAlbumsFragment storefrontAlbumsFragment = (StorefrontAlbumsFragment) obj;
                qcy<Object>[] qcyVarArr = StorefrontAlbumsFragment.R;
                bpn0 bpn0Var = storefrontAlbumsFragment.N;
                StorefrontAlbumsArgs storefrontAlbumsArgs = (StorefrontAlbumsArgs) bpn0Var.getValue();
                mzp0 mzp0Var = storefrontAlbumsFragment.J;
                UserId userId = ((StorefrontAlbumsArgs) bpn0Var.getValue()).b;
                bpn0 bpn0Var2 = storefrontAlbumsFragment.O;
                return new bkl0(storefrontAlbumsArgs, mzp0Var, new fkl0(userId, new mkl0(new h6o0((y330) ((wjl0) bpn0Var2.getValue()).b.getValue()))), (wjl0) bpn0Var2.getValue());
            case 5:
                return new mol0((StorefrontServicesArgs) obj, null, null, null, LoadingState.Full, 190);
            case 6:
                com.vk.camera.editor.stories.impl.background.b bVar = (com.vk.camera.editor.stories.impl.background.b) obj;
                bVar.h = BackgroundEditorState.a(bVar.h.c(), null, null, null, null, null, null, false, true, null, null, null, null, null, null, 32639);
                return s3q0.a;
            case 7:
                return ((StoryEditorExtDepsComponent) m7m.a(((x0m0) obj).f).a(fpf0.a(StoryEditorExtDepsComponent.class))).r8();
            case 8:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                return ((StoriesComponent) ((k7m) m7m.f((StoryGalleryActivity) obj)).a(fpf0.a(StoriesComponent.class))).Ca();
            case 9:
                gzs<s3q0> gzsVar = ((m5m0) obj).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 10:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj;
                return new s3p0(toolbarRedesignVh.d, new wm80(toolbarRedesignVh, 27), new iri0(toolbarRedesignVh, 11), new c3k0(toolbarRedesignVh, 4), new b990(toolbarRedesignVh, 22), new b3m0(toolbarRedesignVh, 7));
            case 11:
                bcp0.a aVar = bcp0.w;
                Bundle arguments = ((bcp0) obj).getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("extra_item_position") : -1);
            case 12:
                ((ioq0) obj).w.b();
                return s3q0.a;
            case 13:
                return ((VkOnboardingComponent) ((k7m) m7m.f((lsq0) obj)).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 14:
                yg5 invoke = ((fbr0) obj).b.invoke();
                return Long.valueOf(invoke != null ? invoke.getPosition() : 0L);
            case 15:
                ((exr0) obj).a.c();
                return s3q0.a;
            case 16:
                VideoAdvertisementsComponentImpl videoAdvertisementsComponentImpl = (VideoAdvertisementsComponentImpl) obj;
                nwy nwyVar = videoAdvertisementsComponentImpl.c;
                qcy<Object> qcyVar = VideoAdvertisementsComponentImpl.g[0];
                fks0 J = ((g7s0) nwyVar.c()).J();
                VideoAdvertisementsComponent.AdType adType = VideoAdvertisementsComponent.AdType.VIDEO;
                wc0 Z3 = videoAdvertisementsComponentImpl.Z3(adType);
                VideoAdvertisementsComponent.AdType adType2 = VideoAdvertisementsComponent.AdType.LIVE;
                return new s0s0(new x11(J, new nmk0(new lmk0(Z3, videoAdvertisementsComponentImpl.Z3(adType2))), new a290()), new kmk0(videoAdvertisementsComponentImpl.Z3(adType), videoAdvertisementsComponentImpl.Z3(adType2)), dmx0.a, videoAdvertisementsComponentImpl.a.M3());
            case 17:
                int i4 = VideoCatalogFragment.l0;
                return ((VideoGrowthComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(VideoGrowthComponent.class))).Z9();
            case 18:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj).F;
                if (rwo0Var != null) {
                    rwo0Var.o();
                }
                return s3q0.a;
            case 19:
                return ((DonutVideoComponent) ((VideoItemListTabletVh) obj).C.getValue()).getActionHandler();
            case 20:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                VideoMinimizableDiscoveryFragment.b bVar2 = videoMinimizableDiscoveryFragment.U;
                FrameLayout frameLayout = (bVar2 != null ? bVar2 : null).h;
                Context requireContext = videoMinimizableDiscoveryFragment.requireContext();
                HashSet hashSet = iah0.a;
                return new e290(frameLayout, fnj.d(requireContext), new q6s0(videoMinimizableDiscoveryFragment, 3));
            case 21:
                return ((DonutVideoComponent) ((com.vk.libvideo.offline.ui.a) obj).x.getValue()).s3();
            case 22:
                int i6 = VideoTopBarView.m;
                return ((VideoRestrictedUserActionsComponent) ((k7m) m7m.c((VideoTopBarView) obj)).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 23:
                int i7 = VideoUploadFragment.S;
                return (CameraClipsComponent) ((k7m) m7m.f((VideoUploadFragment) obj)).a(fpf0.a(CameraClipsComponent.class));
            case 24:
                VideoView videoView = (VideoView) obj;
                return new kox(videoView.K0, videoView.getViewBinding(), videoView.G0);
            case 25:
                z8u0 z8u0Var = (z8u0) obj;
                boolean z = !z8u0Var.D;
                z8u0Var.D = z;
                z8u0Var.X(z);
                z8u0Var.W(z8u0Var.D);
                return s3q0.a;
            case 26:
                return ((hgw0) obj).a().findViewById(R.id.call_by_link_media_setting_disabled_permanent_view);
            case 27:
                return (TextView) ((View) ((sow0) obj).k.getValue()).findViewById(R.id.call_group_selector_button);
            case 28:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj;
                int i8 = VoipPastCallsFragment.a0;
                luw0 luw0Var = luw0.b;
                voipPastCallsFragment.getClass();
                xn50.a.c(voipPastCallsFragment, luw0Var);
                return s3q0.a;
            default:
                return (TextView) ((View) ((uxw0) obj).e.getValue()).findViewById(R.id.call_by_link_media_setting_enabled_view);
        }
    }

    public /* synthetic */ avj0(List list, m9l0 m9l0Var) {
        this.b = 2;
        this.c = list;
    }
}
