package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class f7u {
    public static final File e = new File("/proc/self/fd");
    public static volatile f7u f;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final int a = 20000;

    public static f7u a() {
        if (f == null) {
            synchronized (f7u.class) {
                try {
                    if (f == null) {
                        f = new f7u();
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i < 0 || i2 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        synchronized (this) {
            try {
                int i3 = this.b + 1;
                this.b = i3;
                if (i3 >= 50) {
                    this.b = 0;
                    boolean z4 = ((long) e.list().length) < ((long) this.a);
                    this.c = z4;
                    if (!z4) {
                        Log.isLoggable("Downsampler", 5);
                    }
                }
                z3 = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }
}
