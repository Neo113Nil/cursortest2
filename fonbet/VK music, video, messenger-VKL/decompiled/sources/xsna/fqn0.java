package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import xsna.otu;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes12.dex */
public final class fqn0 implements otu {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    /* compiled from: SystemHandlerWrapper.java */
    public static final class a implements otu.a {

        @Nullable
        public Message a;

        public final void a() {
            this.a = null;
            ArrayList arrayList = fqn0.b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public fqn0(Handler handler) {
        this.a = handler;
    }

    public static a f() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // xsna.otu
    public final void a() {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // xsna.otu
    public final boolean b(otu.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return sendMessageAtFrontOfQueue;
    }

    @Override // xsna.otu
    public final boolean c(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // xsna.otu
    public final boolean d(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // xsna.otu
    public final boolean e(int i) {
        return this.a.hasMessages(i);
    }

    @Override // xsna.otu
    public final Looper getLooper() {
        return this.a.getLooper();
    }

    @Override // xsna.otu
    public final a obtainMessage(int i) {
        a f = f();
        f.a = this.a.obtainMessage(i);
        return f;
    }

    @Override // xsna.otu
    public final boolean post(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // xsna.otu
    public final boolean postDelayed(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }

    @Override // xsna.otu
    public final void removeMessages(int i) {
        fxc0.p(i != 0);
        this.a.removeMessages(i);
    }

    @Override // xsna.otu
    public final boolean sendEmptyMessage(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // xsna.otu
    public final a obtainMessage(int i, @Nullable Object obj) {
        a f = f();
        f.a = this.a.obtainMessage(i, obj);
        return f;
    }

    @Override // xsna.otu
    public final a obtainMessage(int i, int i2, int i3) {
        a f = f();
        f.a = this.a.obtainMessage(i, i2, i3);
        return f;
    }

    @Override // xsna.otu
    public final a obtainMessage(int i, int i2, int i3, @Nullable Object obj) {
        a f = f();
        f.a = this.a.obtainMessage(i, i2, i3, obj);
        return f;
    }
}
