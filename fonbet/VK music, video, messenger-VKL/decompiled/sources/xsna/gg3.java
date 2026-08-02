package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public final class gg3 extends n1z0 {
    public static volatile gg3 h;

    @NonNull
    public static final fg3 i = new fg3();

    @NonNull
    public final iol g = new iol();

    @NonNull
    public static gg3 a() {
        if (h != null) {
            return h;
        }
        synchronized (gg3.class) {
            try {
                if (h == null) {
                    h = new gg3();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final void c(@NonNull Runnable runnable) {
        iol iolVar = this.g;
        if (iolVar.i == null) {
            synchronized (iolVar.g) {
                try {
                    if (iolVar.i == null) {
                        iolVar.i = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        iolVar.i.post(runnable);
    }
}
