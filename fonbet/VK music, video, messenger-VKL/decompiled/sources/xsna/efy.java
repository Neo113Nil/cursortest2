package xsna;

import android.content.res.Resources;
import java.util.LinkedHashSet;

/* compiled from: KeyboardController.kt */
/* loaded from: classes.dex */
public final class efy {
    public static int b;
    public static final int a = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 100);
    public static final LinkedHashSet c = new LinkedHashSet();

    /* compiled from: KeyboardController.kt */
    public interface a {
        void Y0();

        void x0(int i);
    }

    public static void a(a aVar) {
        c.add(aVar);
    }

    public static void b(a aVar) {
        c.remove(aVar);
    }
}
