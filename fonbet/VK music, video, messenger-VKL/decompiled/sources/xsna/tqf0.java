package xsna;

import android.content.Context;
import android.graphics.RectF;
import com.google.gson.GsonBuilder;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.view.components.cell.VkCellSkeleton$Middle$Size;
import com.vk.im.ui.views.StencilLayout;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tqf0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        LifecycleDataSource initialize$lambda$220$lambda$47;
        switch (this.b) {
            case 0:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_PASSWORDLESS, null, null, null, 30);
                return s3q0.a;
            case 1:
                return new n6h0();
            case 2:
                initialize$lambda$220$lambda$47 = ServiceProvider.initialize$lambda$220$lambda$47();
                return initialize$lambda$220$lambda$47;
            case 3:
                int i = StencilLayout.i;
                return new RectF();
            case 4:
                int i2 = StoryReactionViewGroup.s;
                return s3q0.a;
            case 5:
                return Integer.valueOf((int) x5r0.a(32, 1));
            case 6:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.vk_white));
            case 7:
                return Boolean.valueOf(fxc0.B().J().a2());
            case 8:
                return (LinksGeneratorComponent) ((k7m) m7m.f(fss0.b)).mo408a(fpf0.a(LinksGeneratorComponent.class));
            case 9:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().w1());
            case 10:
                bpn0 bpn0Var = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(8));
            case 11:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return new tzr0();
            case 12:
                return tlo0.Companion.serializer();
            case 13:
                return new bsp(VkCellSkeleton$Middle$Size.values(), "com.vk.core.view.components.cell.VkCellSkeleton.Middle.Size");
            case 14:
                return new pco(0);
            case 15:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.z0());
            default:
                return new GsonBuilder().setLenient().create();
        }
    }
}
