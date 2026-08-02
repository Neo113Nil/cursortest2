package xsna;

import android.os.Looper;
import androidx.annotation.Nullable;
import xsna.fqn0;

/* compiled from: HandlerWrapper.java */
/* loaded from: classes12.dex */
public interface otu {

    /* compiled from: HandlerWrapper.java */
    public interface a {
    }

    void a();

    boolean b(a aVar);

    boolean c(long j);

    boolean d(int i, int i2);

    boolean e(int i);

    Looper getLooper();

    fqn0.a obtainMessage(int i);

    fqn0.a obtainMessage(int i, int i2, int i3);

    fqn0.a obtainMessage(int i, int i2, int i3, @Nullable Object obj);

    fqn0.a obtainMessage(int i, @Nullable Object obj);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void removeMessages(int i);

    boolean sendEmptyMessage(int i);
}
