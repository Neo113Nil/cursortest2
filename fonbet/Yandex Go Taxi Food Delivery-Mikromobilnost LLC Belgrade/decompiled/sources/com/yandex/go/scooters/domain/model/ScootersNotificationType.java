package com.yandex.go.scooters.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersNotificationType;", "", "SYSTEM", "DEFAULT", "IMPORTANT", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersNotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersNotificationType[] $VALUES;
    public static final ScootersNotificationType DEFAULT;
    public static final ScootersNotificationType IMPORTANT;
    public static final ScootersNotificationType SYSTEM;

    static {
        ScootersNotificationType scootersNotificationType = new ScootersNotificationType("SYSTEM", 0);
        SYSTEM = scootersNotificationType;
        ScootersNotificationType scootersNotificationType2 = new ScootersNotificationType("DEFAULT", 1);
        DEFAULT = scootersNotificationType2;
        ScootersNotificationType scootersNotificationType3 = new ScootersNotificationType("IMPORTANT", 2);
        IMPORTANT = scootersNotificationType3;
        ScootersNotificationType[] scootersNotificationTypeArr = {scootersNotificationType, scootersNotificationType2, scootersNotificationType3};
        $VALUES = scootersNotificationTypeArr;
        $ENTRIES = a.a(scootersNotificationTypeArr);
    }

    public static ScootersNotificationType valueOf(String str) {
        return (ScootersNotificationType) Enum.valueOf(ScootersNotificationType.class, str);
    }

    public static ScootersNotificationType[] values() {
        return (ScootersNotificationType[]) $VALUES.clone();
    }
}
