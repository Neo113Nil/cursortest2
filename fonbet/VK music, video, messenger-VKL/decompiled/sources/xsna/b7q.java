package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* compiled from: ExoPlaylist.kt */
/* loaded from: classes8.dex */
public final class b7q extends b2p {
    public final q60 b;
    public androidx.media3.exoplayer.source.d c;
    public final Handler d;
    public final LinkedList<gzs<s3q0>> e;
    public boolean f;

    /* compiled from: ExoPlaylist.kt */
    public static final class a implements one.video.player.m {
        public final q60 a;

        public a(q60 q60Var) {
            this.a = q60Var;
        }

        @Override // one.video.player.m
        public final y6b0 a(ArrayList arrayList) {
            return new b7q(this.a, arrayList);
        }
    }

    public b7q() {
        throw null;
    }

    public b7q(q60 q60Var, Iterable iterable) {
        super(iterable);
        this.b = q60Var;
        Looper myLooper = Looper.myLooper();
        this.d = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.e = new LinkedList<>();
    }

    public static s3q0 e(b7q b7qVar, int i, fp0 fp0Var, com.vk.movika.sdk.base.ui.k kVar) {
        androidx.media3.exoplayer.source.d dVar = b7qVar.c;
        if (dVar == null || dVar.E(i, b7qVar.d, fp0Var) == null) {
            super.c(i, kVar);
            s3q0 s3q0Var = s3q0.a;
        }
        return s3q0.a;
    }

    public static void f(b7q b7qVar, int i, com.vk.movika.sdk.base.ui.k kVar) {
        int size;
        androidx.media3.exoplayer.source.d dVar = b7qVar.c;
        if (dVar != null) {
            synchronized (dVar) {
                size = dVar.k.size();
            }
            if (size == 0) {
                b7qVar.c = null;
            }
        }
        super.c(i, kVar);
    }

    public static s3q0 g(androidx.media3.exoplayer.source.d dVar, b7q b7qVar, int i, sht0 sht0Var, ww wwVar, u6q u6qVar) {
        if (dVar != null) {
            dVar.E(i, b7qVar.d, u6qVar);
        } else {
            super.d(i, sht0Var, wwVar);
        }
        return s3q0.a;
    }

    public static void h(b7q b7qVar, defpackage.e0 e0Var) {
        b7qVar.c = null;
        super.b(e0Var);
    }

    public static void i(b7q b7qVar, int i, sht0 sht0Var, ww wwVar) {
        super.d(i, sht0Var, wwVar);
    }

    public static s3q0 j(b7q b7qVar, defpackage.e0 e0Var) {
        int size;
        androidx.media3.exoplayer.source.d dVar = b7qVar.c;
        if (dVar != null) {
            Handler handler = b7qVar.d;
            x6q x6qVar = new x6q(0, b7qVar, e0Var);
            synchronized (dVar) {
                synchronized (dVar) {
                    size = dVar.k.size();
                }
            }
            synchronized (dVar) {
                dVar.F(0, size, handler, x6qVar);
            }
        } else {
            super.b(e0Var);
        }
        return s3q0.a;
    }

    @Override // xsna.b2p
    public final void b(gzs<s3q0> gzsVar) {
        this.e.addLast(new pw(9, this, new defpackage.e0(8, gzsVar, this)));
        k();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.u6q] */
    @Override // xsna.b2p
    public final void d(final int i, final sht0 sht0Var, gzs<s3q0> gzsVar) {
        final ww wwVar = new ww(10, gzsVar, this);
        final androidx.media3.exoplayer.source.d dVar = this.c;
        final ?? r0 = new Runnable() { // from class: xsna.u6q
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.source.d dVar2 = androidx.media3.exoplayer.source.d.this;
                final int i2 = i;
                final b7q b7qVar = this;
                final sht0 sht0Var2 = sht0Var;
                final ww wwVar2 = wwVar;
                if (dVar2 != null) {
                    androidx.media3.exoplayer.source.i iVar = (androidx.media3.exoplayer.source.i) b7qVar.b.invoke(sht0Var2);
                    Handler handler = b7qVar.d;
                    Runnable runnable = new Runnable() { // from class: xsna.w6q
                        @Override // java.lang.Runnable
                        public final void run() {
                            b7q.i(b7q.this, i2, sht0Var2, wwVar2);
                        }
                    };
                    synchronized (dVar2) {
                        dVar2.A(i2, Collections.singletonList(iVar), handler, runnable);
                    }
                }
            }
        };
        this.e.addLast(new gzs() { // from class: xsna.v6q
            @Override // xsna.gzs
            public final Object invoke() {
                return b7q.g(androidx.media3.exoplayer.source.d.this, this, i, sht0Var, wwVar, r0);
            }
        });
        k();
    }

    public final void k() {
        LinkedList<gzs<s3q0>> linkedList = this.e;
        if (linkedList.isEmpty() || this.f) {
            return;
        }
        this.f = true;
        linkedList.pop().invoke();
    }
}
