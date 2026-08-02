package com.ybsdk.screens.upgrade.presentation.edit;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange", "", "Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange;", "<init>", "(Ljava/lang/String;I)V", "BACKWARD", JCP.RAW_PREFIX, "FORWARD", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpgradeEditViewState$StepChange {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeEditViewState$StepChange[] $VALUES;
    public static final UpgradeEditViewState$StepChange BACKWARD = new UpgradeEditViewState$StepChange("BACKWARD", 0);
    public static final UpgradeEditViewState$StepChange NONE = new UpgradeEditViewState$StepChange(JCP.RAW_PREFIX, 1);
    public static final UpgradeEditViewState$StepChange FORWARD = new UpgradeEditViewState$StepChange("FORWARD", 2);

    private static final /* synthetic */ UpgradeEditViewState$StepChange[] $values() {
        return new UpgradeEditViewState$StepChange[]{BACKWARD, NONE, FORWARD};
    }

    static {
        UpgradeEditViewState$StepChange[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UpgradeEditViewState$StepChange(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static UpgradeEditViewState$StepChange valueOf(String str) {
        return (UpgradeEditViewState$StepChange) Enum.valueOf(UpgradeEditViewState$StepChange.class, str);
    }

    public static UpgradeEditViewState$StepChange[] values() {
        return (UpgradeEditViewState$StepChange[]) $VALUES.clone();
    }
}
