package ru.ok.tracer.lite.performance.metrics.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DelayedWork.kt */
/* loaded from: classes9.dex */
public final class DelayedWork {
    private static final Companion Companion = new Companion(null);
    private static final int MSG_RUN = 0;
    private final AtomicReference<State> atomicState;
    private final gzs<s3q0> block;
    private final Handler handler;
    private final long maxAmount;
    private final long maxDelayMillis;
    private final long minAmount;
    private final long minDelayMillis;

    /* compiled from: DelayedWork.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DelayedWork.kt */
    public static final class State {
        public static final Companion Companion = new Companion(null);
        private static final State NONE = new State(Long.MAX_VALUE, 0);
        private final int collectedAmount;
        private final long deadlineMillis;

        /* compiled from: DelayedWork.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final State getNONE() {
                return State.NONE;
            }

            private Companion() {
            }
        }

        public State(long j, int i) {
            this.deadlineMillis = j;
            this.collectedAmount = i;
        }

        public final int getCollectedAmount() {
            return this.collectedAmount;
        }

        public final long getDeadlineMillis() {
            return this.deadlineMillis;
        }
    }

    /* compiled from: DelayedWork.kt */
    public final class WorkCallback implements Handler.Callback {
        public WorkCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            DelayedWork.this.atomicState.set(State.Companion.getNONE());
            DelayedWork.this.block.invoke();
            return true;
        }
    }

    public DelayedWork(Looper looper, long j, long j2, long j3, long j4, gzs<s3q0> gzsVar) {
        this.minDelayMillis = j;
        this.maxDelayMillis = j2;
        this.minAmount = j3;
        this.maxAmount = j4;
        this.block = gzsVar;
        if (j < 0) {
            throw new IllegalArgumentException("minDelayMillis < 0");
        }
        if (j2 < j) {
            throw new IllegalArgumentException("maxDelayMillis < minDelayMillis");
        }
        if (j3 < 1) {
            throw new IllegalArgumentException("minAmount < 1");
        }
        if (j4 < j3) {
            throw new IllegalArgumentException("maxAmount < minAmount");
        }
        this.handler = new Handler(looper, new WorkCallback());
        this.atomicState = new AtomicReference<>(State.Companion.getNONE());
    }

    public static /* synthetic */ void schedule$default(DelayedWork delayedWork, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        delayedWork.schedule(i);
    }

    public final void schedule() {
        schedule$default(this, 0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void schedule(int i) {
        long j;
        long j2;
        long j3;
        State state;
        AtomicReference<State> atomicReference;
        if (i < 0) {
            throw new IllegalArgumentException("amount < 0");
        }
        if (i == 0) {
            return;
        }
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            State state2 = this.atomicState.get();
            int collectedAmount = state2.getCollectedAmount();
            long deadlineMillis = state2.getDeadlineMillis();
            long j4 = collectedAmount;
            long j5 = this.maxAmount;
            if (j4 > j5) {
                return;
            }
            int i2 = collectedAmount + i;
            if (collectedAmount != 0) {
                if (deadlineMillis < Long.MAX_VALUE) {
                    j = deadlineMillis;
                } else {
                    long j6 = this.maxDelayMillis;
                    if (j6 < Long.MAX_VALUE) {
                        j = j6 + elapsedRealtime;
                    }
                }
                j2 = Long.MAX_VALUE;
                j3 = i2;
                if (j3 <= j5) {
                    deadlineMillis = elapsedRealtime;
                } else if (j3 >= this.minAmount) {
                    deadlineMillis = Math.min(this.minDelayMillis + elapsedRealtime, deadlineMillis);
                }
                state = new State(j, i2);
                atomicReference = this.atomicState;
                while (!atomicReference.compareAndSet(state2, state)) {
                    if (atomicReference.get() != state2) {
                        break;
                    }
                }
                this.handler.removeMessages(0);
                if (deadlineMillis >= j2) {
                    this.handler.sendEmptyMessageDelayed(0, deadlineMillis - elapsedRealtime);
                    return;
                }
                return;
            }
            j = Long.MAX_VALUE;
            j2 = Long.MAX_VALUE;
            j3 = i2;
            if (j3 <= j5) {
            }
            state = new State(j, i2);
            atomicReference = this.atomicState;
            while (!atomicReference.compareAndSet(state2, state)) {
            }
            this.handler.removeMessages(0);
            if (deadlineMillis >= j2) {
            }
        }
    }

    public /* synthetic */ DelayedWork(Looper looper, long j, long j2, long j3, long j4, gzs gzsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? Looper.getMainLooper() : looper, j, (i & 4) != 0 ? Long.MAX_VALUE : j2, (i & 8) != 0 ? 1L : j3, (i & 16) != 0 ? Long.MAX_VALUE : j4, gzsVar);
    }
}
