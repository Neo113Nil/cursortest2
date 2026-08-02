package xsna;

import java.util.Iterator;

/* compiled from: AudioStateListener.java */
/* loaded from: classes3.dex */
public final class hy4 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hy4(y6o0 y6o0Var, Runnable runnable) {
        this.c = y6o0Var;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Iterator it = ((dy4) this.d).i.iterator();
                while (it.hasNext()) {
                    ((com.vk.music.player.e) it.next()).onError((String) this.c);
                }
                return;
            default:
                y6o0 y6o0Var = (y6o0) this.c;
                Runnable runnable = (Runnable) this.d;
                exc0.l(((Thread) y6o0Var.d.getAndSet(Thread.currentThread())) == null);
                try {
                    runnable.run();
                    y6o0Var.d.set(null);
                    y6o0Var.b();
                    return;
                } catch (Throwable th) {
                    try {
                        y6o0Var.d.set(null);
                        y6o0Var.b();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
        }
    }

    public hy4(dy4 dy4Var, String str) {
        this.d = dy4Var;
        this.c = str;
    }
}
