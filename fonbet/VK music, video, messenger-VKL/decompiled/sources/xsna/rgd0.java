package xsna;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: ProcessHelper.kt */
/* loaded from: classes.dex */
public final class rgd0 {
    public static final rgd0 a = new rgd0();

    public static String a(ContextWrapper contextWrapper) {
        Object failure;
        Object runningAppProcesses;
        String str;
        if (gz80.a(28)) {
            return Application.getProcessName();
        }
        Object systemService = contextWrapper.getSystemService("activity");
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            try {
                runningAppProcesses = activityManager.getRunningAppProcesses();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            runningAppProcesses = null;
        }
        failure = runningAppProcesses;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        List list = (List) failure;
        if (list != null) {
            int myPid = Process.myPid();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo2.pid == myPid) {
                    runningAppProcessInfo = runningAppProcessInfo2;
                    break;
                }
            }
        }
        return (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) ? GrsBaseInfo.CountryCodeSource.UNKNOWN : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context) {
        int i;
        Object obj;
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ActivityManager.RunningAppProcessInfo) obj).processName, packageName)) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
            if (runningAppProcessInfo != null) {
                i = runningAppProcessInfo.importance;
                return i != 100;
            }
        }
        i = 1000;
        if (i != 100) {
        }
    }
}
