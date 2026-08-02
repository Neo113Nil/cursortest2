package ru.ok.android.webrtc.stat.cpu.processor;

import android.system.Os;
import android.system.OsConstants;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.utils.MemoryUnitConverterKt;
import xsna.bpn0;
import xsna.drm0;
import xsna.i21;
import xsna.ig;
import xsna.lg;
import xsna.lz2;

@CallInternalApi
/* loaded from: classes9.dex */
public final class ProcessorStatistics {
    public final Lazy a = new bpn0(new ig(26));
    public final Lazy b = new bpn0(new i21(28));
    public final Lazy c = new bpn0(new lz2(26));
    public final Lazy d = new bpn0(new lg(28));

    public static final long a() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static final int b() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static final long c() {
        return MemoryUnitConverterKt.byteToKb(Os.sysconf(OsConstants._SC_PAGESIZE));
    }

    public static final long d() {
        return Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
    }

    public final long getClockTickHz() {
        return ((Number) this.c.getValue()).longValue();
    }

    public final int getCountLogicalCpuCores() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final long getPageSizeKb() {
        return ((Number) this.b.getValue()).longValue();
    }

    public final ProcessorInfo getProcessorInfo() {
        String str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_PROCESS_INFO, "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String readLine = randomAccessFile.readLine(); readLine != null; readLine = randomAccessFile.readLine()) {
                    sb.append(readLine);
                }
                str = sb.toString();
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
            str = null;
        }
        if (str != null) {
            List c0 = drm0.c0(str, new String[]{" "}, 0, 6);
            if (c0.size() > 24) {
                try {
                    return new ProcessorInfo(Long.parseLong((String) c0.get(13)), Long.parseLong((String) c0.get(14)), Long.parseLong((String) c0.get(15)), Long.parseLong((String) c0.get(16)), Long.parseLong((String) c0.get(21)), Long.parseLong((String) c0.get(23)));
                } catch (NumberFormatException unused2) {
                    return null;
                }
            }
        }
        return null;
    }

    public final long getProcessorNumber() {
        return ((Number) this.a.getValue()).longValue();
    }

    public final boolean sanityCheck() {
        return getClockTickHz() > 0 && getProcessorNumber() > 0;
    }
}
