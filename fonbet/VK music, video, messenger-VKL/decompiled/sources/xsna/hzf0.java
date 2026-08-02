package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.BaseVideoPlayer;
import xsna.bzf0;

/* compiled from: RendererThread.kt */
/* loaded from: classes8.dex */
public final class hzf0 extends HandlerThread {
    public final ReentrantLock b;
    public final Condition c;
    public bzf0 d;
    public vob e;
    public m0g0 f;
    public p1t g;
    public final LinkedHashMap h;
    public final LinkedHashSet i;

    public hzf0() {
        super("OneVideoRenderThread", -8);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashSet();
    }

    public final void a(BaseVideoPlayer baseVideoPlayer, a aVar, Handler handler) {
        if (!d()) {
            bzf0 c = c();
            c.getClass();
            c.sendMessage(c.obtainMessage(0, new bzf0.a(baseVideoPlayer, aVar, handler)));
        } else {
            if (this.h.containsKey(baseVideoPlayer)) {
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            p1t p1tVar = this.g;
            if (p1tVar == null) {
                p1tVar = null;
            }
            p1tVar.a(new fzf0(this, ref$ObjectRef, handler, aVar, baseVideoPlayer, 0));
        }
    }

    public final void b(Object obj) {
        if (!d()) {
            bzf0 c = c();
            c.sendMessage(c.obtainMessage(1, obj));
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        dzf0 dzf0Var = (dzf0) linkedHashMap.get(obj);
        if (dzf0Var != null) {
            p1t p1tVar = this.g;
            if (p1tVar == null) {
                p1tVar = null;
            }
            p1tVar.a(new jz70(dzf0Var, 18));
            linkedHashMap.remove(obj);
            e(dzf0Var.h);
        }
    }

    public final bzf0 c() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        while (true) {
            try {
                bzf0 bzf0Var = this.d;
                if (bzf0Var != null) {
                    return bzf0Var;
                }
                this.c.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean d() {
        bzf0 bzf0Var = this.d;
        if ((bzf0Var != null ? bzf0Var.getLooper() : null) == null) {
            return false;
        }
        Looper myLooper = Looper.myLooper();
        bzf0 bzf0Var2 = this.d;
        return epx.f(myLooper, bzf0Var2 != null ? bzf0Var2.getLooper() : null);
    }

    public final void e(a2t a2tVar) {
        Object obj;
        Iterator it = this.h.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dzf0) obj).h == a2tVar) {
                    break;
                }
            }
        }
        if (obj == null) {
            p1t p1tVar = this.g;
            if (p1tVar == null) {
                p1tVar = null;
            }
            p1tVar.a(new nm60(a2tVar, 15));
            a2tVar.a = null;
            this.i.remove(a2tVar);
        }
    }

    public final void f(Object obj) {
        if (!d()) {
            bzf0 c = c();
            c.sendMessage(c.obtainMessage(4, obj));
            return;
        }
        dzf0 dzf0Var = (dzf0) this.h.get(obj);
        if (dzf0Var != null) {
            dzf0Var.l = false;
            dzf0Var.e = false;
        }
    }

    public final void g(BaseVideoPlayer baseVideoPlayer, a2t a2tVar) {
        Object obj;
        if (!d()) {
            bzf0 c = c();
            c.getClass();
            c.sendMessage(c.obtainMessage(3, new bzf0.b(baseVideoPlayer, a2tVar)));
            return;
        }
        LinkedHashSet linkedHashSet = this.i;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((a2t) obj) == a2tVar) {
                    break;
                }
            }
        }
        if (obj == null) {
            a2tVar.a = this.e;
            linkedHashSet.add(a2tVar);
            p1t p1tVar = this.g;
            if (p1tVar == null) {
                p1tVar = null;
            }
            p1tVar.a(new yqd0(a2tVar, 1));
        }
        dzf0 dzf0Var = (dzf0) this.h.get(baseVideoPlayer);
        if (dzf0Var != null) {
            a2t a2tVar2 = dzf0Var.h;
            if (!epx.f(a2tVar2, a2tVar)) {
                dzf0Var.h.b = null;
                a2tVar.b = dzf0Var;
                dzf0Var.h = a2tVar;
            }
            e(a2tVar2);
        }
    }

    public final void h(BaseVideoPlayer baseVideoPlayer, Surface surface) {
        dzf0 dzf0Var;
        if (!d()) {
            bzf0 c = c();
            c.getClass();
            bzf0.c cVar = new bzf0.c(baseVideoPlayer, surface);
            c.removeMessages(2, cVar);
            c.sendMessage(c.obtainMessage(2, cVar));
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!epx.f(entry.getKey(), baseVideoPlayer) && surface != null) {
                s1t s1tVar = ((dzf0) entry.getValue()).k;
                if (epx.f(s1tVar != null ? (Surface) s1tVar.a : null, surface)) {
                    ((dzf0) entry.getValue()).c(null);
                }
            }
        }
        if ((surface == null || surface.isValid()) && (dzf0Var = (dzf0) linkedHashMap.get(baseVideoPlayer)) != null) {
            dzf0Var.c(surface);
        }
    }

    public final void i(Object obj, Size size) {
        s1t s1tVar;
        Surface surface;
        s1t s1tVar2;
        Surface surface2;
        if (!d()) {
            bzf0 c = c();
            c.getClass();
            c.sendMessage(c.obtainMessage(5, new bzf0.d(obj, size)));
            return;
        }
        dzf0 dzf0Var = (dzf0) this.h.get(obj);
        if (dzf0Var == null || epx.f(dzf0Var.j, size)) {
            return;
        }
        dzf0Var.j = size;
        if (size != null) {
            if (!dzf0Var.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                s1t s1tVar3 = dzf0Var.k;
                if ((s1tVar3 == null || (surface2 = (Surface) s1tVar3.a) == null || surface2.isValid()) && (s1tVar2 = dzf0Var.k) != null) {
                    s1tVar2.a(new ojg(dzf0Var, size, s1tVar2, 3));
                    return;
                }
                return;
            }
        }
        s1t s1tVar4 = dzf0Var.k;
        if ((s1tVar4 == null || (surface = (Surface) s1tVar4.a) == null || surface.isValid()) && (s1tVar = dzf0Var.k) != null) {
            s1tVar.a(new w910(s1tVar, 22));
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        m0g0 m0g0Var = new m0g0(4);
        this.f = m0g0Var;
        this.g = new p1t(m0g0Var);
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = new bzf0(getLooper(), new WeakReference(this));
            this.e = new vob(getLooper());
            this.c.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        p1t p1tVar = this.g;
        if (p1tVar == null) {
            p1tVar = null;
        }
        p1tVar.a(new ejf0(this, 1));
        this.h.clear();
        this.i.clear();
        p1t p1tVar2 = this.g;
        if (p1tVar2 == null) {
            p1tVar2 = null;
        }
        p1tVar2.b();
        m0g0 m0g0Var = this.f;
        (m0g0Var != null ? m0g0Var : null).f();
    }

    /* compiled from: RendererThread.kt */
    public interface a {
        void a(Surface surface);

        void onRenderedFirstFrame();

        default void b(long j) {
        }
    }
}
