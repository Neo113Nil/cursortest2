package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class npa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ j c;

    public npa1(j jVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(jVar);
                this.c = jVar;
                break;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(jVar);
                this.c = jVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            g gVar = (g) this.c.b;
                            atomicReference.set(gVar.w.Mg(gVar.l().Mg(), nw91.b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            g gVar2 = (g) this.c.b;
                            atomicReference2.set(Double.valueOf(gVar2.w.Pg(gVar2.l().Mg(), nw91.e0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
