package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/UpgradeEvents$UpgradeDataEditField", "", "Lcom/ybsdk/core/analytics/generated/delegates/UpgradeEvents$UpgradeDataEditField;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "NAME", "LAST_NAME", "MIDDLE_NAME", "BIRTHDAY", "PASSPORT", "INN", "SECOND_DOCUMENT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpgradeEvents$UpgradeDataEditField {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeEvents$UpgradeDataEditField[] $VALUES;
    private final String originalValue;
    public static final UpgradeEvents$UpgradeDataEditField NAME = new UpgradeEvents$UpgradeDataEditField("NAME", 0, "name");
    public static final UpgradeEvents$UpgradeDataEditField LAST_NAME = new UpgradeEvents$UpgradeDataEditField("LAST_NAME", 1, "last name");
    public static final UpgradeEvents$UpgradeDataEditField MIDDLE_NAME = new UpgradeEvents$UpgradeDataEditField("MIDDLE_NAME", 2, "middle name");
    public static final UpgradeEvents$UpgradeDataEditField BIRTHDAY = new UpgradeEvents$UpgradeDataEditField("BIRTHDAY", 3, "birthday");
    public static final UpgradeEvents$UpgradeDataEditField PASSPORT = new UpgradeEvents$UpgradeDataEditField("PASSPORT", 4, "passport");
    public static final UpgradeEvents$UpgradeDataEditField INN = new UpgradeEvents$UpgradeDataEditField("INN", 5, "inn");
    public static final UpgradeEvents$UpgradeDataEditField SECOND_DOCUMENT = new UpgradeEvents$UpgradeDataEditField("SECOND_DOCUMENT", 6, "second document");

    private static final /* synthetic */ UpgradeEvents$UpgradeDataEditField[] $values() {
        return new UpgradeEvents$UpgradeDataEditField[]{NAME, LAST_NAME, MIDDLE_NAME, BIRTHDAY, PASSPORT, INN, SECOND_DOCUMENT};
    }

    static {
        UpgradeEvents$UpgradeDataEditField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UpgradeEvents$UpgradeDataEditField(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static UpgradeEvents$UpgradeDataEditField valueOf(String str) {
        return (UpgradeEvents$UpgradeDataEditField) Enum.valueOf(UpgradeEvents$UpgradeDataEditField.class, str);
    }

    public static UpgradeEvents$UpgradeDataEditField[] values() {
        return (UpgradeEvents$UpgradeDataEditField[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
