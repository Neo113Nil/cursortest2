package com.yandex.pulse;

import defpackage.ny61;
import defpackage.w53;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB+\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000RP\u0010\u0002\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004 \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "", "processToHistogramBaseName", "", "", "foregroundIntervalMilliseconds", "", "backgroundIntervalMilliseconds", "(Ljava/util/Map;JJ)V", "", "kotlin.jvm.PlatformType", "Builder", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProcessCpuMonitoringParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final long backgroundIntervalMilliseconds;
    public final long foregroundIntervalMilliseconds;
    public final Map<String, String> processToHistogramBaseName;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/pulse/ProcessCpuMonitoringParams$Builder;", "", "<init>", "()V", "", "processName", "histogramBaseName", "addProcessHistogram", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/pulse/ProcessCpuMonitoringParams$Builder;", "", "foregroundIntervalMilliseconds", "setForegroundIntervalMilliseconds", "(J)Lcom/yandex/pulse/ProcessCpuMonitoringParams$Builder;", "backgroundIntervalMilliseconds", "setBackgroundIntervalMilliseconds", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "build", "()Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "Lw53;", "processToHistogramBaseName", "Lw53;", "J", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private final w53 processToHistogramBaseName = new w53();
        private long foregroundIntervalMilliseconds = 60000;
        private long backgroundIntervalMilliseconds = 3600000;

        public final Builder addProcessHistogram(String processName, String histogramBaseName) {
            this.processToHistogramBaseName.put(processName, histogramBaseName);
            return this;
        }

        public final ProcessCpuMonitoringParams build() {
            if (!this.processToHistogramBaseName.isEmpty()) {
                return new ProcessCpuMonitoringParams(this.processToHistogramBaseName, this.foregroundIntervalMilliseconds, this.backgroundIntervalMilliseconds, null);
            }
            ny61.r("No process to histogram mappings specified.");
            return null;
        }

        public final Builder setBackgroundIntervalMilliseconds(long backgroundIntervalMilliseconds) {
            this.backgroundIntervalMilliseconds = backgroundIntervalMilliseconds;
            return this;
        }

        public final Builder setForegroundIntervalMilliseconds(long foregroundIntervalMilliseconds) {
            this.foregroundIntervalMilliseconds = foregroundIntervalMilliseconds;
            return this;
        }
    }

    private ProcessCpuMonitoringParams(Map<String, String> map, long j, long j2) {
        this.foregroundIntervalMilliseconds = j;
        this.backgroundIntervalMilliseconds = j2;
        this.processToHistogramBaseName = Collections.unmodifiableMap(map);
    }

    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/ProcessCpuMonitoringParams$Companion;", "", "()V", "builder", "Lcom/yandex/pulse/ProcessCpuMonitoringParams$Builder;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProcessCpuMonitoringParams(Map map, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, j, j2);
    }
}
