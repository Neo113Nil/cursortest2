package androidx.work;

import defpackage.jxi;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/ExistingPeriodicWorkPolicy;", "", "REPLACE", "KEEP", "UPDATE", "CANCEL_AND_REENQUEUE", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExistingPeriodicWorkPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExistingPeriodicWorkPolicy[] $VALUES;
    public static final ExistingPeriodicWorkPolicy CANCEL_AND_REENQUEUE;
    public static final ExistingPeriodicWorkPolicy KEEP;

    @jxi
    public static final ExistingPeriodicWorkPolicy REPLACE;
    public static final ExistingPeriodicWorkPolicy UPDATE;

    static {
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = new ExistingPeriodicWorkPolicy("REPLACE", 0);
        REPLACE = existingPeriodicWorkPolicy;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy2 = new ExistingPeriodicWorkPolicy("KEEP", 1);
        KEEP = existingPeriodicWorkPolicy2;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy3 = new ExistingPeriodicWorkPolicy("UPDATE", 2);
        UPDATE = existingPeriodicWorkPolicy3;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy4 = new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3);
        CANCEL_AND_REENQUEUE = existingPeriodicWorkPolicy4;
        ExistingPeriodicWorkPolicy[] existingPeriodicWorkPolicyArr = {existingPeriodicWorkPolicy, existingPeriodicWorkPolicy2, existingPeriodicWorkPolicy3, existingPeriodicWorkPolicy4};
        $VALUES = existingPeriodicWorkPolicyArr;
        $ENTRIES = kotlin.enums.a.a(existingPeriodicWorkPolicyArr);
    }

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) $VALUES.clone();
    }
}
