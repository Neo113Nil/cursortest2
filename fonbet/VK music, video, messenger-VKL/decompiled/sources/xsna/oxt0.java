package xsna;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes12.dex */
public final class oxt0 {
    public static boolean a = true;
    public static Method b;
    public static boolean c;

    /* compiled from: ViewGroupUtils.java */
    public static class a {
        public static int a(int i, ViewGroup viewGroup) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z);
        } else if (a) {
            try {
                a.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
