package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.passkey.HuaweiPasskeyNativeAvailabilityResolver;
import kotlin.Result;

/* compiled from: PasskeyAvailabilityResolver.kt */
/* loaded from: classes15.dex */
public final class ol90 {
    public static final bpn0 a = new bpn0(new o6(23));
    public static final boolean b;
    public static final boolean c;

    static {
        Object failure;
        Object failure2;
        try {
            failure = Boolean.TRUE;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        b = ((Boolean) failure).booleanValue();
        try {
            Class.forName("com.vk.passkey.HuaweiPasskeyNativeAvailabilityResolver");
            failure2 = Boolean.TRUE;
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (failure2 instanceof Result.Failure) {
            failure2 = obj2;
        }
        c = ((Boolean) failure2).booleanValue();
    }

    @ozl
    public static boolean a() {
        if (c) {
            return HuaweiPasskeyNativeAvailabilityResolver.INSTANCE.isPasskeySupportedByHardware((Context) a.getValue());
        }
        Context context = (Context) a.getValue();
        if (k0x.c(context)) {
            return Build.VERSION.SDK_INT < 34 || context.getSystemService("credential") != null;
        }
        return false;
    }

    public static boolean b() {
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        return b && a();
    }
}
