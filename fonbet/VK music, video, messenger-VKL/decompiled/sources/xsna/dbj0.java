package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.b;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dbj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dbj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(com.vk.toggle.b.A.a((ComFeatures) obj));
            case 1:
                ((com.vk.sharing.core.view.f) obj).xa();
                return s3q0.a;
            case 2:
                ((k7k0) obj).dismiss();
                return Boolean.TRUE;
            case 3:
                eck0 eck0Var = (eck0) obj;
                eck0Var.r().d(eck0Var.d);
                return s3q0.a;
            case 4:
                int i3 = StickersDatabase_Impl.B;
                return new o9l0((StickersDatabase_Impl) obj);
            case 5:
                StorefrontServicesFragment storefrontServicesFragment = (StorefrontServicesFragment) obj;
                qcy<Object>[] qcyVarArr = StorefrontServicesFragment.R;
                jnl0 jnl0Var = (jnl0) storefrontServicesFragment.O.getValue();
                StorefrontServicesArgs eo = storefrontServicesFragment.eo();
                Context requireContext = storefrontServicesFragment.requireContext();
                HashSet hashSet = iah0.a;
                return new rnl0(eo, fnj.d(requireContext), jnl0Var);
            case 6:
                q5m0 q5m0Var = (q5m0) obj;
                o1l0 o1l0Var = q5m0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(q5m0Var);
                }
                return s3q0.a;
            case 7:
                mwo0 mwo0Var = (mwo0) obj;
                mwo0Var.d.o();
                mwo0Var.a();
                return s3q0.a;
            case 8:
                sxh0 sxh0Var = ((m3p0) obj).h;
                if (sxh0Var != null) {
                    sxh0Var.d();
                }
                return s3q0.a;
            case 9:
                fpq0 fpq0Var = (fpq0) obj;
                q7v0 q7v0Var = fpq0Var.r;
                VkOnboardingCampaign e = q7v0Var.e("com:profile_subscribe");
                if (e != null && q7v0Var.d(e) && q7v0Var.b(e, false)) {
                    fpq0Var.S = e;
                    fpq0Var.T(new b.w(true));
                }
                return s3q0.a;
            case 10:
                ((lxr0) obj).d.Ff("video_actions_link_details_bottom_sheet");
                return s3q0.a;
            case 11:
                return new bzb0(((j2s0) obj).t);
            case 12:
                ImageView imageView = ((VideoCatalogHeaderBrandedVh) obj).q;
                return ((VideoKidsComponent) ((k7m) m7m.c(imageView != null ? imageView : null)).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 13:
                int i4 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.timeline_pause_btn);
            case 14:
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().w2();
            case 15:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((VideoItemNoAutoPlayVh) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 16:
                return ((tts0) obj).j;
            case 17:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                etn etnVar = videoMinimizableDiscoveryFragment.s0;
                if (etnVar.a() || etnVar.c()) {
                    return new com.vk.video.ui.discovery.minimizable.r(videoMinimizableDiscoveryFragment.getResources().getConfiguration().orientation == 2, videoMinimizableDiscoveryFragment.oo(), new rus0(videoMinimizableDiscoveryFragment, i2), new d3j0(videoMinimizableDiscoveryFragment, 16), new ipq0(videoMinimizableDiscoveryFragment, 6), new sus0(videoMinimizableDiscoveryFragment, 0), new kld0(videoMinimizableDiscoveryFragment, 26));
                }
                return null;
            case 18:
                return VideoOverlayView.T4((VideoOverlayView) obj);
            case 19:
                final VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) obj;
                int i5 = VideoProfileFragmentOld.p0;
                return new BroadcastReceiver() { // from class: com.vk.video.profile.presentation.VideoProfileFragmentOld$donutBroadcastReceiver$2$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if ("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID".equals(intent.getAction())) {
                            a.z zVar = a.z.b;
                            VideoProfileFragmentOld videoProfileFragmentOld2 = VideoProfileFragmentOld.this;
                            videoProfileFragmentOld2.getClass();
                            xn50.a.c(videoProfileFragmentOld2, zVar);
                        }
                    }
                };
            case 20:
                return ((ggu0) obj).s().a();
            case 21:
                int i6 = VkTabLayout.s0;
                return new GestureDetector(((VkTabLayout) obj).getContext(), new VkTabLayout.a());
            case 22:
                int i7 = WriteBar.h0;
                return ((WriteBar) obj).findViewById(R.id.writebar_attach_new);
            default:
                return (ImageView) ((y1y0) obj).a.findViewById(R.id.writebar_pack_new);
        }
    }
}
