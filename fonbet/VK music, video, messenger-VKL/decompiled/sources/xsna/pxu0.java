package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.p0v;

/* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
/* loaded from: classes6.dex */
public final class pxu0 {
    public static final pxu0 a = new pxu0();
    public static Object b;
    public static final Set<String> c;
    public static final Set<String> d;

    /* compiled from: VkHealthHealthConnectPermissionsProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestedMiniApp.values().length];
            try {
                iArr[RequestedMiniApp.VK_STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestedMiniApp.VK_WORKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Object obj = p0v.a;
        c = rl3.y0(new String[]{p0v.a.a(fpf0.a(x0l0.class)), p0v.a.a(fpf0.a(bhn.class))});
        d = rl3.y0(new String[]{p0v.a.a(fpf0.a(bhn.class)), p0v.a.a(fpf0.a(x0l0.class)), p0v.a.a(fpf0.a(n4q.class)), p0v.a.a(fpf0.a(zcp0.class))});
    }

    public static Set a(RequestedMiniApp requestedMiniApp) {
        int i = a.$EnumSwitchMapping$0[requestedMiniApp.ordinal()];
        if (i == 1) {
            return c;
        }
        if (i == 2) {
            return d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Object b(Context context, RequestedMiniApp requestedMiniApp, ContinuationImpl continuationImpl) {
        return myc0.k(dgn0.f().getIo(), new qxu0(context, 4000L, requestedMiniApp, null), continuationImpl);
    }

    public static boolean d(Context context) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("com.google.android.apps.healthdata", of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.apps.healthdata", 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static Object e(kxu0 kxu0Var, RequestedMiniApp requestedMiniApp, hyu0 hyu0Var) {
        String[] strArr;
        gzg0 gzg0Var = new gzg0(s7s0.c(hyu0Var));
        Activity a2 = kxu0Var.a();
        if (a2 == null || a2.isDestroyed() || a2.isFinishing()) {
            gzg0Var.resumeWith(Boolean.FALSE);
        } else {
            PermissionHelper permissionHelper = PermissionHelper.a;
            int i = a.$EnumSwitchMapping$0[requestedMiniApp.ordinal()];
            int i2 = 2;
            if (i == 1) {
                strArr = (String[]) c.toArray(new String[0]);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strArr = (String[]) d.toArray(new String[0]);
            }
            PermissionHelper.l(permissionHelper, a2, strArr, new txu0(gzg0Var), new pxl(gzg0Var, i2), 4);
        }
        Object a3 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(Context context, long j, ContinuationImpl continuationImpl) {
        rxu0 rxu0Var;
        int i;
        Integer num;
        if (continuationImpl instanceof rxu0) {
            rxu0Var = (rxu0) continuationImpl;
            int i2 = rxu0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rxu0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = rxu0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rxu0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                        return HealthConnectSdkStatus.UNAVAILABLE;
                    }
                    if (Build.VERSION.SDK_INT < 34 && !d(context)) {
                        return HealthConnectSdkStatus.NEED_INSTALL;
                    }
                    sxu0 sxu0Var = new sxu0(context, null);
                    rxu0Var.label = 1;
                    obj = oxo0.c(j, sxu0Var, rxu0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    return HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT;
                }
                int intValue = num.intValue();
                return intValue != 1 ? intValue != 2 ? HealthConnectSdkStatus.AVAILABLE : HealthConnectSdkStatus.NEED_MANDATORY_UPDATE : HealthConnectSdkStatus.UNAVAILABLE;
            }
        }
        rxu0Var = new rxu0(this, continuationImpl);
        Object obj2 = rxu0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rxu0Var.label;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
    }
}
