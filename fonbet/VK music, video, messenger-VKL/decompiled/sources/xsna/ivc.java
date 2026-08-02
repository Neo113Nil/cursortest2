package xsna;

import java.io.File;
import java.util.Arrays;

/* compiled from: ClipEncodingTask.kt */
/* loaded from: classes16.dex */
public abstract class ivc implements Runnable {
    public final File b;
    public final File c;
    public b920 d;
    public lfa e;
    public defpackage.g f;

    public ivc(File file, File file2) {
        this.b = file;
        this.c = file2;
    }

    public void a() {
        lyd.a.d(Arrays.copyOf(new Object[]{"ClipEncodingTask", "task " + this + " was canceled"}, 2));
    }

    public abstract long b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        lfa lfaVar;
        lyd.a.d(Arrays.copyOf(new Object[]{"ClipEncodingTask", "start task " + this + " on " + Thread.currentThread().getName()}, 2));
        long currentTimeMillis = System.currentTimeMillis();
        c();
        b920 b920Var = this.d;
        if ((b920Var instanceof lip) && (lfaVar = this.e) != null) {
            lfaVar.invoke(((lip) b920Var).c);
        }
        lyd.a.d(Arrays.copyOf(new Object[]{"ClipEncodingTask", "task " + this + " finished for " + (System.currentTimeMillis() - currentTimeMillis) + " ms, status=" + b920Var}, 2));
        defpackage.g gVar = this.f;
        if (gVar != null) {
            gVar.invoke();
        }
    }
}
