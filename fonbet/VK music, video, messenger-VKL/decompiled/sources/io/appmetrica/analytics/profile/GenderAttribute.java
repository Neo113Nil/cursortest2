package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4892hl;
import io.appmetrica.analytics.impl.C4919in;
import io.appmetrica.analytics.impl.C4982l8;
import io.appmetrica.analytics.impl.C5008m8;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.Il;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import io.appmetrica.analytics.impl.Li;

/* loaded from: classes8.dex */
public class GenderAttribute {
    private final F6 a = new F6("appmetrica_gender", new C5008m8(), new Il());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String a;

        Gender(String str) {
            this.a = str;
        }

        public String getStringValue() {
            return this.a;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValue(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C4982l8 c4982l8 = new C4982l8();
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new C4919in(str, stringValue, c4982l8, f6.a, new E4(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C4982l8 c4982l8 = new C4982l8();
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new C4919in(str, stringValue, c4982l8, f6.a, new C4892hl(f6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5076oo> withValueReset() {
        F6 f6 = this.a;
        return new UserProfileUpdate<>(new Li(0, f6.c, f6.a, f6.b));
    }
}
