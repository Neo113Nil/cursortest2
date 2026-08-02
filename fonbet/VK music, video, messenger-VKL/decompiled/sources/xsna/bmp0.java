package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeoutException;

/* compiled from: TransitionAutoPlayHolder.kt */
/* loaded from: classes2.dex */
public final class bmp0 {
    public static yg5 a;
    public static xw1 c;
    public static final emp0 b = new emp0();
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Handler e = new Handler(Looper.getMainLooper());

    public static void a(yg5 yg5Var) {
        if (epx.f(a, yg5Var)) {
            return;
        }
        if (a == null || yg5Var == null) {
            a = yg5Var;
            if (yg5Var == null) {
                b.b();
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                ((inp0) it.next()).a(yg5Var);
            }
            xw1 xw1Var = c;
            Handler handler = e;
            if (xw1Var != null) {
                handler.removeCallbacks(xw1Var);
            }
            c = null;
            if (yg5Var != null) {
                xw1 xw1Var2 = new xw1(new TimeoutException("Lock autoplay for too long"), 16);
                handler.postDelayed(xw1Var2, 5000L);
                c = xw1Var2;
            }
        }
    }
}
