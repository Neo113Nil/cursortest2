package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes8.dex */
public final class Ih extends AbstractC5121qh {
    public Ih(Q6 q6) {
        super(q6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5121qh, io.appmetrica.analytics.impl.InterfaceC5146rh
    public final boolean a(@Nullable Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
