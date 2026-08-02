package xsna;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ExtensionWindowBackendApi2.kt */
/* loaded from: classes12.dex */
public class idq extends hdq {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public idq(WindowLayoutComponent windowLayoutComponent, p7j p7jVar) {
        super(windowLayoutComponent, p7jVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // xsna.hdq, xsna.gdq, xsna.opx0
    public final void a(Context context, Executor executor, o7j<erx0> o7jVar) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            c740 c740Var = (c740) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (c740Var != null) {
                c740Var.a(o7jVar);
                linkedHashMap2.put(o7jVar, context);
            } else {
                c740 c740Var2 = new c740(context);
                linkedHashMap.put(context, c740Var2);
                linkedHashMap2.put(o7jVar, context);
                c740Var2.a(o7jVar);
                this.a.addWindowLayoutInfoListener(context, c740Var2);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.hdq, xsna.gdq, xsna.opx0
    public final void b(o7j<erx0> o7jVar) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(o7jVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            c740 c740Var = (c740) linkedHashMap.get(context);
            if (c740Var == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = c740Var.c;
            reentrantLock2.lock();
            try {
                c740Var.e.remove(o7jVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(o7jVar);
                if (c740Var.e.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(c740Var);
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
