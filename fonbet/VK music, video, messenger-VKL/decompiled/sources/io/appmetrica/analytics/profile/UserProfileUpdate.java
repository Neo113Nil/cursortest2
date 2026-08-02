package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC5076oo;

/* loaded from: classes8.dex */
public class UserProfileUpdate<T extends InterfaceC5076oo> {
    private final InterfaceC5076oo a;

    public UserProfileUpdate(InterfaceC5076oo interfaceC5076oo) {
        this.a = interfaceC5076oo;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.a;
    }
}
