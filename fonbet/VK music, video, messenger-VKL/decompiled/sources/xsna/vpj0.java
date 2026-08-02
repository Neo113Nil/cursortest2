package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.bridges.ProfileType;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderTabletHideVh;
import com.vk.clips.design.view.timeline.TimelineEditingActionsView;
import com.vk.clips.design.view.timeline.TimelineVoiceoverView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;
import com.vk.im.ui.views.msg.BombView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.overlay.LiveUpcomingView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.IOException;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.awt0;
import xsna.e3m;
import xsna.g7n0;
import xsna.kcl0;
import xsna.y1y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class vpj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vpj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Resources resources;
        int i = this.b;
        boolean z = false;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                OneVideoPlayer oneVideoPlayer = ((SimpleControlsView) obj).x;
                if (oneVideoPlayer == null) {
                    return s3q0.a;
                }
                if (oneVideoPlayer.o()) {
                    oneVideoPlayer.seekTo(C.TIME_UNSET);
                } else {
                    oneVideoPlayer.seekTo(0L);
                }
                return s3q0.a;
            case 1:
                Context context = ((q3k0) obj).l.getContext();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
            case 2:
                int i3 = StickersDatabase_Impl.B;
                return new l8w0((StickersDatabase_Impl) obj);
            case 3:
                return Float.valueOf(((vak0) ((ofl0) obj).h).getFloatValue());
            case 4:
                StorefrontServicesFragment storefrontServicesFragment = (StorefrontServicesFragment) obj;
                qcy<Object>[] qcyVarArr = StorefrontServicesFragment.R;
                return new mnl0(storefrontServicesFragment, (jnl0) storefrontServicesFragment.O.getValue());
            case 5:
                return rl3.u0(((abm0) obj).getFillPoints());
            case 6:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                g7n0.b d = superAppFragment.d0.d();
                if (d != null) {
                    d.g();
                }
                FragmentActivity activity = superAppFragment.getActivity();
                if (activity != null) {
                    q7n0.a().a().e(activity);
                }
                return s3q0.a;
            case 7:
                u7o0 u7o0Var = (u7o0) obj;
                az2 az2Var = u7o0Var.d;
                VkInputSelect vkInputSelect = u7o0Var.g;
                az2Var.invoke(String.valueOf(vkInputSelect != null ? vkInputSelect.getText() : null));
                cvk.u(R.string.video_tech_bugreport_thanks, false);
                return s3q0.a;
            case 8:
                int i4 = TimelineEditingActionsView.x;
                return (VkButton) ((TimelineEditingActionsView) obj).findViewById(R.id.timeline_editing_cancel);
            case 9:
                return go9.b("executeUploading: network error occurred: ", ((IOException) obj).getMessage());
            case 10:
                return xa4.K(((UserProfileHeaderView) obj).A.getRightMainRect());
            case 11:
                vxq0 vxq0Var = (vxq0) obj;
                return new wwq0(vxq0Var.b, new jaa0(vxq0Var, 24));
            case 12:
                return (BombView) ((ViewStub) ((View) obj).findViewById(R.id.bomb_viewstub)).inflate();
            case 13:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                rhh0 rhh0Var = videoAutoPlay.d;
                dmg dmgVar = new dmg(videoAutoPlay);
                zi0 zi0Var = videoAutoPlay.X;
                rhh0Var.getClass();
                return new kc60(dmgVar, zi0Var);
            case 14:
                VideoCatalogHeaderBrandedVh videoCatalogHeaderBrandedVh = (VideoCatalogHeaderBrandedVh) obj;
                if (((b25) videoCatalogHeaderBrandedVh.n.getValue()).c0() != ProfileType.RELATED) {
                    ((vqs0) videoCatalogHeaderBrandedVh.o.getValue()).getClass();
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                int i5 = VideoEditTimelineView.H;
                return (TimelineVoiceoverView) ((VideoEditTimelineView) obj).findViewById(R.id.voiceover_view);
            case 16:
                LinearLayout linearLayout = ((VideoItemSliderTabletHideVh) obj).o;
                if (linearLayout == null || (resources = linearLayout.getResources()) == null) {
                    return VideoItemListSettings.s;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.catalog_video_slider_medium_tablet_item_with_avatar);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.catalog_video_slider_medium_tablet_item_height_avatar);
                return VideoItemListSettings.a(VideoItemListSettings.s, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize / dimensionPixelSize2, null, 8);
            case 17:
                return ((tts0) obj).j;
            case 18:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                etn etnVar = videoMinimizableDiscoveryFragment.s0;
                if (!etnVar.b() || etnVar.a()) {
                    return null;
                }
                return new com.vk.video.ui.discovery.minimizable.t(videoMinimizableDiscoveryFragment.getResources().getConfiguration().orientation == 2, videoMinimizableDiscoveryFragment.oo(), new mwm0(videoMinimizableDiscoveryFragment, 10), new vus0(videoMinimizableDiscoveryFragment, i2), new wus0(videoMinimizableDiscoveryFragment, i2), new xus0(videoMinimizableDiscoveryFragment, i2));
            case 19:
                return (ucg0) ((com.vk.libvideo.offline.ui.a) obj).u.getValue();
            case 20:
                VideoOverlayView videoOverlayView = (VideoOverlayView) obj;
                bpn0 bpn0Var = VideoOverlayView.I;
                videoOverlayView.f5();
                return (LiveUpcomingView) videoOverlayView.findViewById(R.id.upcomingView);
            case 21:
                int i6 = VideoProfileFragmentOld.p0;
                return ((VideoProfileFragmentOld) obj).requireArguments().getString("VideoProfileFragment.track_code");
            case 22:
                return ((ggu0) obj).m().g;
            case 23:
                ((mjw0) obj).f(false);
                return s3q0.a;
            case 24:
                int i7 = WriteBar.h0;
                return (ViewGroup) ((WriteBar) obj).findViewById(R.id.write_bar_edit_area_container);
            default:
                final y1y0 y1y0Var = (y1y0) obj;
                return new BroadcastReceiver() { // from class: com.vk.writebar.WriteBarStickersHolder$mReceiver$2$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        y1y0 y1y0Var2 = y1y0.this;
                        kcl0 kcl0Var = y1y0Var2.l;
                        String action = intent.getAction();
                        if (action != null) {
                            int hashCode = action.hashCode();
                            boolean z2 = false;
                            if (hashCode != 2038551911) {
                                if (hashCode == 2139085602 && action.equals("com.vkontakte.android.STICKERS_RELOADED")) {
                                    ImageView c = y1y0Var2.c();
                                    if (y1y0Var2.v && kcl0Var.W()) {
                                        z2 = true;
                                    }
                                    awt0.v(c, z2);
                                    return;
                                }
                                return;
                            }
                            if (action.equals("com.vkontakte.android.STICKERS_NUM_UPDATES")) {
                                ImageView b = y1y0Var2.b();
                                if (y1y0Var2.v && y1y0Var2.u && kcl0Var.O0() > 0) {
                                    z2 = true;
                                }
                                awt0.v(b, z2);
                            }
                        }
                    }
                };
        }
    }
}
