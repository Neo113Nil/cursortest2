package defpackage;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public abstract class mfb1 {
    public static final String a(ae8 ae8Var) {
        if (ae8Var instanceof yd8) {
            return ((yd8) ae8Var).a.d;
        }
        if (ae8Var instanceof zd8) {
            return ((zd8) ae8Var).a;
        }
        w511.b();
        return null;
    }

    public static final String b(Throwable th) {
        int i;
        StringWriter stringWriter = new StringWriter();
        zyt0 zyt0Var = new zyt0(stringWriter);
        int i2 = -1;
        Throwable th2 = th;
        while (th2 != null) {
            th2 = th2.getCause();
            i2++;
        }
        if (i2 >= 1) {
            i2 = 1;
        }
        Throwable th3 = th;
        while (true) {
            i = 0;
            if (th3 == null || i2 <= 0) {
                break;
            }
            zyt0Var.println(th3.toString());
            StackTraceElement[] stackTrace = th3.getStackTrace();
            int length = stackTrace.length;
            if (length > 4) {
                length = 4;
            }
            while (i < length) {
                zyt0Var.println("\tat " + stackTrace[i]);
                i++;
            }
            th3 = th3.getCause();
            i2--;
            zyt0Var.print("Caused by: ");
        }
        while (true) {
            if ((th3 != null ? th3.getCause() : null) == null) {
                break;
            }
            i++;
            th3 = th3.getCause();
        }
        if (i != 0) {
            zyt0Var.println(String.format(Locale.US, "... %d intermediate causes were omitted.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        }
        if (th3 != null) {
            th3.getCause();
            if (th != th3) {
                zyt0Var.print("Caused by: ");
            }
            th3.printStackTrace(zyt0Var);
        }
        String obj = stringWriter.toString();
        zyt0Var.close();
        return obj;
    }

    public static final jq51 c(ae8 ae8Var, int i) {
        if (ae8Var instanceof yd8) {
            return ((yd8) ae8Var).a.m;
        }
        if (!(ae8Var instanceof zd8)) {
            w511.b();
            return null;
        }
        gq51 gq51Var = (gq51) a.S(i, ((zd8) ae8Var).b);
        if (gq51Var != null) {
            return gq51Var.m;
        }
        return null;
    }

    public static final Object d(yn50 yn50Var, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        yn50Var.b(null, new whv(j18Var, 1));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
