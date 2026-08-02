package ru.ok.tracer.opentelemetry.record;

import xsna.jk3;
import xsna.kpw;
import xsna.q94;
import xsna.qhk0;

/* compiled from: DoubleRecorder.kt */
/* loaded from: classes9.dex */
public interface DoubleRecorder {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DoubleRecorder.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DoubleRecorder noop() {
            return NoopDoubleRecorder.INSTANCE;
        }
    }

    /* compiled from: DoubleRecorder.kt */
    public static final class DefaultImpls {
        public static void record$default(DoubleRecorder doubleRecorder, double d, q94 q94Var, qhk0 qhk0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record");
            }
            if ((i & 2) != 0) {
                q94Var = jk3.e;
            }
            if ((i & 4) != 0) {
                qhk0Var = kpw.a;
            }
            doubleRecorder.record(d, q94Var, qhk0Var);
        }
    }

    void record(double d, q94 q94Var, qhk0 qhk0Var);
}
