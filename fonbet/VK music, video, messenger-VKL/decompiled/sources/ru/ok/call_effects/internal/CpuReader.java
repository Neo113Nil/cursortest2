package ru.ok.call_effects.internal;

import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import xsna.bd3;
import xsna.drm0;

/* compiled from: CpuReader.kt */
/* loaded from: classes9.dex */
public final class CpuReader {
    private final String memKey = "MemTotal";
    private int totalMem = -2;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r4 = new java.util.StringTokenizer(r3);
        r4.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2 = java.lang.Integer.parseInt(r4.nextToken());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        android.util.Log.e("CpuReader", "Mem is unavailable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getTotalMem() {
        int i = this.totalMem;
        if (i != -2) {
            return i;
        }
        int i2 = -1;
        if (bd3.d("/proc/cpuinfo")) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (drm0.D(readLine, this.memKey, false)) {
                        break;
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                Log.e("CpuReader", "" + e.getMessage());
            }
        }
        this.totalMem = i2;
        return i2;
    }
}
