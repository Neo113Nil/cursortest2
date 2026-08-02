package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.sequences.a;
import kotlin.sequences.b;

/* loaded from: classes9.dex */
public abstract class o400 {
    public static final g6u a;

    static {
        String str;
        int i = t3x0.a;
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
            Iterator it = b.s(a.b(Arrays.asList(new h92()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((n400) obj).getClass();
                    do {
                        ((n400) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((n400) obj) == null) {
                ny61.r("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new g6u(i6u.b(mainLooper));
            } else {
                ny61.r("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
