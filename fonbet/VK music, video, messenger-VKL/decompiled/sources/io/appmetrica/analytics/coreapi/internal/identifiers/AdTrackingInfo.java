package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.tn;

/* loaded from: classes8.dex */
public class AdTrackingInfo {

    @Nullable
    public final String advId;

    @Nullable
    public final Boolean limitedAdTracking;

    @NonNull
    public final Provider provider;

    public enum Provider {
        GOOGLE,
        HMS,
        YANDEX
    }

    public AdTrackingInfo(@NonNull Provider provider, @Nullable String str, @Nullable Boolean bool) {
        this.provider = provider;
        this.advId = str;
        this.limitedAdTracking = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdTrackingInfo{provider=");
        sb.append(this.provider);
        sb.append(", advId='");
        sb.append(this.advId);
        sb.append("', limitedAdTracking=");
        return tn.a(sb, this.limitedAdTracking, '}');
    }
}
