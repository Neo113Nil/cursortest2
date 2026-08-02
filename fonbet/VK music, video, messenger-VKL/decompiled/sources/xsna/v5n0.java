package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.ui.SuperAppItemDecoration;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vkontakte.android.R;
import java.util.NoSuchElementException;
import kotlin.text.Regex;
import xsna.l5x0;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v5n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((DonutVideoComponent) ((x5n0) obj).t0.getValue()).J().a());
            case 1:
                return ((SuperAppItemDecoration) obj).b.getDrawable(R.drawable.vk_superapp_section_rect_background);
            case 2:
                ((zak0) ((zdn0) obj).s).setValue(Boolean.FALSE);
                return s3q0.a;
            case 3:
                xno0 xno0Var = (xno0) obj;
                VkText vkText = (VkText) xno0Var.b.inflate(R.layout.pds_text_with_chips_show_more, (ViewGroup) xno0Var, false);
                vkText.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                return vkText;
            case 4:
                ((zak0) ((e6p0) obj).f).setValue(Boolean.valueOf(!r4.q()));
                return s3q0.a;
            case 5:
                return new f.e.AbstractC1725f.a(((f.b.a) ((f.b) obj)).a);
            case 6:
                ((UserProfileHeaderView) obj).v.invoke();
                return s3q0.a;
            case 7:
                FragmentImpl fragmentImpl = ((vxq0) obj).b;
                return new dpq0(m7m.d(fragmentImpl), fragmentImpl);
            case 8:
                return ((VKEnhancedImageView) obj).u;
            case 9:
                tdr0 tdr0Var = (tdr0) obj;
                VkBrowserMenuFactory a = tdr0Var.a.a();
                if (a != null) {
                    return a;
                }
                Context context = ((ggu0) tdr0Var.f.c).b;
                fvv0 fvv0Var = tdr0Var.b;
                wc80 wc80Var = tdr0Var.c;
                ggu0 ggu0Var = tdr0Var.d;
                return new VkBrowserMenuFactory(context, fvv0Var, wc80Var, ggu0Var, null, ggu0Var.d.getState().f());
            case 10:
                Regex regex = hgr0.X;
                return ((UserProfileComponent) m7m.d((hgr0) obj).mo408a(fpf0.a(UserProfileComponent.class))).X2();
            case 11:
                int i2 = VideoActivity.I;
                return ((VideoTechBugreportComponent) m7m.a((VideoActivity) obj).mo408a(fpf0.a(VideoTechBugreportComponent.class))).getReporter();
            case 12:
                ImageView imageView = ((VideoCatalogHeaderBrandedVh) obj).q;
                return ((AuthBridgeComponent) ((k7m) m7m.c(imageView != null ? imageView : null)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 13:
                return VideoEditTimelineView.Q4((VideoEditTimelineView) obj);
            case 14:
                int i3 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoRestrictedUserActionsComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 15:
                return (VideoRestrictedUserActionsComponent) ((f8m) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class));
            case 16:
                return ((ClipActionsComponent) ((k7m) m7m.f((y6t0) obj)).mo408a(fpf0.a(ClipActionsComponent.class))).q5();
            case 17:
                ((vlt0) obj).f.Ff("video_traffic_saving");
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return (DonutVideoComponent) ((k7m) m7m.c((VideoView) obj)).a(fpf0.a(DonutVideoComponent.class));
            case 19:
                ((com.vk.superapp.browser.ui.a) obj).getClass();
                return new sxv0();
            case 20:
                return ((ggu0) obj).b;
            case 21:
                b2v0 b2v0Var = (b2v0) obj;
                i6m0 i6m0Var = b2v0Var.A;
                if (i6m0Var != null) {
                    i6m0Var.invoke();
                }
                b2v0Var.dismiss();
                return s3q0.a;
            case 22:
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) obj;
                int i4 = VkOnboardingHighlighter.m;
                if (vkOnboardingHighlighter.getChildCount() <= 0) {
                    throw new NoSuchElementException("Sequence is empty.");
                }
                View childAt = vkOnboardingHighlighter.getChildAt(0);
                if (childAt != null) {
                    return (TextView) childAt;
                }
                throw new IndexOutOfBoundsException();
            case 23:
                ((fav0) obj).a.a();
                return s3q0.a;
            case 24:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i5 = VoipCallServiceFragment.Y;
                rhw0.d dVar = rhw0.d.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, dVar);
                return s3q0.a;
            case 25:
                mjw0 mjw0Var = (mjw0) obj;
                VoipViewBehaviour voipViewBehaviour = mjw0Var.x;
                voipViewBehaviour.f.b = mjw0Var.y.f.b;
                voipViewBehaviour.i();
                mjw0.u(mjw0Var, mjw0Var.q0, false, false, 12);
                mjw0Var.y();
                return s3q0.a;
            case 26:
                int i6 = otw0.i1;
                return ((VoipAnalyticsInternalComponent) m7m.d((otw0) obj).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df();
            case 27:
                VoipReportSuspiciousCallActivity voipReportSuspiciousCallActivity = (VoipReportSuspiciousCallActivity) obj;
                dw20 dw20Var = voipReportSuspiciousCallActivity.l;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                voipReportSuspiciousCallActivity.finish();
                return s3q0.a;
            case 28:
                ((l5x0) obj).a.getClass();
                return new m4u0(new l5x0.d(0, com.vk.voip.ui.c.J(), rew0.class, "getCurrentCallUserId", "getCurrentCallUserId()Lcom/vk/dto/common/id/UserId;", 0));
            default:
                o7x0 o7x0Var = (o7x0) obj;
                ih80.b(o7x0Var.c, null, new ntw0(o7x0Var, 3), 3);
                return s3q0.a;
        }
    }
}
