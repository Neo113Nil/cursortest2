package ru.ok.tracer.opentelemetry.export;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;
import xsna.fik0;
import xsna.g5g;
import xsna.hhv;
import xsna.q7f0;
import xsna.rkh0;
import xsna.tj0;
import xsna.u7f0;
import xsna.ues;
import xsna.v7i;
import xsna.w63;
import xsna.whk0;
import xsna.wmj;
import xsna.xhk0;
import xsna.zcl;

/* compiled from: TracerOpenTelemetrySpanProcessor.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetrySpanProcessor implements fik0 {
    public static final Companion Companion = new Companion(null);
    private final boolean completeToExport;
    private final xhk0 exporter;
    private final AtomicBoolean isShutdown = new AtomicBoolean();
    private final Set<v7i> results = tj0.c();
    private final ConcurrentHashMap<String, Record> queues = new ConcurrentHashMap<>();

    /* compiled from: TracerOpenTelemetrySpanProcessor.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ fik0 create$default(Companion companion, xhk0 xhk0Var, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return companion.create(xhk0Var, z);
        }

        public final fik0 create(xhk0 xhk0Var, boolean z) {
            return new TracerOpenTelemetrySpanProcessor(xhk0Var, z);
        }

        private Companion() {
        }
    }

    /* compiled from: TracerOpenTelemetrySpanProcessor.kt */
    public static final class Record {
        private final AtomicInteger startedCount = new AtomicInteger();
        private final AtomicReference<List<whk0>> endedSpans = new AtomicReference<>(new ArrayList());

        public final AtomicReference<List<whk0>> getEndedSpans() {
            return this.endedSpans;
        }

        public final AtomicInteger getStartedCount() {
            return this.startedCount;
        }
    }

    public TracerOpenTelemetrySpanProcessor(xhk0 xhk0Var, boolean z) {
        this.exporter = xhk0Var;
        this.completeToExport = z;
    }

    private final void export(List<? extends whk0> list) {
        v7i export = this.exporter.export(list);
        this.results.add(export);
        export.f(new w63(9, this, export));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void export$lambda$1(TracerOpenTelemetrySpanProcessor tracerOpenTelemetrySpanProcessor, v7i v7iVar) {
        tracerOpenTelemetrySpanProcessor.results.remove(v7iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdown$lambda$3(TracerOpenTelemetrySpanProcessor tracerOpenTelemetrySpanProcessor, v7i v7iVar, v7i v7iVar2) {
        v7i shutdown = tracerOpenTelemetrySpanProcessor.exporter.shutdown();
        shutdown.f(new hhv(v7iVar, shutdown, v7iVar2, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdown$lambda$3$lambda$2(v7i v7iVar, v7i v7iVar2, v7i v7iVar3) {
        if (v7iVar.b() && v7iVar2.b()) {
            v7iVar3.e();
        } else {
            v7iVar3.a(null);
        }
    }

    @Override // xsna.fik0, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // xsna.fik0
    public v7i forceFlush() {
        List<? extends whk0> list;
        List<whk0> andSet;
        if (this.completeToExport) {
            ListBuilder e = e43.e();
            Iterator<Map.Entry<String, Record>> it = this.queues.entrySet().iterator();
            while (it.hasNext()) {
                Record value = it.next().getValue();
                ArrayList arrayList = new ArrayList();
                do {
                    andSet = value.getEndedSpans().getAndSet(null);
                } while (andSet == null);
                g5g.y(andSet, arrayList);
                g5g.y(arrayList, e);
                arrayList.clear();
                value.getEndedSpans().set(arrayList);
            }
            list = e.g();
        } else {
            list = EmptyList.b;
        }
        if (!list.isEmpty()) {
            export(list);
        }
        return v7i.d(this.results);
    }

    @Override // xsna.fik0
    public boolean isEndRequired() {
        return true;
    }

    @Override // xsna.fik0
    public boolean isStartRequired() {
        return this.completeToExport;
    }

    @Override // xsna.fik0
    public void onEnd(u7f0 u7f0Var) {
        List<whk0> singletonList;
        if (this.completeToExport) {
            rkh0 rkh0Var = (rkh0) u7f0Var;
            String str = rkh0Var.b.b;
            Record record = this.queues.get(str);
            do {
                singletonList = record.getEndedSpans().getAndSet(null);
            } while (singletonList == null);
            singletonList.add(rkh0Var.s());
            if (record.getStartedCount().decrementAndGet() > 0) {
                record.getEndedSpans().set(singletonList);
                return;
            }
            this.queues.remove(str);
        } else {
            singletonList = Collections.singletonList(((rkh0) u7f0Var).s());
        }
        export(singletonList);
    }

    @Override // xsna.fik0
    public void onStart(wmj wmjVar, q7f0 q7f0Var) {
        Record putIfAbsent;
        if (this.completeToExport) {
            String str = ((rkh0) q7f0Var).b.b;
            ConcurrentHashMap<String, Record> concurrentHashMap = this.queues;
            Record record = concurrentHashMap.get(str);
            if (record == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (record = new Record()))) != null) {
                record = putIfAbsent;
            }
            record.getStartedCount().getAndIncrement();
        }
    }

    @Override // xsna.fik0
    public v7i shutdown() {
        if (this.isShutdown.getAndSet(true)) {
            return v7i.e;
        }
        v7i v7iVar = new v7i();
        v7i forceFlush = forceFlush();
        forceFlush.f(new ues(this, forceFlush, v7iVar, 2));
        return v7iVar;
    }
}
