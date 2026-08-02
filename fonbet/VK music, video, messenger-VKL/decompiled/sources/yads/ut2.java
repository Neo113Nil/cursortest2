package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import xsna.kmm0;

/* loaded from: classes10.dex */
public final class ut2 {
    public final o63 a;

    public /* synthetic */ ut2() {
        this(new o63());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        o63 o63Var = this.a;
        kmm0 kmm0Var = new kmm0(windowManager, 1);
        o63Var.getClass();
        final Display display = (Display) o63.a(kmm0Var, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        o63 o63Var2 = this.a;
        Callable callable = new Callable() { // from class: xsna.nfz0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yads.ut2.a(display, point, this);
            }
        };
        o63Var2.getClass();
        Object a = o63.a(callable, display, "getting display metrics", "Display");
        if (a != 0) {
            point = a;
        }
        return point;
    }

    public ut2(o63 o63Var) {
        this.a = o63Var;
    }

    public static final Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    public static final Point a(Display display, Point point, ut2 ut2Var) {
        if (display == null) {
            return point;
        }
        ut2Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
