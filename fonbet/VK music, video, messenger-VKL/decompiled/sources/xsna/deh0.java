package xsna;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Result;

/* compiled from: ScreenshotMaker.kt */
/* loaded from: classes4.dex */
public final class deh0 {
    public static final deh0 a = new deh0();

    public static Window a(View view) {
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        deh0 deh0Var = a;
        Object parent = view.getParent();
        while (parent instanceof View) {
            parent = ((View) parent).getParent();
        }
        try {
            deh0Var.getClass();
            failure = (Window) b(b(parent, "mView"), "mWindow");
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Window window = (Window) failure;
        if (window == null) {
            try {
                deh0Var.getClass();
                failure2 = (Window) b(parent, "mWindow");
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            if (failure2 instanceof Result.Failure) {
                failure2 = null;
            }
            window = (Window) failure2;
        }
        if (window == null) {
            try {
                deh0Var.getClass();
                failure3 = (Window) b(b(view, "mView"), "mWindow");
            } catch (Throwable th3) {
                failure3 = new Result.Failure(th3);
            }
            if (failure3 instanceof Result.Failure) {
                failure3 = null;
            }
            window = (Window) failure3;
        }
        if (window != null) {
            return window;
        }
        try {
            deh0Var.getClass();
            failure4 = (Window) b(view, "mWindow");
        } catch (Throwable th4) {
            failure4 = new Result.Failure(th4);
        }
        return (Window) (failure4 instanceof Result.Failure ? null : failure4);
    }

    public static Object b(Object obj, String str) {
        Field field;
        try {
            field = obj.getClass().getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            field = obj.getClass().getField(str);
        }
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
