package xsna;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes11.dex */
public final class ie00 {
    public static final ge00 a;

    static {
        String str;
        int i = crn0.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = rli0.A(dli0.c(Arrays.asList(new z72()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((he00) obj).getClass();
                    do {
                        ((he00) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            he00 he00Var = (he00) obj;
            if (he00Var == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            a = he00Var.a();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
