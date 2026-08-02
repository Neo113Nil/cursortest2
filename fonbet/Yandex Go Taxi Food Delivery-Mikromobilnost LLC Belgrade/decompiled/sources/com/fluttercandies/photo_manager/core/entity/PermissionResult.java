package com.fluttercandies.photo_manager.core.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fluttercandies/photo_manager/core/entity/PermissionResult;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "NotDetermined", CA20Status.STATUS_REQUEST_DESCRIPTION_D, "Authorized", "Limited", "photo_manager_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PermissionResult[] $VALUES;
    public static final PermissionResult Authorized;
    public static final PermissionResult Denied;
    public static final PermissionResult Limited;
    public static final PermissionResult NotDetermined;
    private final int value;

    static {
        PermissionResult permissionResult = new PermissionResult("NotDetermined", 0, 0);
        NotDetermined = permissionResult;
        PermissionResult permissionResult2 = new PermissionResult(CA20Status.STATUS_REQUEST_DESCRIPTION_D, 1, 2);
        Denied = permissionResult2;
        PermissionResult permissionResult3 = new PermissionResult("Authorized", 2, 3);
        Authorized = permissionResult3;
        PermissionResult permissionResult4 = new PermissionResult("Limited", 3, 4);
        Limited = permissionResult4;
        PermissionResult[] permissionResultArr = {permissionResult, permissionResult2, permissionResult3, permissionResult4};
        $VALUES = permissionResultArr;
        $ENTRIES = a.a(permissionResultArr);
    }

    public PermissionResult(String str, int i, int i2) {
        this.value = i2;
    }

    public static PermissionResult valueOf(String str) {
        return (PermissionResult) Enum.valueOf(PermissionResult.class, str);
    }

    public static PermissionResult[] values() {
        return (PermissionResult[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
