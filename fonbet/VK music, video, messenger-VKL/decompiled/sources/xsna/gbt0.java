package xsna;

import android.app.Activity;
import android.app.Application;
import android.widget.FrameLayout;
import com.vk.auth.validation.b;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.VkAppMusicFragmentComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gbt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gbt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                hbt0 hbt0Var = (hbt0) obj;
                if (!hbt0Var.j) {
                    hbt0Var.A();
                }
                return s3q0.a;
            case 1:
                s6s0 s6s0Var = (s6s0) obj;
                fxc0.B().L(s6s0Var.a, s6s0Var.u);
                return s3q0.a;
            case 2:
                Activity activity = ((jgt0) obj).a;
                return new k640(activity, ((InfoBridgeComponent) m7m.a(activity).a(fpf0.a(InfoBridgeComponent.class))).t().b());
            case 3:
                return new MusicAddTrackToPlaylistLauncherImpl((Application) ((VkAppMusicFragmentComponentImpl) obj).a.a);
            case 4:
                ((com.vk.superapp.browser.ui.a) obj).jk();
                return s3q0.a;
            case 5:
                int i2 = VkFeedOverlayProductCarousel.A;
                return (FrameLayout) ((VkFeedOverlayProductCarousel) obj).findViewById(R.id.feed_carousel_products_container);
            case 6:
                ((b.a) obj).dispose();
                return s3q0.a;
            case 7:
                tkx0 tkx0Var = (tkx0) ((xkx0) obj).a;
                if (tkx0Var != null) {
                    tkx0Var.e();
                }
                return s3q0.a;
            default:
                return new com.vk.writebar.e((com.vk.writebar.g) obj);
        }
    }
}
