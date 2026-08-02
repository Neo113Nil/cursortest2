package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton", "", "Lcom/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CLOSE", "LIST_SOURCES", "DOCUMENTS", "LEGAL", "OPEN_TOPUP_FUND", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[] $VALUES;
    private final String originalValue;
    public static final SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton CLOSE = new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton("CLOSE", 0, "close");
    public static final SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton LIST_SOURCES = new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton("LIST_SOURCES", 1, "list_sources");
    public static final SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton DOCUMENTS = new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton("DOCUMENTS", 2, "documents");
    public static final SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton LEGAL = new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton("LEGAL", 3, "legal");
    public static final SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton OPEN_TOPUP_FUND = new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton("OPEN_TOPUP_FUND", 4, "open_topup_fund");

    private static final /* synthetic */ SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[] $values() {
        return new SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[]{CLOSE, LIST_SOURCES, DOCUMENTS, LEGAL, OPEN_TOPUP_FUND};
    }

    static {
        SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton valueOf(String str) {
        return (SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton) Enum.valueOf(SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton.class, str);
    }

    public static SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[] values() {
        return (SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
