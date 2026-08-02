package com.yandex.go.navigation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/navigation/UserPhotoUploadingEntryPoint;", "", "IN_APP_NOTIFICATION", "NOTIFICATION", "MENU", "DEEPLINK", "PROFILE", "RESTORED", "SAFETY_CENTER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserPhotoUploadingEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserPhotoUploadingEntryPoint[] $VALUES;
    public static final UserPhotoUploadingEntryPoint DEEPLINK;
    public static final UserPhotoUploadingEntryPoint IN_APP_NOTIFICATION;
    public static final UserPhotoUploadingEntryPoint MENU;
    public static final UserPhotoUploadingEntryPoint NOTIFICATION;
    public static final UserPhotoUploadingEntryPoint PROFILE;
    public static final UserPhotoUploadingEntryPoint RESTORED;
    public static final UserPhotoUploadingEntryPoint SAFETY_CENTER;

    static {
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint = new UserPhotoUploadingEntryPoint("IN_APP_NOTIFICATION", 0);
        IN_APP_NOTIFICATION = userPhotoUploadingEntryPoint;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint2 = new UserPhotoUploadingEntryPoint("NOTIFICATION", 1);
        NOTIFICATION = userPhotoUploadingEntryPoint2;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint3 = new UserPhotoUploadingEntryPoint("MENU", 2);
        MENU = userPhotoUploadingEntryPoint3;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint4 = new UserPhotoUploadingEntryPoint("DEEPLINK", 3);
        DEEPLINK = userPhotoUploadingEntryPoint4;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint5 = new UserPhotoUploadingEntryPoint("PROFILE", 4);
        PROFILE = userPhotoUploadingEntryPoint5;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint6 = new UserPhotoUploadingEntryPoint("RESTORED", 5);
        RESTORED = userPhotoUploadingEntryPoint6;
        UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint7 = new UserPhotoUploadingEntryPoint("SAFETY_CENTER", 6);
        SAFETY_CENTER = userPhotoUploadingEntryPoint7;
        UserPhotoUploadingEntryPoint[] userPhotoUploadingEntryPointArr = {userPhotoUploadingEntryPoint, userPhotoUploadingEntryPoint2, userPhotoUploadingEntryPoint3, userPhotoUploadingEntryPoint4, userPhotoUploadingEntryPoint5, userPhotoUploadingEntryPoint6, userPhotoUploadingEntryPoint7};
        $VALUES = userPhotoUploadingEntryPointArr;
        $ENTRIES = kotlin.enums.a.a(userPhotoUploadingEntryPointArr);
    }

    public static UserPhotoUploadingEntryPoint valueOf(String str) {
        return (UserPhotoUploadingEntryPoint) Enum.valueOf(UserPhotoUploadingEntryPoint.class, str);
    }

    public static UserPhotoUploadingEntryPoint[] values() {
        return (UserPhotoUploadingEntryPoint[]) $VALUES.clone();
    }
}
