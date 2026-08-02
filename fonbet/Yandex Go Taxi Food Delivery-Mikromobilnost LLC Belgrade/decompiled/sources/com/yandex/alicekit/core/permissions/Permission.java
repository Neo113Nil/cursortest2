package com.yandex.alicekit.core.permissions;

import defpackage.vxa0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/alicekit/core/permissions/Permission;", "", "", "permissionString", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "vxa0", "ACCESS_COARSE_LOCATION", "ACCESS_FINE_LOCATION", "ACCESS_BACKGROUND_LOCATION", "RECORD_AUDIO", "READ_CONTACTS", "CALL_PHONE", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE", "READ_MEDIA_IMAGES", "READ_MEDIA_VIDEO", "READ_MEDIA_VISUAL_USER_SELECTED", "READ_MEDIA_AUDIO", "NEARBY_DEVICES", "POST_NOTIFICATIONS", "CAMERA", "BLUETOOTH_CONNECT", "READ_PHONE_STATE", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum Permission {
    ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    ACCESS_BACKGROUND_LOCATION("android.permission.ACCESS_BACKGROUND_LOCATION"),
    RECORD_AUDIO("android.permission.RECORD_AUDIO"),
    READ_CONTACTS("android.permission.READ_CONTACTS"),
    CALL_PHONE("android.permission.CALL_PHONE"),
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    WRITE_EXTERNAL_STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
    READ_MEDIA_IMAGES("android.permission.READ_MEDIA_IMAGES"),
    READ_MEDIA_VIDEO("android.permission.READ_MEDIA_VIDEO"),
    READ_MEDIA_VISUAL_USER_SELECTED("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"),
    READ_MEDIA_AUDIO("android.permission.READ_MEDIA_AUDIO"),
    NEARBY_DEVICES("android.permission.NEARBY_WIFI_DEVICES"),
    POST_NOTIFICATIONS("android.permission.POST_NOTIFICATIONS"),
    CAMERA("android.permission.CAMERA"),
    BLUETOOTH_CONNECT("android.permission.BLUETOOTH_CONNECT"),
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE");

    public static final vxa0 Companion = new vxa0();
    private final String permissionString;

    Permission(String str) {
        this.permissionString = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getPermissionString() {
        return this.permissionString;
    }
}
