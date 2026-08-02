package com.yandex.go.sharing_personal_goals;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/SharingPersonalGoalsPrimaryButtonStyle;", "", "MAIN", "MINOR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsPrimaryButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingPersonalGoalsPrimaryButtonStyle[] $VALUES;
    public static final SharingPersonalGoalsPrimaryButtonStyle MAIN;
    public static final SharingPersonalGoalsPrimaryButtonStyle MINOR;

    static {
        SharingPersonalGoalsPrimaryButtonStyle sharingPersonalGoalsPrimaryButtonStyle = new SharingPersonalGoalsPrimaryButtonStyle("MAIN", 0);
        MAIN = sharingPersonalGoalsPrimaryButtonStyle;
        SharingPersonalGoalsPrimaryButtonStyle sharingPersonalGoalsPrimaryButtonStyle2 = new SharingPersonalGoalsPrimaryButtonStyle("MINOR", 1);
        MINOR = sharingPersonalGoalsPrimaryButtonStyle2;
        SharingPersonalGoalsPrimaryButtonStyle[] sharingPersonalGoalsPrimaryButtonStyleArr = {sharingPersonalGoalsPrimaryButtonStyle, sharingPersonalGoalsPrimaryButtonStyle2};
        $VALUES = sharingPersonalGoalsPrimaryButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(sharingPersonalGoalsPrimaryButtonStyleArr);
    }

    public static SharingPersonalGoalsPrimaryButtonStyle valueOf(String str) {
        return (SharingPersonalGoalsPrimaryButtonStyle) Enum.valueOf(SharingPersonalGoalsPrimaryButtonStyle.class, str);
    }

    public static SharingPersonalGoalsPrimaryButtonStyle[] values() {
        return (SharingPersonalGoalsPrimaryButtonStyle[]) $VALUES.clone();
    }
}
