package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CloseBarrier.kt */
/* loaded from: classes.dex */
public final class jvf {
    public final RoomDatabase.d a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public jvf(RoomDatabase.d dVar) {
        this.a = dVar;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c.get()) {
                return false;
            }
            this.b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.b.decrementAndGet();
            if (this.b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
