package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.yandex.pulse.mvi.a;
import io.appmetrica.analytics.impl.Uf;
import io.appmetrica.analytics.impl.Wf;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class obp0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final Object c;
    public final Object w;

    public obp0(jya1 jya1Var, qwa1 qwa1Var, long j) {
        this.c = qwa1Var;
        this.b = j;
        Objects.requireNonNull(jya1Var);
        this.w = jya1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double a;
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                bv20 bv20Var = (bv20) obj;
                List list = (List) ((thw0) obj2).get();
                if (list.isEmpty()) {
                    a = -1.0d;
                } else {
                    int binarySearch = Collections.binarySearch(list, new qbp0(j, 0.0d), new o2f(6));
                    if (binarySearch >= 0) {
                        a = ((qbp0) list.get(binarySearch)).b;
                    } else {
                        int i2 = -binarySearch;
                        int i3 = i2 - 1;
                        if (i3 <= 0) {
                            a = ((qbp0) list.get(0)).b;
                        } else if (i3 >= list.size()) {
                            a = ((qbp0) b64.c(1, list)).b;
                        } else {
                            qbp0 qbp0Var = (qbp0) list.get(i2 - 2);
                            qbp0 qbp0Var2 = (qbp0) list.get(i3);
                            long j2 = qbp0Var.a;
                            double d = qbp0Var.b;
                            a = x4e.a(qbp0Var2.b, d, (j - j2) / (qbp0Var2.a - j2), d);
                        }
                    }
                }
                final double d2 = a;
                final ev20 ev20Var = bv20Var.a;
                final String str = bv20Var.b;
                final long j3 = bv20Var.c;
                final String str2 = bv20Var.d;
                final String str3 = bv20Var.e;
                boolean z = bv20Var.f;
                Runnable runnable = new Runnable() { // from class: cv20
                    @Override // java.lang.Runnable
                    public final void run() {
                        ev20 ev20Var2 = ev20.this;
                        Uf uf = ev20Var2.a;
                        Wf wf = ev20Var2.r;
                        String str4 = str;
                        long j4 = j3;
                        double d3 = d2;
                        uf.reportKeyMetric(wf, str4, j4, d3, str2, str3);
                        k5g k5gVar = ev20Var2.p;
                        if (((pc20) k5gVar.f) == null) {
                            k5gVar.f = (pc20) ((a) k5gVar.l).get();
                        }
                        ((pc20) k5gVar.f).a(d3, str4);
                    }
                };
                if (!z) {
                    ev20Var.e.post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                jya1 jya1Var = (jya1) obj2;
                jya1Var.Kg((qwa1) obj, false, j);
                jya1Var.y = null;
                j5b1 j4 = ((g) jya1Var.b).j();
                j4.Gg();
                j4.Hg();
                j4.Ug(new na3(j4, null));
                break;
        }
    }

    public obp0(long j, thw0 thw0Var, bv20 bv20Var) {
        this.b = j;
        this.w = thw0Var;
        this.c = bv20Var;
    }
}
