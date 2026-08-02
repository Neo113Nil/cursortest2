package xsna;

import ru.ok.android.onelog.ExperimentalOneLogDirect;

/* compiled from: ExoVideoCoverageProcessor.kt */
/* loaded from: classes3.dex */
public abstract class l7q extends de {
    public final tds0 b = new tds0(0);

    public final long q0() {
        g4b0 g4b0Var;
        tds0 tds0Var = this.b;
        long j = tds0Var.a;
        if (j < 0) {
            return -1L;
        }
        long j2 = tds0Var.b;
        if (j2 > j || (j2 == 0 && j == 0)) {
            c7q c7qVar = c7q.this;
            if (c7qVar.a != null && (g4b0Var = c7qVar.b) != null) {
                String a = f3r0.a(j, j2);
                if (g4b0Var.a != null) {
                    ExperimentalOneLogDirect experimentalOneLogDirect = ExperimentalOneLogDirect.INSTANCE;
                    experimentalOneLogDirect.flush();
                    experimentalOneLogDirect.send(wi80.a("watch_coverage_record", g4b0Var, a, null));
                }
            }
        }
        tds0Var.a();
        return j2;
    }
}
