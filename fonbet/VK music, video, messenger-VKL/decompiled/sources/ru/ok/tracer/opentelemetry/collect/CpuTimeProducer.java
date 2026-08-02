package ru.ok.tracer.opentelemetry.collect;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.opentelemetry.api.common.AttributeType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.text.Regex;
import ru.ok.tracer.base.ucum.UcumUtils;
import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import ru.ok.tracer.opentelemetry.record.DoubleRecorder;
import ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider;
import xsna.emb;
import xsna.i94;
import xsna.j5g;
import xsna.n6j;
import xsna.nbr;
import xsna.p8z;
import xsna.q94;
import xsna.ro;
import xsna.t5j;
import xsna.xfx;

/* compiled from: CpuTimeProducer.kt */
/* loaded from: classes9.dex */
public final class CpuTimeProducer {
    private static final double HZ = 100.0d;
    private static final DoubleRecorder processCpuCounter;
    private static final DoubleRecorder systemCpuCounter;
    public static final CpuTimeProducer INSTANCE = new CpuTimeProducer();
    private static final i94<String> ATTR_KEY_CPU_MODE = xfx.a(AttributeType.STRING, "cpu.mode");

    static {
        TracerOpenTelemetry tracerOpenTelemetry = TracerOpenTelemetry.INSTANCE;
        OpenTelemetryRecorderProvider recorderProvider$tracer_opentelemetry_release = tracerOpenTelemetry.getRecorderProvider$tracer_opentelemetry_release();
        TechStatsCollectorManager techStatsCollectorManager = TechStatsCollectorManager.INSTANCE;
        systemCpuCounter = recorderProvider$tracer_opentelemetry_release.createDoubleRecorder(techStatsCollectorManager.getScope$tracer_opentelemetry_release(), "system.cpu.time", "CPU time in seconds by system", UcumUtils.UCUM_SECONDS);
        processCpuCounter = tracerOpenTelemetry.getRecorderProvider$tracer_opentelemetry_release().createDoubleRecorder(techStatsCollectorManager.getScope$tracer_opentelemetry_release(), "process.cpu.time", "CPU time in seconds by this process", UcumUtils.UCUM_SECONDS);
    }

    private CpuTimeProducer() {
    }

    private final void addCpu(DoubleRecorder doubleRecorder, long j, String str) {
        if (j > 0) {
            DoubleRecorder.DefaultImpls.record$default(doubleRecorder, j / HZ, q94.j(ATTR_KEY_CPU_MODE, str), null, 4, null);
        }
    }

    private final void collectProcess() {
        List a = n6j.a(0, "\\s+", nbr.r(new File(AndroidDynamicDeviceInfoDataSource.DIRECTORY_PROCESS_INFO), emb.b));
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        long parseLong = Long.parseLong((String) arrayList.get(13));
        long parseLong2 = Long.parseLong((String) arrayList.get(14));
        long parseLong3 = Long.parseLong((String) arrayList.get(15));
        long parseLong4 = Long.parseLong((String) arrayList.get(16));
        DoubleRecorder doubleRecorder = processCpuCounter;
        addCpu(doubleRecorder, parseLong + parseLong3, "user");
        addCpu(doubleRecorder, parseLong2 + parseLong4, "system");
    }

    private final void collectSystem() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/stat")), emb.b), 8192);
        try {
            Iterator it = new t5j(new p8z(bufferedReader)).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            String str = (String) it.next();
            bufferedReader.close();
            List j = new Regex("\\s+").j(0, str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : j) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            long parseLong = Long.parseLong((String) arrayList.get(1));
            long parseLong2 = Long.parseLong((String) arrayList.get(2));
            long parseLong3 = Long.parseLong((String) arrayList.get(3));
            long parseLong4 = Long.parseLong((String) arrayList.get(4));
            String str2 = (String) j5g.b0(5, arrayList);
            long parseLong5 = str2 != null ? Long.parseLong(str2) : 0L;
            String str3 = (String) j5g.b0(6, arrayList);
            long parseLong6 = str3 != null ? Long.parseLong(str3) : 0L;
            String str4 = (String) j5g.b0(7, arrayList);
            long parseLong7 = str4 != null ? Long.parseLong(str4) : 0L;
            DoubleRecorder doubleRecorder = systemCpuCounter;
            addCpu(doubleRecorder, parseLong + parseLong2, "user");
            addCpu(doubleRecorder, parseLong3, "system");
            addCpu(doubleRecorder, parseLong4 + parseLong5, "idle");
            addCpu(doubleRecorder, parseLong6 + parseLong7, "irq");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(bufferedReader, th);
                throw th2;
            }
        }
    }

    public final void collect() {
        collectProcess();
    }
}
