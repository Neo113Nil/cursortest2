package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4868gn;
import io.appmetrica.analytics.impl.C4894hn;
import io.appmetrica.analytics.impl.C4917il;
import io.appmetrica.analytics.impl.C5008m8;
import io.appmetrica.analytics.impl.C5311y4;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.Sb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class FirstPartyDataPhoneSha256Attribute {
    private final F6 a = new F6("appmetrica_1pd_phone_sha256", new C5008m8(), new Sb(new C5311y4(100)));
    private final C4917il b;

    public FirstPartyDataPhoneSha256Attribute(C4917il c4917il) {
        this.b = c4917il;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withPhoneValues(@NonNull String... strArr) {
        return withPhoneValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withPhoneValues(@NonNull Iterable<String> iterable) {
        String str = this.a.c;
        ArrayList a = this.b.a(iterable);
        C4894hn c4894hn = new C4894hn(200, "First party data phones attribute", PublicLogger.getAnonymousInstance());
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new C4868gn(str, a, 10, c4894hn, f6.a, new E4(f6.b)));
    }
}
