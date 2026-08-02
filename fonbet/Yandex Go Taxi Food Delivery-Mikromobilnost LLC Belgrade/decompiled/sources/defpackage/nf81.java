package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import yads.ri;

/* loaded from: classes7.dex */
public final class nf81 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public ri c;
    public final AtomicReference d;
    public final sh71 e;
    public boolean f;

    public nf81(MediaCodec mediaCodec, HandlerThread handlerThread) {
        sh71 sh71Var = new sh71();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = sh71Var;
        this.d = new AtomicReference();
    }

    public static hc81 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new hc81();
                }
                return (hc81) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                ri riVar = this.c;
                riVar.getClass();
                riVar.removeCallbacksAndMessages(null);
                sh71 sh71Var = this.e;
                synchronized (sh71Var) {
                    sh71Var.a = false;
                }
                ri riVar2 = this.c;
                riVar2.getClass();
                riVar2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ny61.o(e);
            }
        }
    }
}
