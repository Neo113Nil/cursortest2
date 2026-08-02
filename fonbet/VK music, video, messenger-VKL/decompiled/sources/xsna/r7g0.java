package xsna;

import android.os.Handler;

/* compiled from: RequestExecutor.java */
/* loaded from: classes11.dex */
public final class r7g0<T> implements Runnable {
    public m5s b;
    public n5s c;
    public Handler d;

    /* compiled from: RequestExecutor.java */
    public class a implements Runnable {
        public final /* synthetic */ n5s b;
        public final /* synthetic */ Object c;

        public a(n5s n5sVar, Object obj) {
            this.b = n5sVar;
            this.c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.accept(this.c);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.d.post(new a(this.c, obj));
    }
}
