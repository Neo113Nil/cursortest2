package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4892hl;
import io.appmetrica.analytics.impl.C4894hn;
import io.appmetrica.analytics.impl.C4919in;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.InterfaceC5234v2;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.Vn;

/* loaded from: classes8.dex */
public class StringAttribute {
    private final Vn a;
    private final F6 b;

    public StringAttribute(String str, C4894hn c4894hn, Co co, InterfaceC5234v2 interfaceC5234v2) {
        this.b = new F6(str, co, interfaceC5234v2);
        this.a = c4894hn;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValue(@NonNull String str) {
        F6 f6 = this.b;
        return new UserProfileUpdate<>(new C4919in(f6.c, str, this.a, f6.a, new E4(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueIfUndefined(@NonNull String str) {
        F6 f6 = this.b;
        return new UserProfileUpdate<>(new C4919in(f6.c, str, this.a, f6.a, new C4892hl(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueReset() {
        F6 f6 = this.b;
        return new UserProfileUpdate<>(new Li(0, f6.c, f6.a, f6.b));
    }
}
