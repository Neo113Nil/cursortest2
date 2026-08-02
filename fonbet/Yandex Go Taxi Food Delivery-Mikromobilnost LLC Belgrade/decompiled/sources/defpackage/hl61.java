package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;
import yads.a72;

/* loaded from: classes7.dex */
public final class hl61 {
    public static hl61 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public hl61(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
        context.registerReceiver(new a72(this), intentFilter);
    }

    public static synchronized hl61 b(Context context) {
        hl61 hl61Var;
        synchronized (hl61.class) {
            try {
                if (e == null) {
                    e = new hl61(context);
                }
                hl61Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hl61Var;
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    bj71 bj71Var = (bj71) weakReference.get();
                    if (bj71Var != null) {
                        bj71Var.a(i);
                    } else {
                        this.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
