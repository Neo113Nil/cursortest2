package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoOverlayViewHelper.kt */
/* loaded from: classes.dex */
public interface l1t0 {
    static /* synthetic */ View c(l1t0 l1t0Var, Context context, float f, int i) {
        if ((i & 16) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return l1t0Var.e(context, f);
    }

    default View e(Context context, float f) {
        return new View(context);
    }

    default void b(int i, int i2, View view) {
    }

    default void f(int i, int i2, View view) {
    }

    default void a(View view, float f, float f2, float f3, float f4) {
    }

    default void d(View view, VideoFile videoFile, View view2, izs izsVar, izs izsVar2, View view3) {
    }
}
