package xsna;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.TimeUtils;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class k8h0 implements xhq<SchedulerConfig> {
    @Override // xsna.e9e0
    public final Object get() {
        prw prwVar = new prw();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(priority, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUtils.MILLISECONDS_PER_DAY, set));
        Priority priority2 = Priority.HIGHEST;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(priority2, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(1000L, TimeUtils.MILLISECONDS_PER_DAY, set));
        Priority priority3 = Priority.VERY_LOW;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(priority3, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(TimeUtils.MILLISECONDS_PER_DAY, TimeUtils.MILLISECONDS_PER_DAY, unmodifiableSet));
        if (hashMap.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(prwVar, hashMap);
    }
}
