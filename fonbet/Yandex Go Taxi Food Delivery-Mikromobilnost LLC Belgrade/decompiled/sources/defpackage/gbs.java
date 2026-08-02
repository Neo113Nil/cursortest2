package defpackage;

import android.util.Range;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;

/* loaded from: classes10.dex */
public final class gbs extends b3u {
    public static final Range d = new Range(30, 30);
    public final int a = 60;
    public final int b = 60;
    public final FeatureTypeInternal c = FeatureTypeInternal.FPS_RANGE;

    @Override // defpackage.b3u
    public final FeatureTypeInternal a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.a);
        sb.append(", maxFps=");
        return oyr.s(sb, this.b, ')');
    }
}
