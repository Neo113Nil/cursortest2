package xsna;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5k;
import xsna.nl5;

/* compiled from: ProcessDetailsProvider.kt */
/* loaded from: classes.dex */
public final class qgd0 {
    public static final qgd0 a = new qgd0();

    public static ArrayList a(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.b;
        }
        List V = j5g.V(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : V) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            nl5.a aVar = new nl5.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            aVar.a = str2;
            aVar.b = runningAppProcessInfo.pid;
            byte b = (byte) (aVar.e | 1);
            aVar.c = runningAppProcessInfo.importance;
            aVar.e = (byte) (b | 2);
            aVar.d = epx.f(str2, str);
            aVar.e = (byte) (aVar.e | 4);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public final j5k.e.d.a.c b(Context context) {
        Object obj;
        String processName;
        int myPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j5k.e.d.a.c) obj).b() == myPid) {
                break;
            }
        }
        j5k.e.d.a.c cVar = (j5k.e.d.a.c) obj;
        if (cVar != null) {
            return cVar;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        int i = (12 & 4) != 0 ? 0 : 0;
        nl5.a aVar = new nl5.a();
        aVar.a = processName;
        aVar.b = myPid;
        byte b = (byte) (aVar.e | 1);
        aVar.c = i;
        aVar.d = false;
        aVar.e = (byte) (((byte) (b | 2)) | 4);
        return aVar.a();
    }
}
