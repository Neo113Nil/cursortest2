package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4748c6;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.Sb;

/* loaded from: classes8.dex */
public final class CounterAttribute {
    private final F6 a;

    public CounterAttribute(String str, Cb cb, Sb sb) {
        this.a = new F6(str, cb, sb);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withDelta(double d) {
        return new UserProfileUpdate<>(new C4748c6(this.a.c, d));
    }
}
