package xsna;

import com.vk.core.preference.Preference;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;

/* compiled from: AppCrashStorageFixLoadTask.kt */
/* loaded from: classes11.dex */
public final class f43 implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        dx90 dx90Var = ow90.e;
        b.d i = com.vk.toggle.b.A.i(CoreFeatures.APP_CRASH_STORAGE_FIX);
        boolean z = false;
        if (i != null && i.a) {
            z = true;
        }
        dx90Var.getClass();
        Preference.I("performance", "__app_performance_app_crash_storage_fix_enabled", z);
        return s3q0.a;
    }
}
