package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class pd51 {
    public static final i3y a = a.b(LazyThreadSafetyMode.NONE, new q251(9));

    public static boolean a(int i, Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(myUid), packageName)).intValue() == 0;
        } catch (Exception unused) {
            return true;
        }
    }
}
