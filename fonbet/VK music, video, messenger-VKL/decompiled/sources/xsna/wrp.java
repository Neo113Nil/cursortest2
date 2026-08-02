package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: EntyPointExt.kt */
/* loaded from: classes5.dex */
public final class wrp {
    public static final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a(String str) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint[] values = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.values();
        int length = values.length;
        int i = 0;
        while (true) {
            creationEntryPoint = null;
            if (i >= length) {
                break;
            }
            MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint2 = values[i];
            if (b(creationEntryPoint2).equals(str != null ? cqm0.m(str) : null)) {
                creationEntryPoint = creationEntryPoint2;
                break;
            }
            i++;
        }
        return creationEntryPoint == null ? MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER : creationEntryPoint;
    }

    public static final String b(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint) {
        return cqm0.m(creationEntryPoint.name());
    }
}
