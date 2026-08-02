package ru.ok.tracer.opentelemetry.record;

import xsna.jk3;
import xsna.kpw;
import xsna.q94;
import xsna.qhk0;

/* compiled from: LongRecorder.kt */
/* loaded from: classes9.dex */
public interface LongRecorder {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: LongRecorder.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final LongRecorder noop() {
            return NoopLongRecorder.INSTANCE;
        }
    }

    /* compiled from: LongRecorder.kt */
    public static final class DefaultImpls {
        public static void record$default(LongRecorder longRecorder, long j, q94 q94Var, qhk0 qhk0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record");
            }
            if ((i & 2) != 0) {
                q94Var = jk3.e;
            }
            if ((i & 4) != 0) {
                qhk0Var = kpw.a;
            }
            longRecorder.record(j, q94Var, qhk0Var);
        }
    }

    void record(long j, q94 q94Var, qhk0 qhk0Var);
}
