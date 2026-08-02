package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import xsna.l9s;
import xsna.lfw;

/* compiled from: ImageAnalysisNonBlockingAnalyzer.java */
/* loaded from: classes11.dex */
public final class lfw extends jfw {
    public final Executor g;
    public final Object h = new Object();

    @Nullable
    public alw i;

    @Nullable
    public b j;

    /* compiled from: ImageAnalysisNonBlockingAnalyzer.java */
    public class a implements o0t<Void> {
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            this.b.close();
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }
    }

    /* compiled from: ImageAnalysisNonBlockingAnalyzer.java */
    public static class b extends l9s {
        public final WeakReference<lfw> d;

        public b(alw alwVar, lfw lfwVar) {
            super(alwVar);
            this.d = new WeakReference<>(lfwVar);
            b(new l9s.a() { // from class: xsna.mfw
                @Override // xsna.l9s.a
                public final void f(l9s l9sVar) {
                    lfw lfwVar2 = lfw.b.this.d.get();
                    if (lfwVar2 != null) {
                        lfwVar2.g.execute(new ef2(lfwVar2, 12));
                    }
                }
            });
        }
    }

    public lfw(Executor executor) {
        this.g = executor;
    }

    @Override // xsna.jfw
    @Nullable
    public final alw a(@NonNull hlw hlwVar) {
        return hlwVar.c();
    }

    @Override // xsna.jfw
    public final void c() {
        synchronized (this.h) {
            try {
                alw alwVar = this.i;
                if (alwVar != null) {
                    alwVar.close();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.jfw
    public final void e(@NonNull alw alwVar) {
        synchronized (this.h) {
            try {
                if (!this.f) {
                    alwVar.close();
                    return;
                }
                if (this.j == null) {
                    b bVar = new b(alwVar, this);
                    this.j = bVar;
                    r0t.a(b(bVar), new a(bVar), xo9.g());
                } else {
                    if (alwVar.B().getTimestamp() <= this.j.B().getTimestamp()) {
                        alwVar.close();
                    } else {
                        alw alwVar2 = this.i;
                        if (alwVar2 != null) {
                            alwVar2.close();
                        }
                        this.i = alwVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
