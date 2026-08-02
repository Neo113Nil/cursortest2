package defpackage;

import com.ybsdk.core.permissions.MultiplePermissionAllowance;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a0b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MultiplePermissionAllowance.values().length];
        try {
            iArr[MultiplePermissionAllowance.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultiplePermissionAllowance.ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MultiplePermissionAllowance.ALL_MANDATORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
