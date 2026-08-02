package com.yandex.go.sharing_personal_goals;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/SharingPersonalGoalsProgressStyle;", "", "NEUTRAL", "SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsProgressStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingPersonalGoalsProgressStyle[] $VALUES;
    public static final SharingPersonalGoalsProgressStyle NEUTRAL;
    public static final SharingPersonalGoalsProgressStyle SUCCESS;

    static {
        SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle = new SharingPersonalGoalsProgressStyle("NEUTRAL", 0);
        NEUTRAL = sharingPersonalGoalsProgressStyle;
        SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle2 = new SharingPersonalGoalsProgressStyle("SUCCESS", 1);
        SUCCESS = sharingPersonalGoalsProgressStyle2;
        SharingPersonalGoalsProgressStyle[] sharingPersonalGoalsProgressStyleArr = {sharingPersonalGoalsProgressStyle, sharingPersonalGoalsProgressStyle2};
        $VALUES = sharingPersonalGoalsProgressStyleArr;
        $ENTRIES = kotlin.enums.a.a(sharingPersonalGoalsProgressStyleArr);
    }

    public static SharingPersonalGoalsProgressStyle valueOf(String str) {
        return (SharingPersonalGoalsProgressStyle) Enum.valueOf(SharingPersonalGoalsProgressStyle.class, str);
    }

    public static SharingPersonalGoalsProgressStyle[] values() {
        return (SharingPersonalGoalsProgressStyle[]) $VALUES.clone();
    }
}
