package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.ExecutorService;
import xsna.hlw;
import xsna.snw;
import xsna.ub9;

/* compiled from: ImageAnalysisAbstractAnalyzer.java */
/* loaded from: classes11.dex */
public abstract class jfw implements hlw.a {
    public d4n b;
    public volatile int c;
    public ExecutorService d;
    public final Object e = new Object();
    public boolean f = true;

    @Nullable
    public abstract alw a(@NonNull hlw hlwVar);

    public final ugz<Void> b(final alw alwVar) {
        final ExecutorService executorService;
        final d4n d4nVar;
        synchronized (this.e) {
            executorService = this.d;
            d4nVar = this.b;
        }
        return (d4nVar == null || executorService == null) ? new snw.a(new OperationCanceledException("No analyzer or executor currently set.")) : ub9.a(new ub9.c() { // from class: xsna.hfw
            @Override // xsna.ub9.c
            public final Object attachCompleter(ub9.a aVar) {
                executorService.execute(new ifw(jfw.this, alwVar, d4nVar, aVar, 0));
                return "analyzeImage";
            }
        });
    }

    public abstract void c();

    @Override // xsna.hlw.a
    public final void d(@NonNull hlw hlwVar) {
        try {
            alw a = a(hlwVar);
            if (a != null) {
                e(a);
            }
        } catch (IllegalStateException e) {
            s100.a("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract void e(@NonNull alw alwVar);
}
