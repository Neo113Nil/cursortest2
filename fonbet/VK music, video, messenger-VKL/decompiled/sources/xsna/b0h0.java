package xsna;

import android.content.Context;
import java.io.File;

/* compiled from: SakExecutorConfigRepository.kt */
/* loaded from: classes11.dex */
public final class b0h0 {
    public static volatile Boolean a;

    public static boolean a() {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = e43.a;
        Context context2 = null;
        if (context != null) {
            if (context == null) {
                context = null;
            }
            context2 = context;
        }
        boolean z = false;
        if (context2 != null) {
            try {
                z = new File(new File(context2.getFilesDir(), "sak_use_coroutine_executors"), "1").exists();
            } catch (Exception e) {
                par0.a.getClass();
                par0.c("SakExecutorConfigRepository: read config exception, use ThreadPool", e);
            }
            a = Boolean.valueOf(z);
        }
        return z;
    }
}
