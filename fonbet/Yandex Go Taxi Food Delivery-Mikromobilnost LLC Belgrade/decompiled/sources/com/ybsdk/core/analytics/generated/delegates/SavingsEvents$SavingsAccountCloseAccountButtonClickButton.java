package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsAccountCloseAccountButtonClickButton", "", "Lcom/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsAccountCloseAccountButtonClickButton;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CLOSE_DOCS", "CLOSE_SAVE", "CANCEL_CLOSE", "CLOSE", "LEGAL", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsEvents$SavingsAccountCloseAccountButtonClickButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsEvents$SavingsAccountCloseAccountButtonClickButton[] $VALUES;
    private final String originalValue;
    public static final SavingsEvents$SavingsAccountCloseAccountButtonClickButton CLOSE_DOCS = new SavingsEvents$SavingsAccountCloseAccountButtonClickButton("CLOSE_DOCS", 0, "close_docs");
    public static final SavingsEvents$SavingsAccountCloseAccountButtonClickButton CLOSE_SAVE = new SavingsEvents$SavingsAccountCloseAccountButtonClickButton("CLOSE_SAVE", 1, "close_save");
    public static final SavingsEvents$SavingsAccountCloseAccountButtonClickButton CANCEL_CLOSE = new SavingsEvents$SavingsAccountCloseAccountButtonClickButton("CANCEL_CLOSE", 2, "cancel_close");
    public static final SavingsEvents$SavingsAccountCloseAccountButtonClickButton CLOSE = new SavingsEvents$SavingsAccountCloseAccountButtonClickButton("CLOSE", 3, "close");
    public static final SavingsEvents$SavingsAccountCloseAccountButtonClickButton LEGAL = new SavingsEvents$SavingsAccountCloseAccountButtonClickButton("LEGAL", 4, "legal");

    private static final /* synthetic */ SavingsEvents$SavingsAccountCloseAccountButtonClickButton[] $values() {
        return new SavingsEvents$SavingsAccountCloseAccountButtonClickButton[]{CLOSE_DOCS, CLOSE_SAVE, CANCEL_CLOSE, CLOSE, LEGAL};
    }

    static {
        SavingsEvents$SavingsAccountCloseAccountButtonClickButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SavingsEvents$SavingsAccountCloseAccountButtonClickButton(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsEvents$SavingsAccountCloseAccountButtonClickButton valueOf(String str) {
        return (SavingsEvents$SavingsAccountCloseAccountButtonClickButton) Enum.valueOf(SavingsEvents$SavingsAccountCloseAccountButtonClickButton.class, str);
    }

    public static SavingsEvents$SavingsAccountCloseAccountButtonClickButton[] values() {
        return (SavingsEvents$SavingsAccountCloseAccountButtonClickButton[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
