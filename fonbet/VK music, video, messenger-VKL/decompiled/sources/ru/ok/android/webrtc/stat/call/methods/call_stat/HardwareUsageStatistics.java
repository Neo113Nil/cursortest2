package ru.ok.android.webrtc.stat.call.methods.call_stat;

import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.cpu.CpuInfo;
import ru.ok.android.webrtc.stat.cpu.ram.MemoryInfo;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.utils.MemoryUnitConverterKt;

/* loaded from: classes9.dex */
public final class HardwareUsageStatistics {
    public final void addStats(CpuInfo cpuInfo, MemoryInfo memoryInfo, EventItemsMap eventItemsMap) {
        Float usageFraction = cpuInfo.getUsageFraction();
        if (usageFraction != null) {
            eventItemsMap.set(CallStatMetric.CpuUsagePercentTotal.getKey(), Long.valueOf((long) (usageFraction.floatValue() * 100)));
        }
        eventItemsMap.set(CallStatMetric.CpuScoreMax.getKey(), cpuInfo.getCpuMaxScore());
        eventItemsMap.set(CallStatMetric.CpuScoreAvg.getKey(), cpuInfo.getCpuAvgScore());
        eventItemsMap.set(CallStatMetric.CpuHardwareConcurrency.getKey(), Integer.valueOf(cpuInfo.getCountLogicalCpuCores()));
        eventItemsMap.set(CallStatMetric.MemoryUsageMbMax.getKey(), MemoryUnitConverterKt.kbToMb(memoryInfo.getMemoryUsageKbMax()));
        eventItemsMap.set(CallStatMetric.MemoryUsageMbAvg.getKey(), MemoryUnitConverterKt.kbToMb(memoryInfo.getMemoryUsageKbAvg()));
    }
}
