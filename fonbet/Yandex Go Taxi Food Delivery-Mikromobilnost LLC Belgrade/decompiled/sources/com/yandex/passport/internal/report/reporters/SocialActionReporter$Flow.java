package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/passport/internal/report/reporters/SocialActionReporter$Flow", "", "Lcom/yandex/passport/internal/report/reporters/SocialActionReporter$Flow;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BROWSER", "ESIA_APP_2_APP", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialActionReporter$Flow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SocialActionReporter$Flow[] $VALUES;
    public static final SocialActionReporter$Flow BROWSER;
    public static final SocialActionReporter$Flow ESIA_APP_2_APP;
    private final String value;

    static {
        SocialActionReporter$Flow socialActionReporter$Flow = new SocialActionReporter$Flow("BROWSER", 0, "browser");
        BROWSER = socialActionReporter$Flow;
        SocialActionReporter$Flow socialActionReporter$Flow2 = new SocialActionReporter$Flow("ESIA_APP_2_APP", 1, "esia_app2app");
        ESIA_APP_2_APP = socialActionReporter$Flow2;
        SocialActionReporter$Flow[] socialActionReporter$FlowArr = {socialActionReporter$Flow, socialActionReporter$Flow2};
        $VALUES = socialActionReporter$FlowArr;
        $ENTRIES = kotlin.enums.a.a(socialActionReporter$FlowArr);
    }

    public SocialActionReporter$Flow(String str, int i, String str2) {
        this.value = str2;
    }

    public static SocialActionReporter$Flow valueOf(String str) {
        return (SocialActionReporter$Flow) Enum.valueOf(SocialActionReporter$Flow.class, str);
    }

    public static SocialActionReporter$Flow[] values() {
        return (SocialActionReporter$Flow[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
