package xsna;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.dialogslist.view.ViewPager2NestedRecyclerView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.im.ui.views.msg.ViewsCountView;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.VoipService;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import ru.mail.libverify.controls.VerificationController;
import xsna.w2x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ipq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ipq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String lambda$getSmsCode$5;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = UserProfileFragment.p0;
                return (BridgeComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(BridgeComponent.class));
            case 1:
                lambda$getSmsCode$5 = ((VerificationController) obj).lambda$getSmsCode$5();
                return lambda$getSmsCode$5;
            case 2:
                int i3 = VideoBottomBarView.p;
                return Boolean.valueOf(((DonutVideoComponent) ((k7m) m7m.c((VideoBottomBarView) obj)).a(fpf0.a(DonutVideoComponent.class))).J().a());
            case 3:
                return ((BridgeComponent) ((k7m) m7m.f((b9s0) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 4:
                ihs0 ihs0Var = (ihs0) obj;
                s5t0 s5t0Var = (s5t0) ((zak0) ihs0Var.i1).getValue();
                if (s5t0Var != null) {
                    s5t0Var.a();
                }
                ihs0Var.dismiss();
                return s3q0.a;
            case 5:
                return ((LinksBridgeComponent) ((VideoGrowthComponentImpl) obj).a.getValue()).p();
            case 6:
                return ((VideoMinimizableDiscoveryFragment) obj).G0;
            case 7:
                return (VideoAdFreeSubscriptionComponent) ((f8m) obj).a(fpf0.a(VideoAdFreeSubscriptionComponent.class));
            case 8:
                return ((h4t0) obj).i;
            case 9:
                ((xht0) obj).f.Ff("video_quality");
                return s3q0.a;
            case 10:
                int i4 = ViewPager2NestedRecyclerView.c;
                ViewParent viewParent = ((ViewPager2NestedRecyclerView) obj).getParent();
                while (viewParent != 0 && !(viewParent instanceof ViewPager2)) {
                    viewParent = viewParent.getParent();
                }
                View view = viewParent instanceof View ? (View) viewParent : null;
                KeyEvent.Callback l = view != null ? awt0.l(view, new fyi0(10)) : null;
                RecyclerView recyclerView = l instanceof RecyclerView ? (RecyclerView) l : null;
                if (recyclerView == null) {
                    tv4.b("ViewPager2NestedRecyclerView: pager recycler not found", com.vk.metrics.eventtracking.b.a);
                    s3q0 s3q0Var = s3q0.a;
                }
                return recyclerView;
            case 11:
                int i5 = ViewsCountView.d;
                return (AppCompatImageView) ((ViewsCountView) obj).findViewById(R.id.im_views_icon);
            case 12:
                return new uzu0((com.vk.superapp.browser.ui.a) obj);
            case 13:
                int i6 = VkPhotoPickerFragment.r0;
                return (PhotosComponent) m7m.d((VkPhotoPickerFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 14:
                int i7 = VkVideoPromoFragment.Q;
                return ((VkVideoPromoComponent) ((k7m) m7m.f((VkVideoPromoFragment) obj)).a(fpf0.a(VkVideoPromoComponent.class))).Ka();
            case 15:
                ((VoipMainMenuFragmentBase) obj).tn();
                return s3q0.a;
            case 16:
                Object obj2 = VoipService.q;
                L.A("VoipService", "accept");
                com.vk.voip.ui.c.b.j(((VoipService) obj).j());
                com.vk.voip.ui.c.U().b(new w2x0.a(false, 7));
                return s3q0.a;
            default:
                int i8 = WriteBarButtonsBubbleView.h;
                return ((WriteBarButtonsBubbleView) obj).findViewById(R.id.writebar_attach_new);
        }
    }
}
