package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Ji extends M4 {
    public Ji(J4 j4) {
        super(j4);
    }

    @Override // io.appmetrica.analytics.impl.M4
    public final boolean a(@NonNull C4722b6 c4722b6, @NonNull G4 g4) {
        Bundle bundle = c4722b6.m;
        this.a.k.a(new I4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
