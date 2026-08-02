package com.yandex.passport.internal.ui.domik;

import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/FinishRegistrationActivities;", "", ProxyPassportActivity.ACTION_BIND_PHONE, "SOCIAL_REGISTRATION", "LITE_REGISTRATION", "FORCE_UPGRADE", "SKIP_VERIFY", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinishRegistrationActivities {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FinishRegistrationActivities[] $VALUES;
    public static final FinishRegistrationActivities BIND_PHONE;
    public static final FinishRegistrationActivities FORCE_UPGRADE;
    public static final FinishRegistrationActivities LITE_REGISTRATION;
    public static final FinishRegistrationActivities SKIP_VERIFY;
    public static final FinishRegistrationActivities SOCIAL_REGISTRATION;

    static {
        FinishRegistrationActivities finishRegistrationActivities = new FinishRegistrationActivities(ProxyPassportActivity.ACTION_BIND_PHONE, 0);
        BIND_PHONE = finishRegistrationActivities;
        FinishRegistrationActivities finishRegistrationActivities2 = new FinishRegistrationActivities("SOCIAL_REGISTRATION", 1);
        SOCIAL_REGISTRATION = finishRegistrationActivities2;
        FinishRegistrationActivities finishRegistrationActivities3 = new FinishRegistrationActivities("LITE_REGISTRATION", 2);
        LITE_REGISTRATION = finishRegistrationActivities3;
        FinishRegistrationActivities finishRegistrationActivities4 = new FinishRegistrationActivities("FORCE_UPGRADE", 3);
        FORCE_UPGRADE = finishRegistrationActivities4;
        FinishRegistrationActivities finishRegistrationActivities5 = new FinishRegistrationActivities("SKIP_VERIFY", 4);
        SKIP_VERIFY = finishRegistrationActivities5;
        FinishRegistrationActivities[] finishRegistrationActivitiesArr = {finishRegistrationActivities, finishRegistrationActivities2, finishRegistrationActivities3, finishRegistrationActivities4, finishRegistrationActivities5};
        $VALUES = finishRegistrationActivitiesArr;
        $ENTRIES = kotlin.enums.a.a(finishRegistrationActivitiesArr);
    }

    public static FinishRegistrationActivities valueOf(String str) {
        return (FinishRegistrationActivities) Enum.valueOf(FinishRegistrationActivities.class, str);
    }

    public static FinishRegistrationActivities[] values() {
        return (FinishRegistrationActivities[]) $VALUES.clone();
    }
}
