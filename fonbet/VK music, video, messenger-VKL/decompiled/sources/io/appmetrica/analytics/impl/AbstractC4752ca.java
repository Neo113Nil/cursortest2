package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4752ca {
    public final C4778da a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new C4778da("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    public abstract C4778da b(FeatureInfo featureInfo);
}
