package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import xsna.k8l;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes12.dex */
public abstract class eqj0<I extends DecoderInputBuffer, O extends k8l, E extends DecoderException> implements a8l<I, O, E> {
    public final a a;
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;

    @Nullable
    public I i;

    @Nullable
    public E j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = C.TIME_UNSET;
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();

    /* compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (eqj0.this.g());
        }
    }

    public eqj0(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    @Override // xsna.a8l
    public final void a(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    fxc0.z(z);
                    this.m = j;
                }
                z = true;
                fxc0.z(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract I c();

    public abstract O d();

    @Override // xsna.a8l
    @Nullable
    public final Object dequeueInputBuffer() throws DecoderException {
        I i;
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                fxc0.z(this.i == null);
                int i2 = this.g;
                if (i2 == 0) {
                    i = null;
                } else {
                    I[] iArr = this.e;
                    int i3 = i2 - 1;
                    this.g = i3;
                    i = iArr[i3];
                }
                this.i = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public abstract E e(Throwable th);

    @Nullable
    public abstract E f(I i, O o, boolean z);

    @Override // xsna.a8l
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                I i = this.i;
                if (i != null) {
                    i.c();
                    I[] iArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    iArr[i2] = i;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    I removeFirst = this.c.removeFirst();
                    removeFirst.c();
                    I[] iArr2 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    iArr2[i3] = removeFirst;
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() throws InterruptedException {
        boolean z;
        E e;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (removeFirst.b(4)) {
                o.a(4);
            } else {
                o.c = removeFirst.g;
                if (removeFirst.b(134217728)) {
                    o.a(134217728);
                }
                long j = removeFirst.g;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != C.TIME_UNSET && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    o.d = true;
                }
                try {
                    e = f(removeFirst, o, z2);
                } catch (OutOfMemoryError e2) {
                    e = e(e2);
                } catch (RuntimeException e3) {
                    e = e(e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        o.h();
                    } else if (o.d) {
                        o.h();
                    } else {
                        this.d.addLast(o);
                    }
                    removeFirst.c();
                    I[] iArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    iArr[i2] = removeFirst;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // xsna.a8l
    @Nullable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.a8l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void b(I i) throws DecoderException {
        synchronized (this.b) {
            try {
                E e = this.j;
                if (e != null) {
                    throw e;
                }
                fxc0.p(i == this.i);
                this.c.addLast(i);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(O o) {
        synchronized (this.b) {
            o.c();
            O[] oArr = this.f;
            int i = this.h;
            this.h = i + 1;
            oArr[i] = o;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // xsna.a8l
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
