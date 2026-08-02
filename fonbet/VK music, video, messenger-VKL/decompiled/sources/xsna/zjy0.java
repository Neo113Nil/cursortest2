package xsna;

import java.util.concurrent.locks.ReentrantLock;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;

/* compiled from: QuicStreamImpl.java */
/* loaded from: classes8.dex */
public class zjy0 implements sdy0 {
    public final int a;
    public final bI b;
    public final bE c;
    public final mky0 d;
    public final sp e;
    public final dky0 f;
    public final lvb0 g;
    public volatile boolean h;
    public volatile boolean i;
    public final ReentrantLock j;

    public zjy0(int i, bI bIVar, bE bEVar, mky0 mky0Var, vjy0 vjy0Var, sp spVar) {
        dky0 fky0Var;
        bI bIVar2;
        bI bIVar3;
        this.a = i;
        this.b = bIVar;
        this.c = bEVar;
        this.d = mky0Var;
        this.e = spVar;
        if (e() || (d() && !(((bIVar3 = this.b) == bI.a && (i & 1) == 0) || (bIVar3 == bI.b && (i & 1) == 1)))) {
            fky0Var = new fky0(this, e() ? mky0Var.g.h() : mky0Var.g.g(), spVar);
        } else {
            fky0Var = new xjy0();
        }
        this.f = fky0Var;
        this.g = (e() || (d() && (((bIVar2 = this.b) == bI.a && (i & 1) == 0) || (bIVar2 == bI.b && (i & 1) == 1)))) ? b(vjy0Var) : new yjy0(1);
        this.j = new ReentrantLock();
    }

    @Override // xsna.sdy0
    public final dky0 a() {
        return this.f;
    }

    @Override // xsna.sdy0
    public final lvb0 b() {
        return this.g;
    }

    @Override // xsna.sdy0
    public final int c() {
        return this.a;
    }

    @Override // xsna.sdy0
    public final boolean d() {
        return (this.a & 2) == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (d() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        try {
            this.j.lock();
            this.h = true;
            if (e()) {
                if (!this.i) {
                }
                this.d.g(this.a);
                this.j.unlock();
            }
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (d() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        try {
            this.j.lock();
            this.i = true;
            if (e()) {
                if (!this.h) {
                }
                this.d.g(this.a);
                this.j.unlock();
            }
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }

    public final String toString() {
        return lhg.a(this.a, "Stream ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if ((r1 & 1) == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if ((r1 & 1) == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(one.video.calls.sdk_private.w wVar) throws bJ {
        if (!e()) {
            if (d()) {
                bI bIVar = bI.a;
                int i = this.a;
                bI bIVar2 = this.b;
                if (bIVar2 == bIVar) {
                }
                if (bIVar2 == bI.b) {
                }
            }
            throw new bJ(ap$a.STREAM_STATE_ERROR);
        }
        return this.f.b(wVar);
    }

    @Override // xsna.sdy0
    public final void b(long j) {
        this.g.h(j);
    }

    public final void c(int i) {
        mky0 mky0Var = this.d;
        mky0Var.getClass();
        try {
            mky0Var.u.lock();
            mky0Var.q += i;
            if (mky0Var.q - mky0Var.r > mky0Var.s) {
                bE bEVar = mky0Var.b;
                long j = mky0Var.q;
                dcy0 dcy0Var = new dcy0();
                dcy0Var.b = j;
                bEVar.j(dcy0Var, new iby0(1), true);
                mky0Var.r = mky0Var.q;
            }
        } finally {
            mky0Var.u.unlock();
        }
    }

    public rky0 b(vjy0 vjy0Var) {
        return new rky0(this, vjy0Var, this.e);
    }

    @Override // xsna.sdy0
    public final void a(long j) {
        this.f.h(j);
    }
}
