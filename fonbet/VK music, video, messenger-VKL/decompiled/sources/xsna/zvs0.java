package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.scene_dsl.transitions.MotionLayoutCurveFit;
import com.vkontakte.android.R;

/* compiled from: VideoMinimizableDiscoveryMotionScenePortraitTransitions.kt */
/* loaded from: classes7.dex */
public final class zvs0 {
    public static final void a(kdy kdyVar) {
        ddy ddyVar = new ddy();
        ddyVar.b = R.id.contentContainer;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ddyVar.i("alpha", valueOf);
        ddyVar.a = 50;
        MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
        ddyVar.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar);
        ddy ddyVar2 = new ddy();
        ddyVar2.b = R.id.relatedVideoItemsBackground;
        ddyVar2.i("alpha", valueOf);
        ddyVar2.a = 50;
        ddyVar2.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar2);
        ydy ydyVar = new ydy();
        ydyVar.b = R.id.dialogContainer;
        ydyVar.i("alpha", valueOf);
        ydyVar.a = 50;
        ydyVar.e = motionLayoutCurveFit.ordinal();
        kdyVar.b(ydyVar);
    }
}
