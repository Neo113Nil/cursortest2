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
import io.appmetrica.analytics.impl.V2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes8.dex */
public class BirthDateAttribute {
    private final F6 a = new F6("appmetrica_birth_date", new C5008m8(), new Il());

    public final UserProfileUpdate a(Calendar calendar, String str, V2 v2) {
        return new UserProfileUpdate(new C4919in(this.a.c, new SimpleDateFormat(str).format(calendar.getTime()), new C4982l8(), new C5008m8(), v2));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new E4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C4892hl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new E4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C4892hl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withValueReset() {
        return new UserProfileUpdate<>(new Li(0, this.a.c, new C5008m8(), new Il()));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new E4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new C4892hl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new E4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C4892hl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new E4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5076oo> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new C4892hl(this.a.b));
    }
}
