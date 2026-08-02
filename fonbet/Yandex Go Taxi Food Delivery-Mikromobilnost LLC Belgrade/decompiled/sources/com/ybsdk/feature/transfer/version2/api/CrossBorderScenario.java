package com.ybsdk.feature.transfer.version2.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "", "<init>", "(Ljava/lang/String;I)V", "PARTNER", "PARTNER_WITH_NAME", "PHONE_WITH_NAME", "isWithReceiverName", "", "()Z", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CrossBorderScenario[] $VALUES;
    public static final CrossBorderScenario PARTNER = new CrossBorderScenario("PARTNER", 0);
    public static final CrossBorderScenario PARTNER_WITH_NAME = new CrossBorderScenario("PARTNER_WITH_NAME", 1);
    public static final CrossBorderScenario PHONE_WITH_NAME = new CrossBorderScenario("PHONE_WITH_NAME", 2);

    private static final /* synthetic */ CrossBorderScenario[] $values() {
        return new CrossBorderScenario[]{PARTNER, PARTNER_WITH_NAME, PHONE_WITH_NAME};
    }

    static {
        CrossBorderScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CrossBorderScenario(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CrossBorderScenario valueOf(String str) {
        return (CrossBorderScenario) Enum.valueOf(CrossBorderScenario.class, str);
    }

    public static CrossBorderScenario[] values() {
        return (CrossBorderScenario[]) $VALUES.clone();
    }

    public final boolean isWithReceiverName() {
        return this == PARTNER_WITH_NAME || this == PHONE_WITH_NAME;
    }
}
