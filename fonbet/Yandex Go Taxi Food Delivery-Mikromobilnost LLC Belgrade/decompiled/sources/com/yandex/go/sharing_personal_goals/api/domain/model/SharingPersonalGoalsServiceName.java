package com.yandex.go.sharing_personal_goals.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/api/domain/model/SharingPersonalGoalsServiceName;", "", "SCOOTERS", "CHARGERS", "DRIVE", "go-client-android.features.sharing_personal_goals:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsServiceName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingPersonalGoalsServiceName[] $VALUES;
    public static final SharingPersonalGoalsServiceName CHARGERS;
    public static final SharingPersonalGoalsServiceName DRIVE;
    public static final SharingPersonalGoalsServiceName SCOOTERS;

    static {
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = new SharingPersonalGoalsServiceName("SCOOTERS", 0);
        SCOOTERS = sharingPersonalGoalsServiceName;
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName2 = new SharingPersonalGoalsServiceName("CHARGERS", 1);
        CHARGERS = sharingPersonalGoalsServiceName2;
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName3 = new SharingPersonalGoalsServiceName("DRIVE", 2);
        DRIVE = sharingPersonalGoalsServiceName3;
        SharingPersonalGoalsServiceName[] sharingPersonalGoalsServiceNameArr = {sharingPersonalGoalsServiceName, sharingPersonalGoalsServiceName2, sharingPersonalGoalsServiceName3};
        $VALUES = sharingPersonalGoalsServiceNameArr;
        $ENTRIES = a.a(sharingPersonalGoalsServiceNameArr);
    }

    public static SharingPersonalGoalsServiceName valueOf(String str) {
        return (SharingPersonalGoalsServiceName) Enum.valueOf(SharingPersonalGoalsServiceName.class, str);
    }

    public static SharingPersonalGoalsServiceName[] values() {
        return (SharingPersonalGoalsServiceName[]) $VALUES.clone();
    }
}
