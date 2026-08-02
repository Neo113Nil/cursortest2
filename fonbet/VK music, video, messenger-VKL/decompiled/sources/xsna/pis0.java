package xsna;

import android.graphics.Matrix;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.core.snackbar.HideReason;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.toggle.features.ImFeatures;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vk.writebar.WriteBar;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.gy50;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pis0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pis0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        float[] fArr;
        gzs gzsVar;
        Void u;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                VideoEffect videoEffect = (VideoEffect) obj;
                FilterItem filterItem = videoEffect.c;
                VideoTransformEffect videoTransformEffect = videoEffect.b;
                boolean z2 = filterItem != null && filterItem.f;
                if (videoTransformEffect == null || (fArr = videoTransformEffect.b) == null) {
                    z = false;
                } else {
                    Matrix matrix = new Matrix();
                    matrix.setValues(fArr);
                    z = !matrix.isIdentity();
                }
                return Boolean.valueOf(z2 || z || (((videoTransformEffect != null ? videoTransformEffect.e : 0.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : ((videoTransformEffect != null ? videoTransformEffect.e : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) > 0));
            case 1:
                p870 f = p870.f();
                dck dckVar = ((yks0) obj).h;
                f.b(102, dckVar);
                p870.f().b(9, dckVar);
                p870.f().b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, dckVar);
                return s3q0.a;
            case 2:
                int i2 = VideoInteractiveFullscreenFragment.Q0;
                return ((BridgeComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).a(fpf0.a(BridgeComponent.class))).p();
            case 3:
                ((jss0) obj).d.Ff("video_link_stats_bottom_sheet");
                return s3q0.a;
            case 4:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return (v8f0) ((CastComponent) ((VideoMinimizableDiscoveryFragment) obj).ko().e.getValue()).s2();
            case 5:
                return (VkVideoPromoComponent) ((f8m) obj).a(fpf0.a(VkVideoPromoComponent.class));
            case 6:
                ((hbt0) obj).C(new r0d0(3));
                return s3q0.a;
            case 7:
                return ((VideoRestrictedUserActionsComponent) m7m.d((ect0) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 8:
                return VideoView.C((VideoView) obj);
            case 9:
                return new qxk0(((uxt0) obj).x);
            case 10:
                y3i y3iVar = ((com.vk.attachpicker.screen.p) obj).c0;
                if (y3iVar != null) {
                    y3iVar.invoke();
                }
                return s3q0.a;
            case 11:
                return ((VkAnalyticsComponent) m7m.d((com.vk.superapp.browser.ui.a) obj).mo408a(fpf0.a(VkAnalyticsComponent.class))).qc();
            case 12:
                return new xdj0(((com.vk.feed.design.view.newsfeed.ads_action_button.c) obj).D);
            case 13:
                VkOnboardingHighlighter.e((VkOnboardingHighlighter) obj, false, 5000L, false, null, 12);
                return s3q0.a;
            case 14:
                l7k0 l7k0Var = (l7k0) obj;
                HideReason hideReason = HideReason.Swipe;
                if (l7k0Var.h.isActive()) {
                    Object obj2 = flv0.a;
                    flv0.b(l7k0Var.b, hideReason);
                }
                return Boolean.TRUE;
            case 15:
                FragmentManager fragmentManager = (FragmentManager) obj;
                com.vk.voip.ui.c.b.getClass();
                if (com.vk.voip.ui.c.z0()) {
                    fw6 fw6Var = com.vk.voip.ui.c.W;
                    if (fw6Var != null) {
                        fw6Var.b(fragmentManager);
                    }
                } else {
                    com.vk.voip.ui.c.S0(gy50.a.a);
                }
                return s3q0.a;
            case 16:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i4 = VoipCallServiceFragment.Y;
                rhw0.q qVar = rhw0.q.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, qVar);
                return s3q0.a;
            case 17:
                return mjw0.d((mjw0) obj);
            case 18:
                xyt xytVar = (xyt) obj;
                if (xytVar != null && (gzsVar = (gzs) xytVar.b) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 19:
                int i5 = VoipReportSuspiciousCallActivity.q;
                ((VoipReportSuspiciousCallActivity) obj).finish();
                return s3q0.a;
            case 20:
                ((cd80) obj).getClass();
                return s3q0.a;
            case 21:
                com.vk.writebar.c cVar = (com.vk.writebar.c) obj;
                ImFeatures imFeatures = ImFeatures.BLUR_POST;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures) && cVar.b.getState().o == WriteBar.Source.COMMUNITY_CHANNEL) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                u = ((ru.mail.libverify.api.s) obj).u();
                return u;
        }
    }
}
