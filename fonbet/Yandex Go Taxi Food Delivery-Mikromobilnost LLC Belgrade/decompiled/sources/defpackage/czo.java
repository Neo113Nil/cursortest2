package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.a;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes10.dex */
public class czo extends a {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public czo(WindowLayoutComponent windowLayoutComponent, yfa yfaVar) {
        super(windowLayoutComponent, yfaVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.a, defpackage.bzo, defpackage.z551
    public final void a(Context context, Executor executor, e9e e9eVar) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            io40 io40Var = (io40) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (io40Var != null) {
                io40Var.a(e9eVar);
                linkedHashMap2.put(e9eVar, context);
            } else {
                io40 io40Var2 = new io40(context);
                linkedHashMap.put(context, io40Var2);
                linkedHashMap2.put(e9eVar, context);
                io40Var2.a(e9eVar);
                this.a.addWindowLayoutInfoListener(context, io40Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.a, defpackage.bzo, defpackage.z551
    public final void b(e9e e9eVar) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(e9eVar);
            if (context == null) {
                return;
            }
            io40 io40Var = (io40) linkedHashMap.get(context);
            if (io40Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = io40Var.b;
            reentrantLock2.lock();
            try {
                io40Var.w.remove(e9eVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(e9eVar);
                if (io40Var.w.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(io40Var);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
