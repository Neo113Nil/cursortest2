package xsna;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.SuperAppItemDecoration;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.transform.TransformController;
import xsna.c9p0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pwh0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pwh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((SearchOwnerVideosCatalogRootVh) obj).w.ck();
            case 1:
                int i3 = yhi0.f1;
                ((AppCompatTextView) obj).setEnabled(true);
                return s3q0.a;
            case 2:
                ((ixi0) obj).a.getContext();
                return new LinearLayoutManager(1, false);
            case 3:
                SettingsFragment settingsFragment = (SettingsFragment) obj;
                qcy<Object>[] qcyVarArr = SettingsFragment.Q;
                r1j0 r1j0Var = new r1j0((SettingsArguments) settingsFragment.N.getValue());
                l7m d = m7m.d(settingsFragment);
                SettingsFragmentInternalComponent.j.getClass();
                return (SettingsFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, r1j0Var, fpf0.a(SettingsFragmentInternalComponent.class), new hkb(10))).a(fpf0.a(SettingsFragmentInternalComponent.class));
            case 4:
                SettingsListFragment settingsListFragment = (SettingsListFragment) obj;
                if (!settingsListFragment.N0.h()) {
                    settingsListFragment.N0.dispose();
                }
                if (settingsListFragment.Mo().b()) {
                    settingsListFragment.N0 = settingsListFragment.Mo().d(settingsListFragment.n0).subscribe(new s5y(i2));
                } else {
                    settingsListFragment.N0 = settingsListFragment.Mo().a(settingsListFragment.requireContext()).subscribe(new f2u(new n1g0(5), 17));
                }
                ver0.a(settingsListFragment.N0);
                return s3q0.a;
            case 5:
                return (TextView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_title);
            case 6:
                ((TabLayout.g) obj).j();
                return s3q0.a;
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((npk0) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                int i4 = StickersDatabase_Impl.B;
                return new lyp0((StickersDatabase_Impl) obj);
            case 9:
                int i5 = StoryArchiveFragment.h0;
                return ((StoryViewerComponent) ((k7m) m7m.f((StoryArchiveFragment) obj)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 10:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c((myl0) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).M0();
            case 11:
                return ((DonutVideoComponent) ((x5n0) obj).t0.getValue()).s3();
            case 12:
                return ((SuperAppItemDecoration) obj).b.getDrawable(R.drawable.vk_superapp_tile_rect_background);
            case 13:
                dcn dcnVar = (dcn) ((Ref$ObjectRef) obj).element;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                return s3q0.a;
            case 14:
                ((izs) ((zak0) ((c9p0.c) obj).d).getValue()).invoke(new sx40.g0(PlayerContext.TOP));
                return s3q0.a;
            case 15:
                ((q7) obj).b(sls.a);
                return s3q0.a;
            case 16:
                vxq0 vxq0Var = (vxq0) obj;
                return new mvq0(new lva0(vxq0Var, 29), new h8n0(vxq0Var, 7), new nrq0(vxq0Var, i2), new iri0(vxq0Var, 14));
            case 17:
                return ((VKEnhancedImageView) obj).u;
            case 18:
                ggr0 ggr0Var = (ggr0) obj;
                ggr0Var.a0 = true;
                if (ggr0Var.vn().q && (context = ggr0Var.M) != null) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).b0(context);
                }
                ((agu0) ggr0Var.s.getValue()).m(true);
                return s3q0.a;
            case 19:
                return m33.a(R.drawable.bg_vkim_channel_share, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj).itemView.getContext());
            case 20:
                int i6 = VideoActivity.I;
                return (VideoShareComponent) m7m.a((VideoActivity) obj).a(fpf0.a(VideoShareComponent.class));
            case 21:
                ImageView imageView = ((VideoCatalogHeaderBrandedVh) obj).q;
                return ((CastComponent) ((k7m) m7m.c(imageView != null ? imageView : null)).a(fpf0.a(CastComponent.class))).n9();
            case 22:
                int i7 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoPlaybackSpeedComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).mo408a(fpf0.a(VideoPlaybackSpeedComponent.class))).m0();
            case 23:
                return (VideoPip2Component) ((f8m) obj).a(fpf0.a(VideoPip2Component.class));
            case 24:
                return ((ClipEditComponent) ((k7m) m7m.f((y6t0) obj)).a(fpf0.a(ClipEditComponent.class))).d6();
            case 25:
                int i8 = VideoProfileFragmentOld.p0;
                return Boolean.valueOf(((VideoProfileFragmentOld) obj).requireArguments().getBoolean("VideoProfileFragment.is_navigation_back_button_visible"));
            case 26:
                VideoTextureView videoTextureView = (VideoTextureView) obj;
                TransformController transformController = new TransformController(videoTextureView.m);
                transformController.j(videoTextureView.c);
                transformController.f(videoTextureView.i, false);
                return transformController;
            case 27:
                vlt0 vlt0Var = (vlt0) obj;
                vlt0Var.f.Qc("video_traffic_saving");
                vlt0Var.b = null;
                return s3q0.a;
            case 28:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return ((AuthBridgeComponent) ((k7m) m7m.c((VideoView) obj)).a(fpf0.a(AuthBridgeComponent.class))).s();
            default:
                ((nw10) obj).performClick();
                return s3q0.a;
        }
    }
}
