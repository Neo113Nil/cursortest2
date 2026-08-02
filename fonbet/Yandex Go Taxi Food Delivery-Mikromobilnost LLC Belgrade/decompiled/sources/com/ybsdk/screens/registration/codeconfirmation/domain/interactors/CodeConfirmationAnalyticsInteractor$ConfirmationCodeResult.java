package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/screens/registration/codeconfirmation/domain/interactors/CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult", "", "Lcom/ybsdk/screens/registration/codeconfirmation/domain/interactors/CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult;", "<init>", "(Ljava/lang/String;I)V", "OK", "CANCEL", "ERROR", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[] $VALUES;
    public static final CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult OK = new CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult("OK", 0);
    public static final CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult CANCEL = new CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult("CANCEL", 1);
    public static final CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult ERROR = new CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult("ERROR", 2);

    private static final /* synthetic */ CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[] $values() {
        return new CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[]{OK, CANCEL, ERROR};
    }

    static {
        CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult valueOf(String str) {
        return (CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult) Enum.valueOf(CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.class, str);
    }

    public static CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[] values() {
        return (CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult[]) $VALUES.clone();
    }
}
