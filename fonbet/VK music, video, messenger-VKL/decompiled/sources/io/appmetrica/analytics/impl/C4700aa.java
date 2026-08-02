package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4700aa extends AbstractC4752ca {
    @Override // io.appmetrica.analytics.impl.AbstractC4752ca
    @TargetApi(24)
    public final C4778da b(@NonNull FeatureInfo featureInfo) {
        return new C4778da(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
