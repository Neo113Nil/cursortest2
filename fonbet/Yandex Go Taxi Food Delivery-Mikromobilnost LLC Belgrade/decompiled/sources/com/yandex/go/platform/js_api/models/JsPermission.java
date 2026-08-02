package com.yandex.go.platform.js_api.models;

import defpackage.k4o;
import defpackage.vax;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsPermission;", "", "", "jsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "vax", "ENABLE_NOTIFICATIONS", "ENABLE_LOCATION", "LOCATION_PERMISSION", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsPermission {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ JsPermission[] $VALUES;
    public static final vax Companion;
    public static final JsPermission ENABLE_LOCATION;
    public static final JsPermission ENABLE_NOTIFICATIONS;
    public static final JsPermission LOCATION_PERMISSION;
    private final String jsName;

    static {
        JsPermission jsPermission = new JsPermission("ENABLE_NOTIFICATIONS", 0, "notifications");
        ENABLE_NOTIFICATIONS = jsPermission;
        JsPermission jsPermission2 = new JsPermission("ENABLE_LOCATION", 1, "deviceLocation");
        ENABLE_LOCATION = jsPermission2;
        JsPermission jsPermission3 = new JsPermission("LOCATION_PERMISSION", 2, "locationAccess");
        LOCATION_PERMISSION = jsPermission3;
        JsPermission[] jsPermissionArr = {jsPermission, jsPermission2, jsPermission3};
        $VALUES = jsPermissionArr;
        $ENTRIES = kotlin.enums.a.a(jsPermissionArr);
        Companion = new vax();
    }

    public JsPermission(String str, int i, String str2) {
        this.jsName = str2;
    }

    public static JsPermission valueOf(String str) {
        return (JsPermission) Enum.valueOf(JsPermission.class, str);
    }

    public static JsPermission[] values() {
        return (JsPermission[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getJsName() {
        return this.jsName;
    }
}
