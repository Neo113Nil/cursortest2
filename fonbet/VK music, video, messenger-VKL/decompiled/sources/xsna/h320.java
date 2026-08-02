package xsna;

import android.app.ActivityManager;
import android.content.Context;
import com.vk.log.L;

/* compiled from: MemoryUtils.kt */
/* loaded from: classes3.dex */
public final class h320 {
    public static boolean a(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem > 3000000000L;
        } catch (Throwable th) {
            L.g("Failed to get device total memory", th);
            return false;
        }
    }
}
