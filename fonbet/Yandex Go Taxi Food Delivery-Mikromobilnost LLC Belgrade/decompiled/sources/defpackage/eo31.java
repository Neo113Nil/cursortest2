package defpackage;

import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature$StabilizationMode;

/* loaded from: classes10.dex */
public final class eo31 extends b3u {
    public static final VideoStabilizationFeature$StabilizationMode c = VideoStabilizationFeature$StabilizationMode.OFF;
    public final VideoStabilizationFeature$StabilizationMode a;
    public final FeatureTypeInternal b = FeatureTypeInternal.VIDEO_STABILIZATION;

    public eo31(VideoStabilizationFeature$StabilizationMode videoStabilizationFeature$StabilizationMode) {
        this.a = videoStabilizationFeature$StabilizationMode;
    }

    @Override // defpackage.b3u
    public final FeatureTypeInternal a() {
        return this.b;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
