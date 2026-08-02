package xsna;

import com.vk.permission.PermissionHelper;
import com.vk.stat.AppStartPermissionResult;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PermissionResultExt.kt */
/* loaded from: classes11.dex */
public final class by90 {

    /* compiled from: PermissionResultExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionHelper.PermissionResult.values().length];
            try {
                iArr[PermissionHelper.PermissionResult.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.NOT_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.DONT_ASK_AGAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.NOT_DETERMINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(PermissionHelper.PermissionResult permissionResult) {
        AppStartPermissionResult appStartPermissionResult;
        int i = a.$EnumSwitchMapping$0[permissionResult.ordinal()];
        if (i == 1) {
            appStartPermissionResult = AppStartPermissionResult.ALLOWED;
        } else if (i == 2) {
            appStartPermissionResult = AppStartPermissionResult.NOT_ALLOWED;
        } else if (i == 3) {
            appStartPermissionResult = AppStartPermissionResult.DONT_ASK_AGAIN;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            appStartPermissionResult = AppStartPermissionResult.NOT_DETERMINED;
        }
        return appStartPermissionResult.h();
    }
}
