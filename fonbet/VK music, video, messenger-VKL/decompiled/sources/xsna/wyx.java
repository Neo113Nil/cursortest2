package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: JobsBackgroundServiceController.kt */
/* loaded from: classes.dex */
public final class wyx {
    public static volatile boolean c;
    public static final wyx a = new wyx();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final CopyOnWriteArrayList<a> d = new CopyOnWriteArrayList<>();

    /* compiled from: JobsBackgroundServiceController.kt */
    public interface a {
        void a(boolean z);
    }

    public final synchronized void a(boolean z) {
        if (c != z) {
            c = z;
            b.post(new vyx(new uyx(z), 0));
        }
    }
}
