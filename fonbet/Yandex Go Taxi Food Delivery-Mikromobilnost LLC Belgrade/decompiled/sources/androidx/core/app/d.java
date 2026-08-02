package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public abstract class d {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Handler f = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        c = field2;
        Class cls3 = a;
        Class cls4 = Boolean.TYPE;
        if (cls3 != null) {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, cls4, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            d = declaredMethod;
            cls2 = a;
            if (cls2 != null) {
                try {
                    Method declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls4);
                    declaredMethod2.setAccessible(true);
                    method = declaredMethod2;
                } catch (Throwable unused5) {
                }
            }
            e = method;
        }
        declaredMethod = null;
        d = declaredMethod;
        cls2 = a;
        if (cls2 != null) {
        }
        e = method;
    }
}
