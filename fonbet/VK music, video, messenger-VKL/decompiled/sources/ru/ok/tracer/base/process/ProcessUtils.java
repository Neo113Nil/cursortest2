package ru.ok.tracer.base.process;

import android.app.Application;
import android.content.Context;
import xsna.brm0;
import xsna.drm0;

/* compiled from: ProcessUtils.kt */
/* loaded from: classes11.dex */
public final class ProcessUtils {
    private static volatile String processName;

    public static final String getProcessName(Context context) {
        String str = processName;
        if (str != null) {
            return str;
        }
        String processName2 = Application.getProcessName();
        processName = processName2;
        return processName2;
    }

    public static final String getSimpleProcessName(Context context) {
        return simplifyProcessName(getProcessName(context), context.getPackageName());
    }

    public static final String simplifyProcessName(String str, String str2) {
        if (str == null || str.equals(str2)) {
            return null;
        }
        int L = drm0.L(str, ':', 0, 6);
        return (L == str2.length() && brm0.B(str, str2, false)) ? str.substring(L) : str;
    }
}
