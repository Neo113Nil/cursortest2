package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class ona1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ j c;

    public ona1(j jVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(jVar);
                this.c = jVar;
                break;
            case 2:
                this.c = jVar;
                this.b = atomicReference;
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
                            atomicReference.set(Boolean.valueOf(gVar.w.Qg(gVar.l().Mg(), nw91.a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            g gVar2 = (g) this.c.b;
                            atomicReference2.set(Integer.valueOf(gVar2.w.Og(gVar2.l().Mg(), nw91.d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                j5b1 j = ((g) this.c.b).j();
                zzoo zza = zzoo.zza(zzls.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.b;
                j.Gg();
                j.Hg();
                j.Ug(new h(j, atomicReference3, j.Wg(false), zza, 3));
                return;
        }
    }
}
