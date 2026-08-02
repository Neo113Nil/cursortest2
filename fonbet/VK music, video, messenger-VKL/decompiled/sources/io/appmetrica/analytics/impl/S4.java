package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes8.dex */
public abstract class S4 extends A5 {
    public S4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, X5> componentLoader, @NonNull C5100pm c5100pm, @NonNull BaseRequestConfig.BaseRequestArguments<A4, Object> baseRequestArguments) {
        super(componentLoader, c5100pm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.A5
    public final void a(@NonNull Object obj) {
        A4 a4 = (A4) obj;
        synchronized (this) {
            super.a((Object) a4);
        }
    }

    public final synchronized void a(@NonNull A4 a4) {
        super.a((Object) a4);
    }
}
