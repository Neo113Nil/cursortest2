package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4892hl;
import io.appmetrica.analytics.impl.C4925j3;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.InterfaceC5234v2;
import io.appmetrica.analytics.impl.Li;

/* loaded from: classes8.dex */
public class BooleanAttribute {
    private final F6 a;

    public BooleanAttribute(String str, Co co, InterfaceC5234v2 interfaceC5234v2) {
        this.a = new F6(str, co, interfaceC5234v2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValue(boolean z) {
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new C4925j3(f6.c, z, f6.a, new E4(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueIfUndefined(boolean z) {
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new C4925j3(f6.c, z, f6.a, new C4892hl(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueReset() {
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new Li(3, f6.c, f6.a, f6.b));
    }
}
