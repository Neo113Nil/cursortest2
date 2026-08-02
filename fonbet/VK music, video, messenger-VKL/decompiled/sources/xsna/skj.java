package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.TimeUnit;

/* compiled from: ContentProviderMeasureTask.kt */
/* loaded from: classes11.dex */
public final class skj extends ParallelTaskRunner.d {
    public static final long c = TimeUnit.HOURS.toMillis(6);

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ContentProviderMeasure";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        boolean z = true;
        boolean z2 = System.currentTimeMillis() - Preference.j().getLong("content_provider_measure_key", 0L) >= c;
        o2l.a.getClass();
        if (!o2l.b("__dbg_ignore_content_provider_session_timeout", false) && !z2) {
            z = false;
        }
        if (!z) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"ContentProviderMeasureTask", " Too early to send measurement"});
            }
        }
        if (z) {
            asu0.a.getClass();
            asu0.x().submit(new rkj());
        }
        return s3q0.a;
    }
}
