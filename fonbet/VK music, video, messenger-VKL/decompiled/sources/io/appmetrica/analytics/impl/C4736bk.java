package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4736bk extends AbstractC5121qh {
    public C4736bk(@NonNull Q6 q6) {
        super(q6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5121qh, io.appmetrica.analytics.impl.InterfaceC5146rh
    public final boolean a(@Nullable Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
