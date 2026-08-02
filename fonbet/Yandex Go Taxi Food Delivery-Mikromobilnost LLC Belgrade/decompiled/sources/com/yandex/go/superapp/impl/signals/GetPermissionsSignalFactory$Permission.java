package com.yandex.go.superapp.impl.signals;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/yandex/go/superapp/impl/signals/GetPermissionsSignalFactory$Permission", "", "Lcom/yandex/go/superapp/impl/signals/GetPermissionsSignalFactory$Permission;", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "requestId", CA20Status.STATUS_USER_I, "c", "()I", "", "isAutoGranted", "Z", "f", "()Z", "CAMERA", "MICROPHONE", "PHOTO_LIBRARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class GetPermissionsSignalFactory$Permission {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GetPermissionsSignalFactory$Permission[] $VALUES;
    public static final GetPermissionsSignalFactory$Permission CAMERA;
    public static final GetPermissionsSignalFactory$Permission MICROPHONE;
    public static final GetPermissionsSignalFactory$Permission PHOTO_LIBRARY;
    private final boolean isAutoGranted;
    private final String key;
    private final int requestId;

    static {
        GetPermissionsSignalFactory$Permission getPermissionsSignalFactory$Permission = new GetPermissionsSignalFactory$Permission("CAMERA", 0, "camera", 3, 4);
        CAMERA = getPermissionsSignalFactory$Permission;
        GetPermissionsSignalFactory$Permission getPermissionsSignalFactory$Permission2 = new GetPermissionsSignalFactory$Permission("MICROPHONE", 1, "microphone", 14, 4);
        MICROPHONE = getPermissionsSignalFactory$Permission2;
        GetPermissionsSignalFactory$Permission getPermissionsSignalFactory$Permission3 = new GetPermissionsSignalFactory$Permission("PHOTO_LIBRARY", 2, "photoLibrary", 0, 2);
        PHOTO_LIBRARY = getPermissionsSignalFactory$Permission3;
        GetPermissionsSignalFactory$Permission[] getPermissionsSignalFactory$PermissionArr = {getPermissionsSignalFactory$Permission, getPermissionsSignalFactory$Permission2, getPermissionsSignalFactory$Permission3};
        $VALUES = getPermissionsSignalFactory$PermissionArr;
        $ENTRIES = kotlin.enums.a.a(getPermissionsSignalFactory$PermissionArr);
    }

    public GetPermissionsSignalFactory$Permission(String str, int i, String str2, int i2, int i3) {
        i2 = (i3 & 2) != 0 ? -1 : i2;
        boolean z = (i3 & 4) == 0;
        this.key = str2;
        this.requestId = i2;
        this.isAutoGranted = z;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static GetPermissionsSignalFactory$Permission valueOf(String str) {
        return (GetPermissionsSignalFactory$Permission) Enum.valueOf(GetPermissionsSignalFactory$Permission.class, str);
    }

    public static GetPermissionsSignalFactory$Permission[] values() {
        return (GetPermissionsSignalFactory$Permission[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public final int getRequestId() {
        return this.requestId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsAutoGranted() {
        return this.isAutoGranted;
    }
}
