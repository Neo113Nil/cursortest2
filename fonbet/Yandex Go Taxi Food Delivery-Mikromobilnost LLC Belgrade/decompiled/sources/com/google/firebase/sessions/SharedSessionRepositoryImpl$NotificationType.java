package com.google.firebase.sessions;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType", "", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedSessionRepositoryImpl$NotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedSessionRepositoryImpl$NotificationType[] $VALUES;
    public static final SharedSessionRepositoryImpl$NotificationType FALLBACK;
    public static final SharedSessionRepositoryImpl$NotificationType GENERAL;

    static {
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = new SharedSessionRepositoryImpl$NotificationType("GENERAL", 0);
        GENERAL = sharedSessionRepositoryImpl$NotificationType;
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType2 = new SharedSessionRepositoryImpl$NotificationType("FALLBACK", 1);
        FALLBACK = sharedSessionRepositoryImpl$NotificationType2;
        SharedSessionRepositoryImpl$NotificationType[] sharedSessionRepositoryImpl$NotificationTypeArr = {sharedSessionRepositoryImpl$NotificationType, sharedSessionRepositoryImpl$NotificationType2};
        $VALUES = sharedSessionRepositoryImpl$NotificationTypeArr;
        $ENTRIES = kotlin.enums.a.a(sharedSessionRepositoryImpl$NotificationTypeArr);
    }

    public static SharedSessionRepositoryImpl$NotificationType valueOf(String str) {
        return (SharedSessionRepositoryImpl$NotificationType) Enum.valueOf(SharedSessionRepositoryImpl$NotificationType.class, str);
    }

    public static SharedSessionRepositoryImpl$NotificationType[] values() {
        return (SharedSessionRepositoryImpl$NotificationType[]) $VALUES.clone();
    }
}
