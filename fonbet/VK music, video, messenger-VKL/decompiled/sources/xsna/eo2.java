package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.narratives.Narrative;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.dialogs.AnimationDialog.a;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypePinVideoAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class eo2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eo2(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        pn10 pn10Var = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AnimationDialog animationDialog = (AnimationDialog) obj3;
                tn10 tn10Var = (tn10) obj;
                int i2 = AnimationDialog.g0;
                pkk pkkVar = BaseAnimationDialog.Z;
                int i3 = 0;
                pn10 so = animationDialog.so((tn10) obj2, animationDialog.N, false);
                if (so != null) {
                    so.start();
                } else {
                    so = null;
                }
                animationDialog.S = so;
                pn10 so2 = animationDialog.so(tn10Var, animationDialog.N, false);
                if (so2 != null) {
                    so2.start();
                    pn10Var = so2;
                }
                animationDialog.R = pn10Var;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setDuration(animationDialog.N ? BaseAnimationDialog.a0 : 0L);
                ofFloat.setInterpolator(BaseAnimationDialog.Z);
                ofFloat.addUpdateListener(new fo2(animationDialog, i3));
                ofFloat.addListener(animationDialog.new a());
                ofFloat.start();
                animationDialog.T = ofFloat;
                break;
            case 1:
                WebView webView = (WebView) obj3;
                webView.removeJavascriptInterface((String) obj2);
                ((s1w0) ((nf3) obj).c).b(webView);
                break;
            case 2:
                fdi.D((View) obj3, HapticHelper.LIGHT);
                myc0.h((yvj) obj2, null, null, new p6t((mc90) obj, null), 3);
                break;
            case 3:
                ((r320) obj3).f((Context) obj2, (View) obj);
                break;
            case 4:
                y6s0 y6s0Var = (y6s0) obj3;
                s6s0 s6s0Var = (s6s0) obj2;
                Activity activity = (Activity) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.UNPIN, s6s0Var.a);
                }
                VideoFile videoFile = s6s0Var.a;
                long j = videoFile.I0().b;
                int o0 = videoFile.o0();
                UiTracker uiTracker = UiTracker.a;
                new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypePinVideoAction(j, o0, MobileOfficialAppsVideoStat$TypePinVideoAction.EventType.UNPIN_VIDEO, null, MobileOfficialAppsVideoStat$TypePinVideoAction.VideoType.VIDEO, MobileOfficialAppsVideoStat$TypePinVideoAction.EventSubtype.FROM_MAIN, 8, null), 3)).q();
                j3t0.a(activity, activity.getString(R.string.video_unpinned));
                break;
            default:
                smq.f(((xsq0) obj3).a.l, (Context) obj2, (Narrative) obj, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
        }
        return s3q0.a;
    }
}
