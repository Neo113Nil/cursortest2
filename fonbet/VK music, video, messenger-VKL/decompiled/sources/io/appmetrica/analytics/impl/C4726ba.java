package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4726ba extends AbstractC4752ca {
    @Override // io.appmetrica.analytics.impl.AbstractC4752ca
    public final C4778da b(@NonNull FeatureInfo featureInfo) {
        return new C4778da(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
