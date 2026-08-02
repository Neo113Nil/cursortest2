package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class kk2 implements a83 {
    public final kw a;
    public final long b;
    public final WeakReference c;

    public kk2(ProgressBar progressBar, kw kwVar, long j) {
        this.a = kwVar;
        this.b = j;
        this.c = new WeakReference(progressBar);
    }

    @Override // yads.a83
    public final void a(long j, long j2) {
        ProgressBar progressBar = (ProgressBar) this.c.get();
        if (progressBar != null) {
            kw kwVar = this.a;
            long j3 = this.b;
            kwVar.a.getClass();
            ff.a(progressBar, j3, j3 - j);
        }
    }
}
