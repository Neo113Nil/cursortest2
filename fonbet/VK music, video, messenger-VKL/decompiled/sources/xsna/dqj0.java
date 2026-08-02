package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import xsna.k8l;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes8.dex */
public abstract class dqj0<I extends DecoderInputBuffer, O extends k8l, E extends DecoderException> implements a8l<I, O, E> {
    public final a a;
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;

    @Nullable
    public I i;

    @Nullable
    public SubtitleDecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = C.TIME_UNSET;
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();

    /* compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public final /* synthetic */ usj0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(usj0 usj0Var) {
            super("ExoPlayer:SimpleDecoder");
            this.b = usj0Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException unused) {
                    return;
                }
            } while (this.b.d());
        }
    }

    public dqj0(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new u0n0();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new ssj0((usj0) this);
        }
        a aVar = new a((usj0) this);
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

    @Override // xsna.a8l
    public final void b(u0n0 u0n0Var) throws DecoderException {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                fxc0.p(u0n0Var == this.i);
                this.c.addLast(u0n0Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public abstract E c(I i, O o, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() throws InterruptedException {
        boolean z;
        E subtitleDecoderException;
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
                    e = c(removeFirst, o, z2);
                } catch (OutOfMemoryError e2) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e2);
                    e = subtitleDecoderException;
                    if (e != null) {
                    }
                    synchronized (this.b) {
                    }
                } catch (RuntimeException e3) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e3);
                    e = subtitleDecoderException;
                    if (e != null) {
                    }
                    synchronized (this.b) {
                    }
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = (SubtitleDecoderException) e;
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
    public final Object dequeueInputBuffer() throws DecoderException {
        I i;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
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

    @Override // xsna.a8l
    @Nullable
    public final Object dequeueOutputBuffer() throws DecoderException {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
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

    @Override // xsna.a8l
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        this.a.interrupt();
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
