package com.yandex.div.internal.viewpool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.zcl;
import xsna.zk3;
import xsna.zr;

/* compiled from: ProfilingSession.kt */
/* loaded from: classes7.dex */
public final class ProfilingSession {
    public static final Companion Companion = new Companion(null);
    private final Accumulator mOverallTimeAccumulator = new Accumulator();
    private final Accumulator mLongRequestAccumulator = new Accumulator();
    private final zk3<String, Accumulator> mBlockedViewAccumulators = new zk3<>();

    /* compiled from: ProfilingSession.kt */
    public static final class Accumulator {
        private long accumulated;
        private int count;

        public final void add(long j) {
            this.accumulated += j;
        }

        public final void addAndIncrement(long j) {
            add(j);
            this.count++;
        }

        public final long getAccumulated() {
            return this.accumulated;
        }

        public final long getAvg() {
            int i = this.count;
            if (i == 0) {
                return 0L;
            }
            return this.accumulated / i;
        }

        public final int getCount() {
            return this.count;
        }

        public final void reset() {
            this.accumulated = 0L;
            this.count = 0;
        }
    }

    /* compiled from: ProfilingSession.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long toMicroseconds(long j) {
            return j / 1000;
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.mOverallTimeAccumulator.reset();
        this.mLongRequestAccumulator.reset();
        Iterator<Map.Entry<String, Accumulator>> it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().reset();
        }
    }

    public final Map<String, Object> flush() {
        HashMap hashMap = new HashMap();
        hashMap.put("view obtaining - total count", Integer.valueOf(this.mOverallTimeAccumulator.getCount()));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mOverallTimeAccumulator.getAccumulated()))));
        for (Map.Entry<String, Accumulator> entry : this.mBlockedViewAccumulators.entrySet()) {
            String key = entry.getKey();
            Accumulator value = entry.getValue();
            if (value.getCount() > 0) {
                hashMap.put(zr.a("blocking view obtaining for ", key, " - count"), Integer.valueOf(value.getCount()));
                hashMap.put("blocking view obtaining for " + key + " - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(value.getAvg()))));
            }
        }
        if (this.mLongRequestAccumulator.getCount() > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(this.mLongRequestAccumulator.getCount()));
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mLongRequestAccumulator.getAvg()))));
        }
        return hashMap;
    }

    public final boolean hasLongEvents() {
        if (this.mLongRequestAccumulator.getCount() > 0) {
            return true;
        }
        Iterator<Map.Entry<String, Accumulator>> it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void viewObtainedWithBlock(String str, long j) {
        this.mOverallTimeAccumulator.addAndIncrement(j);
        zk3<String, Accumulator> zk3Var = this.mBlockedViewAccumulators;
        Accumulator accumulator = zk3Var.get(str);
        if (accumulator == null) {
            accumulator = new Accumulator();
            zk3Var.put(str, accumulator);
        }
        accumulator.addAndIncrement(j);
    }

    public final void viewObtainedWithoutBlock(long j) {
        this.mOverallTimeAccumulator.addAndIncrement(j);
    }

    public final void viewRequested(long j) {
        this.mOverallTimeAccumulator.add(j);
        if (j >= 1000000) {
            this.mLongRequestAccumulator.addAndIncrement(j);
        }
    }
}
