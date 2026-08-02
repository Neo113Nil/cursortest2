package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AuthExtensions.kt */
/* loaded from: classes15.dex */
public final class f35 {
    public static final List a(Context context) {
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        return EmptyList.b;
    }

    public static final boolean b(VKApiExecutionException vKApiExecutionException) {
        return vKApiExecutionException.s() == 103 || vKApiExecutionException.s() == 1112 || vKApiExecutionException.s() == 9;
    }

    public static final boolean c(VKApiExecutionException vKApiExecutionException) {
        return vKApiExecutionException.s() == 5 && vKApiExecutionException.C() == 1129;
    }

    public static final boolean d(VKApiExecutionException vKApiExecutionException) {
        return vKApiExecutionException.s() == 5 && vKApiExecutionException.C() == 1108;
    }

    public static final boolean e(Throwable th) {
        if (!(th instanceof VKApiExecutionException)) {
            return false;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        return vKApiExecutionException.C() == 1106 || vKApiExecutionException.C() == 1136;
    }
}
