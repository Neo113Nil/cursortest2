package xsna;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: View.kt */
/* loaded from: classes15.dex */
public final class icu implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public icu(View view, jcu jcuVar) {
        this.c = view;
        this.d = jcuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.b) {
            case 0:
                ((jcu) this.d).n.setTranslationX((-r0.r.getWidth()) + r0.p.getWidth());
                return;
            default:
                synchronized (((AtomicReference) this.c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.c;
                            mb01 mb01Var = (mb01) ((bf01) this.d).b;
                            kwz0 kwz0Var = mb01Var.h;
                            String o = mb01Var.o().o();
                            r701 r701Var = s701.L;
                            if (o == null) {
                                kwz0Var.getClass();
                                str = (String) r701Var.a(null);
                            } else {
                                str = (String) r701Var.a(kwz0Var.f.b(o, r701Var.a));
                            }
                            atomicReference.set(str);
                        } finally {
                            ((AtomicReference) this.c).notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public icu(bf01 bf01Var, AtomicReference atomicReference) {
        this.d = bf01Var;
        this.c = atomicReference;
    }
}
