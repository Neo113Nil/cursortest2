package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: TimeScheduler.kt */
/* loaded from: classes8.dex */
public final class hvo0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final b b;

    /* compiled from: TimeScheduler.kt */
    public interface a {
        void a(long j);
    }

    /* compiled from: TimeScheduler.kt */
    public static final class b extends Handler {
        public final long a;
        public final hvo0 b;
        public volatile long c;
        public volatile long d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(long j, hvo0 hvo0Var, Looper looper) {
            super(looper);
            if (looper == null && (looper = Looper.myLooper()) == null) {
                looper = Looper.getMainLooper();
            }
            this.a = j;
            this.b = hvo0Var;
            this.d = -1L;
        }

        public final long a() {
            long elapsedRealtime;
            synchronized (this) {
                elapsedRealtime = this.c + (this.d > 0 ? SystemClock.elapsedRealtime() - this.d : 0L);
            }
            return elapsedRealtime;
        }

        public final void b() {
            synchronized (this) {
                if (this.d != -1) {
                    this.c = (SystemClock.elapsedRealtime() - this.d) + this.c;
                    this.d = -1L;
                    removeCallbacksAndMessages(this);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.d != -1 && message.what == 1 && message.obj == this) {
                hvo0 hvo0Var = this.b;
                long a = a();
                Iterator it = hvo0Var.a.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(a);
                }
                sendMessageDelayed(obtainMessage(1, this), this.a);
            }
        }
    }

    public hvo0(long j, Looper looper) {
        this.b = new b(j, this, looper);
    }
}
