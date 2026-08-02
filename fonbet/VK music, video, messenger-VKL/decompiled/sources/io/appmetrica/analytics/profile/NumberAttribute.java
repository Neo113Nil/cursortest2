package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4892hl;
import io.appmetrica.analytics.impl.C5118qe;
import io.appmetrica.analytics.impl.C5311y4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.Sb;

/* loaded from: classes8.dex */
public final class NumberAttribute {
    private final F6 a;

    public NumberAttribute(String str, Cb cb, Sb sb) {
        this.a = new F6(str, cb, sb);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValue(double d) {
        return new UserProfileUpdate<>(new C5118qe(this.a.c, d, new Cb(), new E4(new Sb(new C5311y4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C5118qe(this.a.c, d, new Cb(), new C4892hl(new Sb(new C5311y4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueReset() {
        return new UserProfileUpdate<>(new Li(1, this.a.c, new Cb(), new Sb(new C5311y4(100))));
    }
}
