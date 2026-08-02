package com.ybsdk.core.permissions;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/permissions/RequestPermissionResult;", "", "isGranted", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "RATIONALE_DISALLOW", "RATIONALE_DISMISS", "SETTINGS_DISMISS", "SYSTEM_DISALLOW", "ALLOW", "core-permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestPermissionResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestPermissionResult[] $VALUES;
    private final boolean isGranted;
    public static final RequestPermissionResult RATIONALE_DISALLOW = new RequestPermissionResult("RATIONALE_DISALLOW", 0, false);
    public static final RequestPermissionResult RATIONALE_DISMISS = new RequestPermissionResult("RATIONALE_DISMISS", 1, false);
    public static final RequestPermissionResult SETTINGS_DISMISS = new RequestPermissionResult("SETTINGS_DISMISS", 2, false);
    public static final RequestPermissionResult SYSTEM_DISALLOW = new RequestPermissionResult("SYSTEM_DISALLOW", 3, false);
    public static final RequestPermissionResult ALLOW = new RequestPermissionResult("ALLOW", 4, true);

    private static final /* synthetic */ RequestPermissionResult[] $values() {
        return new RequestPermissionResult[]{RATIONALE_DISALLOW, RATIONALE_DISMISS, SETTINGS_DISMISS, SYSTEM_DISALLOW, ALLOW};
    }

    static {
        RequestPermissionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RequestPermissionResult(String str, int i, boolean z) {
        this.isGranted = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RequestPermissionResult valueOf(String str) {
        return (RequestPermissionResult) Enum.valueOf(RequestPermissionResult.class, str);
    }

    public static RequestPermissionResult[] values() {
        return (RequestPermissionResult[]) $VALUES.clone();
    }

    /* renamed from: isGranted, reason: from getter */
    public final boolean getIsGranted() {
        return this.isGranted;
    }
}
