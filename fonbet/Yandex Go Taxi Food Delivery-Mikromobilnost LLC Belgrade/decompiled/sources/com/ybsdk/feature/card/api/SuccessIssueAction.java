package com.ybsdk.feature.card.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/card/api/SuccessIssueAction;", "", "<init>", "(Ljava/lang/String;I)V", "Back", "OpenCardDetails", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SuccessIssueAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuccessIssueAction[] $VALUES;
    public static final SuccessIssueAction Back = new SuccessIssueAction("Back", 0);
    public static final SuccessIssueAction OpenCardDetails = new SuccessIssueAction("OpenCardDetails", 1);

    private static final /* synthetic */ SuccessIssueAction[] $values() {
        return new SuccessIssueAction[]{Back, OpenCardDetails};
    }

    static {
        SuccessIssueAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SuccessIssueAction(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SuccessIssueAction valueOf(String str) {
        return (SuccessIssueAction) Enum.valueOf(SuccessIssueAction.class, str);
    }

    public static SuccessIssueAction[] values() {
        return (SuccessIssueAction[]) $VALUES.clone();
    }
}
