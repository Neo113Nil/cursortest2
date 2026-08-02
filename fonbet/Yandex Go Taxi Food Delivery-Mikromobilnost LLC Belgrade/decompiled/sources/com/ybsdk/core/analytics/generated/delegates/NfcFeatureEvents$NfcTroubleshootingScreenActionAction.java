package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcTroubleshootingScreenActionAction", "", "Lcom/ybsdk/core/analytics/generated/delegates/NfcFeatureEvents$NfcTroubleshootingScreenActionAction;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "BACK", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NfcFeatureEvents$NfcTroubleshootingScreenActionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFeatureEvents$NfcTroubleshootingScreenActionAction[] $VALUES;
    private final String originalValue;
    public static final NfcFeatureEvents$NfcTroubleshootingScreenActionAction OK = new NfcFeatureEvents$NfcTroubleshootingScreenActionAction("OK", 0, WriteBlocks.OK);
    public static final NfcFeatureEvents$NfcTroubleshootingScreenActionAction BACK = new NfcFeatureEvents$NfcTroubleshootingScreenActionAction("BACK", 1, "back");

    private static final /* synthetic */ NfcFeatureEvents$NfcTroubleshootingScreenActionAction[] $values() {
        return new NfcFeatureEvents$NfcTroubleshootingScreenActionAction[]{OK, BACK};
    }

    static {
        NfcFeatureEvents$NfcTroubleshootingScreenActionAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcFeatureEvents$NfcTroubleshootingScreenActionAction(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFeatureEvents$NfcTroubleshootingScreenActionAction valueOf(String str) {
        return (NfcFeatureEvents$NfcTroubleshootingScreenActionAction) Enum.valueOf(NfcFeatureEvents$NfcTroubleshootingScreenActionAction.class, str);
    }

    public static NfcFeatureEvents$NfcTroubleshootingScreenActionAction[] values() {
        return (NfcFeatureEvents$NfcTroubleshootingScreenActionAction[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
