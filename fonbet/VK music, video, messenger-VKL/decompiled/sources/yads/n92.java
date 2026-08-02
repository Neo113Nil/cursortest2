package yads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes10.dex */
public abstract class n92 {
    public static void a(Context context, q92 q92Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            m92 m92Var = new m92(q92Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), m92Var);
            telephonyManager.unregisterTelephonyCallback(m92Var);
        } catch (RuntimeException unused) {
            q92Var.a(5);
        }
    }
}
