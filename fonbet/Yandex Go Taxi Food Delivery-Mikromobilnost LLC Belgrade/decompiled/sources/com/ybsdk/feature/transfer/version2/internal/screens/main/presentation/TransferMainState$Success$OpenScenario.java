package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainState$Success$OpenScenario", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainState$Success$OpenScenario;", "", "requireNavigation", "<init>", "(Ljava/lang/String;IZ)V", "Z", "getRequireNavigation", "()Z", "PHONE", "REQUISITES", "CROSS_BORDER", "SELF", JCP.RAW_PREFIX, "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferMainState$Success$OpenScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferMainState$Success$OpenScenario[] $VALUES;
    private final boolean requireNavigation;
    public static final TransferMainState$Success$OpenScenario PHONE = new TransferMainState$Success$OpenScenario("PHONE", 0, true);
    public static final TransferMainState$Success$OpenScenario REQUISITES = new TransferMainState$Success$OpenScenario("REQUISITES", 1, true);
    public static final TransferMainState$Success$OpenScenario CROSS_BORDER = new TransferMainState$Success$OpenScenario("CROSS_BORDER", 2, true);
    public static final TransferMainState$Success$OpenScenario SELF = new TransferMainState$Success$OpenScenario("SELF", 3, false);
    public static final TransferMainState$Success$OpenScenario NONE = new TransferMainState$Success$OpenScenario(JCP.RAW_PREFIX, 4, false);

    private static final /* synthetic */ TransferMainState$Success$OpenScenario[] $values() {
        return new TransferMainState$Success$OpenScenario[]{PHONE, REQUISITES, CROSS_BORDER, SELF, NONE};
    }

    static {
        TransferMainState$Success$OpenScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferMainState$Success$OpenScenario(String str, int i, boolean z) {
        this.requireNavigation = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferMainState$Success$OpenScenario valueOf(String str) {
        return (TransferMainState$Success$OpenScenario) Enum.valueOf(TransferMainState$Success$OpenScenario.class, str);
    }

    public static TransferMainState$Success$OpenScenario[] values() {
        return (TransferMainState$Success$OpenScenario[]) $VALUES.clone();
    }

    public final boolean getRequireNavigation() {
        return this.requireNavigation;
    }
}
