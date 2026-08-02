package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public final class rll {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rll(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public void a(@NonNull Runnable runnable) {
        ((Handler) this.b).removeCallbacks(runnable);
    }

    public void b(long j, @NonNull Runnable runnable) {
        ((Handler) this.b).postDelayed(runnable, j);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public rll() {
        this.a = 0;
        this.b = Handler.createAsync(Looper.getMainLooper());
    }
}
