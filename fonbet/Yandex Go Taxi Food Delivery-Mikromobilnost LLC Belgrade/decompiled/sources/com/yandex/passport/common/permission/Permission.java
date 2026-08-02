package com.yandex.passport.common.permission;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/passport/common/permission/Permission;", "", "", "permissionString", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "com/yandex/passport/common/permission/a", "ACCESS_COARSE_LOCATION", "ACCESS_FINE_LOCATION", "ACCESS_BACKGROUND_LOCATION", "ACCESS_NETWORK_STATE", "RECORD_AUDIO", "READ_CONTACTS", "CALL_PHONE", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE", "CAMERA", "BLUETOOTH_CONNECT", "READ_PHONE_STATE", "WAKE_LOCK", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Permission {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Permission[] $VALUES;
    public static final Permission ACCESS_BACKGROUND_LOCATION;
    public static final Permission ACCESS_COARSE_LOCATION;
    public static final Permission ACCESS_FINE_LOCATION;
    public static final Permission ACCESS_NETWORK_STATE;
    public static final Permission BLUETOOTH_CONNECT;
    public static final Permission CALL_PHONE;
    public static final Permission CAMERA;
    public static final a Companion;
    public static final Permission READ_CONTACTS;
    public static final Permission READ_EXTERNAL_STORAGE;
    public static final Permission READ_PHONE_STATE;
    public static final Permission RECORD_AUDIO;
    public static final Permission WAKE_LOCK;
    public static final Permission WRITE_EXTERNAL_STORAGE;
    private final String permissionString;

    static {
        Permission permission = new Permission("ACCESS_COARSE_LOCATION", 0, "android.permission.ACCESS_COARSE_LOCATION");
        ACCESS_COARSE_LOCATION = permission;
        Permission permission2 = new Permission("ACCESS_FINE_LOCATION", 1, "android.permission.ACCESS_FINE_LOCATION");
        ACCESS_FINE_LOCATION = permission2;
        Permission permission3 = new Permission("ACCESS_BACKGROUND_LOCATION", 2, "android.permission.ACCESS_BACKGROUND_LOCATION");
        ACCESS_BACKGROUND_LOCATION = permission3;
        Permission permission4 = new Permission("ACCESS_NETWORK_STATE", 3, "android.permission.ACCESS_NETWORK_STATE");
        ACCESS_NETWORK_STATE = permission4;
        Permission permission5 = new Permission("RECORD_AUDIO", 4, "android.permission.RECORD_AUDIO");
        RECORD_AUDIO = permission5;
        Permission permission6 = new Permission("READ_CONTACTS", 5, "android.permission.READ_CONTACTS");
        READ_CONTACTS = permission6;
        Permission permission7 = new Permission("CALL_PHONE", 6, "android.permission.CALL_PHONE");
        CALL_PHONE = permission7;
        Permission permission8 = new Permission("READ_EXTERNAL_STORAGE", 7, "android.permission.READ_EXTERNAL_STORAGE");
        READ_EXTERNAL_STORAGE = permission8;
        Permission permission9 = new Permission("WRITE_EXTERNAL_STORAGE", 8, "android.permission.WRITE_EXTERNAL_STORAGE");
        WRITE_EXTERNAL_STORAGE = permission9;
        Permission permission10 = new Permission("CAMERA", 9, "android.permission.CAMERA");
        CAMERA = permission10;
        Permission permission11 = new Permission("BLUETOOTH_CONNECT", 10, "android.permission.BLUETOOTH_CONNECT");
        BLUETOOTH_CONNECT = permission11;
        Permission permission12 = new Permission("READ_PHONE_STATE", 11, "android.permission.READ_PHONE_STATE");
        READ_PHONE_STATE = permission12;
        Permission permission13 = new Permission("WAKE_LOCK", 12, "android.permission.WAKE_LOCK");
        WAKE_LOCK = permission13;
        Permission[] permissionArr = {permission, permission2, permission3, permission4, permission5, permission6, permission7, permission8, permission9, permission10, permission11, permission12, permission13};
        $VALUES = permissionArr;
        $ENTRIES = kotlin.enums.a.a(permissionArr);
        Companion = new a();
    }

    public Permission(String str, int i, String str2) {
        this.permissionString = str2;
    }

    public static Permission valueOf(String str) {
        return (Permission) Enum.valueOf(Permission.class, str);
    }

    public static Permission[] values() {
        return (Permission[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getPermissionString() {
        return this.permissionString;
    }
}
