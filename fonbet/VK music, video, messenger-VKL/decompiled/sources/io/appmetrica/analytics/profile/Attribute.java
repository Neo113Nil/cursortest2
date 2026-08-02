package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4894hn;
import io.appmetrica.analytics.impl.C4917il;
import io.appmetrica.analytics.impl.C5305xn;
import io.appmetrica.analytics.impl.C5311y4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.H8;
import io.appmetrica.analytics.impl.Me;
import io.appmetrica.analytics.impl.Sb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import xsna.zr;

/* loaded from: classes8.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new Cb(), new Sb(new C5311y4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new Cb(), new Sb(new C5311y4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new Cb(), new Sb(new C5311y4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C4894hn(200, zr.a("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new Cb(), new Sb(new C5311y4(100)));
    }

    @NonNull
    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new C4917il(new H8()));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    @NonNull
    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new C4917il(new Me()));
    }

    @NonNull
    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new C4917il(new C5305xn()));
    }
}
