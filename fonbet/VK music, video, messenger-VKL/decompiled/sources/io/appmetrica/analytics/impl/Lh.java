package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes8.dex */
public final class Lh extends AbstractC5238v6 {
    public final AbstractC4869go d;

    public Lh(@NonNull Context context, @NonNull AbstractC4869go abstractC4869go, @NonNull InterfaceC5213u6 interfaceC5213u6, @Nullable ICrashTransformer iCrashTransformer) {
        this(abstractC4869go, interfaceC5213u6, iCrashTransformer, new Y9(context));
    }

    public Lh(AbstractC4869go abstractC4869go, InterfaceC5213u6 interfaceC5213u6, ICrashTransformer iCrashTransformer, Y9 y9) {
        super(interfaceC5213u6, iCrashTransformer, y9);
        this.d = abstractC4869go;
    }
}
