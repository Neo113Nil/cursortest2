package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vk.clips.design.view.timeline.TimelineEditingActionsView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.core.view.components.button.VkButton;
import com.vk.di.scope.SingletonScope;
import com.vk.dto.video.VideoAlbum;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.profile.di.VideoProfileComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import ru.mail.libverify.controls.VerificationController;
import xsna.c9p0;
import xsna.hp90;
import xsna.m3p0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mlf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mlf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        Resources resources;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                Bundle arguments = ((RedesignNotificationSettingsFragment) obj).getArguments();
                if (arguments != null) {
                    return arguments.getString("section_id");
                }
                return null;
            case 1:
                ((zak0) ((sjg0) obj).o).setValue(Boolean.valueOf(!r3.g()));
                return s3q0.a;
            case 2:
                ((e0i0) obj).b.setVisibility(0);
                return s3q0.a;
            case 3:
                int i3 = SettingsListFragment.X0;
                return ((NotificationsSettingsComponent) m7m.d((SettingsListFragment) obj).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 4:
                return ((eck0) obj).c.getState();
            case 5:
                int i4 = StickersDatabase_Impl.B;
                return new eyi((StickersDatabase_Impl) obj);
            case 6:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                h3p0.b((SuggestedPostsFragment) obj);
                return s3q0.a;
            case 7:
                c7n0 c7n0Var = ((SuperAppFragment) obj).b0;
                if (c7n0Var == null) {
                    return null;
                }
                return c7n0Var;
            case 8:
                int i5 = TimelineEditingActionsView.x;
                return (VkButton) ((TimelineEditingActionsView) obj).findViewById(R.id.timeline_editing_done);
            case 9:
                m3p0 m3p0Var = (m3p0) obj;
                m3p0Var.j = m3p0.a.a(m3p0Var.j, null, false, new tho0("", 0L, 6), false, 11);
                m3p0Var.d.invoke("");
                m3p0Var.e.invoke(m3p0Var.j);
                return s3q0.a;
            case 10:
                ((izs) ((zak0) ((c9p0.b) obj).b).getValue()).invoke(new sx40.o0(PlayerContext.TOP));
                return s3q0.a;
            case 11:
                ((vrq0) obj).o.a(UserProfileAction.s.e.b.b);
                return s3q0.a;
            case 12:
                return Integer.valueOf(((VerificationController) obj).internalGetSmsCodeLength());
            case 13:
                return new PorterDuffColorFilter(((com.vk.video.ui.discovery.minimizable.announce.a) obj).a.a.getContext().getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
            case 14:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                return ((AdStatPixelsComponent) videoAutoPlay.d.b).A3(videoAutoPlay.X);
            case 15:
                int i6 = VideoCatalogSearchFragment.X;
                ((VideoCatalogComponent) m7m.d((VideoCatalogSearchFragment) obj).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
                return null;
            case 16:
                int i7 = VideoEditTimelineView.H;
                return (FragmentActionsView) ((VideoEditTimelineView) obj).findViewById(R.id.fragment_actions);
            case 17:
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().B0();
            case 18:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                etn etnVar = videoMinimizableDiscoveryFragment.s0;
                if (!etnVar.b() || etnVar.a()) {
                    return null;
                }
                return new com.vk.video.ui.discovery.minimizable.a(new y3l0(videoMinimizableDiscoveryFragment, 20));
            case 19:
                VideoOverlayView videoOverlayView = (VideoOverlayView) obj;
                bpn0 bpn0Var = VideoOverlayView.I;
                videoOverlayView.f5();
                VKImageView vKImageView = (VKImageView) videoOverlayView.findViewById(R.id.video_overlay_holder_icon);
                bwt0.c0(videoOverlayView.e5(), vKImageView);
                bwt0.r0(videoOverlayView.e5(), vKImageView);
                return vKImageView;
            case 20:
                View view = ((VideoPlaylistPlaceHolder) obj).G;
                if (view != null && (context = view.getContext()) != null && (resources = context.getResources()) != null) {
                    i2 = resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
                }
                return Integer.valueOf(i2);
            case 21:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) obj;
                int i8 = VideoProfileFragmentOld.p0;
                return (VideoProfileComponent) ((k7m) m7m.f(videoProfileFragmentOld)).d(SingletonScope.a).b(fpf0.a(VideoProfileComponent.class), new l7t0(videoProfileFragmentOld.ho()));
            case 22:
                return new cst0(((VideoViewerFragmentInternalComponent) obj).a.a);
            case 23:
                ggu0 ggu0Var = (ggu0) obj;
                pa3 pa3Var = ggu0Var.A;
                if (pa3Var.b || pa3Var.c) {
                    ggu0Var.c.B(new IllegalStateException("Failed to update app info"));
                }
                ggu0Var.A = pa3.a(ggu0Var.A, false, false, 7);
                return s3q0.a;
            case 24:
                ((eav0) obj).b.onDismiss();
                return s3q0.a;
            case 25:
                VkTabLayoutVh vkTabLayoutVh = (VkTabLayoutVh) obj;
                vkTabLayoutVh.k = null;
                vkTabLayoutVh.b();
                return s3q0.a;
            case 26:
                evv0 evv0Var = (evv0) obj;
                Bundle arguments2 = evv0Var.getArguments();
                if (arguments2 == null) {
                    throw new IllegalStateException("Arguments is null! You must create the instance of this class with " + evv0Var.getClass().getSimpleName() + ".Builder()");
                }
                Parcelable parcelable = arguments2.getParcelable("args_app");
                WebApiApplication webApiApplication = parcelable instanceof WebApiApplication ? (WebApiApplication) parcelable : null;
                String string = arguments2.getString("args_view_url");
                String string2 = arguments2.getString("args_link_params");
                String string3 = arguments2.getString("args_ref");
                String string4 = arguments2.getString("args_source_url");
                String valueOf = String.valueOf(webApiApplication.D);
                try {
                    valueOf = Uri.parse(valueOf).buildUpon().appendQueryParameter("ui_window_type", "popup").build().toString();
                } catch (Throwable unused) {
                }
                webApiApplication.D = valueOf;
                String a = fo8.a(string, string2);
                try {
                    a = Uri.parse(a).buildUpon().appendQueryParameter("ui_window_type", "popup").build().toString();
                } catch (Throwable unused2) {
                }
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                return (superappUiRouterBridge != null ? superappUiRouterBridge : null).F(webApiApplication, a, string3, string4);
            case 27:
                wjs0.a(new hwr0((VideoAlbum) obj));
                return s3q0.a;
            case 28:
                ((ohw0) obj).a.b(hp90.c.a);
                return s3q0.a;
            default:
                int i9 = WriteBar.h0;
                return (FrameLayout) ((WriteBar) obj).findViewById(R.id.writebar_action);
        }
    }
}
