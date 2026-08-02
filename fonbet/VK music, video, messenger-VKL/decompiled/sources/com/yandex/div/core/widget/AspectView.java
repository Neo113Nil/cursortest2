package com.yandex.div.core.widget;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.izs;
import xsna.p7f0;

/* compiled from: AspectView.kt */
/* loaded from: classes7.dex */
public interface AspectView {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AspectView.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final p7f0<View, Float> aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new izs<Float, Float>() { // from class: com.yandex.div.core.widget.AspectView$Companion$aspectRatioProperty$1
                public final Float invoke(float f) {
                    if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = 0.0f;
                    }
                    return Float.valueOf(f);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ Float invoke(Float f) {
                    return invoke(f.floatValue());
                }
            });
        }
    }

    void setAspectRatio(float f);
}
