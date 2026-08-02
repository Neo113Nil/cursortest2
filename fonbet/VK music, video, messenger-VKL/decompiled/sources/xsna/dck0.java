package xsna;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.vk.auth.ui.multiaccount.VkMultiAccountSelectorView;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.clips.viewer.vk.ClipsViewerEventsComponent;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.scheduled_clips.UserScheduledClipsGridFragment;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bcp0;
import xsna.m3p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dck0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dck0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object parcelable;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                eck0 eck0Var = (eck0) obj;
                return new qx4(eck0Var.g, eck0Var.f, new r9c0(eck0Var, 9), eck0Var.h, new mlf0(eck0Var, 4), new a2a(eck0Var, 12));
            case 1:
                ?? r0 = ((fwk0) obj).a;
                return new az0(((awk0) r0.getValue()).b, ((awk0) r0.getValue()).c, null, ((awk0) r0.getValue()).d, null, null);
            case 2:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) obj;
                vtk0.d().d(stickerCatalogRootVh.R(), new r2l0(stickerCatalogRootVh));
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = StorefrontServicesFragment.R;
                return (StorefrontServicesArgs) ((StorefrontServicesFragment) obj).requireArguments().getParcelable("arguments_storefront_services");
            case 4:
                return ((MarketComponent) m7m.a(((ddm0) obj).f).a(fpf0.a(MarketComponent.class))).U1();
            case 5:
                u7o0 u7o0Var = (u7o0) obj;
                u7o0Var.f.invoke("tech_bug_report");
                u7o0Var.b = null;
                return s3q0.a;
            case 6:
                return ((mwo0) obj).d;
            case 7:
                m3p0 m3p0Var = (m3p0) obj;
                m3p0Var.j = m3p0.a.a(m3p0Var.j, null, false, new tho0("", 0L, 6), m3p0Var.c(m3p0Var.j.a, false), 1);
                m3p0Var.d.invoke("");
                m3p0Var.e.invoke(m3p0Var.j);
                return s3q0.a;
            case 8:
                bcp0.a aVar = bcp0.w;
                return ((VideoMinimizablePlayerComponent) m7m.d((bcp0) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 9:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 10:
                slq0 slq0Var = ((pmq0) obj).b;
                if (slq0Var != null) {
                    slq0Var.a(UserProfileAction.s.e.a.b);
                }
                return s3q0.a;
            case 11:
                UserScheduledClipsGridFragment userScheduledClipsGridFragment = (UserScheduledClipsGridFragment) obj;
                int i2 = UserScheduledClipsGridFragment.W;
                if (Build.VERSION.SDK_INT < 33) {
                    UserId userId = (UserId) userScheduledClipsGridFragment.requireArguments().getParcelable("UserScheduledClipsGridFragment.user_id");
                    return userId == null ? UserId.d : userId;
                }
                parcelable = userScheduledClipsGridFragment.requireArguments().getParcelable("UserScheduledClipsGridFragment.user_id", UserId.class);
                UserId userId2 = (UserId) parcelable;
                return userId2 == null ? UserId.d : userId2;
            case 12:
                int i3 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.redo_btn);
            case 13:
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().getImage();
            case 14:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                return new odt0(videoMinimizableDiscoveryFragment.requireContext(), new avs0(videoMinimizableDiscoveryFragment, 1));
            case 15:
                return VideoOverlayView.P4((VideoOverlayView) obj);
            case 16:
                int i5 = VideoProfileFragmentOld.p0;
                return ((ClipsViewerEventsComponent) m7m.d((VideoProfileFragmentOld) obj).a(fpf0.a(ClipsViewerEventsComponent.class))).y0();
            case 17:
                yit0 yit0Var = (yit0) obj;
                yit0Var.f.Qc("video_subtitles");
                yit0Var.b = null;
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr3 = VideoView.T0;
                return (AccessibilityManager) ((VideoView) obj).getContext().getSystemService("accessibility");
            case 19:
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d((Context) obj));
            case 20:
                return ((ggu0) obj).x;
            case 21:
                return (ImageRequest) obj;
            case 22:
                int i6 = VkMultiAccountSelectorView.B;
                return ((MultiAccountComponent) ((k7m) m7m.f((VkMultiAccountSelectorView) obj)).a(fpf0.a(MultiAccountComponent.class))).c();
            case 23:
                return ((lcw0) obj).a.getParentFragmentManager();
            case 24:
                int i7 = WriteBar.h0;
                return ((WriteBar) obj).findViewById(R.id.writebar_attach);
            default:
                y1y0 y1y0Var = (y1y0) obj;
                ImageView imageView = (ImageView) y1y0Var.a.findViewById(R.id.writebar_emoji);
                bwt0.i0(imageView, new u5p0(y1y0Var, 27));
                return imageView;
        }
    }
}
