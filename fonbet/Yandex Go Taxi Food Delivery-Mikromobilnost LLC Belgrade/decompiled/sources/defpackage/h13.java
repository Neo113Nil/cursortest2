package defpackage;

import com.ybsdk.core.utils.dto.common.ApplicationType;

/* loaded from: classes2.dex */
public final class h13 {
    public static ApplicationType a(String str) {
        ApplicationType applicationType;
        ApplicationType[] values = ApplicationType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                applicationType = null;
                break;
            }
            applicationType = values[i];
            if (jl40.l(applicationType.name(), str)) {
                break;
            }
            i++;
        }
        return applicationType == null ? ApplicationType.UNKNOWN : applicationType;
    }
}
