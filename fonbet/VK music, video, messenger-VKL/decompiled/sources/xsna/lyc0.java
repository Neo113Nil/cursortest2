package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: PreferenceInstallTaskLogic.kt */
/* loaded from: classes11.dex */
public final class lyc0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "Preference";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Preference preference = Preference.a;
        int i = BuildInfo.e;
        preference.getClass();
        Preference.h = i;
        Preference.c = new r03(7);
        return s3q0.a;
    }
}
