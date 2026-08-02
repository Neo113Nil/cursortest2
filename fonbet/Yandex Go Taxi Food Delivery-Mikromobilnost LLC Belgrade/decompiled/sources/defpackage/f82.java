package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f82 {
    public static boolean a() {
        Method method;
        Method method2;
        try {
            if (AndroidComposeView.systemPropertiesClass == null) {
                AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
            }
            method = AndroidComposeView.getBooleanMethod;
            if (method == null) {
                Class cls = AndroidComposeView.systemPropertiesClass;
                AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            method2 = AndroidComposeView.getBooleanMethod;
            Object invoke = method2 != null ? method2.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return jl40.l(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }
}
