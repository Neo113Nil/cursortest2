package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MyHandlerThread.kt */
/* loaded from: classes3.dex */
public abstract class oo50<T extends Handler> extends HandlerThread {
    public final ReentrantLock b;
    public final Condition c;
    public vfs d;

    public oo50() {
        super("FramePlayerThread");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    public final vfs a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        while (true) {
            try {
                vfs vfsVar = this.d;
                if (vfsVar != null) {
                    return vfsVar;
                }
                this.c.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean b() {
        vfs vfsVar = this.d;
        if ((vfsVar != null ? vfsVar.getLooper() : null) == null) {
            return false;
        }
        Looper myLooper = Looper.myLooper();
        vfs vfsVar2 = this.d;
        return epx.f(myLooper, vfsVar2 != null ? vfsVar2.getLooper() : null);
    }

    public abstract void c();

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ufs ufsVar = (ufs) this;
            m0g0 m0g0Var = new m0g0(4);
            p1t p1tVar = new p1t(m0g0Var);
            ufsVar.g = m0g0Var;
            ufsVar.h = p1tVar;
            p1tVar.a(new z3i(ufsVar, 14));
            ufs ufsVar2 = (ufs) this;
            this.d = new vfs(ufsVar2.getLooper(), new WeakReference(ufsVar2));
            this.c.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            super.run();
        } finally {
            c();
        }
    }
}
