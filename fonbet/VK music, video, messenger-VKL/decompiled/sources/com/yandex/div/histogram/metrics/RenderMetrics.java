package com.yandex.div.histogram.metrics;

/* compiled from: RenderMetrics.kt */
/* loaded from: classes7.dex */
public final class RenderMetrics {
    private long bindingMs;
    private long drawMs;
    private long layoutMs;
    private long measureMs;
    private long rebindingMs;

    public final void addDraw(long j) {
        this.drawMs += j;
    }

    public final void addLayout(long j) {
        this.layoutMs += j;
    }

    public final void addMeasure(long j) {
        this.measureMs += j;
    }

    public final void binding(long j) {
        this.bindingMs = j;
    }

    public final long getDrawMs() {
        return this.drawMs;
    }

    public final long getLayoutMs() {
        return this.layoutMs;
    }

    public final long getMeasureMs() {
        return this.measureMs;
    }

    public final long getTotalMs() {
        return Math.max(this.bindingMs, this.rebindingMs) + this.measureMs + this.layoutMs + this.drawMs;
    }

    public final void rebinding(long j) {
        this.rebindingMs = j;
    }

    public final void reset() {
        this.measureMs = 0L;
        this.layoutMs = 0L;
        this.drawMs = 0L;
        this.bindingMs = 0L;
        this.rebindingMs = 0L;
    }
}
