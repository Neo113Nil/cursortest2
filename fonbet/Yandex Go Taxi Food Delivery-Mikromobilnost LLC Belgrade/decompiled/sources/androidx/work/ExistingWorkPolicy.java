package androidx.work;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "REPLACE", "KEEP", "APPEND", "APPEND_OR_REPLACE", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExistingWorkPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExistingWorkPolicy[] $VALUES;
    public static final ExistingWorkPolicy APPEND;
    public static final ExistingWorkPolicy APPEND_OR_REPLACE;
    public static final ExistingWorkPolicy KEEP;
    public static final ExistingWorkPolicy REPLACE;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        REPLACE = existingWorkPolicy;
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        KEEP = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        APPEND = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = existingWorkPolicy4;
        ExistingWorkPolicy[] existingWorkPolicyArr = {existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
        $VALUES = existingWorkPolicyArr;
        $ENTRIES = kotlin.enums.a.a(existingWorkPolicyArr);
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) $VALUES.clone();
    }
}
