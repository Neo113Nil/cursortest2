package com.ybsdk.core.permissions;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/permissions/MultiplePermissionAllowance;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "ANY", "ALL_MANDATORY", "core-permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiplePermissionAllowance {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiplePermissionAllowance[] $VALUES;
    public static final MultiplePermissionAllowance ALL = new MultiplePermissionAllowance("ALL", 0);
    public static final MultiplePermissionAllowance ANY = new MultiplePermissionAllowance("ANY", 1);
    public static final MultiplePermissionAllowance ALL_MANDATORY = new MultiplePermissionAllowance("ALL_MANDATORY", 2);

    private static final /* synthetic */ MultiplePermissionAllowance[] $values() {
        return new MultiplePermissionAllowance[]{ALL, ANY, ALL_MANDATORY};
    }

    static {
        MultiplePermissionAllowance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MultiplePermissionAllowance(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MultiplePermissionAllowance valueOf(String str) {
        return (MultiplePermissionAllowance) Enum.valueOf(MultiplePermissionAllowance.class, str);
    }

    public static MultiplePermissionAllowance[] values() {
        return (MultiplePermissionAllowance[]) $VALUES.clone();
    }
}
