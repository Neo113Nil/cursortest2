package com.yandex.div.histogram;

import android.os.SystemClock;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gzs;
import xsna.msy;

/* compiled from: Div2ViewHistogramReporter.kt */
/* loaded from: classes7.dex */
public final class Div2ViewHistogramReporter {
    private Long bindingPausedTime;
    private Long bindingResumedTime;
    private Long bindingStartedTime;
    private String component;
    private Long drawStartedTime;
    private final gzs<HistogramReporter> histogramReporter;
    private Long layoutStartedTime;
    private Long measureStartedTime;
    private Long rebindingStartedTime;
    private final gzs<RenderConfiguration> renderConfig;
    private final Lazy renderMetrics$delegate = msy.a(LazyThreadSafetyMode.NONE, Div2ViewHistogramReporter$renderMetrics$2.INSTANCE);
    private boolean renderStarted;

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(gzs<? extends HistogramReporter> gzsVar, gzs<RenderConfiguration> gzsVar2) {
        this.histogramReporter = gzsVar;
        this.renderConfig = gzsVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    private final RenderMetrics getRenderMetrics() {
        return (RenderMetrics) this.renderMetrics$delegate.getValue();
    }

    private final void reportRenderMetrics(RenderMetrics renderMetrics) {
        HistogramReporter invoke = this.histogramReporter.invoke();
        RenderConfiguration invoke2 = this.renderConfig.invoke();
        HistogramReporter.reportDuration$default(invoke, "Div.Render.Total", renderMetrics.getTotalMs(), this.component, null, invoke2.getTotalFilter(), 8, null);
        HistogramReporter.reportDuration$default(invoke, "Div.Render.Measure", renderMetrics.getMeasureMs(), this.component, null, invoke2.getMeasureFilter(), 8, null);
        HistogramReporter.reportDuration$default(invoke, "Div.Render.Layout", renderMetrics.getLayoutMs(), this.component, null, invoke2.getLayoutFilter(), 8, null);
        HistogramReporter.reportDuration$default(invoke, "Div.Render.Draw", renderMetrics.getDrawMs(), this.component, null, invoke2.getDrawFilter(), 8, null);
    }

    private final void resetRenderMetrics() {
        this.renderStarted = false;
        this.layoutStartedTime = null;
        this.measureStartedTime = null;
        this.drawStartedTime = null;
        getRenderMetrics().reset();
    }

    private final long toTimePassed(long j) {
        return getCurrentUptime() - j;
    }

    public final String getComponent() {
        return this.component;
    }

    public final void onBindingFinished() {
        String str;
        long currentUptime;
        long longValue;
        Long l = this.bindingStartedTime;
        Long l2 = this.bindingPausedTime;
        Long l3 = this.bindingResumedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                str = "start time of Div.Binding is null";
                Assert.fail(str);
            }
        } else {
            if (l2 != null && l3 != null) {
                currentUptime = l2.longValue() + (getCurrentUptime() - l3.longValue());
                longValue = l.longValue();
            } else if (l2 == null && l3 == null) {
                currentUptime = getCurrentUptime();
                longValue = l.longValue();
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    str = "when Div.Binding has paused time it should have resumed time and otherwise";
                    Assert.fail(str);
                }
            }
            long j = currentUptime - longValue;
            renderMetrics.binding(j);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Binding", j, getComponent(), null, null, 24, null);
        }
        this.bindingStartedTime = null;
        this.bindingPausedTime = null;
        this.bindingResumedTime = null;
    }

    public final void onBindingPaused() {
        this.bindingPausedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingResumed() {
        this.bindingResumedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingStarted() {
        this.bindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onDrawFinished() {
        Long l = this.drawStartedTime;
        if (l != null) {
            getRenderMetrics().addDraw(toTimePassed(l.longValue()));
        }
        if (this.renderStarted) {
            reportRenderMetrics(getRenderMetrics());
        }
        resetRenderMetrics();
    }

    public final void onDrawStarted() {
        this.drawStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onLayoutFinished() {
        Long l = this.layoutStartedTime;
        if (l != null) {
            getRenderMetrics().addLayout(toTimePassed(l.longValue()));
        }
    }

    public final void onLayoutStarted() {
        this.layoutStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onMeasureFinished() {
        Long l = this.measureStartedTime;
        if (l != null) {
            getRenderMetrics().addMeasure(toTimePassed(l.longValue()));
        }
    }

    public final void onMeasureStarted() {
        this.measureStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRebindingFinished() {
        Long l = this.rebindingStartedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of Div.Rebinding is null");
            }
        } else {
            long currentUptime = getCurrentUptime() - l.longValue();
            renderMetrics.rebinding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Rebinding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.rebindingStartedTime = null;
    }

    public final void onRebindingStarted() {
        this.rebindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRenderStarted() {
        this.renderStarted = true;
    }

    public final void setComponent(String str) {
        this.component = str;
    }
}
