package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import defpackage.s3c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DEVICE_CHARGING;
        public static final Flag DEVICE_IDLE;
        public static final Flag NETWORK_UNMETERED;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            DEVICE_IDLE = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = flag3;
            $VALUES = new Flag[]{flag, flag2, flag3};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    public static class a {
        public s3c a;
        public HashMap b = new HashMap();
    }

    public static abstract class b {

        public static abstract class a {
        }

        public abstract long a();

        public abstract Set b();

        public abstract long c();
    }

    public abstract s3c a();

    public final long b(Priority priority, long j, int i) {
        long time = j - a().getTime();
        b bVar = (b) c().get(priority);
        long a2 = bVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * a2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((a2 > 1 ? a2 : 2L) * r12))), time), bVar.c());
    }

    public abstract Map c();
}
