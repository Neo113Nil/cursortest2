package defpackage;

import com.ybsdk.core.permissions.RequestPermissionResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mt20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequestPermissionResult.values().length];
        try {
            iArr[RequestPermissionResult.RATIONALE_DISALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestPermissionResult.SYSTEM_DISALLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestPermissionResult.RATIONALE_DISMISS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequestPermissionResult.SETTINGS_DISMISS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequestPermissionResult.ALLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
