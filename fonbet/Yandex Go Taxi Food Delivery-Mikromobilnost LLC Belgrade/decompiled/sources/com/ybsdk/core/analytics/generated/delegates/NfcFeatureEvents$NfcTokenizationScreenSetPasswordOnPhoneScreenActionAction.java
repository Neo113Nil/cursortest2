package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "APPLY", "CLOSE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[] $VALUES;
    public static final NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction APPLY = new NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction("APPLY", 0, "apply");
    public static final NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction CLOSE = new NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction("CLOSE", 1, "close");
    private final String originalValue;

    private static final /* synthetic */ NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[] $values() {
        return new NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[]{APPLY, CLOSE};
    }

    static {
        NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction valueOf(String str) {
        return (NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction) Enum.valueOf(NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction.class, str);
    }

    public static NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[] values() {
        return (NfcFeatureEvents$NfcTokenizationScreenSetPasswordOnPhoneScreenActionAction[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
