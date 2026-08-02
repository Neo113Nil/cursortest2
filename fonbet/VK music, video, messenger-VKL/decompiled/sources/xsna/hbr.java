package xsna;

import android.util.Log;
import java.util.concurrent.ExecutorService;

/* compiled from: FileWritable.kt */
/* loaded from: classes3.dex */
public abstract class hbr {
    public final m9r a;
    public final Object b = new Object();
    public String c = "";
    public jar d;
    public ExecutorService e;

    public hbr(m9r m9rVar) {
        this.a = m9rVar;
    }

    public abstract boolean a();

    public abstract void b();

    public abstract void c();

    public final void d(String str, boolean z) {
        try {
            e(str, z);
        } catch (Throwable th) {
            Log.e("FileWritable", "File writable error", th);
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public abstract void e(String str, boolean z);
}
