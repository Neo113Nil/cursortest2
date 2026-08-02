package io.appmetrica.analytics.logger.common.impl;

import android.util.Log;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Locale;
import xsna.ho8;
import xsna.t33;

/* loaded from: classes8.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder b = ho8.b(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable th) {
                StringBuilder a = t33.a("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                a.append(Arrays.toString(objArr));
                str2 = a.toString();
                Log.e("[LogMessageConstructor]", str2, th);
            }
        }
        Locale locale = Locale.US;
        b.append(X3.j.d + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return b.toString();
    }
}
