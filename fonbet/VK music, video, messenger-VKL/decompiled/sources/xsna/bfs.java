package xsna;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: FrameController.kt */
/* loaded from: classes18.dex */
public final class bfs {
    public final mwo0 a;
    public final HashMap<String, a> b = new HashMap<>();

    /* compiled from: FrameController.kt */
    public final class a {
        public final efl a;
        public final TreeMap<Long, Bitmap> b = new TreeMap<>();
        public final HashMap<Long, b> c = new HashMap<>();
        public final long d;

        public a(String str, long j) {
            this.a = new efl(str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.d = j < timeUnit.toMillis(2L) ? 250L : j < timeUnit.toMillis(15L) ? 1000L : j < TimeUnit.MINUTES.toMillis(1L) ? 2000L : 3000L;
        }
    }

    /* compiled from: FrameController.kt */
    public interface b {
    }

    /* compiled from: FrameController.kt */
    public static final class c implements b {
        public final Bitmap a;

        public c(Bitmap bitmap) {
            this.a = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qr.c(new StringBuilder("StateFrameComplete(frame="), this.a, ')');
        }
    }

    /* compiled from: FrameController.kt */
    public static final class d implements b {
        public final Throwable a;

        public d(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("StateFrameError(error="), this.a, ')');
        }
    }

    /* compiled from: FrameController.kt */
    public static final class e implements b {
        public final io.reactivex.rxjava3.disposables.c a;

        public e(io.reactivex.rxjava3.disposables.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StateFrameLoading(disposable=" + this.a + ')';
        }
    }

    public bfs(mwo0 mwo0Var) {
        this.a = mwo0Var;
    }
}
