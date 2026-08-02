package xsna;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: TrackerParamsBuilder.kt */
/* loaded from: classes.dex */
public final class rhp0 {
    public static final Bundle b = a.a("unknown", "unknown", "unknown", "unknown");
    public static final Bundle c = a.a(StringUtils.UNDEFINED, StringUtils.UNDEFINED, StringUtils.UNDEFINED, StringUtils.UNDEFINED);
    public final Bundle a = new Bundle();

    /* compiled from: TrackerParamsBuilder.kt */
    public static final class a {
        public static Bundle a(String str, String str2, String str3, String str4) {
            Bundle bundle = new rhp0().a;
            bundle.putString("CPU_CLASS", str);
            bundle.putString("DISK_CLASS", str2);
            bundle.putString("MEMORY_CLASS", str3);
            bundle.putString("OVERALL_CLASS", str4);
            return bundle;
        }
    }
}
