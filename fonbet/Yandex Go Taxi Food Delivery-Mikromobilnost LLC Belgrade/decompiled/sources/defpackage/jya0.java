package defpackage;

import com.fluttercandies.photo_manager.core.entity.PermissionResult;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class jya0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PermissionResult.values().length];
        try {
            iArr[PermissionResult.Denied.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PermissionResult.Authorized.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PermissionResult.Limited.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
