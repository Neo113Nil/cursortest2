package com.yandex.div.core.timer;

import android.os.SystemClock;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.gzs;
import xsna.i5s;
import xsna.izs;
import xsna.msy;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: Ticker.kt */
/* loaded from: classes7.dex */
public final class Ticker {
    public static final Companion Companion = new Companion(null);
    private Long currentDuration;
    private Long currentInterval;
    private Long duration;
    private final ErrorCollector errorCollector;
    private Long interval;
    private final String name;
    private final izs<Long, s3q0> onEnd;
    private final izs<Long, s3q0> onInterrupt;
    private final izs<Long, s3q0> onStart;
    private final izs<Long, s3q0> onTick;
    private long workTimeFromPrevious;
    private State state = State.STOPPED;
    private long startedAt = -1;
    private long interruptedAt = -1;
    private final Lazy timer$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<FixedRateScheduler>() { // from class: com.yandex.div.core.timer.Ticker$timer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final FixedRateScheduler invoke() {
            return new FixedRateScheduler();
        }
    });

    /* compiled from: Ticker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Ticker.kt */
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* compiled from: Ticker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(String str, izs<? super Long, s3q0> izsVar, izs<? super Long, s3q0> izsVar2, izs<? super Long, s3q0> izsVar3, izs<? super Long, s3q0> izsVar4, ErrorCollector errorCollector) {
        this.name = str;
        this.onInterrupt = izsVar;
        this.onStart = izsVar2;
        this.onEnd = izsVar3;
        this.onTick = izsVar4;
        this.errorCollector = errorCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l = this.duration;
        if (l == null) {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
            return;
        }
        izs<Long, s3q0> izsVar = this.onTick;
        long totalWorkTime = getTotalWorkTime();
        long longValue = l.longValue();
        if (totalWorkTime > longValue) {
            totalWorkTime = longValue;
        }
        izsVar.invoke(Long.valueOf(totalWorkTime));
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    private final void onError(String str) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    private final void runCountDownTimer(final long j) {
        long totalWorkTime = j - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new gzs<s3q0>() { // from class: com.yandex.div.core.timer.Ticker$runCountDownTimer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    izs izsVar;
                    Ticker.this.cleanTicker();
                    izsVar = Ticker.this.onEnd;
                    izsVar.invoke(Long.valueOf(j));
                    Ticker.this.state = Ticker.State.STOPPED;
                    Ticker.this.resetTickerState();
                }
            }, 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(j));
            resetTickerState();
        }
    }

    private final void runEndlessTimer(long j) {
        setupTimer(j, j - (getTotalWorkTime() % j), new gzs<s3q0>() { // from class: com.yandex.div.core.timer.Ticker$runEndlessTimer$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Ticker.this.coercedTick();
            }
        });
    }

    private final void runTickTimer(final long j, final long j2) {
        long totalWorkTime = j2 - (getTotalWorkTime() % j2);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = (j / j2) - (getTotalWorkTime() / j2);
        final gzs<s3q0> gzsVar = new gzs<s3q0>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                izs izsVar;
                izs izsVar2;
                if (Ref$LongRef.this.element > 0) {
                    izsVar2 = this.onTick;
                    izsVar2.invoke(Long.valueOf(j));
                }
                izsVar = this.onEnd;
                izsVar.invoke(Long.valueOf(j));
                this.cleanTicker();
                this.resetTickerState();
                this.state = Ticker.State.STOPPED;
            }
        };
        setupTimer(j2, totalWorkTime, new gzs<s3q0>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long totalWorkTime2;
                long j3 = j;
                totalWorkTime2 = this.getTotalWorkTime();
                long j4 = j3 - totalWorkTime2;
                this.coercedTick();
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                ref$LongRef2.element--;
                if (1 > j4 || j4 >= j2) {
                    if (j4 <= 0) {
                        gzsVar.invoke();
                    }
                } else {
                    this.cleanTicker();
                    Ticker ticker = this;
                    final gzs<s3q0> gzsVar2 = gzsVar;
                    Ticker.setupTimer$default(ticker, j4, 0L, new gzs<s3q0>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // xsna.gzs
                        public /* bridge */ /* synthetic */ s3q0 invoke() {
                            invoke2();
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            gzsVar2.invoke();
                        }
                    }, 2, null);
                }
            }
        });
    }

    private final void runTimer() {
        Long l = this.currentInterval;
        Long l2 = this.currentDuration;
        if (l != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l.longValue()) {
            coercedTick();
        }
        if (l == null && l2 != null) {
            runCountDownTimer(l2.longValue());
            return;
        }
        if (l != null && l2 != null) {
            runTickTimer(l2.longValue(), l.longValue());
        } else {
            if (l == null || l2 != null) {
                return;
            }
            runEndlessTimer(l.longValue());
        }
    }

    private final void setupTimer(long j, long j2, gzs<s3q0> gzsVar) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(j2, j, gzsVar);
    }

    public static /* synthetic */ void setupTimer$default(Ticker ticker, long j, long j2, gzs gzsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        ticker.setupTimer(j, j2, gzsVar);
    }

    public final void cancel() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 2 || i == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void pause() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError(i5s.a(new StringBuilder("The timer '"), this.name, "' already stopped!"));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            onError(i5s.a(new StringBuilder("The timer '"), this.name, "' already paused!"));
        } else {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
        }
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void restoreState(boolean z) {
        if (!z) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void resume() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError(i5s.a(new StringBuilder("The timer '"), this.name, "' is stopped!"));
            return;
        }
        if (i == 2) {
            onError(i5s.a(new StringBuilder("The timer '"), this.name, "' already working!"));
        } else {
            if (i != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
        }
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void start() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                onError(i5s.a(new StringBuilder("The timer '"), this.name, "' already working!"));
                return;
            } else {
                if (i != 3) {
                    return;
                }
                onError(i5s.a(new StringBuilder("The timer '"), this.name, "' paused!"));
                return;
            }
        }
        cleanTicker();
        this.currentDuration = this.duration;
        this.currentInterval = this.interval;
        this.state = State.WORKING;
        this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
        runTimer();
    }

    public final void stop() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError(i5s.a(new StringBuilder("The timer '"), this.name, "' already stopped!"));
            return;
        }
        if (i == 2 || i == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void update(long j, Long l) {
        this.interval = l;
        this.duration = j == 0 ? null : Long.valueOf(j);
    }
}
