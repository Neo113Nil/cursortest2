package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/OnboardingEvents$OnboardingStoriesShownOpenReason", "", "Lcom/ybsdk/core/analytics/generated/delegates/OnboardingEvents$OnboardingStoriesShownOpenReason;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "TAP_TO_NEXT", "TAP_TO_PREVIOUS", "TIME", "DEEPLINK_NEXT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingEvents$OnboardingStoriesShownOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OnboardingEvents$OnboardingStoriesShownOpenReason[] $VALUES;
    private final String originalValue;
    public static final OnboardingEvents$OnboardingStoriesShownOpenReason TAP_TO_NEXT = new OnboardingEvents$OnboardingStoriesShownOpenReason("TAP_TO_NEXT", 0, "tap_to_next");
    public static final OnboardingEvents$OnboardingStoriesShownOpenReason TAP_TO_PREVIOUS = new OnboardingEvents$OnboardingStoriesShownOpenReason("TAP_TO_PREVIOUS", 1, "tap_to_previous");
    public static final OnboardingEvents$OnboardingStoriesShownOpenReason TIME = new OnboardingEvents$OnboardingStoriesShownOpenReason("TIME", 2, RemoteBioParameters.TIME);
    public static final OnboardingEvents$OnboardingStoriesShownOpenReason DEEPLINK_NEXT = new OnboardingEvents$OnboardingStoriesShownOpenReason("DEEPLINK_NEXT", 3, "deeplink_next");

    private static final /* synthetic */ OnboardingEvents$OnboardingStoriesShownOpenReason[] $values() {
        return new OnboardingEvents$OnboardingStoriesShownOpenReason[]{TAP_TO_NEXT, TAP_TO_PREVIOUS, TIME, DEEPLINK_NEXT};
    }

    static {
        OnboardingEvents$OnboardingStoriesShownOpenReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OnboardingEvents$OnboardingStoriesShownOpenReason(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OnboardingEvents$OnboardingStoriesShownOpenReason valueOf(String str) {
        return (OnboardingEvents$OnboardingStoriesShownOpenReason) Enum.valueOf(OnboardingEvents$OnboardingStoriesShownOpenReason.class, str);
    }

    public static OnboardingEvents$OnboardingStoriesShownOpenReason[] values() {
        return (OnboardingEvents$OnboardingStoriesShownOpenReason[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
